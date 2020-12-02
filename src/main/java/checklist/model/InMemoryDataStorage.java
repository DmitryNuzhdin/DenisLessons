package checklist.model;

import checklist.domain.Task;
import checklist.domain.TaskUpdate;
import checklist.domain.User;
import checklist.domain.UserUpdate;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
//@Scope(scopeName = "prototype")
public class InMemoryDataStorage implements DataStorage {

    private Map<Long, User> userList = new HashMap<>();
    private Map<Long, Task> taskList = new HashMap<>();
    private long lastUserId = 0;
    private long lastTaskId = 0;

    @Override
    public Optional<User> getUser(long userId) {
        return Optional.ofNullable(userList.get(userId));
    }
    /* 18/11/2020 */
    @Override
    public Optional<Task> getTask(long taskId) {
        return Optional.ofNullable(taskList.get(taskId));
    }

    @Override
    public User createUser(UserUpdate userUpdate) {
        User user = new User(lastUserId++,userUpdate.userName);
        userList.put(user.userId, user);
        return user;
    }
    /* 18/11/2020 */
    @Override
    public Task createTask(long userId, TaskUpdate taskUpdate) {
        Task task = new Task(lastTaskId++,userId,taskUpdate.taskName,taskUpdate.taskDescription, taskUpdate.isComplete);
        taskList.put(task.taskId,task);
        return task;
    }
    /* 18/11/2020 */
    @Override
    public User updateUser(long userId, UserUpdate userUpdate) {
        if (userList.containsKey(userId) ) {
            User user = new User(userId, userUpdate.userName);
            userList.put(userId, user);
        }
            return null;
        }
    /* 18/11/2020 */
    @Override
    public Task updateTask(long taskId, TaskUpdate taskUpdate) {
        if (taskList.containsKey(taskId)){
            Task taskToUpdate = taskList.get(taskId);
            Task task = new Task(taskId,taskToUpdate.userId,taskUpdate.taskName,taskUpdate.taskDescription,taskUpdate.isComplete);
            taskList.put(taskId,task);
        }
        return null;
    }

    @Override
    public List<Task> getAllTasksOfUser(long userId, boolean onlyOpened) {
        return taskList.values().stream()
                .filter(task -> !task.isComplete || !onlyOpened)
                .filter(task -> task.userId == userId)
                .collect(Collectors.toList());
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userList.values());
    }
}

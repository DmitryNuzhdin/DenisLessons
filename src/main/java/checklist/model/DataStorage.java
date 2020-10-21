package checklist.model;

import checklist.domain.Task;
import checklist.domain.TaskUpdate;
import checklist.domain.*;

import java.util.List;
import java.util.Optional;

public interface DataStorage {
    Optional<User> getUser(long userId);
    Optional<User> getTask(long userId, long taskId);
    User createUser(UserUpdate userUpdate);
    Task createTask(TaskUpdate taskUpdate);
    User updateUser(long userId, UserUpdate userUpdate);
    Task updateTask(long userId, long taskId, TaskUpdate taskUpdate);
    List<Task> getAllTasksOfUser(long userId, boolean onlyOpened);
    List<User> getAllUsers(); //???
}

package checklist.model;

import checklist.domain.Task;
import checklist.domain.TaskUpdate;
import checklist.domain.User;
import checklist.domain.UserUpdate;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
//@Scope(scopeName = "prototype")
public class DataStorageImpl implements DataStorage {
    @Override
    public Optional<User> getUser(long userId) {
        return Optional.empty();
    }

    @Override
    public Optional<User> getTask(long userId, long taskId) {
        return Optional.empty();
    }

    @Override
    public User createUser(UserUpdate userUpdate) {
        return null;
    }

    @Override
    public Task createTask(TaskUpdate taskUpdate) {
        return null;
    }

    @Override
    public User updateUser(long userId, UserUpdate userUpdate) {
        return null;
    }

    @Override
    public Task updateTask(long userId, long taskId, TaskUpdate taskUpdate) {
        return null;
    }

    @Override
    public List<Task> getAllTasksOfUser(long userId, boolean onlyOpened) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}

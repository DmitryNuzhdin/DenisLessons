package checklist.model;

import checklist.domain.Task;
import checklist.domain.TaskUpdate;
import checklist.domain.User;
import checklist.domain.UserUpdate;

import java.util.List;

public class ModelImpl implements Model {
    private final DataStorage dataStorage;

    public ModelImpl(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    @Override
    public User createUser(UserUpdate userUpdate) throws UserExistsException {
        return null;
    }

    @Override
    public User getUser(long userId) throws UserNotFoundException {
        return null;
    }

    @Override
    public Task createTask(long userId, TaskUpdate taskUpdate) throws UserNotFoundException {
        return null;
    }

    @Override
    public Task updateTask(long userId, long taskId, TaskUpdate taskUpdate) throws TaskNotFoundException, UserNotFoundException {
        return null;
    }

    @Override
    public List<Task> getAllTasksOfUser(long userId, boolean onlyOpened) throws UserNotFoundException {
        return null;
    }
}

package checklist.model;

import checklist.domain.Task;
import checklist.domain.TaskUpdate;
import checklist.domain.User;
import checklist.domain.UserUpdate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class ModelImpl implements Model {
    private final DataStorage dataStorage;

    public ModelImpl(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }
    /* 18/11/2020 */
    @Override
    public User createUser(UserUpdate userUpdate) throws UserExistsException {
        if (dataStorage.getAllUsers().stream().anyMatch(user -> Objects.equals(user.userName,userUpdate.userName)))
        {
            throw new UserExistsException();
        }
        return dataStorage.createUser(userUpdate);
    }
    /* 18/11/2020 */
    @Override
    public Optional<User> getUser(long userId) throws UserNotFoundException {
        if (dataStorage.getUser(userId).isPresent()) {
            return dataStorage.getUser(userId);
        }
        throw new UserNotFoundException();
    }

    /* 18/11/2020 */
    @Override
    public Task createTask(long userId, TaskUpdate taskUpdate) throws UserNotFoundException {
        if (dataStorage.getUser(userId).isPresent()) {
            dataStorage.createTask(userId, taskUpdate);
        }
        throw new UserNotFoundException();

    }

    @Override
    public Task updateTask(long taskId, TaskUpdate taskUpdate) throws TaskNotFoundException {
        if (dataStorage.getTask(taskId).isPresent()) {
            return dataStorage.updateTask(taskId, taskUpdate);
        }
        throw new TaskNotFoundException();
    }

    @Override
    public List<Task> getAllTasksOfUser(long userId, boolean onlyOpened) throws UserNotFoundException {
        if (dataStorage.getUser(userId).isPresent()) {
            return dataStorage.getAllTasksOfUser(userId, onlyOpened);
        }
        throw new UserNotFoundException();
    }
}

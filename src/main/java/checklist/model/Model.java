package checklist.model;

import checklist.domain.*;

import java.util.*;

public interface Model {
    User createUser(UserUpdate userUpdate)
            throws UserExistsException;
    Optional<User> getUser(long userId)
            throws UserNotFoundException;
    Task createTask(long userId, TaskUpdate taskUpdate)
            throws UserNotFoundException;
    Task updateTask(long taskId, TaskUpdate taskUpdate)
            throws TaskNotFoundException;
    List<Task> getAllTasksOfUser(long userId, boolean onlyOpened)
            throws UserNotFoundException;
}


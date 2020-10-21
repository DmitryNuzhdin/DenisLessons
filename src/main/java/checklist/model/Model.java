package checklist.model;

import checklist.domain.*;

import java.util.*;

public interface Model {
    User createUser(UserUpdate userUpdate)
            throws UserExistsException;
    User getUser(long userId)
            throws UserNotFoundException;
    Task createTask(long userId, TaskUpdate taskUpdate)
            throws UserNotFoundException;
    Task updateTask(long userId, long taskId, TaskUpdate taskUpdate)
            throws TaskNotFoundException, UserNotFoundException;
    List<Task> getAllTasksOfUser(long userId, boolean onlyOpened)
            throws UserNotFoundException;
}


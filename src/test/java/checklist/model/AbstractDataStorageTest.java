package checklist.model;

import checklist.domain.User;
import checklist.domain.UserUpdate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public abstract class AbstractDataStorageTest {
    DataStorage dataStorage;

    abstract DataStorage createDataStorage();

    @Before
    public void init(){
        dataStorage = createDataStorage();
    }

    @Test
    public void createAndGetUserTest(){
        User user = dataStorage.createUser(new UserUpdate("ABC"));
        assertEquals("ABC", user.userName);
        assertEquals(user, dataStorage.getUser(user.userId).get());
        assertEquals(1, dataStorage.getAllUsers().size());
    }

    @Test
    public void createAndGetUserTest2(){
        User user = dataStorage.createUser(new UserUpdate("ABC1"));
        assertEquals("ABC1", user.userName);
        assertEquals(user, dataStorage.getUser(user.userId).get());
        assertEquals(1, dataStorage.getAllUsers().size());
    }

}

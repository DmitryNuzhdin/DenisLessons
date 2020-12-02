package checklist;

import checklist.domain.Task;
import checklist.domain.TaskUpdate;
import checklist.domain.User;
import checklist.domain.UserUpdate;
import checklist.model.DataBaseDataStorage;
import checklist.model.DataStorage;
import checklist.model.InMemoryDataStorage;
import java.sql.Connection;
import java.sql.DriverManager;


public class Application {
    public static void main(String[] args) {

        DataStorage dataStorage = new DataBaseDataStorage();
        //User user = dataStorage.createUser(new UserUpdate("User3"));
        //Task task = dataStorage.createTask(2,new TaskUpdate("Task2", "TODODO",false));
        //dataStorage.updateUser(1,new UserUpdate("User1"));
        //dataStorage.updateTask(1,new TaskUpdate("Task1", "TODO", false));
        dataStorage.getAllTasksOfUser(1,false);
    }
}
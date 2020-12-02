package checklist.model;

import checklist.domain.Task;
import checklist.domain.TaskUpdate;
import checklist.domain.User;
import checklist.domain.UserUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;

public class DataBaseDataStorage implements DataStorage {

    ArrayList<User> userData = new ArrayList<User>();
    ArrayList<Task> taskData = new ArrayList<Task>();

    private long lastUserId = 0;
    private long lastTaskId = 0;

    @Override
    public Optional<User> getUser(long userId) {
         return Optional.empty();
    }

    @Override
    public Optional<Task> getTask(long taskId) {
        return Optional.empty();
    }

    @Override
    public User createUser(UserUpdate userUpdate) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:C:\\Users\\dgutyrchik\\IdeaProjects\\DenisLessons\\src\\main\\resources\\checklist");
            Statement statement = connection.createStatement();
            ResultSet check = statement.executeQuery("select name from user where name = '" + userUpdate.userName + "';");
            if(check.next()) {
                System.out.println("User already exists!");
                return null;
            }
            ResultSet rs = statement.executeQuery("select max(id) as ID from user");
            if(rs.next()) {
                lastUserId = rs.getInt(rs.findColumn("ID")) + 1;
            }
            statement.executeUpdate("insert into user (id, name) values (" + lastUserId + ",'" + userUpdate.userName+"');");
            statement.close();
            connection.close();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
/*
        //statement.executeUpdate("create table table1 (id int)");
//            statement.executeUpdate("insert into table1 (id) values (11)");
//            statement.executeUpdate("insert into table1 (id) values (22)");
//            statement.executeUpdate("insert into table1 (id) values (33)");

        List<Integer> ints = Arrays.asList(6, 7, 8, 9);

        PreparedStatement pst = connection.prepareStatement("insert into table1 (id) values (?)");

        for (int i : ints) {
            pst.setInt(1, i);
            pst.execute();
        }

        ResultSet rs = statement.executeQuery("select * from table1");

        while (rs.next()) {
            System.out.println(rs.getInt(rs.findColumn("id")));
        }

        statement.close();
        connection.close();
*/

    @Override
    public Task createTask(long userId, TaskUpdate taskUpdate) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:C:\\Users\\dgutyrchik\\IdeaProjects\\DenisLessons\\src\\main\\resources\\checklist");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select max(id) as ID from task");
            if(rs.next()) {
                lastTaskId = rs.getInt(rs.findColumn("ID")) + 1;
            }
            statement.executeUpdate("insert into task (id, name, user_id, description, iscomplete) values (" + lastTaskId + ",'" + taskUpdate.taskName+"'," + userId + ",'"+taskUpdate.taskDescription + "'," +taskUpdate.isComplete + ");");
            statement.close();
            connection.close();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public User updateUser(long userId, UserUpdate userUpdate) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:C:\\Users\\dgutyrchik\\IdeaProjects\\DenisLessons\\src\\main\\resources\\checklist");
            Statement statement = connection.createStatement();
            ResultSet check = statement.executeQuery("select id from user where id = " +userId + ";");
            if (!check.next()) {
                System.out.println("No user found");
                return null;
            }
            statement.executeUpdate("update user set name = '" + userUpdate.userName + "' where id = " + userId+";");
            statement.close();
            connection.close();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public Task updateTask(long taskId, TaskUpdate taskUpdate) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:C:\\Users\\dgutyrchik\\IdeaProjects\\DenisLessons\\src\\main\\resources\\checklist");
            Statement statement = connection.createStatement();
            ResultSet check = statement.executeQuery("select id from task where id = " +taskId + ";");
            if (!check.next()) {
                System.out.println("No task found");
                return null;
            }
            statement.executeUpdate("update task set name = '" + taskUpdate.taskName + "', description = '" + taskUpdate.taskDescription + "', iscomplete = " + taskUpdate.isComplete + " where id = " + taskId+";");
            statement.close();
            connection.close();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Task> getAllTasksOfUser(long userId, boolean onlyOpened) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:C:\\Users\\dgutyrchik\\IdeaProjects\\DenisLessons\\src\\main\\resources\\checklist");
            Statement statement = connection.createStatement();
            ResultSet check = statement.executeQuery("select id, user_id, name, description, iscomplete from task where user_id = " +userId + " and iscomplete = "+ onlyOpened +";");

            while(check.next()){
                Task taskToAdd = new Task(check.getInt("ID"),check.getInt("USER_ID"),check.getString("NAME"),check.getString("DESCRIPTION"),check.getBoolean("ISCOMPLETE"));
                taskData.add(taskToAdd);
            }
            statement.close();
            connection.close();
            taskData.forEach(t -> System.out.println(t));
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

        return taskData;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}

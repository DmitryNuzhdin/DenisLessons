package checklist;

import checklist.domain.User;
import checklist.domain.UserUpdate;
import checklist.model.*;


public class Application {
    public static void main(String[] args) {
//        DataStorage dataStorage = new DataStorageImpl();
//        Model model = new ModelImpl(dataStorage);
//        IoService ioService = new IoServiceImpl(model);
//
//
//        ioService.start();

        DataStorage dataStorage = new DataStorageImpl();

        User user = dataStorage.createUser(new UserUpdate("abc"));
        dataStorage.getUser(user.userId);


    }
}

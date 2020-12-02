package checklist;

import checklist.domain.Task;
import checklist.domain.UserUpdate;
import checklist.model.Model;
import checklist.model.TaskNotFoundException;
import checklist.model.UserExistsException;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Scanner;

@Component
public class IoServiceImpl implements IoService {
    private final Model model;

    public IoServiceImpl(Model model) {
        this.model = model;
    }

    @Override
    public void start() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                // cделать создание задачи и удаление задачи
                Scanner input = new Scanner(System.in);
                //System.out.println("Choose: 1 - Create user\n2 - Create task\n3 - Get user\n4 - Update task\n5 - Get all tasks of user");
                System.out.println("Enter user name: ");
                String userName = input.next();
                try {
                    model.createUser(new UserUpdate(userName));
                } catch (UserExistsException e) {
                    e.printStackTrace();
                }
                // создать scanner
                // парсить ввод, вызывать методы Model
            }
        };
        new Thread(runnable).start();
    }

    @Override
    public void stop() {

    }
}

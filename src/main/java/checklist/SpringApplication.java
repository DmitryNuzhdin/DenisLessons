package checklist;

import checklist.model.InMemoryDataStorage;
import checklist.model.Model;
import checklist.model.ModelImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ComponentScan(basePackages = "checklist")
public class SpringApplication {
    public static void main(String[] args) {
        //ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringApplication.class);
        IoService ioService = context.getBean(IoService.class);
        ioService.start();
    }

}

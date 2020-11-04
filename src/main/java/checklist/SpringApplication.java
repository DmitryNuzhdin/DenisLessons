package checklist;

import checklist.model.DataStorageImpl;
import checklist.model.Model;
import checklist.model.ModelImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.management.modelmbean.ModelMBean;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "checklist")
public class SpringApplication {
    public static void main(String[] args) {
        //ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringApplication.class);
//        context.registerBean(DataStorageImpl.class);
//        context.registerBean(ModelImpl.class);
//        context.registerBean(IoServiceImpl.class);
//        context.registerBean(IoServiceImpl2.class);
//        context.registerBean(IoServiceSupervisor.class);
//        context.refresh();

        DataStorageImpl dataStorage = context.getBean(DataStorageImpl.class);
        Model model = context.getBean(ModelImpl.class);
        Map<String, IoService> ioServices = context.getBeansOfType(IoService.class);
        IoServiceSupervisor ioServiceSupervisor = context.getBean(IoServiceSupervisor.class);

        System.out.println();
    }

//    @Bean
//    IoService getIoService(){
//        if(true)
//            return new IoServiceImpl();
//        else
//            return new IoServiceImpl2();
//    }
}

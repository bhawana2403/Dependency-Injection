package guru.springframework.sfgdi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.I18nController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {
    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class,args);

        // Spring Profiles
        I18nController i18nController = (I18nController)ctx.getBean("i18nController");
        System.out.println(i18nController.getGreetingString());

        MyController controller = (MyController) ctx.getBean("myController");
        // Didn't created an object of controller but asked spring context to create one for us at line 11.
        System.out.println("------PrimaryBeans");
        System.out.println(controller.getGreetings());
        System.out.println("------Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreetings());
        System.out.println("-------Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreetingsService());
        System.out.println("-------Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreetings());
    }
}

package com.oscarrecinos.learnframework02.examples.a1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.oscarrecinos.learnframework02.LearnFramework02Application;
import com.oscarrecinos.learnframework02.game.GameRunner;

@Component
class YourBusinessClass {

    Dependency1 dependency1;
    @Autowired
    Dependency2 dependency2;

    public String toString() {
        return "Dependency 1 " + dependency1 + " Dependency 2 "
                + dependency2;
    }
 
    public Dependency1 getDependency1() {
        return dependency1;
    }

    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }

    public Dependency2 getDependency2() {
        return dependency2;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
    }

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {

            // context.getBean(GamingConsole.class).up();

            Arrays.stream(context.getBeanDefinitionNames()).forEach(
                    System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));

        } catch (BeansException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

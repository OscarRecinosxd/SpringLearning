package com.oscarrecinos.learnframework02.examples.a0;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.oscarrecinos.learnframework02.LearnFramework02Application;
import com.oscarrecinos.learnframework02.examples.a1.DependencyInjectionLauncherApplication;
import com.oscarrecinos.learnframework02.game.GameRunner;






@Configuration
@ComponentScan
public class SimpleSpringContextLauncher {
    

	public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncher.class)) {
            
            
            //context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();

            Arrays.stream(context.getBeanDefinitionNames()).forEach(
                System.out::println
            );

        } catch (BeansException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}

    
}

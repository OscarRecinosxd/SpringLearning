package com.oscarrecinos.learnframework02.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.oscarrecinos.learnframework02.LearnFramework02Application;

@Configuration
@ComponentScan("com.oscarrecinos.learnframework02.game;")
public class GamingAppLauncher {


	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(LearnFramework02Application.class)) {
            
            
            //context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();


        } catch (BeansException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

    
}

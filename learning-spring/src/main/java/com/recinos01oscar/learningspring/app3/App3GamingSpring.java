package com.recinos01oscar.learningspring.app3;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.recinos01oscar.learningspring.app.game.GameConfiguration;
import com.recinos01oscar.learningspring.app.game.GameRunner;
import com.recinos01oscar.learningspring.app.game.GamingConsole;

public class App3GamingSpring {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
            
            
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();


        } catch (BeansException e) {
            e.printStackTrace();
        }

    }

    
}

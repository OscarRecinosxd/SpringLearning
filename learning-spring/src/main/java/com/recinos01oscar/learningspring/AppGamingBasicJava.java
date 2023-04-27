package com.recinos01oscar.learningspring;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.recinos01oscar.learningspring.app.game.ContraGame;
import com.recinos01oscar.learningspring.app.game.GameRunner;
import com.recinos01oscar.learningspring.app.game.MarioGame;
import com.recinos01oscar.learningspring.app.game.PacmanGame;
import com.recinos01oscar.learningspring.app2.HelloWorldConfiguration;

@SpringBootApplication
public class AppGamingBasicJava {

	public static void main(String[] args) {
		/*SpringApplication.run(AppGamingBasicJava.class, args);
		//var game = new MarioGame();
		//var game = new ContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();*/

		System.out.println("---------------------------");
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println("---------------------------");

			//System.out.println(context.getBean("name"));
			//System.out.println(context.getBean("age")); 
			//System.out.println(context.getBean("person")); 
			System.out.println(context.getBean("person3Parameters"));
			//System.out.println(context.getBean("address2")); 
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	
	
	}

}

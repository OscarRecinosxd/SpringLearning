package com.recinos01oscar.learningspring.app2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {
    
    @Bean
    public String name(){
        return "Hola";
    }

    @Bean
    public int age(){
        return 21;
    }

    @Bean
    public Person person(){
        return new Person("Chepe", 23, new Address("Main sttre", "Houston"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        //name, age, address2
        return new Person(name,age, address3);
    }

    @Bean(name = "address2")
    public Address address(){
        return new Address("Col fatima", "Chalatenango");
    }

    @Bean(name = "address3")
    public Address address3(){
        return new Address("Fatima2", "Chalatenango");
    }
    


}

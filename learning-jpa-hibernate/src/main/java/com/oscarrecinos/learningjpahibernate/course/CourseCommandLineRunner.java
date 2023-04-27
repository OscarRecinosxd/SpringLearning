package com.oscarrecinos.learningjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.oscarrecinos.learningjpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

    //@Autowired
    // private CourseJDBCRepository repository;
    //@Autowired
    // private CourseJPARepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;
    

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn AWS now!","in28Oscar"));
        repository.save(new Course(2,"Learn azure!","in28Oscar"));
        repository.save(new Course(3,"Learn Full stack!","in28Oscar"));

        repository.deleteById(2L);
        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println("------------------------------------------");
        System.out.println(repository.findByAuthor("in28Oscar"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("Learn AWS now!"));
     

    }


    
}

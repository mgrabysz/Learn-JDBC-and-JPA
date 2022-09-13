package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // option with JDBC
//    @Autowired
//    private CourseJdbcRepository repository;

    //oprion with JPA
//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // commands for JDBC or JPA
//        repository.insert(new Course(1, "Learn AWS", "in29minutes"));
//        repository.insert(new Course(2, "Learn Azure", "in28minutes"));
//        repository.deleteById(1);
//        System.out.println(repository.findById(2));

        repository.save(new Course(1, "Learn AWS", "in29minutes"));
        repository.save(new Course(2, "Learn Azure", "in28minutes"));
        repository.deleteById(1l);
        System.out.println(repository.findById(2l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("in28minutes"));

    }
}

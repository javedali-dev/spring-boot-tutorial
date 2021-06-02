package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
          Student javed =   new Student(
                  "Javed Ali",
                  LocalDate.of(1999, FEBRUARY,5),
                  "Javedali@gmail.com"
          );
            Student alex =   new Student(
                    "Alex",
                    LocalDate.of(2004, FEBRUARY,5),
                    "Alex@gmail.com"
            );
            repository.saveAll(
                    List.of(javed,alex)
            );
        };
    }
}

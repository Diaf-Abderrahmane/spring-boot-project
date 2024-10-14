package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student abdou = new Student(
                    "Abdou",
                    LocalDate.of(2001, Month.DECEMBER, 19),
                    "abdoudiaf30@gmail.com"
            );

            Student nour = new Student(
                    "Nour",
                    LocalDate.of(2003, Month.SEPTEMBER, 26),
                    "nour@gmail.com"
            );

            repository.saveAll(
                    List.of(abdou, nour)
            );
        };
    }
}

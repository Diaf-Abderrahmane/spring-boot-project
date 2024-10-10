package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// to tell that this class has to be instantiated i.e a bean.
@Service
public class StudentService {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Abdou",
                        21,
                        LocalDate.of(2000, Month.JANUARY, 5),
                        "abdoudiaf30@gmail.com"
                ),
                new Student(
                        1L,
                        "Abdou",
                        21,
                        LocalDate.of(2000, Month.JANUARY, 5),
                        "abdoudiaf30@gmail.com"
                )
        );
    }

}

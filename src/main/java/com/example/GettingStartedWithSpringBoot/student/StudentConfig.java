package com.example.GettingStartedWithSpringBoot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student student1 = new Student(1L, "Michael", "michael-steinert@gmx.de",  LocalDate.of(1994, Month.FEBRUARY, 2));

            Student student2 = new Student("Marie", "marie-schmidt@gmx.de",  LocalDate.of(1995, Month.FEBRUARY, 28));

            studentRepository.saveAll(List.of(student1, student2));
        };
    }
}

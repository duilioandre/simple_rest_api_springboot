package com.example.first_demo_spring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentDataLoader {
    @Bean
    CommandLineRunner initDatabase(StudentRepository studentRepository) {
        return args -> {
            Student mario = new Student(
                    "mario,",
                    "rossi",
                    "mario@example.it"
            );
            Student alex = new Student(
                    "alex,",
                    "ramsey",
                    "alex@example.it"
            );
            Student roberto = new Student(
                    "roberto,",
                    "casiraghi",
                    "roberto@example.it"
            );

            studentRepository.saveAll(
                    List.of(mario, alex, roberto)
            );
        };
    }
}

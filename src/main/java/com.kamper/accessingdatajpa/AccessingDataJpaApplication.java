package com.kamper.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);

    }

    @Bean
    public CommandLineRunner demo(EmployeeRepository repository) {
        return (args) -> {

            repository.save(new Employee("Jenkins", 17));
            repository.save(new Employee("Jacobs", 22));
            repository.save(new Employee("Johnes", 30));

            log.info("Employees found with findAll():");
            log.info("-------------------------------");
            for (Employee employee : repository.findAll()) {
                log.info(employee.toString());
            }
            log.info("");

            log.info("Employee found with findByAge():");
            log.info("-------------------------------");
            Employee employee = repository.findByAge(22);
            log.info(employee.toString());

        };
    }
}

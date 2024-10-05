package com.prowin.clinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.prowin.clinic")
@EntityScan(basePackages = "com.prowin.clinic.model")  // Make sure this points to the package where your entity classes are located
@EnableJpaRepositories(basePackages = "com.prowin.clinic.repository")  // Ensure this points to your repository package
public class ClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClinicApplication.class, args);
    }
}

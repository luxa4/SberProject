package ru.sber.sberproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SberProjectApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SberProjectApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure (SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(SberProjectApplication.class);
    }
}

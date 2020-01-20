package com.ignarus.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer {
    public static void main (String args[])
    {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder)
    {
        return applicationBuilder.sources(SpringBootWebApplication.class);
    }
}
package com.ashish.cactus.school.multitenant.config;

import java.util.Properties;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MultitenantApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
//		SpringApplication.run(MultitenantApplication.class, args);
		
		 new MultitenantApplication()
         .configure(new SpringApplicationBuilder(MultitenantApplication.class))
         .properties(getDefaultProperties())
         .run(args);
	}
	
	private static Properties getDefaultProperties() {

        Properties defaultProperties = new Properties();

        // Set sane Spring Hibernate properties:
        defaultProperties.put("spring.jpa.show-sql", "true");
        defaultProperties.put("spring.jpa.hibernate.naming.physical-strategy", "org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl");
        defaultProperties.put("spring.datasource.initialize", "false");

        // Prevent JPA from trying to Auto Detect the Database:
        defaultProperties.put("spring.jpa.database", "mysql");

        // Prevent Hibernate from Automatic Changes to the DDL Schema:
        defaultProperties.put("spring.jpa.hibernate.ddl-auto", "none");

        return defaultProperties;
    }

}


package com.mozanta.pos;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class PosApplication extends SpringBootServletInitializer {
 
    private static final String SPRING_CONFIG_NAME = "spring.config.name:pos";

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(this.getClass()).properties(SPRING_CONFIG_NAME);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(PosApplication.class)
            .properties(SPRING_CONFIG_NAME).build().run(args);
    }
}

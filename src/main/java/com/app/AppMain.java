package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class AppMain {

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.additional-exclude","/META-INF/maven,/META-INF/resources,/resources,/static,/public,templates");
        //System.setProperty("spring.devtools.restart.enabled", "false");
        System.setProperty("spring.devtools.livereload.enabled","false");
        SpringApplication.run(AppMain.class, args);
    }
}

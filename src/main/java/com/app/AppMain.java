package com.app;

import com.app.service.dao.BaseRepository;
import com.app.service.dao.BaseRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.app.service.dao"},
        repositoryBaseClass = BaseRepositoryImpl.class)
@ComponentScan("com.app")
@SpringBootApplication
public class AppMain {

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.additional-exclude","/META-INF/maven,/META-INF/resources,/resources,/static,/public,templates");
        //System.setProperty("spring.devtools.restart.enabled", "false");
        System.setProperty("spring.devtools.livereload.enabled","false");
        SpringApplication.run(AppMain.class, args);
    }
}

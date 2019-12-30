package com.wind.sound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WindsoundApplication {

    public static void main(String[] args) {
        SpringApplication.run(WindsoundApplication.class, args);
    }

}

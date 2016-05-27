package com.example;

import com.example.config.MainConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringApplicationRunner {

    public static void main(String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication(MainConfig.class);
        springApplication.setWebEnvironment(false);
        springApplication.setLogStartupInfo(false);

        ConfigurableApplicationContext context = springApplication.run();
    }
}

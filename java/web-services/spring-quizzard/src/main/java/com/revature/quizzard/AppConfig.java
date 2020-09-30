package com.revature.quizzard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AppConfig {

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class);
    }

}

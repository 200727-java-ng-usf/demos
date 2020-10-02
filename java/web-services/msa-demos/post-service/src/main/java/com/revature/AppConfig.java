package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
<<<<<<< HEAD

@EnableEurekaClient
=======
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
>>>>>>> f129b70f7553797eaaab4ba93bd74130af1e388d
@SpringBootApplication
public class AppConfig {

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
<<<<<<< HEAD

=======
>>>>>>> f129b70f7553797eaaab4ba93bd74130af1e388d
}

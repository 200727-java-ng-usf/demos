package com.revature.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AppConfig {

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
<<<<<<< HEAD

=======
>>>>>>> 4586ccd3d7ab6da76dd3a6433d1dd2cbac2d827c
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
<<<<<<< HEAD
=======

>>>>>>> 4586ccd3d7ab6da76dd3a6433d1dd2cbac2d827c
}

package com.thanos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Thanos Yu
 * @date 2018/4/25
 */

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com")
@EntityScan(basePackages = "com")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

package me.ramos.k8sdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "me.ramos.k8sdemo.config")
public class K8sDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sDemoApplication.class, args);
    }

}

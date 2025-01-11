package me.ramos.k8sdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("admin")
@Configuration
@ComponentScan(basePackages = "me.ramos.k8sdemo.admin")
public class AdminProfileConfiguration {

}

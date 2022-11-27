package com.wcq.admin;

import io.lettuce.core.ScriptOutputType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.wcq.admin")
public class Springboot2test03Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot2test03Application.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            // System.out.println(name);
        }



    }

}

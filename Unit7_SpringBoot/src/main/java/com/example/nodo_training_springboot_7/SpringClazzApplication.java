package com.example.nodo_training_springboot_7;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:/resources/config.xml")
public class SpringClazzApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = (AnnotationConfigApplicationContext) SpringApplication.run(SpringClazzApplication.class,args);
        ctx.start();

    }
//    public static void main(String[] args) {
//        SpringApplication.run(SpringClazzApplication.class, args);
//    }
}

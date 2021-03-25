package cn.hbb.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 此命令声明是一个springboot应用，可以带来Spring Boot自动配置等功能
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}

package com.project.digital_store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication//此注解说明这是一个springboot应用的启动类
@ServletComponentScan//扫描过滤器等组件
public class DigitalStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalStoreApplication.class, args);
    }

    //配置允许跨域访问
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("*")
                        .allowCredentials(true);
            }
        };

    }
}

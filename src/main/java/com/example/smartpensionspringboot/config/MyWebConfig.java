package com.example.smartpensionspringboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @Authof: Huangchenyang
 * @Date: Create in 16:32 2018/8/8
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/imagem/**").addResourceLocations("file:E:/images/CustomerDemand/");
       // registry.addResourceHandler("/image/**").addResourceLocations("file:D:/image/");
    }
}
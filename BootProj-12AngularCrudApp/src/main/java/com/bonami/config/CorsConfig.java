package com.bonami.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
    	 registry.addMapping("/stduentapi/**")
         .allowedOrigins("http://localhost:4200")
         .allowedMethods("GET", "POST", "PUT", "DELETE")
         .allowedHeaders("*")
         .exposedHeaders("Access-Control-Allow-Origin") // Expose the CORS header
         .allowCredentials(true)
         .maxAge(3600);
    }
}
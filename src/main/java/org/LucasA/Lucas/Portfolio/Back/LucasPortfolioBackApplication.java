package org.LucasA.Lucas.Portfolio.Back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class LucasPortfolioBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(LucasPortfolioBackApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**").allowedOrigins("http://localhost:4200", "https://portfolio-angell.web.app").allowedMethods("*").allowedHeaders("*");
            }
        };
    }

}

package com.duoc.veterinaria_backend.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Deshabilitamos CSRF para usar JWT
            .authorizeRequests()
            // 1. URLs Públicas (Login, Registro, etc.)
            .antMatchers("/api/auth/**").permitAll() 
            // 2. URLs Privadas (Tu nueva API de Facturas)
            .antMatchers("/api/facturas/**").authenticated() 
            .anyRequest().authenticated()
            .and()
            .httpBasic(); // O puedes configurar el filtro JWT específico aquí

        return http.build();
    }
}
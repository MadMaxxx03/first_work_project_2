package com.example.first_work_project.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class ResourceServerConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.mvcMatcher("/application/**")
          .authorizeRequests()
          .mvcMatchers("/application/**")
          .access("hasAuthority('SCOPE_application.read')")
          .and()
          .oauth2ResourceServer()
          .jwt();
        return http.build();
    }
}
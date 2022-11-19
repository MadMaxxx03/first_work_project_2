package com.example.first_work_project.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoder;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoders;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class ResourceServerConfig {

    //Взято из старого примера "spring-security-oauth"
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.mvcMatcher("/application/**")
                .authorizeRequests()
                .mvcMatchers("/application/**")
                .access("hasRole('ADMIN')")
                .and()
                .oauth2ResourceServer()
                .jwt();
        return http.build();
    }

    @Bean
    public ReactiveJwtDecoder jwtDecoder() {
        return ReactiveJwtDecoders.fromIssuerLocation("http://localhost:9000");
    }


    //Взято с сайта  "https://docs.spring.io/spring-security/reference/reactive/oauth2/resource-server/jwt.html"
    //Не получается запустить из-за ошибки

    /*
    @Bean
    SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
                .authorizeExchange(exchanges -> exchanges
                        .pathMatchers("/application/**").hasRole("ADMIN")
                        .anyExchange().authenticated()
                )
                .oauth2ResourceServer(oauth2 -> oauth2
                        .jwt(withDefaults())
                );
        return http.build();
    }
    */

    /*
    @Bean
    SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
                .authorizeExchange(exchanges -> exchanges
                        .mvcMatchers("/contacts/**").hasAuthority("SCOPE_contacts")
                        .mvcMatchers("/messages/**").hasAuthority("SCOPE_messages")
                        .anyExchange().authenticated()
                )
                .oauth2ResourceServer(OAuth2ResourceServerSpec::jwt);
        return http.build();
    }

     */
}
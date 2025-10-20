package com.sillek.gitlite.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRequestAttributeHandler;

@Configuration
@EnableWebSecurity
public class GitLiteSecurityConfiguration {
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//	    http.authorizeHttpRequests(
//	      authorizeRequests -> authorizeRequests.requestMatchers("/swagger-ui/**")
//	        .permitAll()
//	        .requestMatchers("/v3/api-docs*/**")
//	        .permitAll());
//
//	    return http.build();
//	}

}

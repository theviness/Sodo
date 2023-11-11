package com.luuthienvi.sodo.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http
				.authorizeHttpRequests(authorize -> {
					authorize.requestMatchers("/").permitAll();
					authorize.anyRequest().authenticated();				
				})
				.oauth2Login(Customizer.withDefaults())	
				.formLogin(Customizer.withDefaults())
				.build();
	}
}

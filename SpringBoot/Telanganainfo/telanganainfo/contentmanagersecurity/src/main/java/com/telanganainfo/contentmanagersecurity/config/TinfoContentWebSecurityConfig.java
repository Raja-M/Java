
package com.telanganainfo.contentmanagersecurity.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class TinfoContentWebSecurityConfig {
	
	private static final String[] WHITE_LIST_URLS = {
			"/home",
			"/tinfouserregister",
			"/tinfouserverifytoken*",
			"/tinfouserresendtoken*",
			"/tinfouserresetpassword*",
			"/tinfousersavepassword*",
			"/tinfouserchangepassword*"
	};
	@Bean
	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder(11);	
		return  NoOpPasswordEncoder.getInstance();
	}
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http
				.cors()
				.and()
				.csrf()
				.disable()
				.authorizeHttpRequests()
				.antMatchers(WHITE_LIST_URLS).permitAll()
				.antMatchers("/api/**").authenticated()
				.and()
				.oauth2Login( oauth2login -> oauth2login.loginPage( "/oauth2/authorization/api-client-oidc"))
				.oauth2Client(Customizer.withDefaults());
				
				/*
				.anyRequest().authenticated()
				.and()
				.formLogin()
				.and()
				.httpBasic();
				*/
				
		return http.build();
	}

}



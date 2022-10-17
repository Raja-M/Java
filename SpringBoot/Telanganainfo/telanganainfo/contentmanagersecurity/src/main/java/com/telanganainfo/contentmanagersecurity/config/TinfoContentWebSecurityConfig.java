
package com.telanganainfo.contentmanagersecurity.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class TinfoContentWebSecurityConfig {
	
	private static final String[] WHITE_LIST_URLS = {
			"/home",
			"/tinfouserregister",
			"/tinfouserverifytoken*",
			"/tinfouseresendtoken*",
			"/tinfouserresetpassword*"
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
				.anyRequest().authenticated();
		
		return http.build();
	}

}



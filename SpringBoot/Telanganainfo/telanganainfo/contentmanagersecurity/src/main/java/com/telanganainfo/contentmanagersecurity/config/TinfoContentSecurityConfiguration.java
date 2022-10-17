package com.telanganainfo.contentmanagersecurity.config;

/*
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class TinfoContentSecurityConfiguration extends WebSecurityConfigurerAdapter {

	private static final String[] WHITE_LIST_URLS = {
			"/home",
			"/tinfouser"
	};
	@Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	        
	        	.csrf()
	        	.disable()
	        	.authorizeRequests()
//	        	.antMatchers("/admin").authenticated()
	        	.antMatchers(WHITE_LIST_URLS).permitAll()
	        	.anyRequest().authenticated()
	        	.and()
	        	.formLogin()
	        	.and()
	            .httpBasic(withDefaults());
	           /*
	           
			.cors()
			.and()
			.csrf()
			.disable()
			.authorizeHttpRequests()
			.antMatchers(WHITE_LIST_URLS).authenticated();
	     	    	
}

}
*/

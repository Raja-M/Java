package com.telanganainfo.contentmanageroauthauthorizationserver.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.telanganainfo.contentmanageroauthauthorizationserver.entity.TinfoUser;
import com.telanganainfo.contentmanageroauthauthorizationserver.repository.TinfoUserRepository;

@Service
@Transactional
public class TinfoUserCustomUserDetailsService implements UserDetailsService {

	@Autowired
	private TinfoUserRepository tinfoUserRepository;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder(11);	
		return  NoOpPasswordEncoder.getInstance();
	}
	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		TinfoUser user =  tinfoUserRepository.findByUseremail(email);
		boolean enabled = false;
		if ( user.getUserstatus().equalsIgnoreCase("ENABLED")) {
			enabled = true;
		}
		if ( user == null) {
			throw new UsernameNotFoundException("No User Found");	
		}
		UserDetails User = new org.springframework.security.core.userdetails.User(
				user.getUseremail(),
				user.getPassword(),
				enabled,
				true,
				true,
				true,
				getAuthorities(List.of(user.getUserrole() ))
				
				);
		return User;
		
	}
	private Collection<? extends GrantedAuthority> getAuthorities( List<String> roles){
		List<GrantedAuthority> authorities = new ArrayList<>();
		for(String role: roles ) {
			authorities.add( new SimpleGrantedAuthority (role));
		}
		return authorities;		
	}
}

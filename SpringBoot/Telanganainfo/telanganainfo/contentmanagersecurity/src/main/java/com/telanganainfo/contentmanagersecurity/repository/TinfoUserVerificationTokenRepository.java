package com.telanganainfo.contentmanagersecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telanganainfo.contentmanagersecurity.entity.TinfoUserVerificationToken;

@Repository
public interface TinfoUserVerificationTokenRepository extends 
		JpaRepository<TinfoUserVerificationToken, Long> {

 

	TinfoUserVerificationToken findByUserToken(String token);
}

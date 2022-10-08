package com.telanganainfo.contentmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telanganainfo.contentmanager.entity.TinfoUser;

@Repository
public interface TinfoUserRepository extends JpaRepository<TinfoUser, Long>{
	
	public TinfoUser findByUserfirstname(String userfirstname); 
	
	public TinfoUser findByUserfirstnameIgnoreCase(String userfirstname); 
}

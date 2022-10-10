package com.telanganainfo.contentmanager.service;


import java.util.List;

import org.springframework.data.repository.query.Param;

import com.telanganainfo.contentmanager.entity.TinfoUser;

public interface TinfoUserService {

	public TinfoUser saveTinfoUser(TinfoUser tinfoUser);

	public List<TinfoUser> fetchTinfoUserList();

	public TinfoUser fetchTinfoUserById(Long userid);
	
	public TinfoUser updateTinfoUser( Long userid, TinfoUser tinfoUser );

	public String deleteTinfoUser( Long userid );
	
	public TinfoUser fetchTinfoUserByUserfirstname( String userfirstname );
	
	public List<TinfoUser> findByUserfirstnameContaining(String username);
	
	public List<TinfoUser> findByTinfoUserContactCityContaining(String usercity);
	
	public List<TinfoUser> getByTinfoUserEmail(String email);
	
	public List<TinfoUser> getByTinfoUserEmailNative( String mailid);
	
	int updateUseremailByUserfirstname(String mailid,  String firstname);	
	
}

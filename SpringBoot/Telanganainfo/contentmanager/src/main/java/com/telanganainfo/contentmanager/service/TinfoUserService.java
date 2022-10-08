package com.telanganainfo.contentmanager.service;


import java.util.List;

import com.telanganainfo.contentmanager.entity.TinfoUser;

public interface TinfoUserService {

	public TinfoUser saveTinfoUser(TinfoUser tinfoUser);

	public List<TinfoUser> fetchTinfoUserList();

	public TinfoUser fetchTinfoUserById(Long userid);
	
	public TinfoUser updateTinfoUser( Long userid, TinfoUser tinfoUser );

	public String deleteTinfoUser( Long userid );
	
	public TinfoUser fetchTinfoUserByUserfirstname( String userfirstname );
	
}

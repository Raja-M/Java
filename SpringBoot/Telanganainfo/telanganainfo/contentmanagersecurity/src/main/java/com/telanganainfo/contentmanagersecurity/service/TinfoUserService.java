package com.telanganainfo.contentmanagersecurity.service;

import java.util.List;


import com.telanganainfo.contentmanagersecurity.entity.TinfoUser;
import com.telanganainfo.contentmanagersecurity.entity.TinfoUserVerificationToken;
import com.telanganainfo.contentmanagersecurity.model.TinfoUserModel;

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

	public TinfoUser registerUser(TinfoUserModel userModel);

	public void saveTinfoUserVerificationTokenForUser(String token, TinfoUser user);

	public String validateVerificationToken(String token);


	public TinfoUserVerificationToken resendVerificationToken(String token);

	

	public void createPasswordRestTokenForUser(TinfoUser user, String token);

	public TinfoUser findByUseremail(String email);

	public String validatePasswordResetToken(String token);

	public java.util.Optional<TinfoUser> getByTinfoUserPasswordResetToken(String token);

	public void changePassword(TinfoUser tinfoUser, String newpassword);

	public boolean checkIfValidOldPassword(TinfoUser user, String oldpassword);
	
	
	
	
	

	 
	
}
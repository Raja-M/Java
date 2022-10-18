package com.telanganainfo.contentmanagersecurity.entity;

public class TinfoUserPasswordModel {
	
	private String useremail;
	
	private String oldpassword;
	
	private String newpassword;

	public TinfoUserPasswordModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TinfoUserPasswordModel(String useremail, String oldpassword, String newpassword) {
		super();
		this.useremail = useremail;
		this.oldpassword = oldpassword;
		this.newpassword = newpassword;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getOldpassword() {
		return oldpassword;
	}

	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	 
	
	
	 
	
	
}

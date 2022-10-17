package com.telanganainfo.contentmanagersecurity.model;

import javax.persistence.Column;


public class TinfoUserModel {



	private String userfirstname;
	private String userlastname;
	private String useremail;

	@Column(length = 60)
	private String userpassword;
	@Column(length = 60)
	private String usermatchingpassword;
	
	public TinfoUserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TinfoUserModel(String userfirstname, String userlastname, String useremail, String userpassword,
			String usermatchingpassword) {
		super();
		this.userfirstname = userfirstname;
		this.userlastname = userlastname;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.usermatchingpassword = usermatchingpassword;
	}

	public String getUserfirstname() {
		return userfirstname;
	}

	public void setUserfirstname(String userfirstname) {
		this.userfirstname = userfirstname;
	}

	public String getUserlastname() {
		return userlastname;
	}

	public void setUserlastname(String userlastname) {
		this.userlastname = userlastname;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUsermatchingpassword() {
		return usermatchingpassword;
	}

	public void setUsermatchingpassword(String usermatchingpassword) {
		this.usermatchingpassword = usermatchingpassword;
	}

	@Override
	public String toString() {
		return "TinfoUserModel [userfirstname=" + userfirstname + ", userlastname=" + userlastname + ", useremail="
				+ useremail + ", userpassword=" + userpassword + ", usermatchingpassword=" + usermatchingpassword + "]";
	}
	
}

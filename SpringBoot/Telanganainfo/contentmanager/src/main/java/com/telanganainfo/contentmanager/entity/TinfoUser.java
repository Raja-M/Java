package com.telanganainfo.contentmanager.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name= "tinfouser")
public class TinfoUser {
	
	@Id
	private Long userid;
	private String useremail;
	private String userfirstname;
	private String userlastname;
	private String userrole;
	private String usercreatetime;
	private String usermodifiedtime;
	private String userstatus;
	
	public TinfoUser() {
		super();
	}

	public TinfoUser(Long userid, String useremail, String userfirstname, String userlastname, String userrole,
			String usercreatetime, String usermodifiedtime, String userstatus) {
		super();
		this.userid = userid;
		this.useremail = useremail;
		this.userfirstname = userfirstname;
		this.userlastname = userlastname;
		this.userrole = userrole;
		this.usercreatetime = usercreatetime;
		this.usermodifiedtime = usermodifiedtime;
		this.userstatus = userstatus;
	}
	
	
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
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
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	public String getUsercreatetime() {
		return usercreatetime;
	}
	public void setUsercreatetime(String usercreatetime) {
		this.usercreatetime = usercreatetime;
	}
	public String getUsermodifiedtime() {
		return usermodifiedtime;
	}
	public void setUsermodifiedtime(String usermodifiedtime) {
		this.usermodifiedtime = usermodifiedtime;
	}
	public String getUserstatus() {
		return userstatus;
	}
	public void setUserstatus(String userstatus) {
		this.userstatus = userstatus;
	}

	@Override
	public String toString() {
		return "TinfoUser [userid=" + userid + ", useremail=" + useremail + ", userfirstname=" + userfirstname
				+ ", userlastname=" + userlastname + ", userrole=" + userrole + ", usercreatetime=" + usercreatetime
				+ ", usermodifiedtime=" + usermodifiedtime + ", userstatus=" + userstatus + "]";
	}
	
	
}

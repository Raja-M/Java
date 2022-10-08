package com.telanganainfo.contentmanager.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name= "tinfouser")
public class TinfoUser {
	
	@Id
	private Long userid;
	private String userfirstname;
	private String userlastname;
	private String userrole;
	private String usercreatetime;
	private String usermodifiedtime;
	private String userstatus;
	private String useremail;
	private int userphonecountrycode;
	private int userphone;
	private int useralternatephone;
	private String useraddresshousenumber;
	private String useraddressstreet;
	private String useraddressaptorsuiteno;
	private String usercity;
	private String userstate;
	private String usercountry;
	private String userzipcode;
	
	
	
	
	
	public TinfoUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TinfoUser(Long userid, String userfirstname, String userlastname, String userrole, String usercreatetime,
			String usermodifiedtime, String userstatus, String useremail, int userphonecountrycode, int userphone,
			int useralternatephone, String useraddresshousenumber, String useraddressstreet,
			String useraddressaptorsuiteno, String usercity, String userstate, String usercountry, String userzipcode) {
		super();
		this.userid = userid;
		this.userfirstname = userfirstname;
		this.userlastname = userlastname;
		this.userrole = userrole;
		this.usercreatetime = usercreatetime;
		this.usermodifiedtime = usermodifiedtime;
		this.userstatus = userstatus;
		this.useremail = useremail;
		this.userphonecountrycode = userphonecountrycode;
		this.userphone = userphone;
		this.useralternatephone = useralternatephone;
		this.useraddresshousenumber = useraddresshousenumber;
		this.useraddressstreet = useraddressstreet;
		this.useraddressaptorsuiteno = useraddressaptorsuiteno;
		this.usercity = usercity;
		this.userstate = userstate;
		this.usercountry = usercountry;
		this.userzipcode = userzipcode;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
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
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public int getUserphonecountrycode() {
		return userphonecountrycode;
	}
	public void setUserphonecountrycode(int userphonecountrycode) {
		this.userphonecountrycode = userphonecountrycode;
	}
	public int getUserphone() {
		return userphone;
	}
	public void setUserphone(int userphone) {
		this.userphone = userphone;
	}
	public int getUseralternatephone() {
		return useralternatephone;
	}
	public void setUseralternatephone(int useralternatephone) {
		this.useralternatephone = useralternatephone;
	}
	public String getUseraddresshousenumber() {
		return useraddresshousenumber;
	}
	public void setUseraddresshousenumber(String useraddresshousenumber) {
		this.useraddresshousenumber = useraddresshousenumber;
	}
	public String getUseraddressstreet() {
		return useraddressstreet;
	}
	public void setUseraddressstreet(String useraddressstreet) {
		this.useraddressstreet = useraddressstreet;
	}
	public String getUseraddressaptorsuiteno() {
		return useraddressaptorsuiteno;
	}
	public void setUseraddressaptorsuiteno(String useraddressaptorsuiteno) {
		this.useraddressaptorsuiteno = useraddressaptorsuiteno;
	}
	public String getUsercity() {
		return usercity;
	}
	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}
	public String getUserstate() {
		return userstate;
	}
	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}
	public String getUsercountry() {
		return usercountry;
	}
	public void setUsercountry(String usercountry) {
		this.usercountry = usercountry;
	}
	public String getUserzipcode() {
		return userzipcode;
	}
	public void setUserzipcode(String userzipcode) {
		this.userzipcode = userzipcode;
	}
	
	@Override
	public String toString() {
		return "TinfoUser [userid=" + userid + ", userfirstname=" + userfirstname + ", userlastname=" + userlastname
				+ ", userrole=" + userrole + ", usercreatetime=" + usercreatetime + ", usermodifiedtime="
				+ usermodifiedtime + ", userstatus=" + userstatus + ", useremail=" + useremail
				+ ", userphonecountrycode=" + userphonecountrycode + ", userphone=" + userphone
				+ ", useralternatephone=" + useralternatephone + ", useraddresshousenumber=" + useraddresshousenumber
				+ ", useraddressstreet=" + useraddressstreet + ", useraddressaptorsuiteno=" + useraddressaptorsuiteno
				+ ", usercity=" + usercity + ", userstate=" + userstate + ", usercountry=" + usercountry
				+ ", userzipcode=" + userzipcode + "]";
	}
	
	
	
	
}

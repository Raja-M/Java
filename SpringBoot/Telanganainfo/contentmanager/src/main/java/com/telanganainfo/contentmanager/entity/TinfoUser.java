package com.telanganainfo.contentmanager.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tinfouser")
public class TinfoUser {

	@Id
	@SequenceGenerator(
				name = "tinfouser_sequence",
				sequenceName = "tinfouser_sequence",
				allocationSize = 1
			)
	@GeneratedValue(
				strategy = GenerationType.SEQUENCE,
				generator = "tinfouser_sequence"
			)
	private Long userid;
	private String userfirstname;
	private String userlastname;
	private String userrole;
	private String usercreatetime;
	private String usermodifiedtime;
	private String userstatus;



	@Embedded
	private TinfoUserContact tinfoUserContact;
	/*
	@OneToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
//			optional = false   // this works only for onetoone relationship only.
			
			)
	@JoinColumn(
			name = "contenteditorid",
			referencedColumnName = "userid"
			)
	@JoinColumn(
			name = "contentapproverid",
			referencedColumnName = "userid"
			)
	private List<TinfoContent> tinfoContents;
	*/
	/* Example of By directional one to one mapping 
	 * removed content editor and content approver from to string of tinfocontent because of circular reference and stackoverflow.
	 * As Tinfouser user id is foreign key in the tinfocontent table
	 * to get all the content referenced by userid  we can use mapped by foreign key field
	 * commented since we are changing the relation ship from tinfouser -> tinfocontent from one to one to One to many.
	 
	@OneToOne(
			mappedBy = "contenteditor"
			)
	private TinfoContent tinfoContent1;
	
	@OneToOne(
			mappedBy = "contentapprover"
			)
	private TinfoContent tinfoContent2;
	
	*/
	public TinfoUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TinfoUser(Long userid, String userfirstname, String userlastname, String userrole, String usercreatetime,
			String usermodifiedtime, String userstatus, TinfoUserContact tinfoUserContact) {
		super();
		this.userid = userid;
		this.userfirstname = userfirstname;
		this.userlastname = userlastname;
		this.userrole = userrole;
		this.usercreatetime = usercreatetime; 	
		this.usermodifiedtime = usermodifiedtime;
		this.userstatus = userstatus;
		this.tinfoUserContact = tinfoUserContact;
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
	public TinfoUserContact getTinfoUserContact() {
		return tinfoUserContact;
	}
	public void setTinfoUserContact(TinfoUserContact tinfoUserContact) {
		this.tinfoUserContact = tinfoUserContact;
	}
	@Override
	public String toString() {
		return "TinfoUser [userid=" + userid + ", userfirstname=" + userfirstname + ", userlastname=" + userlastname
				+ ", userrole=" + userrole + ", usercreatetime=" + usercreatetime + ", usermodifiedtime="
				+ usermodifiedtime + ", userstatus=" + userstatus + ", tinfoUserContact=" + tinfoUserContact + "]";
	}
}


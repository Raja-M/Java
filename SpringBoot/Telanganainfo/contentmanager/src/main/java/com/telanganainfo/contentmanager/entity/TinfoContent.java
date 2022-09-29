package com.telanganainfo.contentmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
/*
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
*/
@Table( name= "tinfocontent")
public class  TinfoContent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long contentid;
	@NotBlank(message="Content Title cant be blank")
	private String contenttitle;
	
	@Column(name="contentbody" , length = 65535, columnDefinition="TEXT")
	@Type(type="text")
	private String contentbody;
	private int contenteditorid;
	private int contentapproverid;
	private String contentcreatetime;
	private String contentupdatetime;
	private char contentstatus;
	private String contentcity;
	private String contentmandal;
	private int contentplaceid;
	private String contentpicurl;
	
	
	
	
	
	public TinfoContent() {
		super();
		// TODO Auto-generated constructor stub
	}
			
	public TinfoContent(Long contentid, @NotBlank(message = "Content Title cant be blank") String contenttitle,
			String contentbody, int contenteditorid, int contentapproverid, String contentcreatetime,
			String contentupdatetime, char contentstatus, String contentcity, String contentmandal, int contentplaceid,
			String contentpicurl) {
		super();
		this.contentid = contentid;
		this.contenttitle = contenttitle;
		this.contentbody = contentbody;
		this.contenteditorid = contenteditorid;
		this.contentapproverid = contentapproverid;
		this.contentcreatetime = contentcreatetime;
		this.contentupdatetime = contentupdatetime;
		this.contentstatus = contentstatus;
		this.contentcity = contentcity;
		this.contentmandal = contentmandal;
		this.contentplaceid = contentplaceid;
		this.contentpicurl = contentpicurl;
	}


	public Long getContentid() {
		return contentid;
	}
	public void setContentid(Long contentid) {
		this.contentid = contentid;
	}
	public String getContenttitle() {
		return contenttitle;
	}
	public void setContenttitle(String contenttitle) {
		this.contenttitle = contenttitle;
	}
	public String getContentbody() {
		return contentbody;
	}
	public void setContentbody(String contentbody) {
		this.contentbody = contentbody;
	}
	public int getContenteditorid() {
		return contenteditorid;
	}
	public void setContenteditorid(int contenteditorid) {
		this.contenteditorid = contenteditorid;
	}
	public int getContentapproverid() {
		return contentapproverid;
	}
	public void setContentapproverid(int contentapproverid) {
		this.contentapproverid = contentapproverid;
	}
	public String getContentcreatetime() {
		return contentcreatetime;
	}
	public void setContentcreatetime(String contentcreatetime) {
		this.contentcreatetime = contentcreatetime;
	}
	public String getContentupdatetime() {
		return contentupdatetime;
	}
	public void setContentupdatetime(String contentupdatetime) {
		this.contentupdatetime = contentupdatetime;
	}
	public char getContentstatus() {
		return contentstatus;
	}
	public void setContentstatus(char contentstatus) {
		this.contentstatus = contentstatus;
	}
	public String getContentcity() {
		return contentcity;
	}
	public void setContentcity(String contentcity) {
		this.contentcity = contentcity;
	}
	public String getContentmandal() {
		return contentmandal;
	}
	public void setContentmandal(String contentmandal) {
		this.contentmandal = contentmandal;
	}
	public int getContentplaceid() {
		return contentplaceid;
	}
	public void setContentplaceid(int contentplaceid) {
		this.contentplaceid = contentplaceid;
	}
	public String getContentpicurl() {
		return contentpicurl;
	}
	public void setContentpicurl(String contentpicurl) {
		this.contentpicurl = contentpicurl;
	}
	
	
	
	
}
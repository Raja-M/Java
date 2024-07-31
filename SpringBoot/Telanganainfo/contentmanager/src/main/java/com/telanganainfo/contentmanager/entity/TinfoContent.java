package com.tgnews.tgnews.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
/*
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
*/
@Table( name= "tinfocontent")
//@ToString( exclude =  {"contenteditor" , "contentapprover"})
public class  TinfoContent {
	

	@Id
	@SequenceGenerator(
			name = "tinfocontent_sequence",
			sequenceName = "tinfocontent_sequence",
			allocationSize = 1 
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "tinfocontent_sequence"
			)
	private Long contentid;
	@NotBlank(message="Content Title cant be blank")
	private String contenttitle;
	
	@Column(name="contentbody" , length = 65535, columnDefinition="TEXT")
	@Type(type="text")
	private String contentbody;
 
	private String contentcreatetime;
	private String contentupdatetime;
	private char contentstatus;
	private String contentcity;
	private String contentmandal;
	private int contentplaceid;
	private String contentpicurl;
  
	@ManyToOne(	
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER,
			optional = false
	)
	@JoinColumn(
			name = "contenteditorid",
			referencedColumnName = "userid"
			
	)
	private TinfoUser contenteditor;
 
	@ManyToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER,
			optional = false
	)
	@JoinColumn(
			name = "contentapproverid",
			referencedColumnName = "userid"
			
	)
	private TinfoUser contentapprover;
 
	@ManyToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER
	)
	@JoinTable(
			name = "tinfocontentcategorymap",
			joinColumns = @JoinColumn(
					name = "contentid"	,
					referencedColumnName = "contentid"
			),
			inverseJoinColumns = @JoinColumn(
					name = "categoryid",
					referencedColumnName ="categoryid"					
			)
			
	)
	private List<TinfoCategory> tinfoCategories;
	
	/*
	 * commented since we are changing the relation ship from tinfouser -> tinfocontent from one to one to One to many.
	@OneToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
			)
	@JoinColumn(
			name = "contenteditorid",
			referencedColumnName= "userid"
			)
	private TinfoUser contenteditor;
	
	@OneToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
			)
	@JoinColumn(
			name = "contentapproverid",
			referencedColumnName = "userid"
			)
	private TinfoUser contentapprover;

	*/
	
	
	public TinfoContent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TinfoContent(Long contentid, @NotBlank(message = "Content Title cant be blank") String contenttitle,
			String contentbody, String contentcreatetime, String contentupdatetime, char contentstatus,
			String contentcity, String contentmandal, int contentplaceid, String contentpicurl, TinfoUser contenteditor,
			TinfoUser contentapprover, List<TinfoCategory> tinfoCategories) {
		super();
		this.contentid = contentid;
		this.contenttitle = contenttitle;
		this.contentbody = contentbody;
		this.contentcreatetime = contentcreatetime;
		this.contentupdatetime = contentupdatetime;
		this.contentstatus = contentstatus;
		this.contentcity = contentcity;
		this.contentmandal = contentmandal;
		this.contentplaceid = contentplaceid;
		this.contentpicurl = contentpicurl;
		this.contenteditor = contenteditor;
		this.contentapprover = contentapprover;
		this.tinfoCategories = tinfoCategories;
	}
	
	public void addTinfoCategories( TinfoCategory tinfoCategory) {
		
		if(tinfoCategories == null) tinfoCategories = new ArrayList<>();
		tinfoCategories.add(tinfoCategory);		
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

	public TinfoUser getContenteditor() {
		return contenteditor;
	}

	public void setContenteditor(TinfoUser contenteditor) {
		this.contenteditor = contenteditor;
	}

	public TinfoUser getContentapprover() {
		return contentapprover;
	}

	public void setContentapprover(TinfoUser contentapprover) {
		this.contentapprover = contentapprover;
	}

	public List<TinfoCategory> getTinfoCategories() {
		return tinfoCategories;
	}

	public void setTinfoCategories(List<TinfoCategory> tinfoCategories) {
		this.tinfoCategories = tinfoCategories;
	}

	@Override
	public String toString() {
		return "TinfoContent [contentid=" + contentid + ", contenttitle=" + contenttitle + ", contentbody="
				+ contentbody + ", contentcreatetime=" + contentcreatetime + ", contentupdatetime=" + contentupdatetime
				+ ", contentstatus=" + contentstatus + ", contentcity=" + contentcity + ", contentmandal="
				+ contentmandal + ", contentplaceid=" + contentplaceid + ", contentpicurl=" + contentpicurl
				+ ", contenteditor=" + contenteditor + ", contentapprover=" + contentapprover + ", tinfoCategories="
				+ tinfoCategories + "]";
	}


	
	 
	 	
	
}
package com.telanganainfo.contentmanager.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table( name = "tinfocategory",
		uniqueConstraints = @UniqueConstraint(
					name = "categorydescription_unique",
					columnNames = {"categorydescription"	}	// can give multiple columns		
				)
		)
public class TinfoCategory {
	
	@Id
	@SequenceGenerator(
				name = "tinfocategory_sequence",
				sequenceName = "tinfocategory_sequence",
				allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "tinfocategory_sequence"
			)
	private Long categoryid;
//	@NotNull
	@Column(nullable = false)
	private String categorydescription;
	@NotNull
	private String categoryupdatetime;
	@NotNull
	private int categorycreatedby;
	
	/*
	@ManyToMany( 
			
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER
	)
	@JoinTable(
			name = "tinfocontentcategorymap",
			joinColumns = @JoinColumn(
					name = "categoryid",
					referencedColumnName = "categoryid"				
			),
			inverseJoinColumns = @JoinColumn(
					name = "contentid",
					referencedColumnName = "contentid"					
			)			
	)
	private List<TinfoContent> tinfoContents;
	*/
	
	public TinfoCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TinfoCategory(Long categoryid, String categorydescription, @NotNull String categoryupdatetime,
			@NotNull int categorycreatedby) {
		super();
		this.categoryid = categoryid;
		this.categorydescription = categorydescription;
		this.categoryupdatetime = categoryupdatetime;
		this.categorycreatedby = categorycreatedby;
	}

	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategorydescription() {
		return categorydescription;
	}

	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}

	public String getCategoryupdatetime() {
		return categoryupdatetime;
	}

	public void setCategoryupdatetime(String categoryupdatetime) {
		this.categoryupdatetime = categoryupdatetime;
	}

	public int getCategorycreatedby() {
		return categorycreatedby;
	}

	public void setCategorycreatedby(int categorycreatedby) {
		this.categorycreatedby = categorycreatedby;
	}

	@Override
	public String toString() {
		return "TinfoCategory [categoryid=" + categoryid + ", categorydescription=" + categorydescription
				+ ", categoryupdatetime=" + categoryupdatetime + ", categorycreatedby=" + categorycreatedby + "]";
	}

	
}

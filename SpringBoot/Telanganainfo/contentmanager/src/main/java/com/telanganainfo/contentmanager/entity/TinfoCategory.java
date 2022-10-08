package com.telanganainfo.contentmanager.entity;

import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table( name = "tinfocategory",
		uniqueConstraints = @UniqueConstraint(
					name = "categorydescription_unique",
					columnNames = "categorydescription"				
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
	private Long categorytid;
//	@NotNull
	@Column(nullable = false)
	private String categorydescription;
	@NotNull
	private String categoryupdatetime;
	@NotNull
	private int categorycreatedby;
	
	
	public TinfoCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TinfoCategory(Long categorytid, @NotNull String categorydescription, @NotNull String categoryupdatetime,
			@NotNull int categorycreatedby) {
		super();
		this.categorytid = categorytid;
		this.categorydescription = categorydescription;
		this.categoryupdatetime = categoryupdatetime;
		this.categorycreatedby = categorycreatedby;
	}
	public Long getCategorytid() {
		return categorytid;
	}
	public void setCategorytid(Long categorytid) {
		this.categorytid = categorytid;
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
		return "TinfoCategory [categorytid=" + categorytid + ", categorydescription=" + categorydescription
				+ ", categoryupdatetime=" + categoryupdatetime + ", categorycreatedby=" + categorycreatedby + "]";
	}
	
}

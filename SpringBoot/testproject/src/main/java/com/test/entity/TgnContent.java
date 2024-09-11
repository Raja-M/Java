package com.test.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;


@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table( name= "tgncontent")
//@ToString( exclude =  {"contenteditor" , "contentapprover"})
public class TgnContent {
	

	@Id
	@SequenceGenerator(
			name = "tgncontent_sequence",
			sequenceName = "tgncontent_sequence",
			allocationSize = 1 
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "tgncontent_sequence"
			)
	private Long contentid;

	private String contenttitle;
	
	@Column(name="contentbody" , length = 65535, columnDefinition="TEXT")
	private String contentbody;
 
	private String contentcreatetime;
	private String contentupdatetime;
	private char contentstatus;
	private String contentcity;
	private String contentmandal;
	private int contentplaceid;
	private String contentpicurl;

	
}
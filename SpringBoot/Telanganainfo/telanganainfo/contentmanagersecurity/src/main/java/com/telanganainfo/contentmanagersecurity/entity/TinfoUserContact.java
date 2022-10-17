package com.telanganainfo.contentmanagersecurity.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@AttributeOverrides({ 
	@AttributeOverride(name = "email", column = @Column(name = "useremail")),
	@AttributeOverride(name = "phonecountrycode", column = @Column(name = "userphonecountrycode")),
	@AttributeOverride(name = "phone", column = @Column(name = "userphone")),
	@AttributeOverride(name = "alternatephone", column = @Column(name = "useralternatephone")),
	@AttributeOverride(name = "addresshousenumber", column = @Column(name = "useraddresshousenumber")),
	@AttributeOverride(name = "addressstreet", column = @Column(name = "useraddressstreet")),
	@AttributeOverride(name = "addressaptorsuiteno", column = @Column(name = "useraddressaptorsuiteno")),
	@AttributeOverride(name = "city", column = @Column(name = "usercity")),
	@AttributeOverride(name = "state", column = @Column(name = "userstate")),
	@AttributeOverride(name = "country", column = @Column(name = "usercountry")),
	@AttributeOverride(name = "zipcode", column = @Column(name = "userzipcode")) 
})

public class TinfoUserContact {
	
	
	
	private int phonecountrycode;
	private Long phone;
	private Long alternatephone;
	private String addresshousenumber;
	private String addressstreet;
	private String addressaptorsuiteno;
	private String city;
	private String state;
	private String country;
	private String zipcode;
	
	public TinfoUserContact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TinfoUserContact( int phonecountrycode, Long phone, Long alternatephone,
			String addresshousenumber, String addressstreet, String addressaptorsuiteno, String city, String state,
			String country, String zipcode) {
		super();

		this.phonecountrycode = phonecountrycode;
		this.phone = phone;
		this.alternatephone = alternatephone;
		this.addresshousenumber = addresshousenumber;
		this.addressstreet = addressstreet;
		this.addressaptorsuiteno = addressaptorsuiteno;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}


	public int getPhonecountrycode() {
		return phonecountrycode;
	}

	public void setPhonecountrycode(int phonecountrycode) {
		this.phonecountrycode = phonecountrycode;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Long getAlternatephone() {
		return alternatephone;
	}

	public void setAlternatephone(Long alternatephone) {
		this.alternatephone = alternatephone;
	}

	public String getAddresshousenumber() {
		return addresshousenumber;
	}

	public void setAddresshousenumber(String addresshousenumber) {
		this.addresshousenumber = addresshousenumber;
	}

	public String getAddressstreet() {
		return addressstreet;
	}

	public void setAddressstreet(String addressstreet) {
		this.addressstreet = addressstreet;
	}

	public String getAddressaptorsuiteno() {
		return addressaptorsuiteno;
	}

	public void setAddressaptorsuiteno(String addressaptorsuiteno) {
		this.addressaptorsuiteno = addressaptorsuiteno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "TinfoUserContact [phonecountrycode=" + phonecountrycode + ", phone=" + phone + ", alternatephone="
				+ alternatephone + ", addresshousenumber=" + addresshousenumber + ", addressstreet=" + addressstreet
				+ ", addressaptorsuiteno=" + addressaptorsuiteno + ", city=" + city + ", state=" + state + ", country="
				+ country + ", zipcode=" + zipcode + "]";
	}	
}

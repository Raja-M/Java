package com.telanganainfo.contentmanagersecurity.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tinfouserpasswordresttoken")
public class TinfoUserPasswordResetToken {

	// Expiration time
	private static final int EXPIRATION_TIME = 10;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String userToken;

	private Date expirationTime;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userid", 
				nullable = false, 
				foreignKey = @ForeignKey(name = "FK_USER_PASWORD_USERTOKEN"))
	private TinfoUser user;

	public TinfoUserPasswordResetToken() {
			super();
			// TODO Auto-generated constructor stub
		}

	public TinfoUserPasswordResetToken( TinfoUser user, String userToken) {
			super();
			this.userToken = userToken;
			this.user = user;
			this.expirationTime = calculateExpirationDate( EXPIRATION_TIME);
			
		}

	public TinfoUserPasswordResetToken(  String userToken) {
			super();
			this.userToken = userToken;
			this.expirationTime = calculateExpirationDate( EXPIRATION_TIME);
			
		}

	private Date calculateExpirationDate(int expirationTime) {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(new Date().getTime());
		calendar.add(Calendar.MINUTE, expirationTime);

		return new Date(calendar.getTime().getTime());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public Date getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}

	public TinfoUser getUser() {
		return user;
	}

	public void setUser(TinfoUser user) {
		this.user = user;
	}

}

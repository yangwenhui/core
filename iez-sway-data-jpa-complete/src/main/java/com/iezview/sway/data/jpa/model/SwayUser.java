package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sway_user database table.
 * 
 */
@Entity
@Table(name = "sway_user")
@NamedQuery(name = "SwayUser.findAll", query = "SELECT s FROM SwayUser s")
public class SwayUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	private Long userId;

	@Column(length = 64)
	private String address;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "reg_time", nullable = false)
	private Date regTime;

	@Column(name = "reg_type", nullable = false)
	private int regType;

	@Column(name = "sign_name", length = 256)
	private String signName;

	@Column(name = "user_email", length = 256)
	private String userEmail;

	@Column(name = "user_img_url", nullable = false, length = 256)
	private String userImgUrl;

	@Column(name = "user_name", nullable = false, length = 64)
	private String userName;

	@Column(name = "user_phone", length = 16)
	private String userPhone;

	@Column(name = "user_qq", length = 64)
	private String userQq;

	@Column(name = "user_sex", nullable = false)
	private int userSex;

	@Column(name = "user_wechat", length = 64)
	private String userWechat;

	public SwayUser() {
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegTime() {
		return this.regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public int getRegType() {
		return this.regType;
	}

	public void setRegType(int regType) {
		this.regType = regType;
	}

	public String getSignName() {
		return this.signName;
	}

	public void setSignName(String signName) {
		this.signName = signName;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserImgUrl() {
		return this.userImgUrl;
	}

	public void setUserImgUrl(String userImgUrl) {
		this.userImgUrl = userImgUrl;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserQq() {
		return this.userQq;
	}

	public void setUserQq(String userQq) {
		this.userQq = userQq;
	}

	public int getUserSex() {
		return this.userSex;
	}

	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}

	public String getUserWechat() {
		return this.userWechat;
	}

	public void setUserWechat(String userWechat) {
		this.userWechat = userWechat;
	}

}
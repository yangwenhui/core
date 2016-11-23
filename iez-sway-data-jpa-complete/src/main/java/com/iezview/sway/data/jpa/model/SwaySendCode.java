package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sway_send_code database table.
 * 
 */
@Entity
@Table(name = "sway_send_code")
@NamedQuery(name = "SwaySendCode.findAll", query = "SELECT s FROM SwaySendCode s")
public class SwaySendCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "log_id", unique = true, nullable = false)
	private Long logId;

	@Column(name = "log_auth_code", nullable = false, length = 10)
	private String logAuthCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "log_auth_time", nullable = false)
	private Date logAuthTime;

	@Column(name = "log_phone", nullable = false, length = 16)
	private String logPhone;

	public SwaySendCode() {
	}

	public Long getLogId() {
		return this.logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public String getLogAuthCode() {
		return this.logAuthCode;
	}

	public void setLogAuthCode(String logAuthCode) {
		this.logAuthCode = logAuthCode;
	}

	public Date getLogAuthTime() {
		return this.logAuthTime;
	}

	public void setLogAuthTime(Date logAuthTime) {
		this.logAuthTime = logAuthTime;
	}

	public String getLogPhone() {
		return this.logPhone;
	}

	public void setLogPhone(String logPhone) {
		this.logPhone = logPhone;
	}

}
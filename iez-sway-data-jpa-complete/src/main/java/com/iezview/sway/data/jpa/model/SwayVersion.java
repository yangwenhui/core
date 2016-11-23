package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sway_version database table.
 * 
 */
@Entity
@Table(name = "sway_version")
@NamedQuery(name = "SwayVersion.findAll", query = "SELECT s FROM SwayVersion s")
public class SwayVersion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ver_id", unique = true, nullable = false)
	private Long verId;

	@Column(name = "ver_code", nullable = false, length = 64)
	private String verCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ver_time", nullable = false)
	private Date verTime;

	@Column(name = "ver_url", nullable = false, length = 256)
	private String verUrl;

	public SwayVersion() {
	}

	public Long getVerId() {
		return this.verId;
	}

	public void setVerId(Long verId) {
		this.verId = verId;
	}

	public String getVerCode() {
		return this.verCode;
	}

	public void setVerCode(String verCode) {
		this.verCode = verCode;
	}

	public Date getVerTime() {
		return this.verTime;
	}

	public void setVerTime(Date verTime) {
		this.verTime = verTime;
	}

	public String getVerUrl() {
		return this.verUrl;
	}

	public void setVerUrl(String verUrl) {
		this.verUrl = verUrl;
	}

}
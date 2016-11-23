package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the sway_push database table.
 * 
 */
@Entity
@Table(name = "sway_push")
@NamedQuery(name = "SwayPush.findAll", query = "SELECT s FROM SwayPush s")
public class SwayPush implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;

	@Column(name = "push_id", nullable = false, length = 128)
	private String pushId;

	private int status;

	private int type;

	@Column(name = "user_id", nullable = false)
	private int userId;

	public SwayPush() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPushId() {
		return this.pushId;
	}

	public void setPushId(String pushId) {
		this.pushId = pushId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
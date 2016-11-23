package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sway_collect database table.
 * 
 */
@Entity
@Table(name = "sway_collect")
@NamedQuery(name = "SwayCollect.findAll", query = "SELECT s FROM SwayCollect s")
public class SwayCollect implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "collect_id", unique = true, nullable = false)
	private Long collectId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "collect_time", nullable = false)
	private Date collectTime;

	@Column(name = "user_id", nullable = false)
	private int userId;

	@Column(name = "works_id", nullable = false)
	private int worksId;

	public SwayCollect() {
	}

	public Long getCollectId() {
		return this.collectId;
	}

	public void setCollectId(Long collectId) {
		this.collectId = collectId;
	}

	public Date getCollectTime() {
		return this.collectTime;
	}

	public void setCollectTime(Date collectTime) {
		this.collectTime = collectTime;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getWorksId() {
		return this.worksId;
	}

	public void setWorksId(int worksId) {
		this.worksId = worksId;
	}

}
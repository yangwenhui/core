package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sway_paraise database table.
 * 
 */
@Entity
@Table(name = "sway_paraise")
@NamedQuery(name = "SwayParaise.findAll", query = "SELECT s FROM SwayParaise s")
public class SwayParaise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paraise_id", unique = true, nullable = false)
	private Long paraiseId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", nullable = false)
	private Date createTime;

	@Column(name = "user_id", nullable = false)
	private int userId;

	@Column(name = "works_id", nullable = false)
	private int worksId;

	public SwayParaise() {
	}

	public Long getParaiseId() {
		return this.paraiseId;
	}

	public void setParaiseId(Long paraiseId) {
		this.paraiseId = paraiseId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
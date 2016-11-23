package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sway_type_works database table.
 * 
 */
@Entity
@Table(name = "sway_type_works")
@NamedQuery(name = "SwayTypeWork.findAll", query = "SELECT s FROM SwayTypeWork s")
public class SwayTypeWork implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_works_id", unique = true, nullable = false)
	private Long typeWorksId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", nullable = false)
	private Date createTime;

	@Column(name = "type_id", nullable = false)
	private int typeId;

	@Column(name = "works_id", nullable = false)
	private int worksId;

	public SwayTypeWork() {
	}

	public Long getTypeWorksId() {
		return this.typeWorksId;
	}

	public void setTypeWorksId(Long typeWorksId) {
		this.typeWorksId = typeWorksId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getWorksId() {
		return this.worksId;
	}

	public void setWorksId(int worksId) {
		this.worksId = worksId;
	}

}
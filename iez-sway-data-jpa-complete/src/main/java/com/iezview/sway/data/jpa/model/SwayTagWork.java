package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sway_tag_works database table.
 * 
 */
@Entity
@Table(name = "sway_tag_works")
@NamedQuery(name = "SwayTagWork.findAll", query = "SELECT s FROM SwayTagWork s")
public class SwayTagWork implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tag_works_id", unique = true, nullable = false)
	private Long tagWorksId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", nullable = false)
	private Date createTime;

	@Column(name = "tag_id", nullable = false)
	private int tagId;

	@Column(name = "works_id", nullable = false)
	private int worksId;

	public SwayTagWork() {
	}

	public Long getTagWorksId() {
		return this.tagWorksId;
	}

	public void setTagWorksId(Long tagWorksId) {
		this.tagWorksId = tagWorksId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getTagId() {
		return this.tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public int getWorksId() {
		return this.worksId;
	}

	public void setWorksId(int worksId) {
		this.worksId = worksId;
	}

}
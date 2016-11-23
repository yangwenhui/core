package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sway_works_browse database table.
 * 
 */
@Entity
@Table(name = "sway_works_browse")
@NamedQuery(name = "SwayWorksBrowse.findAll", query = "SELECT s FROM SwayWorksBrowse s")
public class SwayWorksBrowse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "browse_id", unique = true, nullable = false)
	private Long browseId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "browse_time", nullable = false)
	private Date browseTime;

	@Column(name = "user_id", nullable = false)
	private int userId;

	@Column(name = "works_id", nullable = false)
	private int worksId;

	public SwayWorksBrowse() {
	}

	public Long getBrowseId() {
		return this.browseId;
	}

	public void setBrowseId(Long browseId) {
		this.browseId = browseId;
	}

	public Date getBrowseTime() {
		return this.browseTime;
	}

	public void setBrowseTime(Date browseTime) {
		this.browseTime = browseTime;
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
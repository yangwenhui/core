package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sway_works database table.
 * 
 */
@Entity
@Table(name = "sway_works")
@NamedQuery(name = "SwayWork.findAll", query = "SELECT s FROM SwayWork s")
public class SwayWork implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "works_id", unique = true, nullable = false)
	private Long worksId;

	@Column(name = "author_id", nullable = false)
	private int authorId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", nullable = false)
	private Date createTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "finlish_time")
	private Date finlishTime;

	@Column(length = 64)
	private String position;

	@Column(name = "produce_ip", length = 255)
	private String produceIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "public_time")
	private Date publicTime;

	private int quality;

	private int sequence;

	private int sync;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "upload_time")
	private Date uploadTime;

	@Column(name = "works_desc", length = 256)
	private String worksDesc;

	@Column(name = "works_img_url", length = 256)
	private String worksImgUrl;

	@Column(name = "works_name", nullable = false, length = 256)
	private String worksName;

	@Column(name = "works_size", length = 64)
	private String worksSize;

	@Column(name = "works_status", nullable = false)
	private int worksStatus;

	public SwayWork() {
	}

	public Long getWorksId() {
		return this.worksId;
	}

	public void setWorksId(Long worksId) {
		this.worksId = worksId;
	}

	public int getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getFinlishTime() {
		return this.finlishTime;
	}

	public void setFinlishTime(Date finlishTime) {
		this.finlishTime = finlishTime;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getProduceIp() {
		return this.produceIp;
	}

	public void setProduceIp(String produceIp) {
		this.produceIp = produceIp;
	}

	public Date getPublicTime() {
		return this.publicTime;
	}

	public void setPublicTime(Date publicTime) {
		this.publicTime = publicTime;
	}

	public int getQuality() {
		return this.quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getSequence() {
		return this.sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getSync() {
		return this.sync;
	}

	public void setSync(int sync) {
		this.sync = sync;
	}

	public Date getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public String getWorksDesc() {
		return this.worksDesc;
	}

	public void setWorksDesc(String worksDesc) {
		this.worksDesc = worksDesc;
	}

	public String getWorksImgUrl() {
		return this.worksImgUrl;
	}

	public void setWorksImgUrl(String worksImgUrl) {
		this.worksImgUrl = worksImgUrl;
	}

	public String getWorksName() {
		return this.worksName;
	}

	public void setWorksName(String worksName) {
		this.worksName = worksName;
	}

	public String getWorksSize() {
		return this.worksSize;
	}

	public void setWorksSize(String worksSize) {
		this.worksSize = worksSize;
	}

	public int getWorksStatus() {
		return this.worksStatus;
	}

	public void setWorksStatus(int worksStatus) {
		this.worksStatus = worksStatus;
	}

}
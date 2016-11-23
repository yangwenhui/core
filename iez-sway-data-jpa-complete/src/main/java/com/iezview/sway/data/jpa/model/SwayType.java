package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sway_type database table.
 * 
 */
@Entity
@Table(name = "sway_type")
@NamedQuery(name = "SwayType.findAll", query = "SELECT s FROM SwayType s")
public class SwayType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_id", unique = true, nullable = false)
	private Long typeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", nullable = false)
	private Date createTime;

	@Column(name = "type_name", nullable = false, length = 64)
	private String typeName;

	@Column(name = "type_seq", nullable = false)
	private int typeSeq;

	@Column(name = "type_url", nullable = false, length = 256)
	private String typeUrl;

	public SwayType() {
	}

	public Long getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public int getTypeSeq() {
		return this.typeSeq;
	}

	public void setTypeSeq(int typeSeq) {
		this.typeSeq = typeSeq;
	}

	public String getTypeUrl() {
		return this.typeUrl;
	}

	public void setTypeUrl(String typeUrl) {
		this.typeUrl = typeUrl;
	}

}
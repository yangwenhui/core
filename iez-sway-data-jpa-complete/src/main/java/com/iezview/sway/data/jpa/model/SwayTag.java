package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the sway_tag database table.
 * 
 */
@Entity
@Table(name = "sway_tag")
@NamedQuery(name = "SwayTag.findAll", query = "SELECT s FROM SwayTag s")
public class SwayTag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tag_id", unique = true, nullable = false)
	private Long tagId;

	@Column(name = "tag_name", nullable = false, length = 64)
	private String tagName;

	@Column(name = "tag_seq", nullable = false)
	private int tagSeq;

	@Column(name = "tag_type", nullable = false, length = 8)
	private String tagType;

	@Column(name = "tag_url", nullable = false, length = 256)
	private String tagUrl;

	public SwayTag() {
	}

	public Long getTagId() {
		return this.tagId;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public int getTagSeq() {
		return this.tagSeq;
	}

	public void setTagSeq(int tagSeq) {
		this.tagSeq = tagSeq;
	}

	public String getTagType() {
		return this.tagType;
	}

	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

	public String getTagUrl() {
		return this.tagUrl;
	}

	public void setTagUrl(String tagUrl) {
		this.tagUrl = tagUrl;
	}

}
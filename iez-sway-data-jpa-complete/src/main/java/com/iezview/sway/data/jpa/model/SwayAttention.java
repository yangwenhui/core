package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sway_attention database table.
 * 
 */
@Entity
@Table(name = "sway_attention")
@NamedQuery(name = "SwayAttention.findAll", query = "SELECT s FROM SwayAttention s")
public class SwayAttention implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attention_id", unique = true, nullable = false)
	private Long attentionId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "attention_time", nullable = false)
	private Date attentionTime;

	@Column(name = "author_id", nullable = false)
	private int authorId;

	@Column(name = "user_id", nullable = false)
	private int userId;

	public SwayAttention() {
	}

	public Long getAttentionId() {
		return this.attentionId;
	}

	public void setAttentionId(Long attentionId) {
		this.attentionId = attentionId;
	}

	public Date getAttentionTime() {
		return this.attentionTime;
	}

	public void setAttentionTime(Date attentionTime) {
		this.attentionTime = attentionTime;
	}

	public int getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
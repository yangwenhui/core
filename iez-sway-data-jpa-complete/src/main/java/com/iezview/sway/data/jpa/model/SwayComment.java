package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sway_comment database table.
 * 
 */
@Entity
@Table(name = "sway_comment")
@NamedQuery(name = "SwayComment.findAll", query = "SELECT s FROM SwayComment s")
public class SwayComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comment_id", unique = true, nullable = false)
	private Long commentId;

	@Column(nullable = false, length = 512)
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", nullable = false)
	private Date createTime;

	@Column(name = "p_id")
	private int pId;

	@Column(name = "user_id", nullable = false)
	private int userId;

	@Column(name = "works_id", nullable = false)
	private int worksId;

	public SwayComment() {
	}

	public Long getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getPId() {
		return this.pId;
	}

	public void setPId(int pId) {
		this.pId = pId;
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
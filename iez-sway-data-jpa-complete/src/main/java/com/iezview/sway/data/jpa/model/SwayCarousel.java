package com.iezview.sway.data.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sway_carousel database table.
 * 
 */
@Entity
@Table(name = "sway_carousel")
@NamedQuery(name = "SwayCarousel.findAll", query = "SELECT s FROM SwayCarousel s")
public class SwayCarousel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "carousel_id", unique = true, nullable = false)
	private Long carouselId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", nullable = false)
	private Date createTime;

	@Column(name = "works_id", nullable = false)
	private int worksId;

	public SwayCarousel() {
	}

	public Long getCarouselId() {
		return this.carouselId;
	}

	public void setCarouselId(Long carouselId) {
		this.carouselId = carouselId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getWorksId() {
		return this.worksId;
	}

	public void setWorksId(int worksId) {
		this.worksId = worksId;
	}

}
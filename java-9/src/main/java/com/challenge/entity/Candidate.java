package com.challenge.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;


@Entity
@Table(name="candidate")
public class Candidate implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	@Id
	private int user_id;
	
	@Id
	private int acceleration_id;
	
	@Id
	private int company_id;
	
	@Column
	@NotNull
	private int status;
	
	@Column
	@NotNull
	@CreatedDate
	private Date created_at;
	
    @ManyToOne
    @JoinColumn(name = "acceleration_id")
    private Acceleration acceleration;
    
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Integer getAcceleration_id() {
		return acceleration_id;
	}

	public void setAcceleration_id(Integer acceleration_id) {
		this.acceleration_id = acceleration_id;
	}

	public Integer getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	public Acceleration getAcceleration() {
		return acceleration;
	}
	
	
}

package com.challenge.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name="submission")
public class Submission implements Serializable{
	private static final long serialVersionUID = 1l;
	
	@Id
	private Integer user_id;
	
	@Id
	private Integer challenge_id;
	
	@Column
	@NotNull
	private Double score;
	
	@Column
	@NotNull
	@CreatedDate
	private Date created_at;
	
    @ManyToOne
    @JoinColumn(name = "challenge_id")
    private Challenge challenge;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getChallenge_id() {
		return challenge_id;
	}

	public void setChallenge_id(Integer challenge_id) {
		this.challenge_id = challenge_id;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
}

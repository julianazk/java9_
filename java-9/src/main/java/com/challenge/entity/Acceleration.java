package com.challenge.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "acceleration")
public class Acceleration implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	@Id 
	@GeneratedValue
	private int id;
	
	@Column
	@NotNull
	@Length(max=100)
	private String name;
	
	@Column
	@NotNull
	@Length(max=50)
	private String slug;
	
	@Column
	@NotNull
	private Integer challenge_id;
	
	@Column
	@CreatedDate
	private Date created_at;
	
	@OneToMany(mappedBy="acceleration_id")
	//@JoinColumn(name="acceleration_id")
	private List<Candidate> candidate;
	
	public List<Candidate> getCandidate() {
		return candidate;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Integer getChallenge_id() {
		return challenge_id;
	}

	public void setChallenge_id(Integer challenge_id) {
		this.challenge_id = challenge_id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}


	
}

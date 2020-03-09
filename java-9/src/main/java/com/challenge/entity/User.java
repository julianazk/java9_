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
@Table(name="user")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	@Id 
	@GeneratedValue
	private int id;
	
	@Column
	@NotNull
	@Length(max=100)
	private String full_name;
	
	@Column
	@NotNull
	@EMail
	@Length(max=100)
	private String email;
	
	@Column
	@NotNull
	@Length(max=50)
	private String nickname;
	
	@Column
	@NotNull
	private String password;
	
	@Column
	@NotNull
	@CreatedDate
	private Date created_at;
	
	@OneToMany(mappedBy="user_id")
	//@JoinColumn(name="user_id")
	private List<Candidate> candidate;
	
	public List<Candidate> getCandidate() {
		return candidate;
	}
	
	@OneToMany(mappedBy="user_id")
	//@JoinColumn(name="user_id")
	private List<Submission> submission;
	
	public List<Submission> getSubmission() {
		return submission;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	
}

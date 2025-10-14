package com.sillek.gitlite.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class ProjectUserId {

	private Long user_id;

	private Long project_id;

	private Long role_id;

	public ProjectUserId(Long user_id, Long project_id, Long role_id) {
		super();
		this.user_id = user_id;
		this.project_id = project_id;
		this.role_id = role_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getProject_id() {
		return project_id;
	}

	public void setProject_id(Long project_id) {
		this.project_id = project_id;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}


}
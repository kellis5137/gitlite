package com.sillek.gitlite.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class ProjectUser
{
	public ProjectUser(ProjectUserId projectUserId) {
		super();
		this.projectUserId = projectUserId;
	}

	@EmbeddedId
	private ProjectUserId projectUserId;

	public ProjectUserId getProjectUserId() {
		return projectUserId;
	}

	public void setProjectUserId(ProjectUserId projectUserId) {
		this.projectUserId = projectUserId;
	}
}



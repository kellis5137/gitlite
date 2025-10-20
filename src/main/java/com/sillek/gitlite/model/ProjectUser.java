package com.sillek.gitlite.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProjectUser {

	@EmbeddedId
	private ProjectUserId projectUserId;

	public ProjectUser(ProjectUserId projectUserId) {
		super();
		this.projectUserId = projectUserId;
	}

}

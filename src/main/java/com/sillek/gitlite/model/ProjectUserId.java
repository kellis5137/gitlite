package com.sillek.gitlite.model;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@Embeddable
public class ProjectUserId {

	private Long user_id;

	private Long project_id;

	private Long role_id;

}
package com.sillek.gitlite.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "projects")
public class Project {
	@Setter(AccessLevel.NONE)
	@jakarta.persistence.Id
	@Column(name = "id")
	@SequenceGenerator(name = "SEQ", sequenceName = "PROJECT_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	private Long id;

	@Column(name = "name")
	private String name;

	public Project(String name) {
		super();
		this.name = name;
	}

	private Project(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}

package com.sillek.gitlite.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "roles")
public class Role {
	@Setter(AccessLevel.NONE)
	@jakarta.persistence.Id
	@Column(name = "id")
	@SequenceGenerator(name = "SEQ", sequenceName = "ROLE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	private Long id;

	@Column(name = "name")
	private String name;

	private Role(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private Role(String name) {
		super();
		this.name = name;
	}

}

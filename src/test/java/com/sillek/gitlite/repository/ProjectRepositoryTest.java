package com.sillek.gitlite.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.sillek.gitlite.model.Project;

@DataJpaTest
@ActiveProfiles("test")
public class ProjectRepositoryTest {


    @Autowired
    private ProjectRepository projectRepository;

    @Test
    public void givenProject_whenSave_thenGetOk() {
    	Project project = new Project("test");
        projectRepository.save(project);

        Project project2 = projectRepository.findById(Long.valueOf(1)).get();
        assertEquals("test", project2.getName());
    }
}
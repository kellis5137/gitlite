package com.sillek.gitlite.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.sillek.gitlite.model.Project;

@DataJpaTest
@ActiveProfiles("test")
public class ProjectDaoTest {


    @Autowired
    private ProjectDao projectDao;

    @Test
    public void givenProject_whenSave_thenGetOk() {
    	Project project = Project.builder().name("test").build();
        projectDao.save(project);

        Project project2 = projectDao.findById(Long.valueOf(1)).get();
        assertEquals("test", project2.getName());
    }
}
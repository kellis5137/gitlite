package com.sillek.gitlite.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.sillek.gitlite.model.User;

@DataJpaTest
@ActiveProfiles("test")
public class UserDaoTest {


    @Autowired
    private UserDao userDao;

    @Test
    public void givenUser_whenSave_thenGetOk() {
    	User user = User.builder().firstName("test").lastName("name").email("test@test.gov").build();
    	userDao.save(user);

        User user2 = userDao.findById(Long.valueOf(1)).get();
        assertEquals("test", user2.getFirstName());
        assertEquals("name", user2.getLastName());
    }
}
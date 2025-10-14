package com.sillek.gitlite.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.sillek.gitlite.model.User;

@DataJpaTest
@ActiveProfiles("test")
public class UserRepositoryTest {


    @Autowired
    private UserRepository UserRepository;

    @Test
    public void givenUser_whenSave_thenGetOk() {
    	User User = new User("test", "name");
        UserRepository.save(User);

        User User2 = UserRepository.findById(Long.valueOf(1)).get();
        assertEquals("test", User2.getFirstName());
        assertEquals("name", User2.getLastName());
    }
}
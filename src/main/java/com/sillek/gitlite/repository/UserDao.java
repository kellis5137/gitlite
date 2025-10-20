package com.sillek.gitlite.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sillek.gitlite.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{

}

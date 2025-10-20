package com.sillek.gitlite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sillek.gitlite.model.User;
import com.sillek.gitlite.repository.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public List<User> getAllUsers(){
		return userDao.findAll();
	}
	
	public User createUser(User user) {
		return userDao.save(user);
	}
}
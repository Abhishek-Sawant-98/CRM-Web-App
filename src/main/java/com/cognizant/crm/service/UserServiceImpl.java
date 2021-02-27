package com.cognizant.crm.service;

import com.cognizant.crm.model.User;
import com.cognizant.crm.repository.UserDao;
import com.cognizant.crm.validation.UserValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@RequiredArgsConstructor // Generates constructor for final fields at compile time
@Service
public class UserServiceImpl implements UserService {

	// Using final fields and a constructor is generally considered best practise
	// for autowiring dependencies
	private final UserDao userDaoImpl;

	@Override
	public boolean isUserAuthentic(User user) {
		return userDaoImpl.isUserAuthentic(user);
	}

	@Override
	public boolean signUp(User user) {
		return userDaoImpl.signUp(user);
	}

	@Override
	public User getUserById(String userId) {
		return userDaoImpl.getUserById(userId);
	}

	@Override
	public void validate(User user, BindingResult results) {
		new UserValidator().validate(user, results);
	}
}

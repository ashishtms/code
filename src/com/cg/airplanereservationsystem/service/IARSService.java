package com.cg.airplanereservationsystem.service;

import com.cg.airplanereservationsystem.bean.User;

public interface IARSService {
	public void signUp(User user);

	public boolean logIn(String username, String password);

	boolean validateName(String name);

	boolean validateAge(String age);

	boolean validatePhone(String phone);

	boolean validateEmail(String email);
}

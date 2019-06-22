package com.cg.airplanereservationsystem.service;

import java.util.regex.Pattern;

import com.cg.airplanereservationsystem.bean.User;
import com.cg.airplanereservationsystem.dao.ARSDao;


public class ARSService implements IARSService {
	private ARSDao dao;

	public ARSService() {
		dao = new ARSDao();
	}

	@Override
	public void signUp(User user) {
		dao.beginTransaction();
		dao.signUp(user);
		dao.commitTransaction();	
	}

	@Override
	public boolean logIn(String username, String password) {
		// TODO Auto-generated method stub
		return dao.logIn(username, password);
	}
	@Override
	public boolean validateName(String name) {
		// TODO Auto-generated method stub
		String pattern = "[A-Z]{1}[a-z]{2,19}";
		if(Pattern.matches( pattern, name))
		{
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean validateAge(String age) {
		// TODO Auto-generated method stub
		String pattern = "[0-9]{1,3}";
		if(Pattern.matches( pattern, age))
		{
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean validatePhone(String phone) {
		// TODO Auto-generated method stub
		String pattern = "[1-9]{1}[0-9]{9}";
		if(Pattern.matches( pattern, phone))
		{
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean validateEmail(String email) {
		// TODO Auto-generated method stub
		String pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		if(Pattern.matches( pattern, email))
		{
			return true;
		}
		else
			return false;
	}

}

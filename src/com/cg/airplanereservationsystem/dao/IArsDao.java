package com.cg.airplanereservationsystem.dao;

import com.cg.airplanereservationsystem.bean.User;

public interface IArsDao {
	
	public void signUp(User user);
	public boolean logIn(String username,String password);
	void commitTransaction();
	void beginTransaction();

}

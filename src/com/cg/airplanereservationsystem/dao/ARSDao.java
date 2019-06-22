package com.cg.airplanereservationsystem.dao;

import javax.persistence.EntityManager;

import com.cg.airplanereservationsystem.bean.User;
import com.cg.airplanereservationsystem.dao.JPAUtil;

public class ARSDao implements IArsDao {
	private EntityManager entityManager;

	public ARSDao() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void signUp(User user) {
		entityManager.persist(user);
	}

	@Override
	public boolean logIn(String username, String password) {
		User authUser;
		boolean valid = false;
		authUser = entityManager.find(User.class, username);
		if (authUser != null) {

			if (authUser.getPassword().equals(password)) {
				valid = true;
			} else
				valid = false;
		}
		return valid;
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();

	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();

	}

}

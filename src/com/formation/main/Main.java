package com.formation.main;

import com.formation.dao.UserDao;
import com.formation.dao.impl.UserDaoImpl;

public class Main {

	public static void main(String[] args) {
		UserDao userDao = UserDaoImpl.getInstance();
		System.out.println(userDao.getAll());
	}
}

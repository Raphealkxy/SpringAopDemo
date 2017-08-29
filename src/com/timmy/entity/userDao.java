package com.timmy.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value="userDao")
public class userDao {
	
	@Autowired
	private Dao dao;
	public void add()
	{
		System.out.println("userDao..............");
		dao.add();
	}

}

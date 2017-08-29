package com.timmy.entity;

import org.springframework.stereotype.Component;

@Component(value="Dao")
public class Dao {
	
	public void add()
	{
		System.out.println("Dao...............");
	}

}

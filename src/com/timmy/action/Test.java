package com.timmy.action;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.timmy.entity.User;
import com.timmy.entity.userDao;

public class Test {

	public static void main(String[] args) {
           ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//           User user=(User) context.getBean("user");
//           User user1=(User) context.getBean("user");
//           user.add();
           //System.out.println(user==user1);
           userDao uDao=(userDao) context.getBean("userDao");
           uDao.add();
           
	}

}

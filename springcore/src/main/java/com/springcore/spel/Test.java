package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Training t =con.getBean("t",Training.class);
		System.out.println(t);
	}
}

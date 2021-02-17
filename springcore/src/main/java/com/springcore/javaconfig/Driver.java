package com.springcore.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		//Student student =(Student)context.getBean("student"); // with component configuration and component-scan annotations
		//System.out.println(student);
		Employee emp = context.getBean("getEmployee",Employee.class);
		System.out.println(emp);
		Address add = context.getBean("getAddress",Address.class);
		System.out.println(add);
	}

}

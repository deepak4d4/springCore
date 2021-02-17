package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Samosa s = (Samosa)context.getBean("s1");
		System.out.println(s);
		context.registerShutdownHook();    // for calling the destroy method
		PepsiAndInterface p1 = (PepsiAndInterface)context.getBean("p1");
		System.out.println(p1);
		UsingAnnotation ua = context.getBean("ua",UsingAnnotation.class);
		System.out.println(ua);
	}

}

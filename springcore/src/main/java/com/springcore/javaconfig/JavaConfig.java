package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@ComponentScan(basePackages = "com.springcore.javaconfig")
@Configuration
public class JavaConfig {
	/*
	 * @Bean(name="student") public Student getStudent() { return new Student(); }
	 */
	@Bean
	public Address getAddress() {
		Address address = new Address();
		return address;
	}
	
	@Bean
	public Employee getEmployee() {
		return new Employee(getAddress());
	}
}

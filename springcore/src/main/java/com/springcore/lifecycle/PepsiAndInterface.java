package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PepsiAndInterface implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PepsiAndInterface [price=" + price + "]";
	}

	public PepsiAndInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void destroy() throws Exception {
		System.out.println("Pepsi destroyed");
		
	}
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Pepsi init");
		
	}

	public void start() {
		
	}
	
}

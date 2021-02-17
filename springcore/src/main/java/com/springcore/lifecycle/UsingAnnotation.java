package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UsingAnnotation {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public UsingAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UsingAnnotation [price=" + price + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Starting method");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}
}

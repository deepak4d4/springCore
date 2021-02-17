package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Certi certi;
	private List<String> list;

	public Person(String name, int id, Certi certi, List<String> list) {
		super();
		this.name = name;
		this.id = id;
		this.certi = certi;
		this.list = list;
	}
	public String toString() {
		return this.name+" "+this.id+" "+this.certi.toString()+" "+this.list;
	}
}

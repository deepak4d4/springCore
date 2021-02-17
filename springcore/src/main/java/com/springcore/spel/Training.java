package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("t")
public class Training {
@Value("#{23-12}")
private int x;
@Value("#{12}")
private int y;

@Value("#{T(java.lang.Math).sqrt(25)}")
private double z;

@Value("#{new java.lang.String('Deepak Yadav')}")
private String name;

@Value("#{T(java.lang.Math).E}")
private double e;

@Value("#{8>3}")
private boolean isActive;

public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
@Override
public String toString() {
	return "Training [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", e=" + e + ", isActive=" + isActive
			+ "]";
}



}

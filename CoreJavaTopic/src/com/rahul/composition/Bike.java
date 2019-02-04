package com.rahul.composition;

public class Bike {
	private String color;
	private int maxSpeed;


	public void setColor(String color) {
		this.color = color;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void bikeInfo() {
		System.out.println("Bike Color is = " + color   +   " ,  MaxSpeed is = " + maxSpeed);

	}

}

package com.rahul.composition;

public class TestDemo {
	public static void main(String[] args) {
		Pulsar myPulsar = new Pulsar();
		myPulsar.setColor("Red");
		myPulsar.setMaxSpeed(180);
		myPulsar.bikeInfo();
		myPulsar.pulsarStartDemo();
	}
}

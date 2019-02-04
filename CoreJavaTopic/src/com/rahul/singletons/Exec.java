package com.rahul.singletons;

public class Exec {
public static void main(String[] args) {
	for (int i = 0; i < 2; i++) {
		Satellite sate =Satellite.getSatellite();
		System.out.println(sate.hashCode());
		System.out.println(Satellite.getSatellite().hashCode());
		
	}
}
}

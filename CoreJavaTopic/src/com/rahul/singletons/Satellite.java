package com.rahul.singletons;

public class Satellite {
	
	private static  Satellite _sate;
	
private Satellite() {}
public static Satellite getSatellite() {
	if(_sate==null) {
		_sate =new Satellite();
	}
	return _sate;
}
}

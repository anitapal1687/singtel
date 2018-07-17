package com.singtel.domin;

public class Bird extends Animal {
	
	public boolean fly() {
		return false;
	}

	@Override
	public boolean walk() {
		return true;
	}

	@Override
	public boolean sing() {
	return true;
		
	}

	@Override
	public boolean swim() {
		return false;
	}
 
 
 
}

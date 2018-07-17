package com.singtel.domin;

public class Parrot extends Bird {

	

	@Override
	public boolean sing() {
	if(this instanceof Dog){
		System.out.println("Woof, Woof");
	}else if(this instanceof Cat){
		System.out.println("Meow");
	}else{
		 System.out.println("Cok-a-doodle-doo");
	}
	return true;
		
	}
	
}

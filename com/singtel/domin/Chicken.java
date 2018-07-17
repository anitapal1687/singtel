package com.singtel.domin;

public class Chicken extends Bird {
	
	 public boolean sing(){
		 System.out.println("Cluck, cluck");
		 return true;
	 }
	 
		@Override
		public boolean walk() {
			return true;
		}
	 
	 public boolean fly(){
		 return true;
	 }
	 
}

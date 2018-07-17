package com.singtel.domin;

public class Solution {

	public static void main(String[] args) {
     Bird bird = new Bird();
     bird.walk();
     bird.fly();
     bird.sing();
     
     int singCount=0, walkCount=0, swimCount=0;
     
     Animal[] animalArray = new Bird[]{
    		new Chicken(),
    		new Parrot(),
    		new Duck()
  
     };
     
     for(Animal animal : animalArray){
    	 if(animal.sing()){
    		 singCount++;
    	 }
    	 
    	 if(animal.walk()){
    		 walkCount++;
    	 }
    	 
    	 if(animal.swim()){
    		 swimCount++;
    	 }
     }
     
     Animal[] animalArray1 = new Fish[]{
     		new ClownFish(),
     		new Shark(),
     		
   
      };
  
     
     for(Animal animal : animalArray1){
    	 if(animal.sing()){
    		 singCount++;
    	 }
    	 
    	 if(animal.walk()){
    		 walkCount++;
    	 }
    	 
    	 if(animal.swim()){
    		 swimCount++;
    	 }
     }
     
     System.out.println("Walk Count ::::"+ walkCount);
     
     System.out.println("Swim Count ::::"+ swimCount);
     
     System.out.println("Sing Count ::::"+ singCount);

	}
	


}

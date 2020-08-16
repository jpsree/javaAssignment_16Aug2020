/**
 * 
 */
package com.jpworks.assignment.standalone;

import com.jpworks.assignment.modal.Animal;
import com.jpworks.assignment.modal.Bird;
import com.jpworks.assignment.modal.Butterfly;
import com.jpworks.assignment.modal.Cat;
import com.jpworks.assignment.modal.Chicken;
import com.jpworks.assignment.modal.Clownfish;
import com.jpworks.assignment.modal.Dog;
import com.jpworks.assignment.modal.Dolphin;
import com.jpworks.assignment.modal.Duck;
import com.jpworks.assignment.modal.Fish;
import com.jpworks.assignment.modal.Parrot;
import com.jpworks.assignment.modal.Rooster;
import com.jpworks.assignment.modal.Shark;

/**
 * @author JP
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster().getChicken(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Butterfly(), 
				new Butterfly(true) //For caterpillar		
				};
		
		for(Animal animal: animals) {
			System.out.println("\n\n#######"+animal.getClass()+"#########");
			System.out.println(animal.walk());
			System.out.println(animal.fly());			
			System.out.println(animal.swim());

			if(animal.getClass()==Parrot.class) {
				Parrot parrot = (Parrot)animal;
				parrot.setLivingWith(new Rooster());				
				System.out.println(">>>Parrot living with Rooster::"+parrot.sing());
				parrot.setLivingWith(new Dog());				
				System.out.println(">>>Parrot living with Dog::"+parrot.sing());
				parrot.setLivingWith(new Cat());				
				System.out.println(">>>Parrot living with Cat::"+parrot.sing());
			} else {
				System.out.println(animal.sing());
			}
			
			if(animal.getClass()==Shark.class) {
				Shark shark = (Shark)animal;
				System.out.println(shark.getAdditionalDetails());
			}
			
			if(animal.getClass()==Clownfish.class) {
				Clownfish clownfish = (Clownfish)animal;
				System.out.println(clownfish.getAdditionalDetails());
			}
		}
	
	}

}

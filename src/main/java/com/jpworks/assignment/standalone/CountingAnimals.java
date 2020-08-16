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
import com.jpworks.assignment.modal.Frog;
import com.jpworks.assignment.modal.Parrot;
import com.jpworks.assignment.modal.Rooster;
import com.jpworks.assignment.modal.Shark;

/**
 * @author JP
 *
 */
public class CountingAnimals {

	/**
	 * 
	 */
	public CountingAnimals() {		
	}

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
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
				};
		
		
		int animalsCanfly = 0, animalsCanWalk = 0, animalsCanSing = 0, animalsCanSwim = 0;
		
		for(Animal animal:animals) {
			if (animal.isFly()) animalsCanfly++;
			if (animal.isWalk()) animalsCanWalk++;
			if (animal.isSing()) animalsCanSing++;
			if (animal.isSwim()) animalsCanSwim++;
		}
		
		System.out.println("Total Animals Can Fly are::" + animalsCanfly);
		System.out.println("Total Animals Can Walk are::" + animalsCanWalk);
		System.out.println("Total Animals Can Sing are::" + animalsCanSing);
		System.out.println("Total Animals Can Swim are::" + animalsCanSwim);
	}

}

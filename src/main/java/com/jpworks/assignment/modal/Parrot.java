/**
 * 
 */
package com.jpworks.assignment.modal;

/**
 * @author JP
 *
 */
public class Parrot extends Bird {
	public Parrot() {
		super();		
	}
	
	Animal livingWith = null;

	public Animal getLivingWith() {
		return livingWith;
	}

	public void setLivingWith(Animal livingWith) {
		this.livingWith = livingWith;
		sound = livingWith.getSound();
	}
	
	public void setLivingWith(Rooster livingWith) {
		this.livingWith = livingWith.getChicken();
		sound = livingWith.getChicken().getSound();
	}
}

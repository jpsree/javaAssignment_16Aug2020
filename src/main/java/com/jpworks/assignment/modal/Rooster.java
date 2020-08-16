/**
 * 
 */
package com.jpworks.assignment.modal;

/**
 * @author JP
 *
 */
public class Rooster {
	public Chicken chicken;

	public Chicken getChicken() {
		return chicken;
	}

	public void setChicken(Chicken chicken) {
		this.chicken = chicken;
	}
	
	public Rooster() {
		setChicken(new Chicken());
		chicken.setSound("Cock-a-doodle-doo");
		
	}
		
}

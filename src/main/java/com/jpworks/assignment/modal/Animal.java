package com.jpworks.assignment.modal;


/**
 * @author JP
 *
 */

public class Animal {
	boolean walk = false;
	boolean fly = false;
	boolean sing = false;
	boolean swim = false;
	String sound = null;
	
	public boolean isWalk() {
		return walk;
	}	
			
	public void setWalk(boolean walk) {
		this.walk = walk;
	}
	public boolean isFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	public boolean isSing() {
		return sing;
	}
	public void setSing(boolean sing) {
		this.sing = sing;
	}

	public boolean isSwim() {
		return swim;
	}

	public void setSwim(boolean swim) {
		this.swim = swim;
	}
		
	
	public String getSound() {		
		String rtnValue = this.sound;
		if(rtnValue==null)
			rtnValue= "I cannot make sound";
		
		return rtnValue;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}

	public String walk() {
		String rtnValue = "I cannot Walk";
		
		if(isWalk()) 
			rtnValue = "I am Walking";
		return rtnValue;
		
	}
	
	public String sing() {
		String rtnValue = "I cannot Sing";
		
		if(isSing()) 
			rtnValue = "I am Singing" + (sound==null?"":" makes special sound as " + sound);
		
		return rtnValue;
	}
	
	public String fly() {
		String rtnValue = "I cannot Fly";

		if(isFly()) 
			rtnValue = "I am Flying";
		
		return rtnValue;
	}
	
	public String swim() {
		String rtnValue = "I cannot Swim";
		if(isSwim()) 
			rtnValue = "I am Swimming";
		
		return rtnValue;
	}
}

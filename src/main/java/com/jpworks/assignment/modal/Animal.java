package com.jpworks.assignment.modal;


/**
 * @author JP
 *
 */

public class Animal {
	boolean walk = false;
	boolean fly = false;
	boolean sing = false;
	
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

	public String walk() {
		String rtnValue = "I cannot Walk";
		
		if(isWalk()) 
			rtnValue = "I am Walking";
		return rtnValue;
		
	}
	
	public String sing() {
		String rtnValue = "I cannot Sing";
		
		if(isSing()) 
			rtnValue = "I am Singing";
		
		return rtnValue;
	}
	
	public String fly() {
		String rtnValue = "I cannot Fly";

		if(isFly()) 
			rtnValue = "I am Flying";
		
		return rtnValue;
	}
	
}

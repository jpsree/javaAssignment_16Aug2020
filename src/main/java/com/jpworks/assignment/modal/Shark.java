/**
 * 
 */
package com.jpworks.assignment.modal;

/**
 * @author JP
 *
 */
public class Shark extends Fish {
	public Shark() {
		super();	
		setAdditionalDetails("Sharks are large and grey & eat other fish");
	}
	
	String additionalDetails = null;

	public String getAdditionalDetails() {
		return additionalDetails;
	}

	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}
	
	
}

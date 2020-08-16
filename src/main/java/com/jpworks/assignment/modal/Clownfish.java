/**
 * 
 */
package com.jpworks.assignment.modal;

/**
 * @author JP
 *
 */
public class Clownfish extends Fish {
	public Clownfish() {
		super();	
		setAdditionalDetails("Clownfish are small and colourful(Orange) & makes jokes");
	}
	
	String additionalDetails = null;

	public String getAdditionalDetails() {
		return additionalDetails;
	}

	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}
	
	
}

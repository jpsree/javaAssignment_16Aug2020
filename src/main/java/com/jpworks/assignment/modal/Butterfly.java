/**
 * 
 */
package com.jpworks.assignment.modal;

/**
 * @author JP
 *
 */
public class Butterfly extends Animal {
	public Butterfly() {
		super();
		setFly(true);
	}
	
	public Butterfly(boolean metomorphosisAsCaterpillar) {
		super();
		setMetomorphosisAsCaterpillar(metomorphosisAsCaterpillar);
	}

	public boolean metomorphosisAsCaterpillar = false;

	public boolean isMetomorphosisAsCaterpillar() {
		return metomorphosisAsCaterpillar;
	}

	public void setMetomorphosisAsCaterpillar(boolean metomorphosisAsCaterpillar) {
		this.metomorphosisAsCaterpillar = metomorphosisAsCaterpillar;
		if(metomorphosisAsCaterpillar) {
			setFly(false); setWalk(true);
		}
	}
	
	@Override
	public String walk() {
		String rtnValue = "I cannot Walk";
		
		if(isWalk()) 
			rtnValue = "I am Walking (Crawl)";
		return rtnValue;
		
	}
	
}

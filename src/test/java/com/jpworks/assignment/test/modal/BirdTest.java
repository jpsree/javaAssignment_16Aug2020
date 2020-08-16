/**
 * 
 */
package com.jpworks.assignment.test.modal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jpworks.assignment.modal.Bird;

/**
 * @author JP
 *
 */
public class BirdTest {

	String msgWalk = "I am Walking";
	String msgFly  = "I am Flying";
	String msgSing = "I am Singing";
	
	Bird bird = new Bird();
	/**
	 * Test method for {@link com.example.model.Animal#walk()}.
	 */
	@Test
	public final void testWalk() {
		assertEquals(msgWalk, bird.walk());
	}

	/**
	 * Test method for {@link com.example.model.Animal#sing()}.
	 */
	@Test
	public final void testSing() {
		assertEquals(msgSing, bird.sing());
	}

	/**
	 * Test method for {@link com.example.model.Animal#fly()}.
	 */
	@Test
	public final void testFly() {
		assertEquals(msgFly, bird.fly());
	}

}

/**
 * 
 */
package solutions.chapter01;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import challenges.chapter01.Challenge03;
import challenges.chapter01.Challenge03Impl;

/**
 * @author Alexandre Lorenzatti
 *
 */
public class Challenge03Test {
	
	private Challenge03 challenge;
	
	@BeforeEach
	public void before() {
		this.challenge = new Challenge03Impl();
	}
	
	@ParameterizedTest
	@CsvSource({"'Mr John Smith    ',13, Mr%20John%20Smith"})
	public void urlify(String input, int inputSize, String expected) {
		
		assertEquals(expected, this.challenge.URLify(input, inputSize));
	}
}

package solutions.chapter01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import challenges.chapter01.Challenge01;
import challenges.chapter01.Challenge01Impl_BitArray;

/**
 * @author Alexandre Lorenzatti
 * 
 */
public class Challenge01Test_BitArray {

	private Challenge01 challenge;
	
	@BeforeEach
	public void before() {
		this.challenge = new Challenge01Impl_BitArray();
	}
	
	@ParameterizedTest
	@ValueSource(strings = {" ", "a", "ado", "fangles", "tangles"})
	public void hasUniqueCharacters(String input) {
		
		assertTrue(this.challenge.hasAllUniqueCharacters(input));
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {"egg", "shell", "shoes", "potato", "aeioeu"})
	public void hasNotUniqueCharacters(String input) {
		
		assertFalse(this.challenge.hasAllUniqueCharacters(input));
	}
}

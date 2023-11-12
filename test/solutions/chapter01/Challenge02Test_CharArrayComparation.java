/**
 * 
 */
package solutions.chapter01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import challenges.chapter01.Challenge02;
import challenges.chapter01.Challenge02Impl_CharArrayComparation;

/**
 * @author Alexandre Lorenzatti
 *
 */
public class Challenge02Test_CharArrayComparation {
	
	private Challenge02 challenge;
	
	@BeforeEach
	public void before() {
		this.challenge = new Challenge02Impl_CharArrayComparation();
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"a", "Ada", "fangles", "tangles"})
	public void sameStringArePermutations(String input) {
		
		assertTrue(this.challenge.arePermutations(input, input));
	}
	
	@ParameterizedTest
	@CsvSource({"test,estt", "ABC,ACB", "ABC,BAC", "ABC,BCA", "ABC,CBA", "ABC,CAB"})
	public void arePermutations(String str1, String str2) {
		
		assertTrue(this.challenge.arePermutations(str1, str2));
	}
	
	@ParameterizedTest
	@CsvSource({"test,astt", "DBC,ACB", "ABC,BDAC", "ABC,CBB", "ABC,DAS", "ABC,QWE"})
	public void areNotPermutations(String str1, String str2) {
		
		assertFalse(this.challenge.arePermutations(str1, str2));
	}
}

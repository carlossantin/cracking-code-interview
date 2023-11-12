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
import challenges.chapter01.Challenge02Impl_ZeroArray;
import time.StopWatch;

/**
 * @author Alexandre Lorenzatti
 *
 */
public class Challenge02Test_ZeroArray {
	
	private Challenge02 challenge;
	private StopWatch stopWatch;
	
	@BeforeEach
	public void before() {
		this.challenge = new Challenge02Impl_ZeroArray();
		this.stopWatch = new StopWatch();
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"a", "Ada", "fangles", "tangles"})
	public void sameStringArePermutations(String input) {
		
		this.stopWatch.start();
		final boolean result = this.challenge.arePermutations(input, input);
		this.stopWatch.end();
		assertTrue(result);
		
		System.out.println(String.format("%s.sameStringArePermutations: <%s> %d ns.", this.getClass().getName(), input, this.stopWatch.elapsedTime()));
	}
	
	@ParameterizedTest
	@CsvSource({"test,estt", "ABC,ACB", "ABC,BAC", "ABC,BCA", "ABC,CBA", "ABC,CAB"})
	public void arePermutations(String str1, String str2) {
		
		this.stopWatch.start();
		final boolean result = this.challenge.arePermutations(str1, str2);
		this.stopWatch.end();
		assertTrue(result);
		
		System.out.println(String.format("%s.arePermutations: <%s>:<%s> %d ns.", this.getClass().getName(), str1, str2, this.stopWatch.elapsedTime()));
	}
	
	@ParameterizedTest
	@CsvSource({"test,astt", "DBC,ACB", "ABC,BDAC", "ABC,CBB", "ABC,DAS", "ABC,QWE"})
	public void areNotPermutations(String str1, String str2) {
		
		this.stopWatch.start();
		final boolean result = this.challenge.arePermutations(str1, str2);
		this.stopWatch.end();
		assertFalse(result);
		
		System.out.println(String.format("%s.areNotPermutations: <%s>:<%s> %d ns.", this.getClass().getName(), str1, str2, this.stopWatch.elapsedTime()));
	}
}

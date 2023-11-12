/**
 * 
 */
package challenges.chapter01;

import java.util.Arrays;

/**
 * @author Alexandre Lorenzatti
 *
 */
public class Challenge02Impl implements Challenge02 {

	@Override
	public boolean arePermutations(String str1, String str2) {
		
		final int[] str1Count = this.countCharacters(str1, 128);
		final int[] str2Count = this.countCharacters(str2, 128);
		
		return Arrays.equals(str1Count, str2Count);
	}
	
	private int[] countCharacters(String s, int size) {
		final int[] charactersCount = new int[size];
		
		for(int i = 0 ; i < s.length() ; i++) {
			char currentChar = s.charAt(i);
			charactersCount[currentChar]++;
		}
		return charactersCount;
	}
}

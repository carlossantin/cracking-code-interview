/**
 * 
 */
package challenges.chapter01;

import java.util.Arrays;

/**
 * @author Alexandre Lorenzatti
 *
 */
public class Challenge02Impl_CharArrayComparation implements Challenge02 {

	@Override
	public boolean arePermutations(String str1, String str2) {
			
		final char[] charArr1 = this.sort(str1);
		final char[] charArr2 = this.sort(str2);
		
		return Arrays.equals(charArr1, charArr2);
	}
	
	private char[] sort(String str) {
		
		final char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		return charArr;
	}
}

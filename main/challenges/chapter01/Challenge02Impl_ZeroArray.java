/**
 * 
 */
package challenges.chapter01;

/**
 * @author Alexandre Lorenzatti
 *
 */
public class Challenge02Impl_ZeroArray implements Challenge02 {

	@Override
	public boolean arePermutations(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		final int[] charactersCount = new int[128];
		
		for(int i = 0 ; i < str1.length() ; i++) {
			final char currentChar1 = str1.charAt(i);
			final char currentChar2 = str2.charAt(i);
			charactersCount[currentChar1]++;
			charactersCount[currentChar2]--;
		}
		
		boolean isZero = true;
		for(int i = 0 ; i < charactersCount.length && isZero ; i++) {
			
			isZero = charactersCount[i] == 0;
		}
		return isZero;
	}
}

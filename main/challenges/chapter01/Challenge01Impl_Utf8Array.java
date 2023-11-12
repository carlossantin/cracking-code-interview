package challenges.chapter01;

/**
 * @author Alexandre Lorenzatti
 * 
 */
public class Challenge01Impl_Utf8Array implements Challenge01 {
	
	@Override
	public boolean hasAllUniqueCharacters(String s) {
		
		if(s == null || s.isEmpty()) {
			return false;
		}
		final int[] utf8Table = new int[128];
		
		for(int i = 0 ; i < s.length() ; i++) {
			char currentChar = s.charAt(i);
			utf8Table[currentChar]++;
			
			if(utf8Table[currentChar] == 2) {
				return false;
			}
		}
		return true;
	}
}

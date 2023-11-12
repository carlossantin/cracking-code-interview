package challenges.chapter01;

/**
 * @author Alexandre Lorenzatti
 * 
 */
public class Challenge01Impl_NoDataStructures implements Challenge01 {
	
	@Override
	public boolean hasAllUniqueCharacters(String s) {
		
		if(s == null) {
			return false;
		}
		boolean unique = !s.isEmpty();
		
		for(int i = 0 ; i < s.length() && unique ; i++) {
			char currentChar = s.charAt(i);
			unique = i == this.lastIndexOf(s, currentChar);
		}
		return unique;
	}
	
	private int lastIndexOf(String string, char findChar) {
		int i = string.length();
		boolean found = false;
		do {
			i--;
			found = findChar == string.charAt(i);
		} while(i >= 0 && !found);
		return i;
	}
}

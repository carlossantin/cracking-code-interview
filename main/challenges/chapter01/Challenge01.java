package challenges.chapter01;

/**
 * @author Alexandre Lorenzatti
 *
 */
public class Challenge01 {
	
	public boolean hasAllUniqueCharacters(String string) {
		
		if(string == null || string.isEmpty()) {
			return false;
		}
		final int[] utf8Table = new int[128];
		
		for(int i = 0 ; i < string.length() ; i++) {
			char currentChar = string.charAt(i);
			utf8Table[currentChar]++;
			
			if(utf8Table[currentChar] == 2) {
				return false;
			}
		}
		return true;
	}

	public boolean hasAllUniqueCharacters_NoDataStructures(String string) {
		
		if(string == null) {
			return false;
		}
		boolean unique = !string.isEmpty();
		
		for(int i = 0 ; i < string.length() && unique ; i++) {
			char currentChar = string.charAt(i);
			unique = i == this.lastIndexOf(string, currentChar);
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

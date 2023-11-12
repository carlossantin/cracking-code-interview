package challenges.chapter01;

/**
 * @author Alexandre Lorenzatti
 *
 */
public class Challenge01 {

	public boolean hasAllUniqueCharacters(String string) {
		
		if(string == null) {
			return false;
		}
		boolean unique = !string.isEmpty();
		
		for(int i = 0 ; i < string.length() && unique ; i++) {
			unique = i == string.lastIndexOf(string.charAt(i));
		}
		return unique;
	}
}

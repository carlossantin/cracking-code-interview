package challenges.chapter01;

/**
 * @author Alexandre Lorenzatti
 * 
 */
public class Challenge01Impl implements Challenge01 {
	
	@Override
	public boolean hasAllUniqueCharacters(String s) {
		
		if(s == null) {
			return false;
		}
		boolean unique = !s.isEmpty();
		
		for(int i = 0 ; i < s.length() && unique ; i++) {
			unique = i == s.lastIndexOf(s.charAt(i));
		}
		return unique;
	}
}

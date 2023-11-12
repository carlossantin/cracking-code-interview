package challenges.chapter01;

/**
 * @author Alexandre Lorenzatti
 * 
 */
public class Challenge01Impl_BitArray implements Challenge01 {
	
	@Override
	public boolean hasAllUniqueCharacters(String s) {
		
		if(s == null || s.isEmpty()) {
			return false;
		}
		int checker = 0;
		
		for(int i = 0 ; i < s.length() ; i++) {
			int val = s.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}
}

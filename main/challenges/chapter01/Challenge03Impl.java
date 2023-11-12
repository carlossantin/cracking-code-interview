/**
 * 
 */
package challenges.chapter01;

/**
 * @author Alexandre Lorenzatti
 *
 */
public class Challenge03Impl implements Challenge03 {

	private static final char EMPTY = ' ';
			
	@Override
	public String URLify(String s, int size) {
		
		final char[] charArr = new char[s.length()];
		for(int i = 0 ; i < charArr.length ; i++) {
			charArr[i] = s.charAt(i);
		}
		
		int emptySpaces = 0;
		for(int i = 0 ; i < size ; i++) {
			emptySpaces = charArr[i] == EMPTY ? emptySpaces + 1 : emptySpaces;
		}
		
		int moveRight = size + emptySpaces * 2 - 1;
		for(int i = size - 1 ; i >= 0 ; i--) {
			if(charArr[i] != EMPTY) {
				charArr[moveRight] = charArr[i];
				moveRight--;
			} else {
				charArr[moveRight - 2] = '%';
				charArr[moveRight - 1] = '2';
				charArr[moveRight] = '0';
				moveRight -= 3;
			}
		}
		return String.valueOf(charArr);
	}
}

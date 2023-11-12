/**
 * 
 */
package time;

/**
 * @author Alexandre Lorenzatti
 *
 */
public class StopWatch {
	
	private long start;
	
	private long end;
		
	public void start() {
		this.start = System.nanoTime();
	}
	
	public void end() {
		this.end = System.nanoTime();
	}
	
	public long elapsedTime() {
		return this.end - this.start;
	}
}

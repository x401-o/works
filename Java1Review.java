/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
		
		System.out.println("New semester started...");
		System.out.println(main("CS2334"));
	}
	
	double divide(double a, double b) {
		
		return a/b;
	}

	public static String main(String arg) {
		return "Returning from another main" + arg;
	}
}

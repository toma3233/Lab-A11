/**
 * 
 * @author Tom Abraham
 * Period #1
 *
 */
public class CheckerDriver {
   /**
     * This is the main method. It is the method that actuallly helps to compile the program.
     * It allows us to call methods from different classes that are needed to complete the program.
     * @param args - the various arguments that are passed into the various methods
     */
	public static void main(String[] args) {
		Checker myChecker = new SubstringChecker("broccoli");
		System.out.println("broccoli:" + myChecker.accept("broccoli"));
			System.out.println("I like broccoli:" + myChecker.accept("I like broccoli"));
		System.out.println("carrots are great:" + myChecker.accept("carrots are great"));
		System.out.println("Broccoli Bonanza:" + myChecker.accept("Broccoli Bonanza"));
		
		Checker bChecker = new SubstringChecker("beets");
		Checker cChecker = new SubstringChecker("carrots");
		Checker bothChecker= new AndChecker(bChecker, cChecker);
		
		System.out.println("I love beets and carrots:" + bothChecker.accept("I love beets and carrots"));
		System.out.println("beets are great:" + bothChecker.accept("beets are great"));
		System.out.println("artichokes, beets, and carrots:" + bothChecker.accept("artichokes, beets, and carrots"));
		
		Checker aChecker = new SubstringChecker("artichokes");
		Checker kChecker = new SubstringChecker("kale");
		Checker notChecker = new NotChecker(aChecker);
		Checker notChecker2 = new NotChecker(kChecker);
		System.out.println("chocolate truffles:" + notChecker.accept("chocolate truffles"));
		System.out.println("kale is great:" + notChecker2.accept("kale is great"));
		System.out.println("Yuck: artichokes & kale:" + notChecker.accept("Yuck: artichokes & kale"));
		//Your code goes here
		



		

	}

}

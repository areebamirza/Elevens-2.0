/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

    Card c1 = new Card("king", "hearts", 9);
    Card c2 = new Card("queen", "diamonds", 4);
    Card c3 = new Card("jack", "spades", 6);

    System.out.println("Ranks\nCard 1: " + c1.rank() + "; Card 2: " + c2.rank() + "; Card 3: " + c3.rank());
    System.out.println("Suits\nCard 1: " + c1.suit() + "; Card 2: " + c2.suit() + "; Card 3: " + c3.suit());
    System.out.println("Point Values\nCard 1: " + c1.pointValue() + "; Card 2: " + c2.pointValue() + "; Card 3: " + c3.pointValue());

    System.out.println();

    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());
    
	}
}

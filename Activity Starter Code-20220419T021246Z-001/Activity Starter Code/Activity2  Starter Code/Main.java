/**
 * This is a class that tests the Deck class.
 */
public class Main {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */

    String[] r1 = {"king", "queen", "jack"};
    String[] s1 = {"spades", "hearts", "diamonds"};
    int[] v1 = {9, 6, 3};
    Deck d1 = new Deck(r1, s1, v1);

    String[] r2 = {"ace", "2", "8"};
    String[] s2 = {"clubs", "spades", "hearts"};
    int[] v2 = {8, 4, 2};
    Deck d2 = new Deck(r2, s2, v2);

    String[] r3 = {"7", "3", "9"};
    String[] s3 = {"diamonds", "clubs", "spades"};
    int[] v3 = {10, 5, 1};
    Deck d3 = new Deck(r3, s3, v3);

    System.out.println("Is Empty?\nDeck 1: " + d1.isEmpty() + "; Deck 2: " + d2.isEmpty() + "; Deck 3: " + d3.isEmpty());
    System.out.println();
    System.out.println("Size\nDeck 1: " + d1.size() + "; Deck 2: " + d2.size() + "; Deck 3: " + d3.size());
    System.out.println();
    System.out.println("Deal the Cards\n\tDeck 1: " + d1.deal() + "\n\tDeck 2: " + d2.deal() + "\n\tDeck 3: " + d3.deal());
	}
}

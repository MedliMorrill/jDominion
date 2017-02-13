//Testing File
import java.util.*;
public class Dominion
{
	public static void main(String[] args) 
	{
		//makes sure Card and it's minions work
		Card myCards[] = new Card[5];
		myCards[0] = new KingdomCard("Knight", 3, "Picture of a Knight", "Kicks everyone's ass");
		myCards[1] = new CurseCard("Curse", 0, "Picture of a Curse");
		myCards[2] = new TreasureCard("Copper", 3, "Picture of a Treasure", 1);
 		Pile myPile = new Pile(myCards);
		System.out.println(myPile.getCard(0).getAction());
		System.out.println(myPile.getCard(1).getValue());

		//myCards[2] = myPile.getCard(1).clone();
		myCards[3] = myPile.getCard(1);
		sop("" + myCards[3].getValue());

		
		
		//List<? extends Card> myCards = new ArrayList<KingdomCard>();
		//myCards 
		// ArrayList<Card> myCards = new ArrayList<Card>();
		// myCards.add(new KingdomCard("Knight", 3, "Picture of a Knight", "Kicks everyone's ass"));
		// System.out.println(myCards.get(0) instanceof KingdomCard);
		// System.out.println(myCards.get(0).getAction());
		//System.out.println(myCards.get(0).getAction());



	}

	public static void sop(String words)
	{
		System.out.println(words);
	}
}

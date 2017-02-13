public class Pile
{
	public Card[] cardPile;
	public Pile(Card cards[])
	{
		cardPile[] = cards[];
	}

	public Card getCard(int position)
	{
		return cardPile[position];
	}
}
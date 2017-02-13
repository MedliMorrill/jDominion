public class Card
{
	public String cardName, cardImg;
	public int cardCost;

	public Card(String name, int cost, String img)
	{
		cardName = name;
		cardImg = img;
		cardCost = cost;
	}

	public String getName()
	{
		return cardName;
	}
	public int getCost()
	{
		return cardCost;
	}
	public String getImg()
	{
		return cardImg;
	}
}
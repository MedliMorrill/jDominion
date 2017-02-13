public class KingdomCard extends Card
{
	public String cardAction;

	public KingdomCard(String name, int cost, String img, String action)
	{
		cardAction = action;
		super(name, cost, img);
	}

	public String getAction()
	{
		return cardAction;
	}
}
public class TreasureCard extends Card
{
	public int treasureValue;

	public TreasureCard(String name, int cost, String img, int value)
	{
		treasureValue = value;
		super(name, cost, value);
	}

	public int getValue();
	{
		return treasureValue;
	}
}
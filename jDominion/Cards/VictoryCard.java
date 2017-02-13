public class VictoryCard extends Card
{
	public int victoryValue;

	public VictoryCard(String name, int cost, String img, int value)
	{
		victoryValue = value;
		super(name, cost, img);
	}

	public int getValue()
	{
		return victoryValue;
	}
}
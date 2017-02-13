//Fisher-Yates Shuffle Algorithm, O(n) runtime
//For an array that isn't completely filled
import java.util.Random;
public int[] shuffle(int[] arr, int cards)
{
	Random gen = new Random();
	int j, temp;
	for(int i = cards - 1; i > 0; i--)
	{
		j = gen.nextInt(i) + 1;

		//swap cards
		temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	return arr;
}
//if array is full
public int[] shuffle(int[] arr,)
{
	Random gen = new Random();
	int j, temp;
	for(int i = arr.length - 1; i > 0; i--)
	{
		j = gen.nextInt(i) + 1;

		//swap cards
		temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	return arr;
}
package Task02;
import java.util.Arrays;

public class MaxMin {

	int max_int(int array[]) 
	{
		Arrays.sort(array);
		return array[array.length-1];
		}
	int min_int(int array[])
	{
		Arrays.sort(array);
		return array[0];
		}
	}

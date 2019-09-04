import java.util.Arrays;

/**
 * 
 * @author Tony DeStefano
 *
 */
public class Reverse3 {

	public static void main(String[] args) {
		
		int [] numbers = {1, 2, 3};
		numbers = reverse(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	public static int [] reverse(int [] numbers) {
		
		int [] newNumbers = new int[numbers.length];
		
		for (int x=0; x<numbers.length; x++) {
			newNumbers[numbers.length-1-x] = numbers[x];
		}
		
		return newNumbers;
	}

}

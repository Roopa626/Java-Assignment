package generics;
import java.util.HashMap;

public class RandomNumbers {

	public static void main(String[] args) {
		
		HashMap<Integer, Double> randomValues = new HashMap<>();
		
		randomValues.put(10, 10.0);
		randomValues.put(9, 9.0);
		randomValues.put(8, 8.0);
		randomValues.put(7, 7.0);
		randomValues.put(6, 6.0);
		randomValues.put(5, 5.0);
		randomValues.put(4, 4.0);
		randomValues.put(3, 3.0);
		randomValues.put(2, 2.0);
		randomValues.put(1, 1.0);
		
		System.out.println(randomValues);
		

	}

}

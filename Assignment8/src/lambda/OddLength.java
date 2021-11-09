package lambda;
import java.util.ArrayList;
import java.util.List;

public class OddLength {
	public static void main(String[] args) {
		
			List<String> str = new ArrayList<>();
			
			str.add("roopa");
			str.add("Chaitu");
			str.add("harshi");
			str.add("Keerthi");
			
			str.removeIf(l -> l.length()%2 !=0);
			
			System.out.println(str);
			
	}

}




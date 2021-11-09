package lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Numbers {
public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,7,9,3,8,6,3);
		
		Consumer<List<Integer>>dispList = (list1) -> System.out.println(list1);;
		 
		Thread newthread = new Thread( ()-> dispList.accept(list) );
		
		newthread.start();
 	 
	}
  
}



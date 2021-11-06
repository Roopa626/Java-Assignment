package collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

public class Tree {
public static void main(String[] args) {
		
		Data obj1=new Data(9876543210L,"Roopa","roopa@gmail.com","Female");
		Data obj2=new Data(8978488296L,"Chaitu","chaitu@gmail.com","Male");
		Data obj3=new Data(7893942602L,"Pranathi","pranu@gmail.com","Female");
		 
		Map<Long, Data>data=new TreeMap<Long,Data>(Collections.reverseOrder());
		data.put(1234L,obj1); 
		data.put(5678L,obj2);
		data.put(9876L,obj3);
		
		System.out.println("Keys:"+data.keySet() +"\n");
		System.out.println("Values:"+data.values() +"\n");
		System.out.println(data +"\n");

	}

}



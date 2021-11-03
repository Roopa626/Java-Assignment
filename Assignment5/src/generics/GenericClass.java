package generics;

public class GenericClass {
	public static void main(String[]args) {
		
		Values<String, String> obj1 = new Values<String,String>("1","Hello");
		Values<String,java.util.Date> obj2 = new Values<>("Today is :", new java.util.Date());
		
		System.out.println(obj1.showData());
		System.out.println(obj2.showData());
		
	}

}

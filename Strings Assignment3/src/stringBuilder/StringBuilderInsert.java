package stringBuilder;

public class StringBuilderInsert {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("it is used to _ at specified index position");
		System.out.println("string="+str);
		
		str.insert(15,"insert text");
		System.out.println("After insertion:");
		System.out.println(str.toString());
	}
	}

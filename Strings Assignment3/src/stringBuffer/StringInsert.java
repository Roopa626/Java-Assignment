package stringBuffer;

public class StringInsert {
	public static void main(String[]args) {
		StringBuffer str=new StringBuffer("it is used to _ at specified index position");
		System.out.println("string="+str);
		str.insert(15,"insert text");
		System.out.println("After insertion:");
		System.out.println(str.toString());
	}

}

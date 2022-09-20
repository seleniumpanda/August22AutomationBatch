package strings_Concepts;

public class Introduction_Strings {

	public static void main(String[] args) {
		// String is a non-primitive data type
		// String is also called as Sequence of Characters
		
		char[] c1 = {'a', 'b', 'c', 'd', 'e'};
		
		String S = new String(c1);
		System.out.println(c1);
		
		//String is also a Class in itself. It has lots of methods
		//String is an immutable object
		
		//How to create String Objects
		String S1 = "Selenium";
		String S2 = new String();
		StringBuffer S4 = new StringBuffer();
		StringBuilder S5 = new StringBuilder();
	}

}

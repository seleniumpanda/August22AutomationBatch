package strings_Concepts;

public class StringConstang_LiteralPool {

	public static void main(String[] args) {
		// 1. What is SCP/SLP ?
		//Ans: Memory location which stores String objects
		
		
		
		//What are the memory storage areas in Java ?
		//1. Heap Area (SCP/SLP comes under heap area)/ We can manipulate size
		//2. Method Area (Upto Java 1.6, String objects were stored here)
		//3. Stack Area
		//4. PC Register
		//5. Native Method Area
		
		String S = new String(); //any object created with new keyword will be stored in Heap Area
		
		String S1 = new String("Selenium"); //1 object will be created in Heap Area, 2nd object will be created in the SCP/SLP area
		
		String S2 = "C++"; //1 object will be created in the SCP/SLP Area
		
		String S3 = new String("Java"); //2 objects - 1 in the Heap area and 1 in the SCP/SLP Area
		
		String S4 = new String("Python"); //2 objects - 1 in Heap and 1 in SCP/SLP Area
		
		String S5 = new String("Java"); //1 object in the Heap area because of use of new keyword
		
		String S6 = "Java"; //no object will be created. Zero
		
		//Interview Question
		
		String S7 = new String("Hello World");
		
		String S8 = "Hello World"; 
		

	}

}

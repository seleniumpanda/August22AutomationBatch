package strings_Concepts;

public class StringOperations1 {

	public static void main(String[] args) {
	    //length() - return type is int
		String S0 = null;
		//System.out.println(S0.length()); //NullPointerException
		
		String S1 = "I am coding in Selenium Java";
		int val1 = S1.length();
		System.out.println(val1);
		
	    //isEmpty()	- return type is boolean
		String S2 = "";
		boolean val2 = S2.isEmpty();
		System.out.println(val2);
		String S3 =" ";
		System.out.println(S3.isEmpty());
		
		//trim() - this method removes the blank space(s) before and after the String
		String S4 ="   I love    to   cook    ";
		System.out.println(S4.length());
		String val3 = S4.trim();
		System.out.println(val3);
		
		//how to use trim() and length method together
		System.out.println("Using both trim and length together:" + S4.trim().length()); //S4.length().trim(); is not allowed
		
		//Comparing two strings - equals(), equalsIgnoreCase - these return boolean 
		//                        compareTo(), compareToIgnoreCase() - these return integer
		
		String S5 = "Java";
		String S6 = "Python";
		System.out.println(S5.equals(S6));
		String S7 = "JAVA";
		System.out.println(S5.equalsIgnoreCase(S7));
		String S8 = "I am going Out";
		String S9 = "I am staying Home";
		System.out.println(S8.compareTo(S9)); //-12
		String S10 = "a"; //unicode value of a is 97
		String S11 = "A"; //unicode value of A is 65
		System.out.println(S10.compareTo(S11)); // 97-65 = 32
		System.out.println(S10.compareToIgnoreCase(S11)); //0
		String S12 = "b"; //unicode value of b is 98
		String S13 = "c"; //unicode value of c is 99
		System.out.println(S12.compareTo(S13)); // 98-99 = -1
		
		//concat()
		String S14 = "HelloWorld";
		String S15 = "PlayGames";
		String S16 = S14 + S15;
		System.out.println(S16);
		
		String S17 = "Terry"; //this is 1 object only in SCP
		String S18 = S17.concat("Jerry");
		System.out.println(S17);  
		System.out.println(S18);
		
		
		//join()
		String S19 = "Mercedes";
		String S20 = "BMW";
		String S21 = "Audi";
		System.out.println(String.join(",", S19, S20, S21));
		
		//substring()
		String S22 = "ToyotaHondaNissan";
		System.out.println(S22.substring(1, 11)); //oyotaHonda
		System.out.println(S22.substring(0, 0)); //blank output
	

	}

}

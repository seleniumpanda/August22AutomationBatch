package strings_Concepts;

public class String_Immutable {

	public static void main(String[] args) {
		//Why is String immutable ?
		//Immutable - something which cannot be changed. Programming mein cannot be changed during runtime
		
		String S = new String("Selenium"); //2 objects - 1 heap memory and 1 in SCP
		S.concat("TestNG");
		
		System.out.println(S); //Selenium
		
		S = S.concat("Python");
		System.out.println(S);
		
		
		//Let's consider a case of multiple Employees
		
		String Emp1 = "Marketing";
		String Emp2 = "Marketing";
		String Emp3 = "Marketing";
		String Emp4 = "Marketing";
		String Emp5 = "Marketing";
		String Emp6 = "HR";
		

	}

}

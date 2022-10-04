package oct3_2022_session;

public class PolyConcepts {

	// poly means many
	// morphism means forms

	// Compile Time Polymorphism / Static Polymorphism
    //1. Achieved by Method Overloading
	//2. Method name should be same, Class should be same, Different Arguments(Parameters)
	//3. It is handled by Compiler
	
	
	// RuntimeTime Polymorphism / Dynamic Polymorphism 
	//1. Achieved by [Method Overriding]
	//2. Method name should ne same, Class should be different, Same arguments/Parameters
	//3. it is handled by JVM
	//4. Inheritance

	public static void main(String[] args) {
		PolyConcepts poly = new PolyConcepts();
		poly.tearDown();
		poly.tearDown(10);
	    poly.tearDown('a');
		poly.tearDown(11, 12);
		poly.tearDown("hello");
		poly.tearDown("java", "python");
		poly.tearDown(new StringBuffer("Selenium"));
		poly.tearDown(new StringBuilder("Selenium"));
	}
	
	public void tearDown() {
		System.out.println("This is a simple method with no parameters");
	}
	
	public void tearDown(int i) {
		System.out.println("This is an overloaded method with one int parameter");
	}
	
	public void tearDown(int j, int k) {
		System.out.println("This is an overloaded method with two int parameters");
	}
	
	public void tearDown(String S) {
		System.out.println("This is an overloaded method with one String parameter");
	}
	
	
	public void tearDown(String S1, String S2) {
		System.out.println("This is an overloaded method with two String parameters");
	}
	
	
	public void tearDown(StringBuffer S3) {
		System.out.println("This is an overloaded method with one StringBuffer parameter");
	}
	
	public void tearDown(StringBuilder S3) {
		System.out.println("This is an overloaded method with one StringBuilder parameter");
	}
	
	/*
	 * public void tearDown(char c1) {
	 * System.out.println("This is a char character"); }
	 */
	
	
	
	
	
	
	
	

}

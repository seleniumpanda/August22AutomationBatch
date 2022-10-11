package oct10_2022_session;

public class Method_Overriding {
	
	//Runtime Polymorphism / Dynamic Polymorphism
	
	//Criteria to achieve
	//1. Method name should be same
	//2. Class name should be different
	//3. Same arguments
	//4. Inheritance should be there
	
	//Interview Questions
	//Que1: Overriding method's return type should be same or not ?
	//Ans: No
	
	//que2: Access modifier should be same or different?
	//Ans: Child's access modifier should be same or higher than parent
	
	//Que3: Can a private method be over-riden ?
	//Ans: No it cannot be over-riden because private method scope is within the same Class only
	
	//Que4: Can a static method be over-ridden?
	//Ans: No static methods cannot be over-ridden in Java 
	
	private void secret() {
		System.out.println("this is parent's private method");
	}
	
	public void sample() {
		System.out.println("This is parent's method known as sample");
	}
	
	public Object init() {
		System.out.println("This is parent's init method");
		return null;
	}
	
	public void test() {
		System.out.println("Parent's test method");
	}
	
	public static void validate() {
		System.out.println("This is parent's static method");
	}

}

package sep29_2022_session;

public class Static_NonStatic {

	//static - is of Class
	//non-static - that is of Object
	//keyword static means that the particular member belongs to a type itself. Rather than to an instance of that type
	//that means we create only one instance of that static member which is shared across all instances of the class
	//can be accessed directly or by classname
	//can I used object reference to call a static ? - YES
	//But should I ? you should not. 
	
	String name; //instance variable
	int age;        //instance variable
	static int Total; //static variable
	
	public static void main(String[] args) {
		sample();
		Static_NonStatic.sample();
		
		Static_NonStatic objref = new Static_NonStatic();
		objref.test();
		objref.deploy();
	}
	
	public static void sample() {
		System.out.println("static sample");
		demo();
		int i;     //i is a local variable //local variables cannot be static or non-static
	}
	
	public static void demo() {
		System.out.println("static demo");
		sample();
		
	}
	
	public void test() {
		System.out.println("non-static test method");
		sample();
		demo();
		deploy();
	}
	
	public void deploy() {
		System.out.println("non-static deploy method");
	}

}

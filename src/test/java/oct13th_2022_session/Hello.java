package oct13th_2022_session;

public interface Hello {
	
	//variables inside an interface are public, static and final
	
	public static final int i = 10;
	
	
	//unimplemented methods in interface are public and abstract
	public abstract void sample1(); //abstract/unimplemented methods
	void sample2();
	
	default void sample3() {
		System.out.println("This is a non-static default method");
	}
	
	public static void sample4() {
		System.out.println("This is a public static method");
	}
	
	//only public static methods are allowed in an interface
	//only default non static methods are allowed in an interface
	
	
	

}

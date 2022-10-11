package oct10_2022_session;

public class Method_Overriding_Child extends Method_Overriding {

	public static void main(String[] args) {
		Method_Overriding_Child child = new Method_Overriding_Child();
		child.sample();
		child.init();
		child.secret();
		child.validate();
		validate();
		Method_Overriding_Child.validate();
		
		Method_Overriding parent = new Method_Overriding();
		parent.sample();
		parent.init();
		parent.validate();
		

	}
	
	public void sample() {
		System.out.println("This is child's method name sample");
	}
	
	
	public String init() {
		System.out.println("This is child's init method");
		return null;
	}
	
    public void test() {
		System.out.println("Child's test method");
	}
    
    private void secret() {
		System.out.println("this is child's private method");
	}
    
    public static void validate() {
		System.out.println("This is child's static method");
	}

}

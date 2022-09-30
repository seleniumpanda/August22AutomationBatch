package sep29_2022_session;

public class Methods_Or_Functions {

	// Methods are independent units of execution
	// We write a certain logic. Depends on certain conditions whether we want to
	// execute the logic or not
	// access-modifier + static(optional) + returnType + methodName(){}
	// public, private, protected, default
	
	
	private void secret() {
		System.out.println("This is a secret private method which is not static");
	}

	private static void secret1() {
		System.out.println("This is a secret1 private method which is static");
	}
	
	protected void vault() {
		System.out.println("This is a vault protected method which is not static");
	}
	
	protected static void vault1() {
		System.out.println("This is a vault1 protected method which is  static");
	}
	

	public static void main(String[] args) {
		
		System.out.println("This is the main method");
		Methods_Or_Functions.sample1();
		sample1();

		Methods_Or_Functions objref = new Methods_Or_Functions(); // this is the object

		objref.test(); // 3


		boolean validate = objref.test1(); // true
		System.out.println(validate);

		String concat = objref.sample(); // JavaPython
		System.out.println(concat);
		
		objref.secret();
		secret1();
		Methods_Or_Functions.secret1();
		
		objref.vault();
		vault1();
		Methods_Or_Functions.vault1();
	}

	public void test() {
		int i = 1;
		int j = 2;
		int k = i + j;
        System.out.println(k);
		

	}

	public String sample() {
		String S1 = "Java";
		String S2 = "Python";
		String S3 = S1 + S2;
		return S3;
	}

	public boolean test1() {
		boolean b1 = true;
		boolean b2 = true;
		boolean b3 = (b1 == b2);
		return b3;

	}

	public static void sample1() {
		System.out.println("This is a static method known as sample1");
	}

}

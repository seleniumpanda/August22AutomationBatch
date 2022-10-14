package oct13th_2022_session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test implements Hello, HelloWorld{

	public static void main(String[] args) {
		Test test = new Test();
		//test.sample1();
		//test.sample2();
		test.sample3();
		
		Hello hello = new Test();
		hello.sample1();
		hello.sample2();
		hello.sample3();
		
	
		WebDriver driver = new ChromeDriver();
		//using WebDriver interface's reference I am pointing towards object of ChromeDriver class
		

	}

	@Override
	public void sample1() {
	System.out.println("This is Test Class's sample1 method logic");
		
	}

	@Override
	public void sample2() {
	System.out.println("This is Test Class's sample2 method logic");
		
	}

	@Override
	public void sample5() {
		
		
	}

	@Override
	public void sample6() {
		
		
	}

}

package oct10_2022_session;
//Abstraction - hiding implementation and just highlighting the setup services

//Achieved by

//1. By Abstract Class [0 to 100% abstraction]
//2. By interface [100% abstraction]

public abstract class Check {
	String name;
	int emp_id;

	// there is also something known as abstract methods(they do not have a body) -
	// they cannot be implemented
	// abstract methods are known as unimplemented methods
	// an abstract method cannot reside in a normal class
	// an abstract method has to be inside an abstract class
	// an abstract class can have a normal method

	public void normal() {
		System.out.println("this is a simple method");
	}

	public abstract void abnormal();

	public abstract void abnormal1();

	public abstract void abnormal2();

	public abstract void abnormal3();

	public abstract void abnormal4();

	public abstract void abnormal5();

}

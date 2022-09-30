package sep29_2022_session;

public class Animal {

	//States of the object (dog)
	
	
	String name = "Max";
	int age;
	String breed;
	String color;

	public static void main(String[] args) {
		//What is a Class ??
		//It is a template/blueprint which describes behavior/state of an object which it supports
		//Class is a logical form (it describes behavior/state of an object(S) which it actually supports)
		
		//What is an Object?
		//Is an instance of a Class. They have certain state and behavior
		
		//Class is Animal
		//Object is Dog
		//States of this Object(Dog) - name, age, breed, color
		//Behavior of this Object(Dog) - barking, sleeping, running, eating, guarding
		
		Animal animal = new Animal();
		
		
		System.out.println("The name of the Dog is : " + animal.name);
		System.out.println(animal.age = 1);
		System.out.println(animal.breed = "Golden Retriever");
		System.out.println(animal.color = "dark fawn");
		
		
		animal.barking();
		animal.sleeping();
		animal.running();
		animal.eating();
		animal.guarding();

	}
	
	//Behavior of the object (Dog) in terms of methods
	
	public void barking() {
		System.out.println("Max barks");
	}
	
	public void sleeping() {
		System.out.println("Max sleeps");
	}
	
	public void running() {
		System.out.println("Max runs");
	}
	
	public void eating() {
		System.out.println("Max eats");
	}
	
	public void guarding() {
		System.out.println("Max guards");
	}
	
	

}

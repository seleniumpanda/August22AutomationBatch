package learning_Arrays;

public class Types_Arrays {

	// Types of Arrays
	// 1. Single Dimensional Array 1-D
	// 2. Multi Dimensional Array 2-D, 3-D

	public static void main(String[] args) {

		// Declaration of an Array

		int[] a1; // this is the most popular and widely used
		int a2[]; // this comes 2nd
		int[] a3;
		int[] a4;

		String[] S1;
		String S2[];
		String[] S3;
		String[] S4;

		int[] a5, b5; // a5 and b5 both are arrays

		int[] a6, b6; // a6 and b6 both are arrays

		int a7[], b7; // a7 is array but b7 is an int variable

		// int[5]a8; //cannot insert size while declaring an array
		
		System.out.println("***************************************************************************");
		
		//Array Creation
		
		int[] a9 = new int[9]; //size is declared at the time of creation
		int[] a10 = new int[0]; //it is correct. Program will compile and run.
		System.out.println(a10.length);
		//int[] a11 = new int[-1]; //it is not incorrect but it will give an exception when run
		//System.out.println(a11); //NegativeArraySizeException
		
		System.out.println("***************************************************************************");
		
		//Array Initialization
		
		int[] i = new int[5];
		i[0] = 11;
		i[1] = 22;
		i[2] = 33;
		i[3] = 44;
		i[4] = 55;
		
		System.out.println("The size of this array is : " + i.length);
		
		int[] j = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		System.out.println("The size of this array is : " + j.length);
		
		int[] k = new int[] {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113};
		
		System.out.println("The size of this array is : " + k.length);
		System.out.println("***************************************************************************");
		
		//Array retrieval
		
		String[] S5 = {"Tiger", "Cat", "Dog", "Mice", "Elephant"};
		//retrieve the element in the 6th place
		//System.out.println(S5[6]); //ArrayIndexOutofBoundException
		//System.out.println(S5[5]); //ArrayIndexOutofBoundException
		System.out.println(S5[0] + " " +  S5[1] + " " + S5[2] + " " +  S5[3] + " " + S5[4]);
		
		//can I use a for loop to retrieve all the elements of this array ?
		
		for(int l=0 ; l<S5.length ; l++) {
			System.out.println(S5[l]);
		}
		
		for(int m=0 ; m<=S5.length-1 ; m++) {
			System.out.println(S5[m]);
		}
		

	}

}

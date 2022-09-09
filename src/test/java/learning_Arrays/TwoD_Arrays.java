package learning_Arrays;

public class TwoD_Arrays {

	public static void main(String[] args) {
		//Declaration 
		
		int[][] a1; //popular
		int a2[][];
		int[] []a3; 
		int[] a4[];
		
		int[][] a5,b5; //here a5 and b5 are both 2-D arrays
		int[] a6[], b6; //here a6 is 2-D and b6 is 1-D array
		int[] a7[], b7[]; //here a7 is 2-D and b7 is 2-D array
		int[][] a8, b8[]; //a8 is 2-D array, b8 is 3-D array
		int[][] a9[], b9[]; //a9 is 3-D, b9 is 3-D array
		//int[][] a10, []b10; //cannot apply dimension in front of 2nd variable
		
		
		System.out.println("*****************************************************************************************");
		
		//Creation
		
		int[][] a11 = new int[2][3];
		//Matrix array is created with 2 rows and 3 cols
		
		int[][] a12 = new int[2][]; //this is known as jagged array
	      a12[0] = new int [4];
	      a12[1] = new int [2]; 
	      
	     
	      //initialization
	      int[][] a13 = new int[3][4];
	      a13[0][0] = 10;
	      a13[0][1] = 20;
	      a13[0][2] = 30;
	      a13[0][3] = 40;
	      
	      a13[1][0] = 50;
	      a13[1][1] = 60;
	      a13[1][2] = 70;
	      a13[1][3] = 80;
	      
	      
	      a13[2][0] = 90;
	      a13[2][1] = 100;
	      a13[2][2] = 110;
	      a13[2][3] = 120;
	      
		
		int[][] a14 = {{10,20,30,40}, {50,60,70,80}, {90,100,110,120}};
		System.out.println(a14);
		System.out.println(a14.length);
		System.out.println(a14[0]);
		System.out.println(a14[1]);
		System.out.println(a14[2]);
		
		System.out.println(a14[0][0]);
		//System.out.println(a14[2][4]); //arrayIndexOutOfBoundException
		System.out.println(a14[2][3]);
	
		System.out.println("*****************************************************************************************");
		
		//retrieval
		
		for (int i=0; i<a14.length ; i++) {
			for(int j=0 ; j<a14[i].length ; j++) {
				System.out.println(a14[i][j] + " ");
			}
			System.out.println();
		}
		
		
		

	}

}

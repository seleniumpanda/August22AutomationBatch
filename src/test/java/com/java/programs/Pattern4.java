package com.java.programs;

public class Pattern4 {

	public static void main(String[] args) {
	
		for(int i=1 ; i<=5 ; i++) {
			
			//we will code for the spaces
			
			for(int j=4; j>=i ; j--) {
				System.out.print(" ");
			}
			
			//code for the stars *
			for(int k=1 ; k<=i ; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}

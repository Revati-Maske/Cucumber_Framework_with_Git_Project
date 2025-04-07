package com.basic;

public class Multidimensional {

	public static void main(String[] args) {
		/*int max =a[0][0];
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				if(a[i][j]>max) {
					max = a[i][j];
				}
			}
		}
		System.out.println(max);*/
		
		/*
		 33 38 4
		 5  1  7
		 4  9  10
		 44 32 11
		 */
		int a[][] = {{33,38,4},{5,1,7},{3,9,10},{44,32,11}};
		int min = a[0][0];
		int max = 0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				if(a[i][j]<min) {
					min = a[i][j];
				
				for(int r=j; r<3;r++) {
				for(int k=0; k<4; k++) {
					if(a[k][r]>max) {
						max = a[k][r];
					}
				}
				}
				
				}
			}
		}
		System.out.println("Minimum number is: "+min);

		System.out.println("Maxmium number is: "+max);
		
	}
}
package com.basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArray {
	 //int a[][] = new Array[2][3];
	//int a[][] = {{2,4,5},{5,7,8}};

	public static void main(String[] args) {
		int a[][] = {{2,4,5},{5,7,8}};
		/*for(int i=0; i<a.length; i++) {
			for(int j =0; j<a[i].length; j++) {
				System.out.print(a[i][j]+ " ");
			}
		}*/
		for(int[] row: a) {
			System.out.println(Arrays.toString(row ));
		}

	}

}

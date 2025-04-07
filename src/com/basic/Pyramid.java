package com.basic;

//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Pyramid {
	/* 1 2 3 4
	 * 5 6 7
	 * 8 9
	 * 10
	 */

	public static void main(String[] args) {
		/*int k= 1;
		for(int i=0; i<4; i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(k);
				System.out.print(" ");
				k++;
			}
			System.out.println();
		}*/
		/* 1
		 * 2 3
		 * 4 5 6 
		 * 7 8 9 10
		 */
		/*int k =3;
		for(int i=1; i<4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k);
				System.out.print(" ");
				k= k+3;
			}
			System.out.println();
		}*/
		/*
		 * 2 4 5
		 * 3 4 0
		 * 7 2 9
		 */
		// find Maximum number from array
		/*int a[][] = {{2, 4, 5},{3, 4, 7},{7, 8, 9}};
		int max =a[0][0];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(a[i][j]>max) {
					max = a[i][j];
				}
			}
		}
		System.out.println(max);*/
		/*  2 11 5
		 *  3 4  7
		 *  1 2  0
		 */
//		int [][] a= {{2,11,5},{3,4,7},{1,2,0}};
//		int min=a[0][0];
//		int mincol=0;
//
//		for(int i =0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				if(a[i][j]<min) {
//					min = a[i][j];
//					mincol=j;
//				}
//			}
//		}
//		int max = a[0][mincol];
//		for(int k=0; k<3; k++) {
//			if(a[k][mincol]> max) {
//				max = a[k][mincol];
//			}
//		}
//		System.out.println(max);
		
		/* 8 7 9
		 * 2 2 1
		 * 5 6 4
		 */
		/* int [][] a= {{8,7,9},{2,2,1},{5,6,4}};
		int min = a[0][0];
		int col =0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(a[i][j]<min) {
					min = a[i][j];
					col = j;
				}
			}
		}
		System.out.println(col);
		int max = a[0][col];
		for(int k=0; k<3; k++) {
			if(a[k][col]>max) {
				max = a[k][col];
			}
		}
		System.out.println(min);
		System.out.println(max);*/
		
		int[] a = {2,6,1,4,9};
		int temp;
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		String str1 = "hello";
		String str2 = "hello";
		String str4 = new String("hello");
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println(str1.equals(str4));
		System.out.println(str1==str4);
		
		System.out.println(str1.charAt(4));
		System.out.println(str1.indexOf("x"));
		
		String str3 = "javatraining";
		String arr[] = str3.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(str3.replace("t", "s"));
		

	}
}

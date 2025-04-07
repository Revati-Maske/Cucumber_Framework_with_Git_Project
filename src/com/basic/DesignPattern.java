package com.basic;

/*
 1 2 3 4
 5 6 7
 8 9
 10
 */


public class DesignPattern {

	public static void main(String[] args) {
		/*int k=1;
		for(int i=0; i< 4; i++) {
			for(int j=1; j<=4 -i; j++) {
				System.out.print(k+ " ");
				k++;
			}
			System.out.println();
		}*/
		/*
		 1
		 2 3
		 4 5 6
		 7 8 9 10
		 */
/*int k=1;
for(int i=0; i<4; i++) {
	for(int j=0; j<=i; j++) {
		System.out.print(k+" ");
		k++;
	}
	System.out.println();
}*/
		
		/*
		 1
		 1 2
		 1 2 3
		 1 2 3 4
		 
		for(int i =1; i<=4; i++) {
			int k=1;
			for(int j=1; j<=i; j++) {
				System.out.print(k+" ");
				k++;
				
			}
			System.out.println();
		}*/
		
		/*
		 3
		 6 9
		 12 15 18
		 */
		int k=3;
		for(int i =1; i<4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k+" ");
				k=k+3;
				
			}
			System.out.println();
		}
		
	}
	

}

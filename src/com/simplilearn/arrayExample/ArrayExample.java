package com.simplilearn.arrayExample;

public class ArrayExample {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };
		
		for(int i=0; i<a.length; i++)  {
			//System.out.println(a[i]);
		}

		
		for(int i : a)  {
			//System.out.println(i);
		}
		
		
		int[][] b = {
				{2,3,4,5,6},
				{ 7, 8, 9, 10 }		};
		
		for(int i=0; i<b.length; i++) {
			
			for(int j=0; j<b[i].length; j++)  {
				System.out.println(b[i][j]);
			}
		}
		
	}
	
	

}

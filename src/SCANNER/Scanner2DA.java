package SCANNER;

import java.util.Scanner;

class Scanner2DA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,row,col;
		int x[][]=new int [10][10];
		Scanner sc = new Scanner (System.in);
		System.out.println("enter row value :");
		row=sc.nextInt();
		System.out.println("enter col value :");
		col =sc.nextInt(); 
	
		System.out.println("enter " + (row*col) + "array elements:");
		for(i=0; i<row; i++) {
			for(j=0; j<col; j++) {
				
				System.out.println("the array is:");
				for (i=0;i<row;i++) {
					for(j=0;j<col;j++) {
						System.out.print(x[i][j]+" ");
					}
					System.out.println();
				}
			}
		}
		
		
		

	}

}

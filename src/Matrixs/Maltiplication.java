package Matrixs;

import java.util.Scanner;

 class Maltiplication {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int row1,row2,col1,col2,i,j,k,sum;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter tne number of rows of matrix 1");
		row1=sc.nextInt();
		System.out.println("enter the number columns of matrix 1");
		col1=sc.nextInt();
		System.out.println("enter the number of rows of matrix 2");
		row2=sc.nextInt();
		System.out.println("enter the number of columns of matrix 2");
		col2=sc.nextInt();
		if (col1==row2) 
		{
			int math1[][]=new int[row1][col1];
			int math2[][]=new int[row2][col2];
			int res[][]=new int [row1][col2];
			System.out.println("enter the elements of matrix 1");
			for (i=0;i<row1;i++) 
			{
				for(j=0;j<col1;j++)
					math1[i][j]=sc.nextInt();
			}
			
					System.out.println("enter the elements of matrix 2");
				for(i=0;i<row2;i++) 
				{
					for(j=0;j<col2;j++)
						math2[i][j]=sc.nextInt();
				}
				System.out.println("/n/n output matrix:");
				for (i=0;i<row1;i++) 
					for(j=0;j<col1;j++) 
					{
						sum=0;
						for(k=0;k<row2;k++) 
						{
							sum  = math1[i][j]*math2[k][j];
						}
						res[i][j]=sum;
					}
				for (i=0;i<row1;i++) 
				{
					System.out.println(res[i][j]+" ");
					System.out.println();
					}
		}
				else
				
					System.out.println("multiplication does not exist");
				}

	}
			
		
		
		
		
	



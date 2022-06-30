package Functions;

import java.util.Scanner;

public class function3sc
{

		public static void main(String[] args) {
			
	Scanner sc = new Scanner(System.in);
	System.out.println("enter x value");
	int x=sc.nextInt();
	System.out.println("enter y value");
	int y=sc.nextInt();
	add(x,y);
	sub(x,y);
	mul(x,y);
	div(x,y);
	
		}
		// function defination
		public static void add(int x,int y)
		{
			int z = x+y;
			System.out.println("sum of " +x+ " and "+y+ " = " +z);
		}
		public static void sub (int x,int y)
		{
			int z = x-y;
			System.out.println("sum of "+x+" and "+y+ " =" +z);
		}
		public static void mul(int x, int y)
		{
			int z = x*y;
			System.out.println("sum of "+x+" and "+y+ " =" +z);
		}
		public static void div (int x,int y)
		{
			double z = x/y;
			System.out.println("sum of "+x+" and "+y+ " =" +z);
		}
			
		
	}



package SCANNER;

import java.util.Scanner;

public class ScannerHcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter x value");
		int x=sc.nextInt();
		System.out.println("enter y value");
		int y=sc.nextInt();
		int hcf,i;
		hcf=x<y? x:y;
		for(i=hcf;i>1;i--)
		{
			if(x%hcf==0 && y%hcf==0) 
			{
				break;
			}
			
		}
		System.out.println(("hcf of x and y "
				+ "" +hcf));

	}

}

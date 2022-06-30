package ArrayElements;
import java.util.Scanner;

public class FindanElementanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]x= {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element to a search");
		int f=sc.nextInt();
		boolean found = false;
		for (int i=0;i<x.length;i++) {
			if(x[i]==f) 
			{
				found=true;
				break;
			}
		}
		if(found)
			System.out.println(f+" is found.");
		else
			System.out.println(f+" is not found.");

	}

}

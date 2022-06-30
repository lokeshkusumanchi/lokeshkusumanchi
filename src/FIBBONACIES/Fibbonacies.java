package FIBBONACIES;

public class Fibbonacies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1;
		int c=0;
		int n=10;
		while(c<n)
		{
			//print the numbers
			System.out.print(n1+" ");
			//swap
			int n3=n2+n1;
			n1=n2;
			n2=n3;
			c=c+1;
		}

	}

}

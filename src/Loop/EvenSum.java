package Loop;

public class EvenSum {

	public static void main(String[] args) {

		int x=1;
		int sum=0;
		while(x<=10)
		{
			if(x%2==0)
			{
				sum=sum+x;
			}
			x=x+1;
		}
	System.out.println("sum of n even numbers ="+sum);

	}

}

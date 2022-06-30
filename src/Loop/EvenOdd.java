package Loop;

public class EvenOdd {

	public static void main(String[] args) {
		int x=1;
		int Sum=0;
		while (x<=20)
		{
			if(x%2==1)
			{
				Sum=Sum+x;
			}
			x=x+1;
		}
		System.out.println("sum of n odd numbers="+Sum);
			}
		

}



package LOOP1;

public class sumofEVENnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		i=2;
		int sum = 0;
	
		while(i<=20)//condition
		{
			if(i%2==0)
			{
				sum=sum+i;
				
			}
			i=i+1;
			System.out.println("sum of even numbers=" +sum);
		}
		
		

	}

}

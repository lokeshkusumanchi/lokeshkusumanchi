package Primenumbers;

public class prime44 {

	public static void main(String[] args) {
		int x=20;
		int f = 1;
		int co = 0;
		
		 while (f<= x)// condition
		{
		if (x%2 == 0)
			{
				co = co + 1;
			}
			f = f + 1;
		}
		if (co==2)
		{
			System.out.println("composite number");
		} 
		else 
		{
			System.out.println("prime number");
		}

	}

}

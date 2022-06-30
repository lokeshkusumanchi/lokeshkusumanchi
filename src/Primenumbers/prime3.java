package Primenumbers;

public class prime3 {

	public static void main(String[] args) {
		int x;
		int f = 1;
		int co = 0;
		x=41;
		 while (f<= x)// condition
		{
		if (x%f == 0)
		{
				co = co + 1;
				
			}
			f = f + 1;
		}
		if (co == 2) {
			System.out.println("prime number");
		} else {
			System.out.println("notprime number");
		}

	}

}

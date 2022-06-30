package Primenumbers;

public class prime2 {

	public static void main(String[] args) {
		int x;
		int f=2;
		int co = 0;
		x = 9;
		while (f <= x)// condition
		{
			if (x % f == 0) {
				co = co + 1;
			}
			f = f + 1;
		}
		if (co == 2) {
			System.out.println("prime number");
		} else {
			System.out.println("composite number");
		}

	}

}

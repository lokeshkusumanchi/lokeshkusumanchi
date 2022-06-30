package loops;

public class While1 {

	public static void main(String[] args) {
		int x = 1;
		int sum = 0;
		int n=100;
		while (x <= 10) {
			System.out.println(x);
			sum = sum + x;
			x = x + 2;

		}

		System.out.println("Sum of 100 numbers " + sum);
	}

}

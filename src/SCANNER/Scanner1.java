package SCANNER;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1, m2, m3, m4, tot, avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter M1 value");
		m1 = sc.nextInt();
		System.out.println("Enter M2 value");
		m2 = sc.nextInt();
		m3 = 90;
		m4 = 99;
		if (m1 >= 40 && m2 >= 30 && m3 >= 40 && m4 >= 40) {
			System.out.println("pass");
			tot = m1 + m2 + m3 + m4;
			avg = tot / 4;
			System.out.println("Average =" + avg);
			if (avg >= 80) {
				System.out.println("Dist");
			} else if (avg >= 70) {
				System.out.println("First");
			} else if (avg >= 60) {
				System.out.println("second");
			} else {
				System.out.println("third");
			}
		} else {
			System.out.println("fail");

		}

	}



	}



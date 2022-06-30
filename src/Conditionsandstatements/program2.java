package Conditionsandstatements;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1, m2, m3, m4, tot, avg;
		m1 = 90;
		m2 = 20;
		m3 = 90;
		m4 = 99;
	
		if (m1 < 40 || m2 < 30 || m3 < 40 || m4 < 40) {
			System.out.println("fail");
		}
		tot = m1 + m2 + m3 + m4;
		avg = tot / 4;
		System.out.println("average =" + avg);
		if (avg >= 80 ) {
			System.out.println("dist");
		} else if (avg >= 70) {
			System.out.println("first");
		} else if (avg >= 60) {
			System.out.println("second");
		} else if (avg >= 50) {
			System.out.println("third");
		} else {
			System.out.println("pass");
		}

	}

}

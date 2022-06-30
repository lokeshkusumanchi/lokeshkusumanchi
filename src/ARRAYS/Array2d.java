package ARRAYS;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]x= {{12,11,23},{33,55,66}};
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("element at " + "row" +i+ "column" +j+"is"+x[i][j]+" " );
			}
			System.out.println();
			}
		System.out.println("2d array stores data like matrex");
		for (int i=0;i<x.length;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(x[i][j]+" ");
			}
			System.out.println();
		}

	}

}

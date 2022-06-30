package OVERLOADING;

public class Ambiguity {
	class overloading4{
		void sum(int a , int b) {
			System.out.println("a method invoked");
		}
		void sum (long a,int b) {
			System.out.println("b method invoked");
		}
		}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 overloading4.obj = new overloading4();
	 Obj.sum(20,20);

	}

}
 
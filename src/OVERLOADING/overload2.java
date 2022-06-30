   package OVERLOADING;
   
public class overload2   {
	void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}
	void sum (long a,long b) {
		System.out.println("long arg method invoked");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload2 = new overload2 ();
    obj.sum(20,20);

	}

}

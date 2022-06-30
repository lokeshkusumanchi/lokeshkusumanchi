package OVERLOADING;
class overloading11{
	void sum(int a, int b) {
		System.out.println(a+b);	
	}
	void sum(int a, int b,int c)
{
		System.out.println(a+b+c);
}
	public static void main(String args[]) {
		overloading11 obj=new overloading11();
		obj.sum(20,20);
		obj.sum(20,20,20);
	}
	
	
	
}
       	
package Abstraction;

public class Abstract1 {
abstract class bike{
	abstract void run();
}
class Honda1 extends bike{
	void run ()
	{
		System.out.println("running safely");
	}
	public static void main(String args[]) {
		Bike obj = new Honda1();
		obj.run();
	}	
}
}

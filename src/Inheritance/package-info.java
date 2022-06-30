package Inheritance;
class animal
{
	void eat()
	{
		System.out.println("eating");
	}
	}
class dog extends animal{
	void bark()
	{
		System.out.println("barking");
	}
	}
	class testInheritance
	{
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			dog d = new dog();
			d.bark();
			d.eat();
		
		
	}
}
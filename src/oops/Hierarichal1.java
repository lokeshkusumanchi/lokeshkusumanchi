package oops;

 class Hierarichal1 {
	 class animal{
		 void eat()
		 {System.out.println("eating");}
	 }
	 class Dog extends animal{
		 void bark() 
		 {System.out.println("barking");}
	 }
	 class Cat extends animal{
		 void meow() 
		 {System.out.println("meowing");}
	 }
	 class Hierarichal{

	public static void main(String[] args) {
	Cat c = new cat();
c.meow();
c.eat();
//c.bark();c.t.error	
	}
	 }
 }
	

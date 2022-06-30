package Abstraction;

public class Abstract2 {
	abstract class shape{
		abstract void draw();
	}
	class rveactangle extends shape{
		void dra() {
			System.out.println("drawing rectangle");
	}
	}
	class circle1 extends shape{
		void draw() {
			System.out.println("drawing circle");
		}
	}
	class testabsraction1{
	}

	public static void main(String[] args) {
		
	shape s = new circle1();
	s.draw();
	shape s1 = new reactangle();
	s1.draw();

	}

}

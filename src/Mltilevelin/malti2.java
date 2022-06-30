package Mltilevelin;


	class Person {
		public void show () {
			System.out.println("i am a person");
		}
	}
	class Student extends Person {
	public void show1() {
		System.out.println("who is a student");
	}}
	
	//child class 
	class EngineeringStudent  extends Student {
		//defining additional properties to the child class
		public void show2() {
			System.out.println("persuing engineering");
		}
	}
		public class malti2  {

	public static void main(String[] args) {
	EngineeringStudent obj = new EngineeringStudent ();
		obj.show();
		obj.show1();
		obj.show2();
		

	}
		}


package oops;
//inheritance


	class Person{
		public void show() {
			System.out.println("i am a Person");
		}
	}
//child class1
	class Student extends Person{
		public void show1() {
			System.out.println("and i am Student");
		}
	}
	//child class2
	class Teacher extends Person{
		//defining additional properties to the child class 
		public void show2() {
			System.out.println("and i am a Teacher");
		}
	}
	//child class3
	class Doctor extends Person{
		// defining additional properties to the child class
		public void show3() {
			System.out.println("and i am a Doctor");
		}
	}
	public class HIerachicalo2 {
		
	
	public static void main (String[] args) {
	
	{
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		Student student = new Student();
		Doctor doctor = new Doctor();
		Student.Show();
		Student.Show1 ();
		Teacher.Show ();
		Teacher.Show2 ();
		Doctor.Show ();
		Doctor.Show3 ();
	}

	}}

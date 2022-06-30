package oops;

class Student14{
	int rollno;
	String name;
	int age;
	Student14(int rollno ,String name, int age){
		rollno = rollno;
		name = name;
		age = age;
 	}
	void display() {
		System.out.println(rollno+" "+name+ " "+age);
	}
}
class Student143{
	public static void main(String[] args) {
		Student14 s1= new Student14(432,"lokesh",13);
		Student14 s2= new Student14(431,"hari",23);
		s1.display();
		s2.display();

	}

}

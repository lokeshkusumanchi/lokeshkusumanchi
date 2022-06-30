package oops;
class Student23 {
	 int id;
	 String name;
	 Student23(int i,String n){
		 id=i;
		 name=n;
	 }
	 Student23(Student23 s1)
	 {
		 
	 }
	 void display() {
		 System.out.println(id + " "+ name);
	 }
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student23 s1=new Student23(143,"loke");
		 Student23 s2= new Student23(s1);
		 s2.id=s1.id;
		 s2.name=s1.name;
		 s1.display();
		 s2.display();

	}

}

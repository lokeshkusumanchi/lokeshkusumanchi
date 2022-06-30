package oops;

 class Student22 {
	 int id ;
	 String name;
	 //constructor to initialize integer and string
	 Student22(int i, String n){
		 id=i;
		 name=n;
	 }
	 Student22(Student22 s)
	 {
		 id=s.id;
		 name=s.name;
	 }
	 void display() {
		 System.out.println(id+" "+name);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student22 s1 = new Student22 (143,"hari");
		Student22 s2 = new Student22(s1);
		s1.display();
		s2.display();

	}

}

package oops;

 class Student15 { 
	 int rollno;
		String name;
		int age;
		Student15(int rollno ,String name, int age){
			this.rollno = rollno;
			this.name = name;
			this.age = age;
	 	}
		void display() {
			System.out.println(rollno+" "+name+ " "+age);
		}
	}
	class Student144{
		public static void main(String[] args) {
			Student15 s1= new Student15 (432,"lokesh",25);
			Student15 s2= new Student15 (431,"hari",22);
			s1.display();
			s2.display();
	 

	

	}

}

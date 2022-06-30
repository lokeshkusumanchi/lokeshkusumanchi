package oops;
 class Student44 {
	 int rollno;//instance variable
	 String name;
	 static String school = "Dps";
	 //constructor
	 Student44 (int r, String n)
	 {
		 rollno=r;
		 name=n;
	 }
	 //method to display the val
	 void display()
	 {
		 System.out.println(rollno+" " +name+" "+school);
	 }
	 //test class to show the values of objects
	 public static void main(String[] args)
	 {
		Student44 s1= new Student44(1,"loke");
		Student44 s2= new Student44(2,"hatri");
		//we can change the college of all objects by the single of code
		Student44.school="Amar";
		s1.display();
		s2.display();

	}

}  

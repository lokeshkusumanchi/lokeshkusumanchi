package oops;

 class Student432 {
	 int rollno ;
	 String name ;
	 static String school="apps";
	 //static method to change the value of static variable
	 static void change()
	 {
		 school = "pivotal";
	 }
	 //constructor to initialize the variable
	 Student432(int r, String n)
	 {
		 rollno = r;
		 name =n;
	 }
	 //method to display values
	 void display()
	 {
		 System.out.println(rollno+ " "+name+" "+school);
	 }
	 //test class to create and display the value of object
     public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student432.change();
     //calling change method
     Student432 s1 = new Student432(111,"loke");
     Student432 s2 = new Student432(112,"sri");
     Student432 s3 = new Student432(113,"hari");
	 		 
    		 
    		 
    		 
    		 
    	

	}

}

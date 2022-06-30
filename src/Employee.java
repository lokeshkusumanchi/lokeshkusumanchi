
 class Employee {
	 float salary = 40000;
	 String name = "loke";
 }
 class programer extends Employee{
	 int bouns=10000;
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 programer p = new programer();
		 System.out.println("programer name is : " +p.name);
		 System.out.println("programer salary is : " +p.salary);
		 System.out.println("bonus of programer is :" +p.bouns);
		 programer p1 = new programer();
		 System.out.println("programer salary is : " +p1.salary);
		 System.out.println("bonus of programer is :" +p1.bouns);
		 
	}

}

package oops;

class Student21 {
	int id ;
	String name ;
	int age ;
	double rank ;
	//creating two arg constructor  
	Student21(int i,String n)
	{
		id=i;
		name=n;
	}
	//creating three arg constructor  
	Student21(int i ,String n, int a, double r)
	{
		id=i;
		name=n;
		age=a;
		rank=r;
	}
	void display() {
		System.out.println(id+ " " +name+" "+age+" +rank"  );
	}
	public static void main(String[] args) {
		Student21 s1 = new Student21(111,"hari");
		Student21 s2 = new Student21(121,"lokesh");
		s1.display();
		s2.display();
		// TODO Auto-generated method stub

	}

}

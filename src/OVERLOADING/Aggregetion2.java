package OVERLOADING;

public class Aggregetion2 {
public class student{
	int id;
	String name ;
	 Address address;
	 public student(int id ,String name ,Address address) {
		 this.id = id;
		 this.name = name;
		 this.address = address;
	 }
	 void display()
	 {
		 System.out.println(id+" " +name);
		 System.out.println(Address.city+" "+Address.state+" "Address.country);
		 
	 }
	 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1 = new Address(" loke"," up"," india");
		Address address1 = new Address(" hari"," up"," india");
		student e = new student(431," lokesh",address1);
		student e1 = new student(432," hari",address1);
		e.display();
		e1.display();
		
		

	}

}

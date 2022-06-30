
class Demonstrate1 {
int id;
String name;
//creating a parameterized constructor
Demonstrate1(int i,String n){
	id =i;
	name=n;
}
//method to display the values
void display()
{
	System.out.println( id + " " + name);
}
	public static void main(String[] args) {
		//created objectes and passing values
		Demonstrate1 s1 = new Demonstrate1(111,"lokesh");
		Demonstrate1 s2 = new Demonstrate1(444,"hari");
		//calling method to display the values of object
		s1.display();
		s2.display();
		

	}

}

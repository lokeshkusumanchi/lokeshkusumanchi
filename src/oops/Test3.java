package oops;
//object and class example: initialization through method
class Product{
 int productid,total;
String name;
Double cost; 
void insert (int R, String S,Double D, int I )
{
	productid=R;
	name=S;
	cost=D;
	total=I;
}
void DisplayInformation()
{
	System.out.println(productid +" " +  name + " " + cost +" "+ total);
}
}
class Test3
{
	public static void main(String[] args) {
 Product p1 = new Product();
 Product p2 = new Product();
 Product p3 = new Product();
 Product p4 = new Product();
 p1.insert(1,"watch",200.2,2);
 p2.insert(2,"ring",100.2,1);
 p3.insert(3,"shirt",500.3,2);
 p4.insert(4,"pant",550.4,8);
  
 p1.DisplayInformation();
 p2.DisplayInformation();
 p3.DisplayInformation();
 p4.DisplayInformation();
	}
			
		

	}



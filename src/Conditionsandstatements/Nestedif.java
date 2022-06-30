package Conditionsandstatements;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sub1 = 90;
int sub2 = 70;
int sub3 = 50;
int tottal;
double avarage;
tottal=sub1+sub2+sub3;
avarage=tottal/3;
if(sub1 >= 35 && sub2 >= 35 && sub3 >= 35);
{
System.out.println("pass with;");
if(avarage>70)
{
System.out.println("distance");
	}
else if (avarage>60)
{
	System.out.println("first class");
}
else if (avarage>50)
{
System.out.println("secound class");
}
else 
{
	System.out.println("third class");
}

{
	System.out.println("fail");
}
System.out.println("tottal = " +tottal);
System.out.println("avarage =" +avarage);
}

	}

}

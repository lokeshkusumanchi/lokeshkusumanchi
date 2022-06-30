package loops;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=3;
int y=4;
int lcm;
lcm=x>y? x:y ;//ternary operation
while(lcm<=x*y)//condition
{
	if(lcm%x==0 && lcm%y==0)
	{
		break;//terminate the loop
	}
	lcm=lcm+1;//counter
}
System.out.println("lcm of two numbers" +lcm);
	}

}

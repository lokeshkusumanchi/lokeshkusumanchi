package Loop;

public class Lcm {

	public static void main(String[] args) {
		int x=26;
		int y=32;
		int lcm;
		lcm=x>y?x:y;//ternaray oparation
		while(lcm<=x*y)
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

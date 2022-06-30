package Loop;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=34;
		int y=62;
		int hcf;
		hcf=x>y?x:y;//ternary operation
		while(hcf>1)//condition
		{
			if(x%hcf==0 && y%hcf==0)
			{
				break;//terminate the loop
			}
			hcf=hcf-1;//counter
			}
		System.out.println("hcf =" +hcf);
		}

	}



package loops;

public class while7 {

	public static void main(String[] args) {
	int x;
	int y;
	x=11;
	y=5;
	int hcf;
	hcf=x<y?x:y;//ternary operator
	while(hcf>1)
	{
		if ( x%hcf==0 && y%hcf==0)
		{
			break;
		}
		hcf=hcf-1;// counter
		
		}
	System.out.println("hcf =" +hcf);
	}

	}



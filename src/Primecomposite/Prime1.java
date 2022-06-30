package Primecomposite;

public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
int f;
int co=0;
n=3;
for(f=1;f<=n;f++) {
	if(n%f==0) {
		co=co+1;
	}}
if(co==2) {
	System.out.println("prime number");
	}
else
{
	System.out.println("composite number");
}

	}

}

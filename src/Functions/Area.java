package Functions;
class testInheritance{
 void squ(int s) {
		int a=s*s;
		System.out.println("area="+a);}
	class Square extends Area
	{
		void per(int s) {
			int p=4*5;
			System.out.println("peri = "+p);
		}
	}
	class Area{
		}
		public static void Main(String[] args) {
		// TODO Auto-generated method stub
Square s1 = new Square();
s1.per(5);
s1.square(5);
	}

}

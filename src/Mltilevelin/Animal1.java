package Mltilevelin;
class Animal1 {
	void eat()
	{System.out.println("eating");}
}
	class Dog extends Animal1{
		void bark()
		{System.out.println("barking");}
		}
		class babydog extends Dog {
			void Weep () {
				System.out.println("weeping");}
		}
				
			class multiinhe{
				public static void main(String[] args) {
					// TODO Auto-generated method stub
					babydog d = new babydog();
					d.Weep();
					d.bark();
					d.eat();
				}
			}
			
		
			
		
		



	
		// TODO Auto-generated method stub

	

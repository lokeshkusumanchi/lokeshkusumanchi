package COLLECTIONS;

import java.util.ArrayList;

public class ADDALL {
	class AddallElements{
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an arraylist
		ArrayList < String > languages = new ArrayList<>();
		ArrayList < Integer > fee = new ArrayList<>();
		
		//Add elements to ArrayList
		languages.add("java");
		languages.add("python");
		languages.add("java");
		languages.add(".net");
		languages.add("swift");
		System.out.println("ArrayList :" +languages );
		ArrayList < String > Programminglanguages = new ArrayList<>();
		//add all elements from languages to programminglang
		Programminglanguages.add("R Programminglanguag");
		Programminglanguages.add(".net");
		Programminglanguages.addAll(languages);
		Programminglanguages.set(4,"lokesh");
		Programminglanguages.remove(5);
		fee.add(15);
		fee.add(22);
		fee.add(5);
		fee.add(215);
		fee.add(135);
		System.out.println("Programming Languages: " +Programminglanguages    );
		System.out.println("fees:" + fee);
		String str = Programminglanguages.get(1);
		System.out.println("speci value:" + str);
		

	}

}

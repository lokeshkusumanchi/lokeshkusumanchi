package COLLECTIONS;

import java.util.ArrayList;

public final class LIST {
	class add {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList < String > languages = new ArrayList<>();
//Add elements to ArrayList
languages.add("java");
languages.add("python");
languages.add(".net");
System.out.println("ArrayList :" +languages );
languages.add(1, "java");
//Add c++ at index 3 
languages.add(3,"c++");
System.out.println("ArrayList :" +languages);
		}}}

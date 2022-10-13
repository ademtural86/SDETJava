package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name = "Oksana";
        String lastname = "Zadvorna";
        byte grade = 8;
        String city = "Washington";
        String state = "DC";
        String phone = "(123)456-78-99";

        System.out.println("My name is "+name);
        System.out.println("I am "+grade+" grade student");
        System.out.println("I live in city "+city);
        System.out.println("And my phone number is "+phone);
		
      //Changes
        city = "Fairfax"; //reassigning
        state = "VA";
        phone = "(098)765-43-00";
        grade = 10;

        System.out.println("My name is "+name+" and I moved to a new city "+city+" and new state "+state);
        System.out.println("My new phone number is "+phone);
        
        //Rules for Identifiers=names (variables, methods, classes)
        // 1. cannot use keywords as identifiers
        //String new ="Hello"; -> error
        
        // 2. cannot have spaces in identifiers
        // String last name="Smith";
        
        // 3. identifiers cannot start with numbers
        // int 1number=123;
        int number1=123; //number can be anywhere after 1 character
        
        /* 4. identifiers cannot contain any special characters
         *  boolean hello!=true;
         *  char #chara='A';
         *  
         *  except $ or _
         */
        double $price$=9.98;
        float _price1_=1.99F;
        
        /*
         * Naming Conventions
         * 
         * Class should start with Uppercase and follow camel casing
         * 
         * variables should start with lowercase and follow camel casing
         */
        String Weather="hot"; //not preferred
        String myWeather="cold"; //preferred
	}
}

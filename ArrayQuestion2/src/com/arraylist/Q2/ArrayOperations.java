package com.arraylist.Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> namelist = new ArrayList<>();
		namelist.add("Joey");
		namelist.add("Albert");
		namelist.add("Michael");
		namelist.add("Chandler");
		
		Collections.sort(namelist);
		for(String s : namelist){
			System.out.println(s);
		}
		System.out.println(namelist.size());
			
		System.out.println(namelist.remove("Joey")); //boolean value
		System.out.println(namelist.add("Ross")); //boolean value
		System.out.println(namelist.remove("Albert"));
			
		System.out.println("--------------------");
		System.out.println(namelist.size());
		for(String s : namelist){
			System.out.println(s);
		}
System.out.println("------------------------------------------------");	
     List<Object> count = new ArrayList<>();
     count.add(9);
     count.add("hello");
     count.add('a');
     count.add(7);
     
     for(Object i : count){
			System.out.println(i);
		}
     
     System.out.println("------------------------------------------------");		
     
     List<Integer> intcount = new ArrayList<>();
     intcount.add(9);
     intcount.add(21);
     intcount.add(4);
     intcount.add(7);
     
     Collections.sort(intcount);
     for(Object i : intcount){  //I can also pass int instead of Object.
			System.out.println(i);
		}
	}

}

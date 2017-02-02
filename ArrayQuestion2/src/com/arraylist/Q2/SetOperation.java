package com.arraylist.Q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SetOperation {

	public static void main(String[] args) {
		//HashSet
		Set<Courses>getcourses = new HashSet<>();
		Courses a1 = new Courses(101, "SOAP");
		Courses a2 = new Courses(102, "REST");
		Courses a3 = new Courses(103, "API");
		Courses a4 = new Courses(104, "Web services");
		getcourses.add(a1);
		getcourses.add(a2);
		getcourses.add(a3);
		getcourses.add(a4);
		
		for(Courses z : getcourses ){
			System.out.println(z);
		}
		System.out.println("-------------------------------");
		
		//HashMap
		Courses c1 = new Courses(101,"CSS");
		c1.setCourseBook("B");
		Courses c2 = new Courses(102,"JUnit");
		c2.setCourseBook("C");
		Courses c3 = new Courses(101,"CSS");
		c3.setCourseBook("H");
		Map<Courses,Integer>mapping = new HashMap<>();
		mapping.put(c1, 1);
		mapping.put(c2, 2);
		mapping.put(c3, 3);
		//System.out.println(mapping);
		System.out.println(mapping.size());
		for (Entry<Courses, Integer> entry : mapping.entrySet()) {
	         System.out.println("KEY : "+ entry.getKey() +", VALUE : "+entry.getValue());
	        }

	}

}

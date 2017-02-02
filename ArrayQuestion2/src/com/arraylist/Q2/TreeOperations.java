package com.arraylist.Q2;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeOperations {
	public static void main(String[] args) {
		TreeSet<Courses> treeop = new TreeSet<Courses>(new ForTree());
        treeop.add(new Courses(111,"Software Engg"));
        treeop.add(new Courses(121,"Project Management" ));
        treeop.add(new Courses(131,"ADA"));
        treeop.add(new Courses(141,"Data Structure"));
        for(Courses y:treeop){
            System.out.println(y);
        }

        System.out.println("--------------------------------------------");
        
        TreeMap<Courses,String> map = new TreeMap<Courses, String>(new ForTree());
        map.put(new Courses(211,"Software Engg"), "v1");
        map.put(new Courses(221,"DS"),"v2");
        map.put(new Courses(231,"MAth"), "v3");
        for (Entry<Courses, String> entry : map.entrySet()) {
         System.out.println("KEY : "+ entry.getKey() +", VALUE : "+entry.getValue());
        }
	}
	
}

package com.arraylist.Q2;

import java.util.Comparator;

public class ForTree implements Comparator<Courses>{
	 @Override
	    public int compare(Courses c1, Courses c2) {
	        if(c1.getCourseId() == c2.getCourseId()){
	            return 1;
	        } else {
	            return -1;
	        }
	    }
	
}

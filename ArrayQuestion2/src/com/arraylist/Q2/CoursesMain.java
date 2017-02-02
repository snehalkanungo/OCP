package com.arraylist.Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoursesMain {

	public static void main(String[] args) {
		
		List<Courses>allcourse = new ArrayList<>();
		
		Collections.sort(allcourse);

		//Custom Comparator class
		Collections.sort(allcourse,(cc1,cc2) -> cc1.getCoursename().compareTo(cc2.getCoursename()));
		
	}

}

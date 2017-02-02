package com.arraylist.Q2;

public class Courses implements Comparable<Courses> {

	public Integer courseId;
	public String coursename;
	public String courseBook;
	
	public Courses(int courseId, String coursename) {
		super();
		this.courseId = courseId;
		this.coursename = coursename;
	
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCourseBook() {
		return courseBook;
	}
	public void setCourseBook(String courseBook) {
		this.courseBook = courseBook;
	}
	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", coursename=" + coursename + ", courseBook=" + courseBook + "]";
	}
	
	
	@Override
	public int hashCode() {
		 return this.courseId.hashCode() + this.coursename.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Courses))
			return false;
	
		Courses c1 = (Courses)obj;
		return this.getCourseId().equals(c1.getCourseId()) && this.getCoursename().equals(c1.getCoursename());
			
		} 
			
	@Override
	public int compareTo(Courses c) {
		// TODO Auto-generated method stub
		return c.getCoursename().compareTo(this.getCoursename());
	}
	
	
}

package com.flipkart.service;

import com.flipkart.bean.Student;

public interface StudentInterface 
{	
	public void addCourse(int courseId, Student student);
	public void dropCourse(int courseId,Student student);
	public void displaySelectedCourses(Student student);
	public void semesterRegistration(Student student);
}
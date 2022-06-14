package com.flipkart.service;

import java.util.*;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;

public  class StudentImpl implements StudentInterface
{
	Scanner in = new Scanner(System.in);

	List<Integer> enrolled_courses = new ArrayList<Integer>();
	Scanner sc =new Scanner(System.in);
	
	public void viewGradeCard() {
		// TODO Auto-generated method stub
		
	}

	public void makePayment() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addCourse(int courseId, Student student) {
		// TODO Auto-generated method stub
		System.out.println("Enter course id:");
		int cid= sc.nextInt();
		enrolled_courses.add(cid);
	}

	@Override
	public void dropCourse(int courseId, Student student) {
		// TODO Auto-generated method stub
		System.out.println("Enter course id to be removed:");
		int cid= sc.nextInt();
		for(int c :enrolled_courses) {
			if(c == cid)
			{
				
			enrolled_courses.remove(c);
			}
		}
	}

	@Override
	public void displaySelectedCourses(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void semesterRegistration(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	public void studentReg()
	{
	System.out.println("Student registration");
	
	System.out.println("Enter your name");
	String name=in.nextLine();
	
	System.out.println("Enter your email");
	String email=in.nextLine();
	
	System.out.println("Enter your password");
	String password=in.nextLine();
	
	System.out.println("Enter your branch");
	String branch=in.nextLine();
	System.out.println("You are now logged in!");
	
	}
	
	

}
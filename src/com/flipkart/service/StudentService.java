//
//package com.flipkart.service;
//
//import java.util.*;
//
//import com.flipkart.bean.Course;
//
//public class StudentService implements StudentInterface
//{
//	List<Integer> enrolled_courses = new ArrayList<Integer>();
//	Scanner sc =new Scanner(System.in);
//	
//	public void addCourse() {
//		// TODO Auto-generated method stub
//		System.out.println("Enter course id:");
//		int cid= sc.nextInt();
//		enrolled_courses.add(cid);
//
//	}
//
//	public void dropCourse() {
//		// TODO Auto-generated method stub
//		System.out.println("Enter course id to be removed:");
//		int cid= sc.nextInt();
//		for(int c :enrolled_courses) {
//			if(c == cid)
//			{
//				
//			enrolled_courses.remove(c);
//			}
//		}
//		
//		
//	}
//
//	public void viewGradeCard() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void makePayment() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public List<Course> ViewEnrolledCourses() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
//	
//
//
//
//
/////**
//// * 
//// */
////package com.flipkart.service;
////import java.util.Scanner;
////
/////**
//// * @author anushka.srivastava
//// *
//// */
////public class StudentService 
////{
////	
//	Scanner in = new Scanner(System.in);
//			
//	public void studentReg()
//	{
//		System.out.println("Student registration");
//		
//		System.out.println("Enter your name");
//		String name=in.nextLine();
//		
//		System.out.println("Enter your email");
//		String email=in.nextLine();
//		
//		System.out.println("Enter your password");
//		String password=in.nextLine();
//		
//		System.out.println("Enter your branch");
//		String branch=in.nextLine();
//	}
////	
////	/**
////	 * @param args
////	 */
////	public static void main(String[] args) 
////	{
////		StudentService obj=new StudentService();
////		Scanner sc=new Scanner(System.in);
////		while(true)
////		{
////			System.out.println("****** STUDENT MENU ******\n1.Add Course\n2.Remove Course\n3.Display Selected Courses\n5.Display Available Course \n6.Sem Reg\n7.Exit\nEnter Choice:");
////			
////			int ch=sc.nextInt();
////			switch(ch)
////			{
////			case 1:
//////				obj.addcourse();
//////				break;
////			case 2:
//////				obj.removeCourse();
////				break;
////			case 3:
//////				obj.displayCourse();
////				break;
////			case 4:
////				System.exit(0);
////				
////			}
//		}
////
////	}
////
////}
////

/**
 * 
 */
package com.flipkart.service;
import com.flipkart.bean.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author anushka.srivastava
 *
 */
public class CourseImplementation implements CourseInterface
{
	List<Course> course_list=new ArrayList<Course>();
	Scanner sc=new Scanner(System.in);
	/**
	 * @param args
	 */
//	÷
	public void courseMenu()
	{
		CourseImplementation obj=new CourseImplementation();
		
		while(true)
		{
			System.out.println("****** COURSE MENU ******\n1.Add Course\n2.Remove Course\n3.Display Courses\n4.Exit\nEnter Choice:");
			
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				obj.addCourse();
				break;
			case 2:
				obj.removeCourse();
				break;
			case 3:
				obj.displayCourse();
				break;
			case 4:
				System.exit(0);
				
			}
		}
	}
	
	@Override
	public void displayCourse() {
		// TODO Auto-generated method stub
		System.out.println("Course Catalogue:");
		System.out.println("CID");
		for(Course c :course_list) {
			
			System.out.println( c.getCourseID() + "  " +c.getCourseName() + "   " +c.getCoursePreq() + "  "  +c.getCourseDesc() + "  " +c.getCourseCredits());
		}

	}

//	@Override
//	public void updateCustomer() {
//		// TODO Auto-generated method stub
//		
//		System.out.println("update Customer-->");
//		
//	}

	@Override
	public void addCourse() {
		System.out.println("Enter course id:");
		int cid= sc.nextInt();
		
		System.out.println("Enter course name:");
		String cname= sc.nextLine();
		sc.next();
		System.out.println("Enter course description:");
		String desc= sc.nextLine();
		sc.next();
		System.out.println("Enter course preq:");
		String preq= sc.nextLine();
		sc.next();
		System.out.println("Enter course credential:");
		float cred= sc.nextFloat();

		Course c1 =new Course();
		c1.setCourseID(cid);
		c1.setCourseName(cname);
		c1.setCourseCredits(cred);
		c1.setCourseDesc(desc);
		c1.setCoursePreq(preq);
		course_list.add(c1);
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCourse() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter course id to be removed:");
		int cid= sc.nextInt();
		List<Course> curr = new ArrayList<Course>();
		for(Course c :course_list) {
			if(c.getCourseID() == cid)
			{
				curr.add(c);
			}
		}
		for(Course c: curr)
		{
			course_list.remove(c);
		}
		
		
	}

}

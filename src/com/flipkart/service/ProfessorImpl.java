/**
 * 
 */
package com.flipkart.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.flipkart.bean.Professor;
import com.flipkart.bean.Course;
import com.flipkart.bean.Student;

/**
 * @author shivam.pandey2
 *
 */
public class ProfessorImpl implements ProfessorInterface{
	
	Scanner sc = new Scanner(System.in);
	List<Course>AssignedCourse = new ArrayList<>();
	List<Student>EnrolledStudents = new ArrayList<>();
	public void ProfMenu()
	{
	while(true)
	{
		ProfessorImpl prof = new ProfessorImpl();
		System.out.println("-------------PROFESSOR MENU--------\n1.Add Course\n2.Remove Course\n3.Show Assigned Courses\n4.View Enrolled Students\n5.GetName\n6.View Grades\n7.Grade Students\n8.Exit \nEnter Choice:\" ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			prof.addAssignedCourse();
			break;
		case 2:
			prof.removeAssignedCourse();
			break;
		case 3: 
			prof.showAssignedCourses();
			break;
		case 4: 
			prof.viewEnrolledStudents();
			break;
		case 5:
			prof.getName();
			break;
		case 6:
			prof.viewGrades();
			break;
		case 7: 
			prof.gradeStudents();
			break;
		case 8: 
			System.exit(0);
			//break;
		default:
			System.out.println("Wrong Entry");
		}
	}
	}
	@Override
	public void getName() {
		// TODO Auto-generated method stub
		Professor prof = new Professor();
		System.out.println("Professor Name: "+prof.getUser_id());
	}
	@Override
	public void gradeStudents() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void viewGrades() {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void showAssignedCourses() {
		// TODO Auto-generated method stub
		System.out.println("Showing Assigned Courses");
		for(Course c:AssignedCourse)
		{
			System.out.println(c.getCourseID() + "  " +c.getCourseName() + "   " + c.getCourseCredits());
		}
		
	}
	@Override
	public void addAssignedCourse() {
		// TODO Auto-generated method stub
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
		AssignedCourse.add(c1);
		
	}
	@Override
	public void removeAssignedCourse() {
		
		// TODO Auto-generated method stub
		System.out.println("Enter course id to be removed:");
		int cid= sc.nextInt();
		List<Course> curr = new ArrayList<Course>();
		for(Course c :AssignedCourse) {
			if(c.getCourseID() == cid)
			{
				curr.add(c);
			}
		}
		for(Course c: curr)
		{
			AssignedCourse.remove(c);
		}
		
		
	}
	@Override
	public void viewEnrolledStudents() {
		// TODO Auto-generated method stub
		for(Student st: EnrolledStudents)
		{
			System.out.println(st.getUser_id() + "  " +st.getUser_email());
		}
		
	}
	
	
}
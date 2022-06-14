package com.flipkart.application;
import com.flipkart.service.*;
import java.util.Scanner;
public class CRS_Application {

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	        // Call all those methods in the application.
			// call the professor menu,student menu, menu, user menu.
			Scanner in= new Scanner(System.in);
			int choice;
			StudentImpl ss= new StudentImpl();
			ProfessorService ps=new ProfessorService();
			ProfessorImpl ob = new ProfessorImpl();
			CRS_Application crs_ob= new CRS_Application();
			CourseImplementation obj =new CourseImplementation();
					
			int flag=0;
			
			while(true) {
				
				System.out.println("Welcome To CRS");
				System.out.println("We offer you following options:");
				System.out.println("1. Register as Student ");
				System.out.println("2. Register as Professor");
				System.out.println("3. Login as student ");
				System.out.println("4. Login as Professor ");
				System.out.println("5. Exit CRS ");
				System.out.println("Enter your choice ");

				choice = in.nextInt();
				
				switch(choice) {
					case 1:
						
						ss.studentReg();
						
						//TODO: call register as student function
						
					
						
					case 3:
//						login as student
						if(crs_ob.login())
						{
							System.out.println("You logged in !");
						
							
							
									
									System.out.println("Welcome");
									System.out.println("We offer you following options:");
									System.out.println("1. Add Course ");
									System.out.println("2. Drop Course ");
									System.out.println("3. View Grade Card");
									System.out.println("4. View Enrolled Courses ");
									System.out.println("5. Exit ");
									System.out.println("Enter your choice ");
									int menuStudent=in.nextInt();
									switch(menuStudent) {
									
									case 1:
										// ToDo-> Display all the courses.
										CourseImplementation ci=new CourseImplementation();
										ci.displayCourse();
										//Add Course
										
										break;
										
									case 2:
										break;
									case 3:
										//Grade card
										break;
									case 4:
										//view enrolled courses
										break;
									case 5:
										System.exit(0);
									}
								}
						else
						{
							System.out.println("Invalid Credentials!");
						}
						break;
					case 2:
						ps.profReg();
						//TODO: call register as professor function
						
					case 4:
						if(crs_ob.login())
						{
							System.out.println("You logged in !");
							ob.ProfMenu();
						}
						else
						{
							System.out.println("Invalid Credentials!");
						}
						break;
					case 5:
						System.out.println("You are exiting CRS!!");
						System.exit(0);
							
					default:
						System.out.println("Wrong choice. Enter again!!");			
				}
				
				
			}
			
		}
		public boolean login()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter creadentials to login\nEnter Username:");
			String uname=sc.nextLine();
			System.out.println("Enter password:");
			String pswd=sc.nextLine();
			uname=uname.trim();
			pswd=pswd.trim();
			if(uname.equals("JEDI"))
					{
						if(pswd.equals("JEDI"))
						{
							return true;
						}
								
					}
			return false;
			
			
		}

	}




package com.flipkart.service;
import java.util.Scanner;
public class ProfessorService 
{
	Scanner in=new Scanner(System.in);
	public void profReg()
	{
		System.out.println("Professor registration");
		
		System.out.println("Enter your name");
		String name=in.nextLine();
		
		System.out.println("Enter your email");
		String email=in.nextLine();
		
		System.out.println("Enter your password");
		String password=in.nextLine();
		
		System.out.println("Enter your department");
		String department=in.nextLine();
		
		System.out.println("Enter your designation");
		String designation=in.nextLine();
	}

}

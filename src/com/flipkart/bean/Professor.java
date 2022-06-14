/**
 * 
 */
package com.flipkart.bean;

import java.util.List;

/**
 * @author shivam.pandey2
 *
 */
public class Professor extends User{

	/**
	 * @param args
	 */
	private String Dept;
	private String Designation;
	private String DOJ;
	/**
	 * @return the dept
	 */
	public String getDept() {
		return Dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		Dept = dept;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return Designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		Designation = designation;
	}
	/**
	 * @return the dOJ
	 */
	public String getDOJ() {
		return DOJ;
	}
	/**
	 * @param dOJ the dOJ to set
	 */
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	
}
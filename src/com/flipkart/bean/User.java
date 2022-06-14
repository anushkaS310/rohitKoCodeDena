/**
 * 
 */
package com.flipkart.bean;

/**
 * @author shivam.pandey2
 *
 */
public class User {

	/**
	 * @param args
	 */
	private int user_id;
	private String user_email;
	private String user_password;
	private String role;
	private boolean isVerfied;
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the isVerfied
	 */
	public boolean isVerfied() {
		return isVerfied;
	}
	/**
	 * @param isVerfied the isVerfied to set
	 */
	public void setVerfied(boolean isVerfied) {
		this.isVerfied = isVerfied;
	}
	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the user_email
	 */
	public String getUser_email() {
		return user_email;
	}
	/**
	 * @param user_email the user_email to set
	 */
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	/**
	 * @return the user_password
	 */
	public String getUser_password() {
		return user_password;
	}
	/**
	 * @param user_password the user_password to set
	 */
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	

}
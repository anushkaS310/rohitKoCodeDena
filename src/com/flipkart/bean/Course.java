package com.flipkart.bean;

public class Course {
	
		private int courseID;
		private String courseName;
		private String courseDesc;
		private String coursePreq;
		private String courseDept;
		private float courseCredits;
		
		/**
		 * @return the courseID
		 */
		public int getCourseID() {
			return courseID;
		}
		/**
		 * @param courseId the courseId to set
		 */
		public void setCourseID(int courseID) {
			this.courseID = courseID;
		}
		/**
		 * @return the courseName
		 */
		public String getCourseName() {
			return courseName;
		}
		/**
		 * @param customerName the courseName to set
		 */
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		/**
		 * @return the courseName
		 */
		public String getCourseDesc() {
			return courseDesc;
		}
		/**
		 * @param customerName the courseName to set
		 */
		public void setCourseDesc(String courseDesc) {
			this.courseDesc = courseDesc;
		}
		public String getCoursePreq() {
			return coursePreq;
		}
		/**
		 * @param customerName the courseName to set
		 */
		public void setCoursePreq(String coursePreq) {
			this.coursePreq= coursePreq;
		}
		public String getCourseDept() {
			return courseDept;
		}
		/**
		 * @param customerName the courseName to set
		 */
		public void setCourseDept(String courseDept) {
			this.courseDesc = courseDept;
		}
		/**
		 * @return the customerAddress
		 */
		public float getCourseCredits() {
			return courseCredits;
		}
		/**
		 * @param customerAddress the customerAddress to set
		 */
		public void setCourseCredits(float courseCredits) {
			this.courseCredits = courseCredits;
		}


}

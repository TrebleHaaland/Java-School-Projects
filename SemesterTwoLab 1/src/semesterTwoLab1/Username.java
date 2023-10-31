package semesterTwoLab1;
/*File:Username.java
 *  Creates local scope variables to on a First name, last name and student number.
 */

/**
 *@author Emmanuel Alabi
 *@see Driver
 *@version 1.0
 *@since May 10, 2023
 */


public class Username {
 private String firstName;
 private String lastName;
 private long studentNumber;
 /**
	 * This returns the firstName object that displays the first name of the student
	 * @return
	 */  
public String getFirstName() {
	return firstName;
}
/**
 * This sets the firstName object that displays the first name of the student
 * @param firstName
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/**
 * This returns the lastName object that displays the last name of the student
 * @return
 */
public String getLastName() {
	return lastName;
}
/**
 * This initializes the lastName object that displays the last name of the student
 * @param lastName
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/**
 * This returns the stduentNumber object that displays the student's id number
 * @return studentNumber
 */

public long getStudentNumber() {
	return studentNumber;
}

/**
 * This initializes the stduentNumber object that displays the student's id number
 * @param studentNumber
 */
public void setStudentNumber(long studentNumber) {
	this.studentNumber = studentNumber;
}

/**
 * This method returns the name of the author of this project i.e. Emmanuel Alabi.
 * @return projectBy
 */
public String projectBy() {
	String project=("Project by Emmanuel Alabi");
			return project;
	}
}
	

package SemesterTwoLab6;
/**
*
* @author Emmanuel Alabi.
* @version  1.3
* @since 11
* @see Payme
* 
*/

/**
 * The Programmer class is an abstract class that represents a generic programmer.
 * It implements the Payme interface and provides common properties and methods for programmers.
 */
public abstract class Programmer implements Payme {

private String firstName; 
private String lastName;
private String socialSecurityNumber;
private int year;

	/**
	 * Constructs a Programmer object with the specified details.
	 * @param first              The first name of the programmer.
	 * @param last               The last name of the programmer.
	 * @param ssn                The social security number of the programmer.
	 */
	public Programmer(String first, String last, String ssn) {
	 firstName = first;
	 lastName = last;
	 socialSecurityNumber = ssn;
	}
	
	/**
     * Constructs a Programmer object with the specified details and hire date.
     * @param firstName           The first name of the programmer.
     * @param lastName            The last name of the programmer.
     * @param socialSecurityNumber The social security number of the programmer.
     * @param month               The month of the programmer's hire date.
     * @param newYear             The year (with two digits) of the programmer's hire date.
     */
	 public Programmer(String firstName, String lastName, String socialSecurityNumber, int month, int newYear) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.socialSecurityNumber = socialSecurityNumber;

	        // Validate and set the hire year.
	        if (newYear <= 23 && newYear >= 0) {
	            this.year = 2000 + newYear;
	        } else if (newYear >= 24 && newYear <= 99) {
	            this.year = 1900 + newYear;
	        } else {
	            // Invalid year, set the year to a default value.
	            this.year = 1900;
	            if (newYear < 1900)
	            	this.year= 1900;
	        }
	    }
	
	/**
     * Retrieves the first name of the programmer.
     * @return The first name.
     */
	public String getFirstName() {
		return firstName;
	}
	
	/**
     * Sets the first name of the programmer.
     * @param firstName The first name to set.
     */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
     * Retrieves the last name of the programmer.
     * @return The last name.
     */
	public String getLastName() {
		return lastName;
	}
	
	/**
     * Sets the last name of the programmer.
     * @param lastName The last name to set.
     */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
     * Retrieves the social security number of the programmer.
     * @return The social security number.
     */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	/**
     * Sets the social security number of the programmer.
     * @param socialSecurityNumber The social security number to set.
     */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	/**
     * Sets the hire year of the programmer.
     * @param year The hire year to set.
     */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
     * Retrieves the hire year of the programmer.
     * @return The hire year.
     */
	public int getYear() {
		return year;
	}
	
	/**
     * Generates a formatted string representation of the Programmer object.
     * @return A formatted string describing the programmer's details, including the hire year.
     */
	@Override
	public String toString() {
		return String.format("%s  %s\nSocial Security Number:  %s \ncontract year:  %d", getFirstName(), getLastName(), getSocialSecurityNumber(), getYear());
	}
	
	public abstract double earnings(); 
} 



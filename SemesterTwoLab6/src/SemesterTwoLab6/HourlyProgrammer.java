package SemesterTwoLab6;
/**
*
* @author Emmanuel Alabi.
* @version  1.3
* @since 11
* @see SalesAgent
* @see SalesSupervisor
* @see SalesChief
*/

/**
 * The HourlyProgrammer class represents a programmer who is paid on an hourly basis.
 * It extends the Programmer class and provides methods to manage the hourly wage and hours worked.
 */
public class HourlyProgrammer extends Programmer {
	private double wage; // wage per hour
	private double hours; // hours worked for week
	
	/**
     * Constructs an HourlyProgrammer object with the specified details.
     * @param firstName           The first name of the programmer.
     * @param lastName            The last name of the programmer.
     * @param socialSecurityNumber The social security number of the programmer.
     * @param month               The month of the programmer's hire date.
     * @param year                The year of the programmer's hire date.
     * @param wage                The wage per hour for the programmer.
     * @param hours               The hours worked for the week by the programmer.
     * @throws IllegalArgumentException If the wage is less than 0.0 or if the hours are not within the valid range [0.0, 168.0].
     */
	public HourlyProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, month, year);
	
		if (wage < 0.0) { // validate wage
		  throw new IllegalArgumentException(
		     "Hourly wage must be >= 0.0");
		}
		
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
		  throw new IllegalArgumentException(
		     "Hours worked must be >= 0.0 and <= 168.0");
		}
		
		this.wage = wage;
		this.hours = hours;
	} 
	
	/**
     * Sets the hourly wage for the programmer.
     * @param wage The hourly wage to set.
     * @throws IllegalArgumentException If the wage is less than 0.0.
     */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
		  throw new IllegalArgumentException(
		     "Hourly wage must be >= 0.0");
		}
		
		this.wage = wage;
	} 
	
	/**
     * Retrieves the hourly wage of the programmer.
     * @return The hourly wage.
     */
	public double getWage() {
	return wage;
	} 
	
	/**
     * Sets the hours worked for the week by the programmer.
     * @param hours The hours worked to set.
     * @throws IllegalArgumentException If the hours are not within the valid range [0.0, 168.0].
     */
	public void setHours(double hours) {
	if ((hours < 0.0) || (hours > 168.0)) { // validate hours
	  throw new IllegalArgumentException(
	     "Hours worked must be >= 0.0 and <= 168.0");
	}
	
	this.hours = hours;
	} 
	
	/**
     * Retrieves the hours worked for the week by the programmer.
     * @return The hours worked.
     */
	public double getHours() {
	return hours;
	} 
	
	/**
     * Calculates the payment amount for the programmer based on the hourly wage and hours worked.
     * @return The payment amount for the programmer.
     */
	@Override                                                           
	public double getPaymentAmount() {                                            
	if (getHours() <= 40) { // no overtime                           
	  return getWage() * getHours();   
	}
	else {                                                             
	  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}
	}
	
	/**
     * Calculates the programmer's earnings.
     * This method overrides the method from the Programmer class.
     * @return The programmer's earnings (which are not used in this class).
     */
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return 0;
	}                                          
	   
	/**
     * Generates a formatted string representation of the HourlyProgrammer object.
     * @return A formatted string describing the programmer's details, including the hourly wage and hours worked.
     */
	@Override                                                             
	public String toString() {
		return String.format("Hourly Programmer: " + super.toString() + "\nhourly wage: $%.2f; hours worked: %.2f", 
				getWage(), getHours());
	}                   
}


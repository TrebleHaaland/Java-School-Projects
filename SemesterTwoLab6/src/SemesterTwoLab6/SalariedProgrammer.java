package SemesterTwoLab6;
/**
*
* @author Emmanuel Alabi.
* @version  1.3
* @since 11
* @see Programmer
*/
/**
 * The SalariedProgrammer class represents a programmer who is paid a fixed weekly salary.
 * It extends the Programmer class and provides methods to manage the weekly salary.
 */
public class SalariedProgrammer extends Programmer  {
	private double weeklySalary;
	
	/**
     * Constructs a SalariedProgrammer object with the specified details.
     * @param firstName           The first name of the programmer.
     * @param lastName            The last name of the programmer.
     * @param socialSecurityNumber The social security number of the programmer.
     * @param month               The month of the programmer's hire date.
     * @param year                The year of the programmer's hire date.
     * @param weeklySalary        The weekly salary of the programmer.
     * @throws IllegalArgumentException If the weeklySalary is less than 0.0.
     */
	public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber, month, year); 
	
		if (weeklySalary < 0.0) {
		  throw new IllegalArgumentException(
		     "Weekly salary must be >= 0.0");
		}
		
		this.weeklySalary = weeklySalary;
		} 
	
	/**
     * Sets the weekly salary for the programmer.
     * @param weeklySalary The weekly salary to set.
     * @throws IllegalArgumentException If the weeklySalary is less than 0.0.
     */
	public void setWeeklySalary(double weeklySalary) {
	if (weeklySalary < 0.0) {
	  throw new IllegalArgumentException(
	     "Weekly salary must be >= 0.0");
	}
	
	this.weeklySalary = weeklySalary;
	} 
	
	/**
     * Retrieves the weekly salary of the programmer.
     * @return The weekly salary.
     */
	public double getWeeklySalary() {
		return weeklySalary;
	} 
	
	/**
     * Calculates the payment amount for the programmer.
     * @return The weekly salary of the programmer.
     */
	@Override                                                           
	public double getPaymentAmount() {                                          
		return getWeeklySalary();                                        
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
     * Generates a formatted string representation of the SalariedProgrammer object.
     * @return A formatted string describing the programmer's details, including the weekly salary.
     */
	@Override        
	public String toString() {
		return String.format("Salaried Programmer: " + super.toString() + "\nWeekly Salary: $%.2f", 
				getWeeklySalary());
	}                                           	
}


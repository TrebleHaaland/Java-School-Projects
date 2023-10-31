package SemesterTwoLab6;
/**
*
* @author Emmanuel Alabi.
* @version  1.3
* @since 11
* @see Programmer

*/

/**
 * The CommissionProgrammer class represents a programmer who earns commission based on weekly gross sales.
 * It extends the Programmer class and provides methods to manage the gross sales and commission rate.
 */
public class CommissionProgrammer extends Programmer { 

	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	
	/**
     * Constructs a CommissionProgrammer object with the specified details.
     * @param firstName           The first name of the programmer.
     * @param lastName            The last name of the programmer.
     * @param socialSecurityNumber The social security number of the programmer.
     * @param month               The month of the programmer's hire date.
     * @param year                The year of the programmer's hire date.
     * @param grossSales          The gross weekly sales of the programmer.
     * @param commissionRate      The commission rate as a percentage for the programmer.
     * @throws IllegalArgumentException If the commissionRate is not within the valid range (0.0, 1.0)
     *                                  or if the grossSales are less than 0.0.
     */
	public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year, double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber, month, year);
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
		  throw new IllegalArgumentException(
		     "Commission rate must be > 0.0 and < 1.0");
		}
		
		if (grossSales < 0.0) { // validate
		  throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		} 
	
	/**
     * Sets the gross weekly sales for the programmer.
     * @param grossSales The gross weekly sales to set.
     * @throws IllegalArgumentException If the grossSales are less than 0.0.
     */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
		  throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		this.grossSales = grossSales;
		} 
	
	/**
     * Retrieves the gross weekly sales of the programmer.
     * @return The gross weekly sales.
     */
	public double getGrossSales() {
		return grossSales;
	} 
	
	/**
     * Sets the commission rate as a percentage for the programmer.
     * @param commissionRate The commission rate to set (as a percentage).
     * @throws IllegalArgumentException If the commissionRate is not within the valid range (0.0, 1.0).
     */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
		  throw new IllegalArgumentException(
		     "Commission rate must be > 0.0 and < 1.0");
		}
		
		this.commissionRate = commissionRate;
		} 
	
	/**
     * Retrieves the commission rate as a percentage for the programmer.
     * @return The commission rate.
     */
	public double getCommissionRate() {
	return commissionRate;
	} 
	
	/**
     * Calculates the earnings for the programmer.
     * This method overrides the method from the Programmer class.
     * @return The programmer's earnings (which are not used in this class).
     */
	@Override                                                           
	public double earnings() {  
		// TODO Auto-generated method stub
		return 0;                    
	}
	
	/**
     * Calculates the payment amount for the programmer based on the gross sales and commission rate.
     * @return The payment amount for the programmer.
     */
	@Override 
	public double getPaymentAmount() {
		return getCommissionRate() * getGrossSales();
	}                                             
	
	/**
     * Generates a formatted string representation of the CommissionProgrammer object.
     * @return A formatted string describing the programmer's details, including the gross sales and commission rate.
     */
	@Override      
	public String toString() {
		return String.format("Commision Programmer: " + super.toString() + "\ngross sales: $%.2f; commission rate: %.2f", 
				getGrossSales(), getCommissionRate());
	}                                             
}


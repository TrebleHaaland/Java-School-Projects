package SemesterTwoLab6;
/**
 *
 * @author Emmanuel Alabi.
 * @version  1.3
 * @since 11
 * @see CommissionProgrammer
 * @see Programmer
 */

/**
 * The BasePlusCommissionProgrammer class represents a programmer who earns a base salary
 * in addition to a commission based on their gross sales.
 * It extends the CommissionProgrammer class.
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

	private double baseSalary; // base salary per week
	
	/**
     * Constructs a BasePlusCommissionProgrammer object with the specified details.
     * @param firstName           The first name of the programmer.
     * @param lastName            The last name of the programmer.
     * @param socialSecurityNumber The social security number of the programmer.
     * @param month               The month of the programmer's hire date.
     * @param year                The year of the programmer's hire date.
     * @param grossSales          The gross sales of the programmer.
     * @param commissionRate      The commission rate for the programmer.
     * @param baseSalary          The base salary per week for the programmer.
     * @throws IllegalArgumentException If the baseSalary is less than 0.0.
     */
	public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, month, year, grossSales, commissionRate);
		
		if (baseSalary < 0.0) { // validate baseSalary                  
		  throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;                
	}
	
	  /**
     * Sets the base salary for the programmer.
     * @param baseSalary The base salary per week to set.
     * @throws IllegalArgumentException If the baseSalary is less than 0.0.
     */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary                  
		  throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;                
		} 

	/**
     * Retrieves the base salary of the programmer.
     * @return The base salary per week.
     */
	public double getBaseSalary() {
		return baseSalary;
	}
	
	/**
     * Sets the gross sales for the programmer.
     * This method overrides the method from the CommissionProgrammer class.
     * @param grossSales The gross sales to set.
     */
	public void setGrossSales(double grossSales){
		super.setGrossSales(grossSales);
	}
	
	/**
     * Retrieves the gross sales of the programmer.
     * This method overrides the method from the CommissionProgrammer class.
     * @return The gross sales.
     */
	public double getGrossSales() {
		return super.getGrossSales();
	}
	
	/**
     * Sets the commission rate for the programmer.
     * This method overrides the method from the CommissionProgrammer class.
     * @param commissionRate The commission rate to set.
     */
	public void setCommissionRate(double commissionRate) {
		super.setCommissionRate(commissionRate);
	}
	
	/**
     * Retrieves the commission rate of the programmer.
     * This method overrides the method from the CommissionProgrammer class.
     * @return The commission rate.
     */
	public double getCommissionRate() {
		return super.getCommissionRate();
	}
	
	/**
     * Calculates the programmer's earnings.
     * This method overrides the method from the CommissionProgrammer class.
     * @return The programmer's earnings (which are not used in this class).
     */
	@Override                                                             
	public double earnings() {    
		return 0;                      
	} 
	
	/**
     * Calculates the payment amount for the programmer.
     * This method overrides the method from the CommissionProgrammer class.
     * @return The total payment amount for the programmer (base salary + commission).
     */
	@Override
	public double getPaymentAmount() {
		return getBaseSalary() + super.getPaymentAmount();
	}
	
	/**
     * Generates a formatted string representation of the BasePlusCommissionProgrammer object.
     * @return A formatted string describing the programmer's details, including the base salary.
     */
	@Override     
	public String toString() {
		return String.format("Base-plus " + super.toString() + " base salary: $%.2f", 
				getBaseSalary());
	}                                                      
}




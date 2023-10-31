package SemesterTwoLab6;
/**
*
* @author Emmanuel Alabi.
* @version  1.3
* @since 11
* @see Programmer
*/

/**
 * The Payme interface represents an entity that can receive payments.
 * It declares a single method getPaymentAmount() to retrieve the payment amount for the entity.
 */
public interface Payme {
	
	/**
     * Retrieves the payment amount for the entity.
     * @return The payment amount as a double value.
     */
	public double getPaymentAmount();
}

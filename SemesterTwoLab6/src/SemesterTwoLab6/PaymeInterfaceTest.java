package SemesterTwoLab6;
/**
*
* @author Emmanuel Alabi.
* @version  1.3
* @since 11
* @see Payme
* @see Invoice
* @see SalariedProgrammer
* @see HourlyProgrammer
* @see CommissionProgrammer
* @see BasePlusCommissionProgrammer
*/

/**
 * The PaymeInterfaceTest class process various Payme objects,
 * including invoices and displaying their payment details.
 */
public class PaymeInterfaceTest  {

	/**
     * The main method of the PaymeInterfaceTest class.
     * @param args The command-line arguments (not used in this program).
     */
public static void main(String[] args) {

	Payme[] paymeObjects = new Payme[6];
	paymeObjects[0] = new Invoice("22776", "brakes", 3, 300);
	paymeObjects[1] = new Invoice("33442", "gear", 5, 90.99);
	paymeObjects[2] = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 7, 23, 320);
	paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 7, 50, 18.95, 40);
	paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 7, 01, 16500.00, 0.44);
	paymeObjects[5] = new BasePlusCommissionProgrammer("Emmanuel", "Alabi", "120-44-5878", 7, 05, 1200.00, 0.04, 720.00);

 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 
 for (Payme currentPayme : paymeObjects) {
    System.out.printf("%s \n", currentPayme.toString()); 
    
       
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;

       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.10 * oldBaseSalary);
       System.out.printf("new base salary with 10%% increase is: $%,.2f\n", programmer.getBaseSalary());
    } 
 
    System.out.printf("payment due: $%,.2f\n", currentPayme.getPaymentAmount());
    System.out.println();

 }
}
}



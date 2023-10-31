package SemesterTwoAss01;

/**
* @author alabi
* @see MyHealthDataTest
* @see Patient
* @version 1.7
* @since 11
*/
public class MyHealthDataTest1 {

	/**
	 * @param args The main method 
	 */
	public static void main(String[] args) {
		double expectedBMI = 32.7;
		double verifierNumber = 0.1;
		Patient objPatient1 = new Patient("Emmanuel","Alabi","male",2005,02,28,70,228.2);
		Patient objPatient2 = new Patient("Emmanuel","Alabi","male",2003,03,01,71,229.2);
		if (Math.abs(objPatient1.getBMI()- expectedBMI)<= verifierNumber) {
			System.out.println("BMI test is successful");
		} else {
			System.out.println("BMI test is unsuccessful");
		}
		System.out.println();
		if (Math.abs(objPatient2.getBMI()-expectedBMI)<= verifierNumber) {
			System.out.println("BMI test is successful");
		} else {
			System.out.println("BMI test is unsuccessful");
		}
			
	}
	

}

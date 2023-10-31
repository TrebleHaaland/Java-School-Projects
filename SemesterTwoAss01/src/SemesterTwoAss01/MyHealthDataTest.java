package SemesterTwoAss01;
import java.util.Scanner;

/**
 * @author alabi
 * @see Patient
 * @see MyHealthDataTest1
 * @version 1.7
 * @since 11
 */

public class MyHealthDataTest {

	/**
	 * @param args The main method 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Patient objPatient = new Patient();
		
	System.out.println("First Name:");
	objPatient.setFirstName(scanner.next());
	
		System.out.println("Last Name:");
		objPatient.setLastName(scanner.next());
		
		System.out.println("Gender:");
		objPatient.setGender(scanner.next());
		
		System.out.println("Birth Year:");
		objPatient.setBirthYear(scanner.nextInt());
		
		System.out.println("Birth Month:");
		objPatient.setBirthMonth(scanner.nextInt());
		
		System.out.println("Birth Day:");
		objPatient.setBirthDay(scanner.nextInt());
		
		System.out.println("Height(in inches):");
		objPatient.setHeight(scanner.nextDouble());
		
		System.out.println("Weight(in pounds):");
		objPatient.setWeight(scanner.nextDouble());
		// TODO Auto-generated method stub
objPatient.displayMyHealthData();

	}

}

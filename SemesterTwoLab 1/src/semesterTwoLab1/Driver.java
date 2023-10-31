package semesterTwoLab1;
/*File:Driver.java 
 *This is the main method used to display the first name, last name and id of a student.
 */


/**
 * @see Username
 * @author Emmanuel Alabi
 *@version 1.0
 *@since May 10, 2023
 */
import java.util.Scanner;

public class Driver {

/**
 * The main method
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner printNameScanner= new Scanner(System.in);

System.out.print("Enter your First name: ");
String outputFirstName= printNameScanner.next();

System.out.print("Enter your Last name: ");
String outputLastName= printNameScanner.next();

System.out.print("Enter your Student number: ");
long outputStudentNumber = printNameScanner.nextLong();

Username objUsername = new Username();

//The setter methods in the Username class are being used to tell the scanner object to take their (setter methods) properties  
objUsername.setFirstName(outputFirstName);
objUsername.setLastName(outputLastName);
objUsername.setStudentNumber(outputStudentNumber);

 
// The scanner object are being equated to the getter methods of the Username class.  
outputFirstName = objUsername.getFirstName();
outputLastName = objUsername.getLastName();
outputStudentNumber = objUsername.getStudentNumber();

// To convert to pig latin, take the first letter of a name and place it at the end of the name and add "ay"
String pigLatinFirstName = outputFirstName.substring(1)+ outputFirstName.charAt(0)+"ay";	
String pigLatinLastName = outputLastName.substring(1)+ outputLastName.charAt(0)+"ay";
	
System.out.println("Your first name is "+ outputFirstName);
System.out.println("Your last name is "+ outputLastName);
System.out.println("Your student number is "+ outputStudentNumber);
System.out.println("Your pig latin first name is: " + pigLatinFirstName);
System.out.println("Your pig latin last name is: " + pigLatinLastName);
System.out.println(objUsername.projectBy());
}	
	}
	
	

	
		
	


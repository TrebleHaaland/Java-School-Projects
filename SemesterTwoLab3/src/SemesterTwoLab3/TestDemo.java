package SemesterTwoLab3;

/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Emmanuel Alabi.
 * @version  1.3
 * @since 11
 * @see EventSchedule
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	 

	/**
	 * YOUR TASK: COMPLETE THE CODE FOR THIS DRIVER CLASS NAMED TestDemo.
	 * Hint:  See the SampleOutput file provided for the print statements required.
	*/

	public static void main(String[] args) {

	/**
	 * YOUR CODE STARTS HERE
	*/
		// EventSchedule1
		System.out.println("EventSchedule1");
	    System.out.println(new EventSchedule(2022, 9 ,20).createReport());

	     // EventSchedule2
	     System.out.println("EventSchedule2");
	     System.out.println(new EventSchedule(2023, 9, 20).createReport());

	     // EventSchedule3
	     System.out.println("EventSchedule3");
	     System.out.println(new EventSchedule(2023, 12, 20).createReport());

	     // EventSchedule4
	     System.out.println("EventSchedule4");   
		System.out.println( new EventSchedule(2023, 12, 15).createReport());
	/**
	 * YOUR CODE ENDS HERE
	*/
	}

}

/**
*
*
*
*
**/

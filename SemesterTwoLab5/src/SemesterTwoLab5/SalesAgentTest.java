package SemesterTwoLab5;

/**
 * This program is the first test for the SalesAgent class including the subclass.
 *
 * @author Emmanuel Alabi.
 * @version  1.3
 * @since 11
 * @see SalesAgent
 * @see SalesSupervisor
 * @see SalesChief
 */
public class SalesAgentTest
{  
   public static void main(String[] args)
   {

	//... your code starts here!
	// Create 2 sales agents
	      SalesAgent agent1 = new SalesAgent("John", 30);
	      SalesAgent agent2 = new SalesAgent("Alice", 28);

	      // Create a sales supervisor
	      SalesSupervisor supervisor = new SalesSupervisor("Mark", 35, "New York");

	      // Create a sales chief
	      SalesChief chief = new SalesChief("Sarah", 40, "London", "Marketing");

	      // Print all created objects
	      System.out.println(agent1);
	      System.out.println(agent2);
	      System.out.println(supervisor);
	      System.out.println(chief);
	   
   }
}  
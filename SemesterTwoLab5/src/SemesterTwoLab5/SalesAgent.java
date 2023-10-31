package SemesterTwoLab5;

// This is CST 8284 Lab 5. Follow all instructions stated in your Lab slides carefully.
// Include all the items required in this class.

/**
 * This class shows a Sales Agent with a name and age.
 * @author Emmanuel Alabi
 * @version 1.3
 * @since 11
 * @see SalesSupervisor
 * @see SalesChief
 * @see SalesAgentTest
 * @see SalesAgentTest2
 */

public class SalesAgent {  
   private String name;
   private int age;

   /**
      In this portion of your code, construct a SalesAgent object.
      @param n the name of the Sales Agent
      @param a the age of the Sales Agent
   */
   // START CODE
   public SalesAgent(String name, int age) {
	      this.name = name;
	      this.age = age;
	   }
   // END CODE

   /**
      This portion of your code returns the string representation of the object.
      @return a string representation of the object
   */

   public String toString() {  
      return "Sales Agent [name=" + name + ",age=" + age + "]";
   }


}
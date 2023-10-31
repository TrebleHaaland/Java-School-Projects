package SemesterTwoLab5;

/**
 * This class shows a Sales Chief with a name, age, location and department.
 * @author Emmanuel Alabi
 * @version 1.3
 * @since 11
 * @see SalesAgent
 * @see SalesSupervisor
 * @see SalesAgentTest
 * @see SalesAgentTest2
 */
public class SalesChief extends SalesSupervisor{
private String department;
	public SalesChief(String name, int age, String location,String department) {
		super(name, age, location);
		this.department= department;
		// TODO Auto-generated constructor stub
	}
	/**
    This portion of your code returns the string representation of the object.
    @return a string representation of the object
 */

	@Override
	public String toString(){ 
		return "Sales Chief [super="+super.toString()+"Department : "+ department +"]";
	      
	   }

}



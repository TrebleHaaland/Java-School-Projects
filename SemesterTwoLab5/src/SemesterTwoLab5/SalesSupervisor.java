package SemesterTwoLab5;
/**
 * This class shows a Sales Supervisor with a name,age and location.
 * 
 * @author Emmanuel Alabi
 * @version 1.3
 * @since 11
 * @see SalesAgent
 * @see SalesChief
 * @see SalesAgentTest
 * @see SalesAgentTest2
 */
public class SalesSupervisor extends SalesAgent {
private String location;

/**
 * Constructs a SalesSupervisor object with the given name, age, and location.
 * @param name the name of the Sales Supervisor
 * @param age the age of the Sales Supervisor
 * @param location the location for sales
 */
	public SalesSupervisor(String name, int age,String location) {
		super(name, age);
		this.location = location;
		// TODO Auto-generated constructor stub
	}
	
	/**
    This portion of your code returns the string representation of the object.
    @return a string representation of the object
 */

	@Override
		public String toString() {
			return "Sales Supervisor [super="+super.toString()+"Location: "+location +"]";
			
		}
	}

	   


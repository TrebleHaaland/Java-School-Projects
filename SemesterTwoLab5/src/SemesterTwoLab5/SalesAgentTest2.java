package SemesterTwoLab5;

/**
 * This program tests the SalesAgent class and its subclasses. It creates instances of SalesAgent, SalesSupervisor, and SalesChief, and prints information about each sales agent.
 * 
 * @author Emmanuel Alabi
 * @version 1.3
 * @since 11
 * @see SalesAgent
 * @see SalesSupervisor
 * @see SalesChief
 */
public class SalesAgentTest2 {
    // Define a maximum number of agents as a constant class variable.
    private static final int MAX_AGENTS = 4;

    /**
     * The main method, entry point of the program.
     * It creates an array of SalesAgent objects,
     * populates it with instances of SalesAgent, SalesSupervisor, and SalesChief,
     * and prints information about each sales agent.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        SalesAgent[] agents = new SalesAgent[MAX_AGENTS];

        // 1- Create 2 sales agents, one sales supervisor, and one sales chief.
        agents[0] = new SalesAgent("John", 30);
        agents[1] = new SalesAgent("Alice", 28);
        agents[2] = new SalesSupervisor("Mark", 35, "New York");
        agents[3] = new SalesChief("Sarah", 40, "London", "Marketing");

        // 2- Loop through the array and print information about each sales agent.
        for (SalesAgent agent : agents) {
            System.out.println(agent);

            // Hint: when you call println() to print an object,
            // the toString() method of that object is called.
        }
    }
}

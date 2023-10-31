/**
 * This class represents a FishHandler that demonstrates exception handling for fish-related exceptions.
 * <p>
 * @author Emmanuel Alabi
 * @version 1.3
 * @since 11
 */
package SemesterTwoAss03;

/**
 * This class demonstrates exception handling for fish-related exceptions.
 */
public class FishHandler {

    /**
     * Throws an exception from the easterEnding method.
     *
     * @throws Exception An exception thrown from the easterEnding method.
     */
    public static void easterEnding() throws Exception {
        throw new Exception("This is an exception thrown from easterEnding method.");
    }

    /**
     * Calls the easterEnding method and catches any thrown exception before rethrowing.
     *
     * @throws Exception The exception caught and rethrown from the easterEnding method.
     */
    public static void easterStarting() throws Exception {
        try {
            easterEnding();
        } catch (Exception e) {
            System.err.println("Caught exception in easterStarting method, rethrowing");
            throw e;
        }
    }

    /**
     * The main method to demonstrate exception handling for FishHandler.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try {
            easterStarting();
        } catch (Exception e) {
            System.err.println("Caught rethrown exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

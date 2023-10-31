package SemesterTwoAss03;

import java.io.IOException;

/**
 * This class represents an OrderHandler that demonstrates proper exception handling order.
 * <p>
 * @author Emmanuel Alabi
 * @version 1.3
 * @since 11
 */
public class OrderHandler {
    public static void main(String[] args) {
        try {
            // Instantiate and throw a new subclass exception type IOException.
            throw new IOException("Subclass Exception (IOException)");
        } catch (IOException IOE) {
            // Catching the subclass exception (IOException) first, as it should be handled before the superclass exception.
            System.err.println("Caught an IOException: " + IOE.getMessage());
            IOE.printStackTrace();
        } catch (Exception E) {
            // Catching the superclass exception (Exception) later, to avoid a compilation error.
            // The catch block for the superclass should come after the catch block for the subclass to ensure proper exception handling.
            System.err.println("Caught a Superclass Exception: " + E.getMessage());
            E.printStackTrace();
        }
    }
}

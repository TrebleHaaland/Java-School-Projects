/**
 * This package contains classes for handling various types of exceptions related to cats.
 * <p>
 * @author Emmanuel Alabi
 * @version 1.3
 * @since 11
 */
package SemesterTwoAss03;

/**
 * This class represents a CatHandler that demonstrates exception handling.
 */
public class CatHandler {
    public static void main(String[] args) {
        try {
            Exception exception = null;
            throw exception;
        } catch (Throwable E) {
            System.out.println("Caught an ExceptionAlpha or its subclass.");
        }
    }

    /**
     * This class represents a custom exception, ExceptionAlpha, which extends the standard Java Exception class.
     */
    public class ExceptionAlpha extends Exception {
        // Empty, as it inherits the functionality from its parent class (Exception).
    }

    /**
     * This class represents another custom exception, ExeptionBeta, which extends the ExceptionAlpha class.
     */
    public class ExceptionBeta extends ExceptionAlpha {
        // Empty, as it inherits the functionality from its parent class (ExceptionAlpha).
    }

    /**
     * This class represents a third custom exception, ExcpetionGamma, which extends the ExeptionBeta class.
     */
    public class ExceptionGamma extends ExceptionBeta {
        // Empty, as it inherits the functionality from its parent class (ExeptionBeta).
    }
}

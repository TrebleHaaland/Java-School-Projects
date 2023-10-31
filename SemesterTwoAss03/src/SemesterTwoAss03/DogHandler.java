/**
 * This class represents a DogHandler that demonstrates exception handling for various dog-related exceptions.
 * <p>
 * @author Emmanuel Alabi
 * @version 1.3
 * @since 11
 */
package SemesterTwoAss03;

import java.io.IOException;

/**
 * This class represents a custom exception, ExceptionDog, which extends the standard Java Exception class.
 */
class ExceptionDog extends Exception {
    // Empty, as it inherits the functionality from its parent class (Exception).
}

/**
 * This class represents another custom exception, ExceptionPuppy, which extends the ExceptionDog class.
 */
class ExceptionPuppy extends ExceptionDog {
    // Empty, as it inherits the functionality from its parent class (ExceptionDog).
}

/**
 * This class demonstrates exception handling for Dog-related exceptions.
 */
public class DogHandler {

    /**
     * Catches and handles the ExceptionDog.
     */
    public void catchExceptionDog() {
        try {
            throw new ExceptionDog();
        } catch (ExceptionDog exception) {
            System.err.println("Caught an ExceptionDog: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    /**
     * Catches and handles the ExceptionPuppy.
     */
    public void catchExceptionPuppy() {
        try {
            throw new ExceptionPuppy();
        } catch (Exception exception) {
            System.err.println("Caught an ExceptionPuppy: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    /**
     * Catches and handles the NullPointerException.
     */
    public void catchNullPointerException() {
        try {
            throw new NullPointerException("Null Pointer Exception");
        } catch (Exception exception) {
            System.err.println("Caught a NullPointerException: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    /**
     * Catches and handles the IOException.
     */
    public void catchIOException() {
        try {
            throw new IOException("IO Exception");
        } catch (Exception exception) {
            System.err.println("Caught an IOException: " + exception.getMessage());
            exception.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DogHandler dogHandler = new DogHandler();
        dogHandler.catchExceptionDog();
        dogHandler.catchExceptionPuppy();
        dogHandler.catchNullPointerException();
        dogHandler.catchIOException();
    }
}

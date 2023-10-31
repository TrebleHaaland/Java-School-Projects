package SemesterTwoAss02;

/**
 * The WorldClock class represents a clock with a time offset from the base clock.
 * It extends the Clock class and overrides the getHours method to adjust the hours based on the time offset.
 * 
 * @author Emmanuel Alabi
 * @version 1.3
 * @since 11
 * @see Clock
 * @see WorldClockDemo
 * @see WorldClock
 */
public class WorldClock extends Clock {
    private int timeOffset;

    /**
     * Constructs a WorldClock object with the specified time offset.
     * 
     * @param timeOffset the time offset in hours
     */
    public WorldClock(int timeOffset) {
        this.timeOffset = timeOffset;
    }

    /**
     * Overrides the getHours method in the Clock class to adjust the hours based on the time offset.
     * 
     * @return the adjusted hours of the world clock
     */
    @Override
    public int getHours() {
        int currentHours = super.getHours();
        return (currentHours + timeOffset + 24) % 24;
    }
}

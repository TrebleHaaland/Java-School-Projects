package SemesterTwoAss02;

/**
 * This is a demo file for the AlarmClock class and other clock classes.
 * It demonstrates the usage of different clocks and their functionalities.
 * 
 * @author Emmanuel Alabi
 * @version 1.3
 * @since 11
 * @see Clock
 * @see AlarmClock
 * @see WorldClock
 */
public class ClocksDemo {
    public static void main(String[] args) {
        Clock clock = new Clock();
        WorldClock worldClock = new WorldClock(3);
        AlarmClock alarmClock = new AlarmClock();
        alarmClock.setAlarm(15, 27);

        Clock[] clocks = { clock, worldClock, alarmClock, alarmClock };

        // Print the time for each clock
        for (Clock c : clocks) {
            String time = c.getTime();
            System.out.println(c.getClass().getSimpleName() + ": " + time);
        }
    }
}

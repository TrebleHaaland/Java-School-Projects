package SemesterTwoAss02;
/**
 * @author Emmanuel Alabi.
 * @version  1.3
 * @since 11 
 * @see Clock
 * @see AlarmClock 
 * @see WorldClock
 */

/**
 * Tests the Clock class.
 */
public class ClockDemo
{
   public static void main(String[] args)
   {
      //test Clock
      System.out.println("Testing Clock class");
      Clock clock = new Clock();
      System.out.println("Hours: " + clock.getHours());
      System.out.println("Minutes: " + clock.getMinutes());
      System.out.println("Time: " + clock.getTime());
   }
}

package SemesterTwoAss02;

/**
 * Tests the Clock and WorldClock Classes.
 * @author Emmanuel Alabi
 * @version 1.3
 * @since 11
 * @see Clock
 * @see WorldClock
 */
public class WorldClockDemo
{
   public static void main(String[] args)
   {
      //test WorldClock
      System.out.println("");
      System.out.println("Testing WorldClock class");
      int offset = 3;
      System.out.println("Offset: " + offset);
      WorldClock wclock = new WorldClock(offset);
      System.out.println("Hours: " + wclock.getHours());
      System.out.println("Minutes: " + wclock.getMinutes());
      System.out.println("Time: " + wclock.getTime());
   }
}

package SemesterTwoAss02;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.lang.*;
/**
   Part I: Implement a class Clock whose getHours, getMinutes and
   getTime methods return the current time at your location.
   Return the time as a string.

   Here is how to retrieve the current time as a String:
    With Java 8, you can use 3 classes in the java.time package:
      Instant, LocalDateTime and ZoneId. Here's how you do it:
      String timeString = LocalDateTime.ofInstant(Instant.now(),
                              ZoneId.systemDefault()).toString()

   you'll need to extract the hours and minutes as a substring.
*/

/**
 * @author Emmanuel Alabi.
 * @version  1.3
 * @since 11 
 * @see ClockDemo
 * @see AlarmClock 
 * @see WorldClock
 */

public class Clock{
	
/**
 * @return This method retuns the current hour of the day
 */
public int getHours() {
String time = java.time.LocalTime.now().toString();
return Integer.parseInt(time.substring(0, 2));
}
/**
 * @return This method returns the current minute of the day
 */
public int getMinutes() {
	String time = java.time.LocalTime.now().toString();
	return Integer.parseInt(time.substring(3, 5));
	}

/**
 * @return This method combines the two previous methods to display the current time of the day
 */
public String getTime() { 	       
	int hours = getHours();
	int minutes = getMinutes(); 
	String formattedHours = String.format("%02d", hours);
	String formattedMinutes = String.format("%02d", minutes);
	return formattedHours + ":" + formattedMinutes;
	    }

	
	
}
 







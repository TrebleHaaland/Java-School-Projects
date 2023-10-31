package SemesterTwoAss02;

import java.time.LocalTime;

/**
 * The AlarmClock class represents an alarm clock that extends the Clock class.
 * It allows setting an alarm time and displays the time along with an alarm message
 * when the alarm is triggered.
 *
 * @author Emmanuel Alabi
 * @version 1.3
 * @since 11
 * @see Clock
 * @see AlarmClockDemo
 */
public class AlarmClock extends Clock {
    private int alarmHours;
    private int alarmMinutes;
    private boolean setAlarm;

    /**
     * Constructs an AlarmClock object with the default values.
     */
    public AlarmClock() {
        super();
        setAlarm = true;
    }

    /**
     * Sets the alarm time.
     *
     * @param hours   the hours of the alarm time
     * @param minutes the minutes of the alarm time
     */
    public void setAlarm(int hours, int minutes) {
        alarmHours = hours;
        alarmMinutes = minutes;
    }

    /**
     * Overrides the getTime method in the Clock class to include alarm functionality.
     * If the alarm is set and the current time is after the alarm time, the alarm is triggered.
     * Otherwise, only the current time is returned.
     *
     * @return an alarm message if the alarm is triggered, or just the current time
     */
    @Override
    public String getTime() {
        String currentTime = super.getTime();
        LocalTime current = LocalTime.parse(currentTime);
        LocalTime alarmTime = LocalTime.of(alarmHours, alarmMinutes);

        if (setAlarm && current.isAfter(alarmTime)) {
            setAlarm = false;
            return "Alarm!";
        }
        return currentTime;
    }
}

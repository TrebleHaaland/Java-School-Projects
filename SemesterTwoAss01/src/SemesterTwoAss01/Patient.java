package SemesterTwoAss01;
import java.time.Year;//[1](Reference) See website below
//23W CST8284
//Assignment 1: Patient.java

/**
 * @author alabi
 * @see MyHealthDataTest
 * @see MyHealthDataTest1
 * @version 1.7
 * @since 11
 */
class Patient{
	
//This system maintains important health information about a patient.
//Note: This class assumes values passed to the set methods are correct.
// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!


//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

//START CODE
private String firstName;
private String lastName;
private String gender;
private int birthYear;
private int birthMonth;
private int birthDay;
private double height;
private double weight;
//END CODE


// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
//START CODE
public Patient() {
	
}
/**
 * @param firstName
 * @param lastName
 * @param gender
 * @param birthYear
 * @param birthMonth
 * @param birthDay
 * @param height
 * @param weight
 */
public Patient(String firstName,String lastName,String gender,int birthYear,int birthMonth,int birthDay,double height,double weight) {
this.firstName = firstName;
this.lastName = lastName;
this.gender = gender;
this.birthYear = birthYear;
this.birthMonth = birthMonth;
this.birthDay = birthDay;
this.height = height;
this.weight = weight;
}
//END CODE



//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.

/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}

/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}

/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * @return the gender
 */
public String getGender() {
	return gender;
}

/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
}

/**
 * @return the birthYear
 */
public int getBirthYear() {
	return birthYear;
}

/**
 * @param birthYear the birthYear to set
 */
public void setBirthYear(int birthYear) {
	this.birthYear = birthYear;
}

/**
 * @return the birthMonth
 */
public int getBirthMonth() {
	return birthMonth;
}

/**
 * @param birthMonth the birthMonth to set
 */
public void setBirthMonth(int birthMonth) {
	this.birthMonth = birthMonth;
}

/**
 * @return the birthDay
 */
public int getBirthDay() {
	return birthDay;
}

/**
 * @param birthDay the birthDay to set
 */
public void setBirthDay(int birthDay) {
	this.birthDay = birthDay;
}

/**
 * @return the height
 */
public double getHeight() {
	return height;
}

/**
 * @param height the height to set
 */
public void setHeight(double height) {
	this.height = height;
}

/**
 * @return the weight
 */
public double getWeight() {
	return weight;
}

/**
 * @param weight the weight to set
 */
public void setWeight(double weight) {
	this.weight = weight;
}

// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!

/**
 * @return the BMI of the patient 
 */
public double getBMI() {
   return (getWeight() * 703) / (getHeight() * getHeight());
} 
 
// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION

/**
 * @return This returns the age of the patient by subtracting the current year by the birthYear of patient
 */
public int calaculateAge(){
	int age = Year.now().getValue()- getBirthYear(); //[1](Reference)See website below
	return age;
}

/**
 * @return The maximum heart rate of the patient by subtracting 220 from the age of the patient
 */
public double maximumHeartRate(){
	double heartConst = 220;
	double maxHeartRate = heartConst - calaculateAge();
	return maxHeartRate;
}

/**
 * @return The minimum target heart rate is calculated as 50% of the maximum heart rate.
 */
public double minimumTargetHeartRate() {
	double minTargetHeartRate = maximumHeartRate() * 0.50;
	return minTargetHeartRate; 
}
/**
 * @return The maximum target heart rate is calculated as 85% of the maximum heart rate.
 */
public double maximumTargetHeartRate() {
	double maxTargetHeartRate = maximumHeartRate() * 0.85;
	return maxTargetHeartRate;
}

public void displayMyHealthData() 
{ 

//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
   
// START CODE
	System.out.printf("First Name: %s%n", firstName);
	System.out.printf("Last Name: %s%n", lastName);
	System.out.printf("Gender: %s%n", gender);
	System.out.printf("Birth Year: %d%n", birthYear);
	System.out.printf("Birth Month: %d%n", birthMonth);
	System.out.printf("Birth Day: %d%n", birthDay);
	System.out.printf("Height(in inches): %.1f%n", height);
	System.out.printf("Weight (in pounds): %.1f%n", weight);
	System.out.printf("BMI:  %.1f%n",getBMI());
	System.out.printf("Maximum heart rate: %.1f%n ",maximumHeartRate());
	System.out.printf("Minimum target heart rate: %.1f%n ",minimumTargetHeartRate());
	System.out.printf("Maximum target heart rate: %.1f%n ",maximumTargetHeartRate());

//END CODE
   
//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

   System.out.println("BMI VALUES");
   System.out.println("Underweight: less than 18.5");
   System.out.println("Normal:      between 18.5 and 24.9");
   System.out.println("Overweight:  between 25 and 29.9");
   System.out.println("Obese:       30 or greater");   
} 

} // end class Patient
// Refrences
// [1]- https://stackoverflow.com/questions/56830442/is-there-a-way-to-calculate-birthyear-form-age-which-is-in-years-and-current-da



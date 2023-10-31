package SemesterTwoLab2;

/**
* TASK: Remember to include all necessary headers for your Javadoc, descriptions and explanations of what you have done in the appropriate places.
* ENSURE that you add appropriate Javadoc style comments to relevant parts of this code as you update this program to show that you understand it.
*
* @author Emmanuel Alabi
* @version  1.3
* @since 11
* 
* 
*/

public class CovidStatistics{
	/**
     * Main method that initializes the patients array and the provinces array, and prints the Covid-19 statistics.
     * @param args - command line arguments/ Main method
     */
public static void main(String[] args)
 {
   final int ROWS = 7;
   final int COLUMNS = 8;

   int[][] patients = 
      { 
         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204  },
         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308  }, 
         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502  }, 
         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201  },
         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502  },
         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706  },
         {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406  }
         
      };

   String[] provinces = 
      { 
         "Ontario", 
         "Quebec", 
         "Nova Scotia",
         "New Brunswick", 
         "Manitoba", 
         "British Columbia",
	     "Prince Edward Island"         
      };
   
   System.out.println("Month                  Feb     March   April   May   June   July    Aug   Sept  Least");
   System.out.println(  );
   

   /** TASK: It is important to know the number of patients per province. So you need to print out the number of patients for all provinces (content of the array) for each month.
   * Update the code in this section by using a nested for loop. 
   * 
   */
   for (int i = 0; i < ROWS; i++) {
	    System.out.printf(" %-21s  ", provinces[i]);
	    
	    int leastCases = patients[i][0];
	    int leastCaseMonths = 0;
	    for (int j = 0; j < COLUMNS; j++) {
	        System.out.printf("%-7d", patients[i][j]);
	        if (patients[i][j] < leastCases) {
	            leastCases = patients[i][j];
	            leastCaseMonths = j;
	        }
	    }
	    System.out.print(" ");
	    switch (leastCaseMonths) {
	        case 0:
	            System.out.println("Feb");
	            break;
	        case 1:
	            System.out.println("March");
	            break;
	        case 2:
	            System.out.println("April");
	            break;
	        case 3:
	            System.out.println("May");
	            break;
	        case 4:
	            System.out.println("June");
	            break;
	        case 5:
	            System.out.println("July");
	            break;
	        case 6:
	            System.out.println("Aug");
	            break;
	        case 7:
	            System.out.println("Sept");
	            break;
	    }
	}
   
   /** TASK: Update the code in this section by writing a nested for loop (for the columns and rows of the array) to compute the sum (column). 
   * Print the column sum using printf. Check the sample output file (CovidSample.txt) to see the expected pattern.
   */ 
   
   System.out.println();
   System.out.print("Recovered Patients");
  
   for (int j=0; j<COLUMNS; j++) {
	   int sum = 0;
	   for (int i=0; i<ROWS; i++) {
		   sum += patients[i][j];
	   }
	   System.out.printf("%-8d" , sum);
   }
   
   System.out.println(); 
   System.out.println(); 
   System.out.println("               Vaccinate and maintain good health practices!");
}
}





   
   
   
   
   






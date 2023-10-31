package SemesterTwoLab4;
import org.junit.Assert;
import org.junit.Test;


import s23lab4.YourPurchases;
/*@author: Emmanuel Alabi
 * @version:1.8
 * @see:YourPurchaseTest2.java,YourPurchaseTest3.java
 * @since:11
 */
public class YourPurchasesTest
{
   private static final double EPSILON = 1E-12;

   @Test 
   	public void testGetPurchase(){
    YourPurchases register = new YourPurchases();
    register.recordPurchase(0.75);
    register.recordPurchase(1.50);
    double expected = 2.25;
    Assert.assertEquals(expected, register.getPurchase(), EPSILON);
    
    }
   
// YOUR TASKS ARE STATED HERE: 
   // RUN THE CODE YOU RECEIVED AND DEMO THAT THERE IS NO ERROR in YourPurchasesTest.java 

  
     
}


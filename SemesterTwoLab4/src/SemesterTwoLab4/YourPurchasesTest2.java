package SemesterTwoLab4;
import static org.junit.Assert.assertTrue;
/*@author: Emmanuel Alabi
 * @version:1.8
 * @see:YourPurchaseTest.java,YourPurchaseTest3.java
 * @since:11
 */
import org.junit.Assert;
import org.junit.Test;

import s23lab4.YourPurchases;

public class YourPurchasesTest2 {

	private static final double EPSILON = 1E-12;
	
	//THIS TEST WOULD FAIL. 
	// TODO: WRITE ONE OR MORE TESTS TO SYSTEMATICALLY FIND THE SOURCE OF THE TEST FAILURE 
	@Test
	public void testCalculateChange() {
	YourPurchases aPurchase = new YourPurchases();
	aPurchase.recordPurchase(1.5);
	aPurchase.receivePayment(5, 0, 0, 0, 0);
	double changeResult = aPurchase.CalculateChange();
	double expected = 3.50;
	Assert.assertEquals(expected, changeResult, EPSILON);
	assertTrue(true);
		
	}
	
	 // YOUR TASKS ARE STATED HERE: 
	   // RUN THE TEST CASE IN YourPurchasesTest2.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE individual TEST CASES 
		//  (NOT ALREADY STATED IN THIS CODE) TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
	   
	   // ADD NEW TEST CASES HERE!!!
	@Test
	public void testRecordPurchase() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(2.5);
		double getPurchase = aPurchase.getPurchase();
		double expected = 2.5;
		Assert.assertEquals(expected, getPurchase, EPSILON);
	}
	@Test
	public void testReceivePayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.receivePayment(7,0,0,0,0);
		aPurchase.recordPurchase(5);
		double getPayment= aPurchase.getPayment();
		double expected= 7;
		Assert.assertEquals(expected, getPayment,EPSILON);
		
	}
}

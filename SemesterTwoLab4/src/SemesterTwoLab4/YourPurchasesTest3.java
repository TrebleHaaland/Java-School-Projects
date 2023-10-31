package SemesterTwoLab4;
import static org.junit.Assert.*;
/*@author: Emmanuel Alabi
 * @version:1.8
 * @see:YourPurchaseTest.java,YourPurchaseTes2.java
 * @since:11
 */
import org.junit.Assert;
import org.junit.Test;
import s23lab4.YourPurchases;
 
public class YourPurchasesTest3 {
	private static final double EPSILON = 1E-12;
	@Test
	public void testChangeCoins303() {
		//fail("Not yet implemented");
		YourPurchases coinPurchases = new YourPurchases();
		coinPurchases.receivePayment(20,0,0,0,0);
		int changeCoins = coinPurchases.changeCoins303();
		int expectedDollars = 20;
		Assert.assertEquals(expectedDollars, changeCoins, EPSILON);

	}
	@Test
	public void testChangeCoins303One() {
		//fail("Not yet implemented");
		YourPurchases coinPurchases = new YourPurchases();
		coinPurchases.receivePayment(0,4,0,0,0);
		int changeCoins = coinPurchases.changeCoins303();
		int expectedQuarters = 4;
		Assert.assertEquals(expectedQuarters, changeCoins, EPSILON);

	}/**
	 * This program is missing a dime
	 */
	@Test
		public void testChangeCoins303Two() {
		//fail("Not yet implemented");
		YourPurchases coinPurchases = new YourPurchases();
		coinPurchases.receivePayment(0,0,0,0,0);
		int changeCoins = coinPurchases.changeCoins303();
		int expectedDimes = 1;
		Assert.assertEquals(expectedDimes, changeCoins, EPSILON);
	}
	/**
	 * This program overcounts 5 nickels 
	 */
	@Test
	public void testChangeCoins303Three() {
		//fail("Not yet implemented");
		YourPurchases coinPurchases = new YourPurchases();
		coinPurchases.receivePayment(0,0,0,5,0);
		int changeCoins = coinPurchases.changeCoins303();
		int expectedNickels = 4;
		Assert.assertEquals(expectedNickels, changeCoins, EPSILON);
	}
	
	@Test
	public void testChangeCoins303Four() {
		//fail("Not yet implemented");
		YourPurchases coinPurchases = new YourPurchases();
		coinPurchases.receivePayment(0,0,0,0,6);
		int changeCoins = coinPurchases.changeCoins303();
		int expectedPennies= 6;
		Assert.assertEquals(expectedPennies, changeCoins, EPSILON);
	}
}

package HomePageTest;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import HomePageObjects.BasePage;
import HomePageObjects.HomepageObject;

public class HomePageTest {
	
	HomepageObject homePage;
	BasePage bp;
	
	int random=new Random().nextInt(500000);
	String email="madamkumar" + random + "@gmail.com";
	
	public HomePageTest() {
		homePage = new HomepageObject();
		bp = new BasePage();
	}
	
	@Test 
	public void verifyWomenText() {
		Assert.assertTrue(homePage.Womens.isDisplayed());
	}
		
	@Test
	public void verifyDressesTest() {
		Assert.assertTrue(homePage.Dresses.isDisplayed()); 
	}
	@Test
	public void verifyTShirtsTest() {
		Assert.assertTrue(homePage.TShirts.isDisplayed());
	}
	@Test
	public void verifyWomenNav()
	{
		homePage.clickWomen();
		String msg=homePage.getTitleWomen();
		Assert.assertTrue(msg.equals("Women"),"Failed:Women not Displayed");
	}
	@Test
	public void verifyDressNav()
	{
		homePage.clickDresses();
		String msg1=homePage.getTitleDresses();
		Assert.assertTrue(msg1.equals("Dresses"), "Failed:Dresses not displayed");
	}
	@Test
	public void verifyTshirtNav()
	{
		homePage.clickTshirts();
		String msg2=homePage.getTitleTshirts();
		Assert.assertTrue(msg2.equals("T-shirts"), "Failed:Tshirts not displayed");
	}
	@Test
	public void verifysubscription()
	{
		homePage.setNewsLetter(email);
		String msg=homePage.getTxtNewsletterMessage();
		Assert.assertTrue(msg.contains("successful"), "Failed:Subscription message is not displayed");
		
	}
	}


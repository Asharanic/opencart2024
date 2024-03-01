package testCases;


import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.RegisterPage;
import testBase.BaseClass;

public class RegistrationTestCase extends BaseClass
{
@Test(priority=1)
public void register() throws InterruptedException {
		
	logger.info("*****starting register testcase***");
		HomePage hp=new HomePage(driver);
		logger.info("*****click on my account ***");
		hp.clickOnMyAccount();
		Thread.sleep(2000);
		logger.info("*****clicking on register***");
		hp.clickOnRegister();
		Thread.sleep(2000);
		
		RegisterPage rp=new RegisterPage(driver);
		Thread.sleep(2000);
		logger.info("*****entering all the credentials***");
		logger.info("*****entering first name***");
		rp.sendFirstName("Asha");
		Thread.sleep(2000);
		logger.info("*****entering last name***");
	    rp.sendLastName("C");
	    Thread.sleep(2000);
	    logger.info("*****entering email***");
	    
	    rp.sendEmail(randomAlphaNumeric());
	    Thread.sleep(2000);
	    logger.info("*****entering password***");
        rp.sendPasword("12345678");
        Thread.sleep(4000);
        rp.selectAgree();
        Thread.sleep(2000);
        rp.clickContinue();
	}
}
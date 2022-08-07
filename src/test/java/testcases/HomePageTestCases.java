/*
package testcases;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.codemind.project.Utility;

import pages.HomePage;

public class HomePageTestCases {

	HomePage homePage;
	WebDriver driver;

	@BeforeClass
	public void launchUrl() {
		driver = Utility.getDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		homePage = new HomePage(driver);
	}

	@Test
	public void verifyFormFiledSelection() {
		homePage.setUserNameTextBox();
		homePage.getUserNameTextBox().sendKeys("UserName");
		homePage.setLastNameTextBox();
		homePage.getLastNameTextBox().sendKeys("LastName");
		
			Utility.clickUsingJavaScript(homePage.getGenderRadioButton(), driver);
			homePage.setDateofBirthInputField();
			Utility.scrollIntoView(homePage.getDateofBirthInputField(), driver);
            homePage.getDateofBirthInputField().click();
           webElement.select=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
           Utility.selectValueFromDropdown(select, "2010");
			Utility.selectDateFromDatePicker(driver, "10");
            
		//homePage.setGenderRadioButton();
		
		// homePage.getGenderRadioButton().click();
			/*	Utility.clickUsingJavaScript(homePage.getGenderRadioButton(), driver);
				homePage.setDateOfBirthInputField();
				Utility.scrollIntoView(homePage.getDateOfBirthInputField(), driver);
				homePage.getDateOfBirthInputField().click();

				WebElement select = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
				Utility.selectValueFromDropdown(select, "2010");
				Utility.selectDateFromDatePicker(driver, "10");*/
	//}
//}

package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.codemind.project.Utility;

import pages.HomePage;
//import utility.Utility;

public class HomePageTestCases {

	HomePage homePage;
	WebDriver driver;

	@BeforeClass
	public void launchUrl() {
		driver = Utility.getDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		homePage = new HomePage(driver);
	}

	@Test
	public void verifyFormFiledSelection() {
		homePage.setUserNameTextBox();
		homePage.getUserNameTextBox().sendKeys("UserName");
		homePage.setGenderRadioButton();
		// homePage.getGenderRadioButton().click();
		Utility.clickUsingJavaScript(homePage.getGenderRadioButton(), driver);
		homePage.getDateofBirthInputField().click();
		Utility.scrollIntoView(homePage.getDateofBirthInputField(), driver);
        homePage.getDateofBirthInputField().click();

		WebElement select = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Utility.selectValueFromDropdown(select, "2010");
		Utility.selectDateFromDatePicker(driver, "10");
	}

	/*@AfterClass
	public void tearDown() {
		driver.quit();
	}*/

}


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	WebElement userNameTextBox;
	WebElement genderRadioButton;
	WebElement dateofBirthInputField;
	WebElement hobbiesCheckBox;
	
	WebElement lastNameTextBox;
	//This is home page
	//this changes is from master
  public HomePage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}
  
	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public void setLastNameTextBox() {
		this.lastNameTextBox = driver.findElement(By.xpath("//input[@id='lastName']"));
	}

	public void setUserNameTextBox() {
		this.userNameTextBox = driver.findElement(By.xpath("//input[@id='firstName']"));
		
	}
	
	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public void setGenderRadioButton() {
		this.genderRadioButton = driver.findElement(By.xpath("//input[]@id='gender-radio-1']"));
	}

	public WebElement getDateofBirthInputField() {
		return dateofBirthInputField;
	}

	public void setDateofBirthInputField() {
		this.dateofBirthInputField = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	}

	public WebElement getHobbiesCheckBox() {
		return hobbiesCheckBox;
	}

	public void setHobbiesCheckBox() {
		this.hobbiesCheckBox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
	}

	

	

	
	
	
	
	
	

}

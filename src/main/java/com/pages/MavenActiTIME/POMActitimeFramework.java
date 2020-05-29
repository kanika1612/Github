package com.pages.MavenActiTIME;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.MavenActiTIME.AutoConstant;
import com.generics.MavenActiTIME.BasePage;
import com.generics.MavenActiTIME.ExcelLibrary;


public class POMActitimeFramework extends BasePage implements AutoConstant {
    public WebDriver driver;
    
	//create & delete customer
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordField;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepCheckbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement tasksTab;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[contains(@class,'NewCustomer')]")
	private WebElement newCustomerButton;
	
	@FindBy(xpath="(//input[contains(@placeholder,'Enter Customer')])[2]")
	private WebElement enterCustomerNameTextField;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptionTextfield;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomerButton;
	
	@FindBy(xpath="(//input[contains(@placeholder,'Start typing name')])[1]")
	private WebElement searchCustomerNameTextfield;
	
	@FindBy(xpath="//span[.='Parth']/../../..//div[@class='editButton']")
	private WebElement customerSettingButton;
	
	@FindBy(xpath="(//div[.='ACTIONS'])[1]")
	private WebElement actionsButton;
	
	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement deleteButton;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement permanentlyDeleteButton;
	
	//create & delete work
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsButton;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesOffWorkButton;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createTypeOfWorkButton;
	
	@FindBy(id="name")
	private WebElement workNameTextfield;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement statusDropDownList;
	
	@FindBy(xpath="//input[@type='submit']")
    private WebElement createWorkSubmitButton;
	
	@FindBy(xpath="//a[.='Acting']/../..//a[contains(text(),'delete')]")
    private WebElement deleteWorkLink;
	
	public POMActitimeFramework(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException, InterruptedException {
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 0));
		passwordField.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 1));
		Thread.sleep(2000);
		keepCheckbox.click();
		Thread.sleep(2000);
		loginButton.click();
	}
	public void createCustomerMethod() throws InterruptedException, IOException {
		tasksTab.click();
		Thread.sleep(2000);
		addNewButton.click();
		newCustomerButton.click();
		Thread.sleep(2000);
		enterCustomerNameTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname_CreateCustomer, 1, 0));
		descriptionTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname_CreateCustomer, 1, 1));
		Thread.sleep(2000);
		createCustomerButton.click();
	}
	public void deleteCustomerMethod() throws InterruptedException, IOException {
		Thread.sleep(7000);
		tasksTab.click();
		Thread.sleep(5000);
		searchCustomerNameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname_CreateCustomer, 1, 0));
		Thread.sleep(7000);
		customerSettingButton.click();
		Thread.sleep(5000);
		actionsButton.click();
		Thread.sleep(2000);
		deleteButton.click();
		Thread.sleep(2000);
		permanentlyDeleteButton.click();
		 }
	public void createWorkMethod() throws InterruptedException, IOException {
		Thread.sleep(7000);
		settingsButton.click();
		Thread.sleep(2000);
		typesOffWorkButton.click();
		Thread.sleep(2000);
		createTypeOfWorkButton.click();
		Thread.sleep(2000);
		workNameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname_CreateWork, 1, 0));
		selectbyvalue(statusDropDownList, "false");
		Thread.sleep(2000);
		createWorkSubmitButton.click();
		}
	public void deleteWorkMethod() throws InterruptedException {
		Thread.sleep(5000);
		deleteWorkLink.click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	    }
	}
package com.scripts.MavenActiTIME;
import java.io.IOException;
import org.testng.annotations.Test;

import com.generics.MavenActiTIME.BaseTest;
import com.pages.MavenActiTIME.POMActitimeFramework;


 public class TESTActitime extends  BaseTest {
   
	@Test(priority = 1)
	public void login() throws IOException, InterruptedException {
		POMActitimeFramework login=new POMActitimeFramework(driver);
		login.loginMethod();
	}
	@Test(priority = 2)
	public void createCustomer() throws InterruptedException, IOException {
		POMActitimeFramework createcustomer=new POMActitimeFramework(driver);
		createcustomer.createCustomerMethod();
	}
	@Test(priority = 3)
	public void deleteCustomer() throws InterruptedException, IOException {
		POMActitimeFramework deletecustomer=new POMActitimeFramework(driver);
		deletecustomer.deleteCustomerMethod();
	}
	@Test(priority = 4)
	public void  createWork() throws InterruptedException, IOException {
		POMActitimeFramework creatework=new POMActitimeFramework(driver);
		creatework.createWorkMethod();
	}
	@Test(priority = 5)
	public void deleteWork() throws InterruptedException {
		POMActitimeFramework deletework=new POMActitimeFramework(driver);
		deletework.deleteWorkMethod();
	}
}

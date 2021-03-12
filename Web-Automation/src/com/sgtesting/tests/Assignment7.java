package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment7
{
	public static WebDriver c1=null;
	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();
		login();
		minimizewindow();
		createcoustomer();
		createproject();
		createtasks();
		deletetasks();
		deleteproject();
	    deletecustomer();
		logout();
		closebrowser();
	}
	static void launchbrowser()
	{
		//String path=null;
		try 
		{  //path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", "D:\\Testautomation\\selenium sg\\drivers\\chromedriver.exe");
			c1=new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	static void navigate()
	{
		try 
		{
			c1.get("http://localhost:81/login.do");
			c1.manage().window().maximize();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			c1.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void minimizewindow()
	{
		try 
		{
			c1.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void createcoustomer()
	{
		try 
		{
			c1.findElement(By.xpath("//a[@href='/tasks/tasklist.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@class='downIcon']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("customerLightBox_nameField")).sendKeys("madhali");
			Thread.sleep(2000);
			c1.findElement(By.id("customerLightBox_commitBtn")).click();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void createproject()
	{
		try 
		{
			c1.findElement(By.xpath("//div[@class='addNewContainer']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("projectPopup_projectNameField")).sendKeys("rocky");
			Thread.sleep(2000);
			c1.findElement(By.id("projectPopup_commitBtn")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
	  {
			e.printStackTrace();
		}
	}
	static void createtasks()
	{
		try 
		{
			c1.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@class='item createNewTask ellipsis']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("selenium is easy when u feel it");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[text()='Create Tasks']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void deletetasks()
	{
		try 
		{
			c1.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\'taskPanel_deleteConfirm_submitBtn\']/div")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			
		}
	}
	static void deleteproject()
	{
		try 
		{
			c1.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
				c1.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
				Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void deletecustomer()
	{
		try 
		{
			c1.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try 
		{
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	static void closebrowser()
	{
		try 
		{
			c1.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();	
		}
	}
}


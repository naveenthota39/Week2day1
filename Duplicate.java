package Week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class Duplicate {
			
			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("DemoCSR");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.className("inputBox")).sendKeys("TestLeaf");
				//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thota");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NAveen");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Naveenthota");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Technology");
				driver.findElement(By.className("inputBox")).sendKeys("Working on Selenium Projects");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("thota.naveen39@gmail.com");
				WebElement dup = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select dd = new Select(dup);
				dd.selectByVisibleText("Maine");
				driver.findElement(By.name("submitButton")).click();
				String display = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
				System.out.println(display);
				
				String title = driver.getTitle();
				System.out.println(title);
				
				driver.findElement(By.linkText("Duplicate Lead")).click();
				
				WebElement elecompanyName = driver.findElement(By.id("createLeadForm_companyName"));
				
				elecompanyName.clear();
				
				elecompanyName.sendKeys("HCL");
				
				driver.findElement(By.name("submitButton")).click();
				
				
				
			}

		}
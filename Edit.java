package Week2Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

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
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Naveen");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("thota");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Tnaveen");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HCL");
	driver.findElement(By.className("inputBox")).sendKeys("Working on Selenium Projects");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("thota.naveen39@gmail.com");
	WebElement eleDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd = new Select(eleDropdown);
	dd.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	
	driver.findElement(By.linkText("Edit")).click();

	driver.findElement(By.name("description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Learning on the Java");
	driver.findElement(By.className("smallSubmit")).click();
	
	//Below are the code for Title of Resulting Page.
	String display = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
	System.out.println(display);
	
	String title = driver.getTitle();
	System.out.println(title);
	

}
}

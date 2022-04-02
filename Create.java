package Week2Day2;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Create {
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
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("thota");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NAveen");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("thotanaveen");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HCL");
			driver.findElement(By.className("inputBox")).sendKeys("Working on Selenium Projects");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("thota.naveen39@gmail.com");
			WebElement eleDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select dd = new Select(eleDropdown);
			dd.selectByVisibleText("New York");
			driver.findElement(By.className("smallSubmit")).click();
			String title = driver.getTitle();
			System.out.println(title);
}
	}

package SingleElementSceenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LocalDateTime td = LocalDateTime.now();
		String timestamp = td.toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']"));
		WebElement sd = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		File tempfile = sd.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./errorshot/flipkart3"+timestamp+".png");
		FileUtils.copyFile(tempfile,destfile);

	}

}

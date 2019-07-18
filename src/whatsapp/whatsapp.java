package whatsapp;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class whatsapp
{
		
		public static WebDriver driver;
				@SuppressWarnings("deprecation")
				public static void main(String[]args) 
		{
					System.setProperty("webdriver.chrome.driver", "C://Users/The Tushar Srivastav/Desktop/chromedriver.exe");  
					WebDriver driver = new ChromeDriver();  
			driver=new ChromeDriver();
			driver.get("https://web.whatsapp.com/");
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side']/div[1]/div/label")));
			driver.findElement(By.xpath("//*[@id='pane-side']/div[1]/div/div/div[1]/div/div/div[2]")).click();
			driver.findElements(By.xpath("//*[@id='pane-side']/div[1]/div/div/div[9]/div/div/div[2]/div[2]/div[2]/span[1]/div/span"));
			{
				
			}
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pane-side']/div[1]/div/div/div[17]/div/div/div[2]/div[2]/div[2]/span[1]/div/span")));
			driver.findElement(By.xpath("//*[@id='pane-side']/div[1]/div/div/div[17]/div/div/div[2]/div[2]/div[2]/span[1]/div/span")).click();
			WebElement txt = driver.findElement((By.xpath("//*[@id='main']/div[3]/div/div/div[3]/div[23]/div/div/div[1]")));
			String S=txt.getText();
			  File DestFile= new File("extractedFilePath");
			  try {
				FileUtils.writeStringToFile(DestFile,S );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  driver.close();
		
		}

	}


package runner;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_multiple_data_excel {
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			FileInputStream fis=new FileInputStream("./excel/testdata1.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sh = book.getSheet("Sheet1");
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("base_url");
			List<WebElement> links = driver.findElements(By.xpath("//a"));
			for (int i = 0; i < links.size(); i++) 
			{
				Row r = sh.createRow(i);
				Cell c = r.createCell(0);
				WebElement we = links.get(i);
				String urls = we.getAttribute("href");
				c.setCellValue(urls);
			}
			FileOutputStream fos=new FileOutputStream("./excel/testdata.xlsx");
			book.write(fos);
			WebElement ele = links.get(4);
			ele.click();
			}
			
			
		}


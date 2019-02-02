package MyMainPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import MyObjectClass.MyLoginClass;
import MyObjectClass.MyLogoutClass;
import MyObjectClass.RegClass;

public class MyMainClass {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException {
		
		
		// TODO Auto-generated method stub
		
		
		//FileInputStream fs = new FileInputStream("C:\\Users\\labit\\Desktop\\Third Session\\Test.xls");
		//Workbook wb = Workbook.getWorkbook(fs);
		//Sheet AddressSheet = wb.getSheet("User_Login");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\labit\\Desktop\\Selenium Setup & Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		//MyLoginClass loginobjects = new MyLoginClass (driver);
		//loginobjects.Login("mytc5@gmail.com","123456789");
		
		  RegClass RegObject = new RegClass (driver);
		  RegObject.Reg("AABB1","CCDD2","KSALIM538@GMAIL.COM","03472752507","12345","12345");
		
	/*	for (int i=0; i<=10; i++)
		{
		
		
		MyLoginClass log1 = new MyLoginClass(driver);
		log1.Login(AddressSheet.getCell(0, 1).getContents(), AddressSheet.getCell(1, 1).getContents());
		
		MyLogoutClass logoutobjects = new MyLogoutClass (driver);
		logoutobjects.Logout();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		}
		*/
		
		
		
	
		driver.close();
		driver.quit();
		
	}


}



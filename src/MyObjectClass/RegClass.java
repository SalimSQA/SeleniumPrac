package MyObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegClass {
	

		public RegClass(WebDriver driver) {
			PageFactory.initElements(driver, this);
				
			}
			
			@FindBy(name="username")
			public WebElement Uname;
			
			@FindBy(name="firstname")
			public WebElement fname;
			
			@FindBy(name="lastname")
			public WebElement lname;
			
			@FindBy(name="email")
			public WebElement emailid;
			
			
			@FindBy(name="telephone")
			public WebElement tel;
			
			@FindBy(name="password")
			public WebElement pass;
			
			@FindBy(name="confirm")
			public WebElement con;
			
			@FindBy(name="agree")
			public WebElement agre;

			
			@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
			public WebElement submitbutton;
			
			
			
			public void Login(String a, String b, String c, String d, String e, String f, String g){
						
				Uname.sendKeys(a);
				fname.sendKeys(b);
				lname.sendKeys(c);
				emailid.sendKeys(d);
				tel.sendKeys(e);
				pass.sendKeys(f);
				con.sendKeys(g);
				agre.click();
				submitbutton.click();
						
				System.out.println("Reg Successfully");
	 }

}

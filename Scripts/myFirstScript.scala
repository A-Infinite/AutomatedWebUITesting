//Import the following selenium libraries
import $ivy.`org.seleniumhq.selenium:selenium-java:3.5.3`
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome

//define immutable value
val driver = new chrome.ChromeDriver

// Navigate to URL
driver.get("https://3.basecamp.com") 
driver.close()

//maximize the window 
//driver.manage().window().maximize() 

//Import the following selenium libraries
import $ivy.`org.seleniumhq.selenium:selenium-java:3.5.3`
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

//define immutable value
val driver = new chrome.ChromeDriver
println("\n *** Chrome Driver Instantiated... ***") 

// Navigate to URL
var url = "https://3.basecamp.com"
driver.get(url) 
//driver.Navigate(url)
println("\n *** Now we are on Basecamp Homepage...***") 


//maximize the window 
driver.manage().window().maximize() 
println("\n *** Windows is maximized... ***")

//click on Sign in 
val element = driver.findElementByLinkText("Sign in")  
element.click()
println("\n *** Sign in dialog box opens... ***")


//enter emailid
val username = "arushi131.bhatt@gmail.com"
driver.findElementById("login_hint").sendKeys(username)
println("\n *** emailid is entered... ***")


driver.findElementByName("button").click()
println("\n *** Login button is clicked... ***")


var arr = driver.getWindowHandles().toArray 
driver.switchTo().window(arr(1).toString) 




//import scala.collection.JavaConverters. 





driver.close()
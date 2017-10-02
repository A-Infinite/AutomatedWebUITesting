//Import the following selenium libraries
import $ivy.`org.seleniumhq.selenium:selenium-java:3.5.3`
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome

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
var element = driver.findElementByLinkText("Sign in")  
element.click()
println("\n *** Sign in dialog box opens... ***")


//enter emailid
var username = "arushi131.bhatt@gmail.com"
driver.findElementById("login_hint").sendKeys(username)
println("\n *** emailid is entered... ***")

driver.findElementByName("commit").click()
println("\n *** Login button is clicked... ***")

driver.findElementByName("button").click()
println("\n *** Google button is clicked... ***")


//new window opens
// get the url of two windows in array 'arr'
var arr = driver.getWindowHandles().toArray 
//switch to new window
driver.switchTo().window(arr(1).toString) 
println("\n *** Now we are on new Google Signin Window... ***")


//On New window
//enter username 
driver.findElementByName("identifier").sendKeys(username)
driver.findElementByClassName("CwaK9").click() 
println("\n *** username entered... ***")
//enter password
var password = "Your Password"
driver.findElementByName("password").sendKeys(password)
driver.findElementByClassName("CwaK9").click()


println("\n *** Successfully Logged In Basecamp.. ***")


//import scala.collection.JavaConverters. 





driver.close()

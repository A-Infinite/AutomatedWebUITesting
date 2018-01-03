//Import the following selenium libraries
import $ivy.`org.seleniumhq.selenium:selenium-java:3.5.3`
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome
import org.openqa.selenium.OutputType
import org.apache.commons.io.FileUtils

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
try{
    var element = driver.findElementByLinkText("Sign in")  
    element.click()
    println("\n *** Sign in dialog box opens... *** \n <Test 1 Pass>")
}
catch {
    case ex : Exception => {println("Cannot find sign in button \n <Test 1 Failed> ")}

}

Thread.sleep(1000)
//enter emailid
var username = "YOUR USERNAME"
driver.findElementById("login_hint").sendKeys(username)
println("\n *** emailid is entered... ***")

driver.findElementByName("commit").click()
println("\n *** Login button is clicked... ***")
try{
    driver.findElementByName("button").click()
    println("\n *** Google button is clicked... ***\n <Test 2 Passed>")
}
catch {
    case ex : Exception => {println("Cannot find Google button \n <Test 2 Failed> ")}

}

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

var screenshotFile = driver.getScreenshotAs(OutputType.FILE); 
FileUtils.moveFile(screenshotFile, new java.io.File("SNAP1.png")); 
println("\n****   Screenshot 1 taken ***** ")

Thread.sleep(3000)
//enter password
var password = "YOUR PASSWORD"
driver.findElementByXPath("//*[@id=\"password\"]/div[1]/div/div[1]/input").sendKeys(password)

Thread.sleep(3000)
//Sign In
driver.findElementByClassName("CwaK9").click()

Thread.sleep(3000)
println("\n *** Successfully Logged In Basecamp.. ***")

Thread.sleep(5000)

driver.switchTo().window(arr(0).toString)
driver.executeScript("window.scrollBy(0,1000)", ""); 

screenshotFile = driver.getScreenshotAs(OutputType.FILE); 
FileUtils.moveFile(screenshotFile, new java.io.File("SNAP2.png")); 
println("\n****   Screenshot 2 taken ***** ")





//*************************************************************************************************
//SCHEDULE

//Selecting a Project
driver.findElementById("bucket_5031106_card").click()
println("\nEntered the Project")

Thread.sleep(1000)
//Selecting Schedule 
driver.findElementById("recording_694206377").click()
println("\nEntered Schedule")

Thread.sleep(2000)
//Add Event
driver.findElementByXPath("/html/body/main/div/aside/span[1]/a[1]").click()
println("\nClick on Add Event")

Thread.sleep(2000)
//Event Title
driver.findElementByXPath("//*[@id=\"main-content\"]/div[3]/form/article/section/h1/textarea[2]").sendKeys("Project Submission")
println("\nEnter event title")

//Selecting start date
driver.findElementByXPath("//*[@id=\"main-content\"]/div[3]/form/article/section/div[2]/div/bc-datetime-picker/bc-date-picker").click()  //Problem: Each time the id changes.
driver.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a").click()
println("\nStart date selected")

//Selecting end time
driver.findElementByXPath("/html/body/main/div[3]/form/article/section/div[3]/div/bc-datetime-picker/bc-time-picker/input").click()
driver.findElementByXPath("/html/body/main/div[3]/form/article/section/div[3]/div/bc-datetime-picker/bc-time-picker/ul/li[48]").click()
println("\nEnd time selected")

//Selecting text editor
driver.findElementByTagName("trix-editor").sendKeys("Important task.")
println("\nTyping Message")

screenshotFile = driver.getScreenshotAs(OutputType.FILE); 
FileUtils.moveFile(screenshotFile, new java.io.File("SNAP3.png")); 
println("\n****   Screenshot 3 taken ***** ")

//Post Event
driver.findElementByName("status").click()
println("\nSchedule Posted")

Thread.sleep(2000)

//Going back to Project area
driver.findElementByXPath("//*[@id=\"a-breadcrumb-menu-button\"]").click()
driver.findElementByXPath("//*[@id=\"a-breadcrumb-menu-back-link\"]").click()
println("\nReturned back to the project page")
Thread.sleep(3000)


//*************************************************************************************************


//CAMPFIRE
//Selecting a Project
//driver.findElementById("bucket_5031106_card").click()
//println("Entered the Project")

//Thread.sleep(3000)

//Selecting Campfire
driver.findElementById("recording_694206374").click()
println("\n** Chat Session **")

Thread.sleep(3000)

//Typing Message
driver.findElementByTagName("trix-editor").sendKeys("Hi")
driver.findElementByTagName("trix-editor").sendKeys(" how are you??")
println("\nTyping Message...")

Thread.sleep(1000)

// For keyboard Keys
import org.openqa.selenium.Keys

screenshotFile = driver.getScreenshotAs(OutputType.FILE); 
FileUtils.moveFile(screenshotFile, new java.io.File("SNAP4.png")); 
println("\n****   Screenshot 4 taken ***** ")

//Pressing Enter to send message 
driver.findElementByTagName("trix-editor").sendKeys(Keys.RETURN)
println("\nMessage sent")

Thread.sleep(1000)

//Going back to Project area
println("\nGoing back to Dashboard")
driver.findElementByXPath("//*[@id=\"my_navigation\"]/div/ul[1]/li[1]/a").click()

Thread.sleep(5000)

println("\nClosing the driver")
driver.close()


//Selecting a Project
driver.findElementById("bucket_5119882_card").click()
println("Entered the Project")

//Selecting Campfire
driver.findElementById("recording_706044969").click()
println("** Chat Session **")

//Typing Message
driver.findElementByTagName("trix-editor").sendKeys("Hi")
driver.findElementByTagName("trix-editor").sendKeys(" how are you??")
println("Typing Message...")

//KeyBoard Keys
import org.openqa.selenium.Keys

//Pressing Enter to send message 
driver.findElementByTagName("trix-editor").sendKeys(Keys.RETURN)
println("Message sent")


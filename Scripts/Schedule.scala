//Selecting a Project
driver.findElementById("bucket_5119882_card").click()
println("Entered the Project")

//Selecting Schedule 
driver.findElementById("recording_706044972").click()
println("Entered Schedule")

//Add Event
driver.findElementByXPath("/html/body/main/div/aside/span[1]/a[1]").click()
println("Click on Add Event")


//Event Title
driver.findElementByName("schedule_entry[summary]").sendKeys("Project Submission")
println("Enter event title")

//Selecting start date
driver.findElementByXPath("//*[@id="dp1507047553101"]").click()  //Problem: Each time the id changes.
driver.findElementByTagName("a").click()
println("Start date selected")

//Selecting end time
driver.findElementByXPath("/html/body/main/div[3]/form/article/section/div[3]/div/bc-datetime-picker/bc-time-picker/input").click()
driver.findElementByXPath("/html/body/main/div[3]/form/article/section/div[3]/div/bc-datetime-picker/bc-time-picker/ul/li[48]").click()
println("End time selected")

//Selecting text editor
driver.findElementByTagName("trix-editor").sendKeys("Important task.")
println("Typing Message")

//Post Event
driver.findElementByName("status").click()
println("Schedule Posted")

//Going back to Project area
driver.findElementById("a-breadcrumb-menu-button").click()
driver.findElementById("a-breadcrumb-menu-back-link").click()
println("Returned back to the project page")


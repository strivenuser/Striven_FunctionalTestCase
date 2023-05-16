import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_Signup)

WebUI.maximizeWindow()

// Generate a random first name
Random rand = new Random()

String randomFirstName = ''

String randomLastName = ''

String randomCompanyName = ''

String alphabet = 'abcdefghijklmnopqrstuvwxyz'

String number = '0123456789'

String randomPhoneNumber = ''

for (int i = 0; i < 8; i++) {
    randomFirstName += alphabet.charAt(rand.nextInt(alphabet.length()))

    randomLastName += alphabet.charAt(rand.nextInt(alphabet.length()))

    randomCompanyName += alphabet.charAt(rand.nextInt(alphabet.length()))

    randomPhoneNumber += number.charAt(rand.nextInt(number.length()))
}

// Generate a random email
String randomEmail = (randomFirstName.toLowerCase() + rand.nextInt(1000)) + '@mail.com'

// Print the results
println('Random First Name: ' + randomFirstName)

println('Random Email: ' + randomEmail)

WebUI.click(findTestObject('Object Repository/Page_Striven/input_FIRST NAME_ctl00mainContenttxtFirstName'))

WebUI.setText(findTestObject('Object Repository/Page_Striven/input_FIRST NAME_ctl00mainContenttxtFirstName'), randomFirstName)

WebUI.setText(findTestObject('Object Repository/Page_Striven/input_LAST NAME_ctl00mainContenttxtLastName'), randomLastName)

WebUI.setText(findTestObject('Object Repository/Page_Striven/input_EMAIL_ctl00mainContenttxtEmail'), randomEmail)

WebUI.click(findTestObject('Object Repository/Page_Striven/input_EMAIL_ctl00mainContentbtnStart_input'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Company Name_ctl00ctl00mainContentCon_7609b5'), randomCompanyName)

WebUI.verifyElementText(findTestObject('Object Repository/Page_/input_Personalized Link_ctl00ctl00mainConte_094378'), '')

WebUI.click(findTestObject('Object Repository/Page_/input_land Islands_ctl00ctl00mainContentCon_c07fc0'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(1)

WebUI.setText(findTestObject('Object Repository/Page_/input_land Islands_ctl00ctl00mainContentCon_c07fc0'), randomPhoneNumber)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_/input_test.striven.com_ctl00ctl00mainConten_d264b4'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_/input_test.striven.com_ctl00ctl00mainConten_d264b4'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Skip and Add Later'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/img_Striven Website_img-circle'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_My Profile'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Profile - Info/div_j.lmail.com'), randomEmail)

WebUI.click(findTestObject('Object Repository/Page_My Profile - Info/img_Striven Website_rounded-circle show'))

WebUI.click(findTestObject('Object Repository/Page_My Profile - Info/button_Log Out'))

WebUI.closeBrowser()


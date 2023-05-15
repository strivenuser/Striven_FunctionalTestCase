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
import java.util.Random

String generateRandomName() {
  Random r = new Random()
  String alphabet = "abcdefghijklmnopqrstuvwxyz"
  String fullname = ""
  int length = r.nextInt(10) + 5  // random length between 5 and 15
  for (int i = 0; i < length; i++) {
    char c = alphabet.charAt(r.nextInt(26))
    fullname += c
  }
  return fullname
}

String randomName = generateRandomName()


WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.test.striven.com/Security/Login.aspx')

WebUI.setText(findTestObject('Object Repository/Page_Striven/input_Sign in_ctl00ctl00mainContentmainCont_49a1e1'), 'v.b@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Striven/input_Sign in_ctl00ctl00mainContentmainCont_755761'), 
    'HTbiUiQk+/uArSjH6EUyWA==')

WebUI.click(findTestObject('Object Repository/Page_Striven/input_Email Activation_ctl00ctl00mainConten_95bee1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Striven/input_Sign in_ctl00ctl00mainContentmainCont_755761'), 
    'y0uAm98JxwZOR8I1A6GFzQ==')

WebUI.click(findTestObject('Object Repository/Page_Striven/input_Email Activation_ctl00ctl00mainConten_95bee1'))

WebUI.setText(findTestObject('Object Repository/Page_Striven/input_Remember this device for 30 days_ctl0_098541'), '589452')

WebUI.sendKeys(findTestObject('Object Repository/Page_Striven/input_Remember this device for 30 days_ctl0_098541'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Striven/span_Owens Corning'))

WebUI.click(findTestObject('Object Repository/Page_My Info/a_Employees'))

WebUI.click(findTestObject('Object Repository/Page_My Info/a_List'))

WebUI.click(findTestObject('Object Repository/Page_Employees/input_Create Ticket_ctl00ctl00mainContentCo_dbb0f3'))

WebUI.setText(findTestObject('Object Repository/Page_Add Employee/input_Full Name_txtFullName'), randomName)

WebUI.setText(findTestObject('Object Repository/Page_Add Employee/input_land Islands_intPhone'), '')

WebUI.click(findTestObject('Object Repository/Page_Add Employee/div_Full Name                              _5ccd7c'))


WebUI.setText(findTestObject('Object Repository/Page_Add Employee/input_Email_form-control'), radEmail)

WebUI.click(findTestObject('Object Repository/Page_Add Employee/a_Show More'))

WebUI.click(findTestObject('Object Repository/Page_Add Employee/span_Start Date_k-icon k-i-calendar'))

WebUI.click(findTestObject('Object Repository/Page_Add Employee/a_31'))

WebUI.click(findTestObject('Object Repository/Page_Add Employee/input_Manager_form-control'))

WebUI.click(findTestObject('Object Repository/Page_Add Employee/a_A B'))

WebUI.click(findTestObject('Object Repository/Page_Add Employee/input_Manager_form-control'))

WebUI.click(findTestObject('Object Repository/Page_Add Employee/a_Africa'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Add Employee/select_select AdministratorCustomerUser'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Add Employee/select_select scriptalert(Google)alertscrip_180d86'), 
    '28', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Add Employee/select_select Full-TimePart-TimeTemporaryCo_652c69'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Add Employee/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Raju Gavas - Info/input_select_ctl00ctl00mainContentContentPl_f15f82'))

WebUI.click(findTestObject('Object Repository/Page_Raju Gavas - Info/input_select_ctl00ctl00mainContentContentPl_96f912'))

WebUI.setText(findTestObject('Object Repository/Page_Employees/input_Name_ctl00ctl00mainContentContentPlac_d3cfaa'), randomName)

WebUI.click(findTestObject('Object Repository/Page_Employees/input_Create Ticket_ctl00ctl00mainContentCo_e9f92f'))

WebUI.click(findTestObject('Object Repository/Page_Employees/a_Raju Gavas'))

WebUI.click(findTestObject('Object Repository/Page_Raju Gavas - Info/input_Full Name_ctl00ctl00mainContentConten_3e74b0'))

WebUI.click(findTestObject('Object Repository/Page_Raju Gavas - Info/td_rgmail.com'))

WebUI.click(findTestObject('Object Repository/Page_Raju Gavas - Info/td_W 02005121'))

WebUI.closeBrowser()


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

WebUI.navigateToUrl('https://login.test.striven.com/Security/Login.aspx')

WebUI.setText(findTestObject('Object Repository/Page_Striven/input_Sign in_ctl00ctl00mainContentmainCont_49a1e1'), 'v.p@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Striven/input_Sign in_ctl00ctl00mainContentmainCont_755761'), 
    'y0uAm98JxwZRShil0uEImg==')

WebUI.click(findTestObject('Object Repository/Page_Striven/input_Email Activation_ctl00ctl00mainConten_95bee1'))

WebUI.setText(findTestObject('Object Repository/Page_Striven/input_Remember this device for 30 days_ctl0_098541'), '589452')

WebUI.click(findTestObject('Object Repository/Page_Striven/input_Remember this device for 30 days_ctl0_6a76c4'))

WebUI.click(findTestObject('Object Repository/Page_Settings - Striven/img_Striven Website_rounded-circle show'))

WebUI.rightClick(findTestObject('Object Repository/Page_My Profile - Info/div_v.pmail.com'))

WebUI.click(findTestObject('Object Repository/Page_My Profile - Info/label_Email'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Profile - Info/div_v.pmail.com'), 'v.p@mail.com')

WebUI.closeBrowser()


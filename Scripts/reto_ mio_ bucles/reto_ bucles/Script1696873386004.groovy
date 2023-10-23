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

WebUI.navigateToUrl('https://www.studiof.com.co/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('reto_bucles/botones 1/Page_Tienda de ropa para mujer  Studio F/button_Aceptar cookies'))

WebUI.scrollToElement(findTestObject('reto_bucles/botones 1/vestido'), 5)

WebUI.scrollToElement(findTestObject('reto_bucles/botones 1/banner'), 3)

for (i = 1; i <= 3; i++) {
    WebUI.click(findTestObject('reto_bucles/studiojefe/Page_Tienda de ropa para mujer  Studio F/button_Next'))
}

for (x = 1; x <= 3; x++) {
    WebUI.click(findTestObject('reto_bucles/studiojefe/Page_Tienda de ropa para mujer  Studio F/button_Previous'))
}

WebUI.scrollToElement(findTestObject('reto_bucles/botones 1/blusas'), 1)

WebUI.mouseOver(findTestObject('reto_bucles/botones 1/blusas'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('reto_bucles/botones 1/pantalones'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('reto_bucles/botones 1/vestidos'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('reto_bucles/botones 1/bolsos'))

WebUI.scrollToElement(findTestObject('reto_bucles/ele_ nueva_c'), 2)

for (i = 1; i <= 3; i++) {
    WebUI.click(findTestObject('reto_bucles/botones 1/lateral_2'))
}

for (x = 1; x <= 3; x++) {
    WebUI.click(findTestObject('reto_bucles/botones 1/lateral_1'))
}

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('reto_bucles/botones 1/login'), 0)

WebUI.click(findTestObject('reto_bucles/botones 1/login'))

WebUI.click(findTestObject('reto_bucles/botones 1/mail_pass'))

WebUI.setText(findTestObject('reto_bucles/botones 1/mail'), 'joselitoribers@gmail.com')

WebUI.setText(findTestObject('reto_bucles/pass'), 'Celeste4')

WebUI.click(findTestObject('reto_bucles/botones 1/verificar'))

WebUI.click(findTestObject('reto_bucles/hombre'))

WebUI.scrollToElement(findTestObject('reto_bucles/barra_des'), 0)


for (x = 1; x <= 150; x=x+5) {
	
	
	WebUI.scrollToPosition(0, x)
	
}

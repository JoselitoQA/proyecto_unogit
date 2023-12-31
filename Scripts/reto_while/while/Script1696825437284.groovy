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

WebUI.navigateToUrl('https://www.google.com/')

WebUI.click(findTestObject('Object Repository/reto_while/Page_Google/button_No acceder'))

bandera = 0

while (bandera != 1) {
    int num = (((Math.random() * (10 - 1)) + 1) as int)

    WebUI.maximizeWindow()

    WebUI.waitForPageLoad(5)

    WebUI.setText(findTestObject('Object Repository/reto_while/Page_Google/textarea__q'), '5+' + num)

    WebUI.sendKeys(findTestObject('reto_while/Page_Google/textarea__q'), Keys.chord(Keys.ENTER))

    res = WebUI.getText(findTestObject('reto_while/resultado'))

    print(res)

    if (res == '10') {
		
        bandera = 1
		
		WebUI.setText(findTestObject('Object Repository/reto_while/Page_Google/textarea__q'), 'TE AMO MILLIS' )
		
    } else {
		
        bandera = 0
    }
}

WebUI.delay(5)

WebUI.closeBrowser()


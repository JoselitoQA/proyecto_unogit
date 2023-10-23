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

WebUI.waitForPageLoad(10)

WebUI.navigateToUrl('https://demoqa.com/text-box')

WebUI.maximizeWindow()

for (i = 1; i <= 10; i++) {
	
	def z=['carlos','juan','luis','pedro','ana','celeste','ivanna','lola', 'pedro' ]
	Random rn = new Random()
	tx_nombre = z[rn.nextInt(z.size)] 
	
	
	
    WebUI.setText(findTestObject('Object Repository/reto_for/Page_DEMOQA/input_Full Name_userName'), tx_nombre)

    WebUI.setText(findTestObject('Object Repository/reto_for/Page_DEMOQA/input_Email_userEmail'), (tx_nombre + i) +  '@gmail.com')

    WebUI.setText(findTestObject('Object Repository/reto_for/Page_DEMOQA/textarea_Current Address_currentAddress'), 'datos 1' +  i)

    WebUI.setText(findTestObject('Object Repository/reto_for/Page_DEMOQA/textarea_Permanent Address_permanentAddress'),    'datos 2' + i)

    WebUI.scrollToElement(findTestObject('CONDICIONAL_2/Page_DEMOQA/button_Submit'), 0)

    WebUI.click(findTestObject('reto_for/Page_DEMOQA/button_Submit'))

    WebUI.scrollToElement(findTestObject('reto_for/Page_DEMOQA/input_Full Name_userName'), 0)
}


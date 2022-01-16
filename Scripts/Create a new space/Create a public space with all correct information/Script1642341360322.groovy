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

WebUI.navigateToUrl('http://localhost:8080/')

WebUI.click(findTestObject('Object Repository/Page_Element/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_username'), 'quanghuyne')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Username_password'), 'hk4lGgMz64DUYAH1jDReqA==')

WebUI.click(findTestObject('Object Repository/Page_Element/input_Forgot password_mx_Login_submit'))

WebUI.click(findTestObject('Object Repository/Page_Element/button_Reset all'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Proceed with reset'))

WebUI.click(findTestObject('Object Repository/Page_Element/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Element/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Enable_mx_SpaceButton_icon'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_PublicOpen space for anyone, best for c_08629a'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Upload_spaceName'), 'Quang Huy space')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Q'), 'Q')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Qu'), 'Qu')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Qua'), 'Qua')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quan'), 'Quan')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang'), 'Quang')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang_1'), 'Quang ')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang H'), 'Quang H')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Hu'), 'Quang Hu')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy'), 'Quang Huy')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy_1'), 'Quang Huy ')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy s'), 'Quang Huy s')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy sa'), 'Quang Huy sa')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy s'), 'Quang Huy s')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy so'), 'Quang Huy so')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy sop'), 'Quang Huy sop')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy sopa'), 'Quang Huy sopa')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy sop'), 'Quang Huy sop')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy so'), 'Quang Huy so')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy s'), 'Quang Huy s')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy sp'), 'Quang Huy sp')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy spa'), 'Quang Huy spa')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy spac'), 'Quang Huy spac')

WebUI.setText(findTestObject('Object Repository/Page_Element/textarea_Quang Huy space'), 'Quang Huy space')

WebUI.click(findTestObject('Object Repository/Page_Element/div_Create'))

WebUI.click(findTestObject('Object Repository/Page_Element  Quang Huy space/div_Enable_mx_SpaceButton_icon'))

WebUI.click(findTestObject('Object Repository/Page_Element/span_Q'))


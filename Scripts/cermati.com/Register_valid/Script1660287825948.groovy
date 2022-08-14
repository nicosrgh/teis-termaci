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

WebUI.navigateToUrl('https://www.cermati.com/app/gabung')

WebUI.setText(findTestObject('Object Repository/cermati.com/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Email_email'), 
    'tests@mailinator.com')

WebUI.setText(findTestObject('Object Repository/cermati.com/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_No. Handphone_mobilePhone'), 
    '081178945622')

WebUI.setEncryptedText(findTestObject('Object Repository/cermati.com/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Kata Sandi_password'), 
    'wkalWneaR5GCiyoOdpU5uA==')

WebUI.setEncryptedText(findTestObject('Object Repository/cermati.com/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Ulangi Kata Sandi_confirmPassword'), 
    'wkalWneaR5GCiyoOdpU5uA==')

WebUI.setText(findTestObject('Object Repository/cermati.com/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Nama Depan_firstName'), 
    'Julius')

WebUI.setText(findTestObject('Object Repository/cermati.com/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Nama Belakang_lastName'), 
    'Bartolomeu')

WebUI.setText(findTestObject('Object Repository/cermati.com/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_KabupatenKota_cityAndProvince'), 
    'KOTA MEDAN')

WebUI.click(findTestObject('Object Repository/cermati.com/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/p_Daftar'))

WebUI.closeBrowser()

package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.core.api.Scenario;

public class Utils {
	
	public static WebDriver driver;

	public static void acessarSistema() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.consorcio123sistema.com.br/");
	}
	
	//M�todo de instancia��o do tipo gen�rico
	public static <T> T NaTela(Class<T> classe){ //Utilizada para instanciar dentro dos m�todos da classe "Steps" a classe "Page"
		return PageFactory.initElements(driver, classe); // Retorna a inicializa��o dos elementos da PageFactory
	}

	//m�todo para printar os resultados dos testes
	public static void capturarTela(Scenario scenario){
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}
}

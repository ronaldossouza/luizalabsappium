package br.com.ronaldosouza.core;

import static br.com.ronaldosouza.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;

public class BasePage {

	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);

	}

	public void clicaSearch(By by) {
		getDriver().findElement(By.id("com.luizalabs.mlapp:id/search_icon")).click();
		;

	}

	public void clicarNoProdutoPesquisado(By by) {

		getDriver().findElement(By.xpath("//android.widget.TextView[@text='iphone 8']")).click();

	}

	public void clicarNoProdutoParaVerDetalhes(By by) {
		getDriver()
				.findElement(
						By.xpath("//android.widget.TextView[@text='iPhone 8 Apple 64GB Cinza Espacial 4G Tela 4,7”']"))
				.click();

	}

	public String armazenoNomeDoProdutoPesquisado(By by) {
		String nomeEscrito = getDriver().findElement(By.xpath(
				"//android.widget.TextView[@text='iPhone 8 Apple 64GB Cinza Espacial 4G Tela 4,7” - Retina Câm. 12MP + Selfie 7MP iOS 11']"))
				.getText();
		return nomeEscrito;

	}

}

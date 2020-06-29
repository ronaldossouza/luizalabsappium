package br.com.ronaldo.appium.page;

import static br.com.ronaldosouza.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.ronaldosouza.core.BasePage;
import io.appium.java_client.TouchAction;

public class SearchPage extends BasePage {


	public void clicarNoSearch() {
		clicaSearch(By.id("com.luizalabs.mlapp:id/search_icon"));

	}

	public void escreverNomeDoProduto(String nome) {
		escrever(By.id("com.luizalabs.mlapp:id/searchTextView"), nome);

	}

	public void clicarNoProduto() throws InterruptedException {
		Thread.sleep(4000);
		clicarNoProdutoPesquisado(By.xpath("//android.widget.TextView[@text='iphone 8']"));
	}

	public void clicarNoPrimeiroProduto() {
		clicarNoProdutoParaVerDetalhes(
				By.xpath("//android.widget.TextView[@text='iPhone 8 Apple 64GB Cinza Espacial 4G Tela 4,7”']"));
	}

	public String armazenarNomeDoProduto() {
		return armazenoNomeDoProdutoPesquisado(By.xpath(
				"//android.widget.TextView[@text='iPhone 8 Apple 64GB Cinza Espacial 4G Tela 4,7” - Retina Câm. 12MP + Selfie 7MP iOS 11']"));
	}

	public void scroll(double inicio, double fim) throws InterruptedException {
		org.openqa.selenium.Dimension size = getDriver().manage().window().getSize();

		int x = size.width / 2;

		int start_y = (int) (size.height * inicio);
		int end_y = (int) (size.height * fim);

		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		new TouchAction(getDriver()).press(x, start_y).waitAction().moveTo(end_y, x).release().perform();
		Thread.sleep(2000);

	}

}

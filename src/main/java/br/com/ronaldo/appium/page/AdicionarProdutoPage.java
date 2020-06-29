package br.com.ronaldo.appium.page;

import static br.com.ronaldosouza.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import br.com.ronaldosouza.core.BasePage;

public class AdicionarProdutoPage extends BasePage {

	public void clicaEmAdiconarProduto() {
		getDriver().findElement(By.xpath("//android.widget.TextView[@text='Adicionar à sacola']")).click();

	}

	public String armazenoNomeDoProdutoAdicionado() {
		String nomeProdutoAdicionad = getDriver().findElement(By.xpath(
				"//android.widget.TextView[@text='iPhone 8 Apple 64GB Cinza Espacial 4G Tela 4,7” - Retina Câm. 12MP + Selfie 7MP iOS 11']"))
				.getText();
		return nomeProdutoAdicionad;

	}

	public void clicaEmCompraMaisProdutos() throws InterruptedException {
		getDriver().findElement(By.id("com.luizalabs.mlapp:id/button_buy_more_products")).click();
		Thread.sleep(4000);

	}

	public void clicaNaSacolaDeProdutos() throws InterruptedException {
		getDriver().findElement(By.id("com.luizalabs.mlapp:id/action_basket")).click();
		Thread.sleep(4000);

	}

}

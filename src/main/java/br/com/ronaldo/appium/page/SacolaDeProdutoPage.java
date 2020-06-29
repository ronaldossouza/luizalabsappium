package br.com.ronaldo.appium.page;

import static br.com.ronaldosouza.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.ronaldosouza.core.BasePage;

public class SacolaDeProdutoPage extends BasePage {

	public void clicaNaSacolaDeProduto() {
		getDriver().findElement(By.xpath("//android.widget.TextView[@text='Adicionar à sacola']")).click();

	}

	public String armazenoNomeDoProdutoAdicionado() {
		String nomeProdutoAdicionad = getDriver().findElement(By.xpath(
				"//android.widget.TextView[@text='iPhone 8 Apple 64GB Cinza Espacial 4G Tela 4,7” - Retina Câm. 12MP + Selfie 7MP iOS 11']"))
				.getText();
		return nomeProdutoAdicionad;

	}

	public String validaSetemItensNaSacola() {
		String quantidadeDeProduto = getDriver().findElement(By.xpath("//android.widget.TextView[@text='1']"))
				.getText();
		return quantidadeDeProduto;

	}

}

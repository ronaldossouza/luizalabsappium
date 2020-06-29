package br.com.ronaldo.appium.test;

import java.net.MalformedURLException;
import org.junit.Assert;
import org.junit.Test;
import br.com.ronaldo.appium.page.AdicionarProdutoPage;
import br.com.ronaldo.appium.page.SearchPage;
import br.com.ronaldo.appium.page.SacolaDeProdutoPage;
import br.com.ronaldosouza.core.Basetest;
import br.com.ronaldosouza.core.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MagaluTeste extends Basetest {

	private AndroidDriver<MobileElement> driver;
	private SearchPage page = new SearchPage();
	private AdicionarProdutoPage adicionar = new AdicionarProdutoPage();
	private SacolaDeProdutoPage sacola = new SacolaDeProdutoPage();

	@org.junit.Before
	public void inicializarAppium() throws MalformedURLException {
		driver = DriverFactory.getDriver();
	}

	@Test
	public void deveBuscarProduto() throws MalformedURLException, InterruptedException {

		page.clicarNoSearch();
		page.escreverNomeDoProduto("iphone");
		page.clicarNoProduto();
		page.clicarNoPrimeiroProduto();
		Assert.assertEquals("iPhone 8 Apple 64GB Cinza Espacial 4G Tela 4,7” - Retina Câm. 12MP + Selfie 7MP iOS 11",
				page.armazenarNomeDoProduto());

		page.scroll(0.5, 0.1);
		adicionar.clicaEmAdiconarProduto();
		Assert.assertEquals("iPhone 8 Apple 64GB Cinza Espacial 4G Tela 4,7” - Retina Câm. 12MP + Selfie 7MP iOS 11",
				adicionar.armazenoNomeDoProdutoAdicionado());

		adicionar.clicaEmCompraMaisProdutos();
		adicionar.clicaNaSacolaDeProdutos();
		Assert.assertEquals("1", sacola.validaSetemItensNaSacola());

	}

}

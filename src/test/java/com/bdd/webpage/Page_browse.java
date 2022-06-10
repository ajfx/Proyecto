package com.bdd.webpage;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Page_browse {
	
	WebDriver driver;
	
	
	By txtsearch = By.id("twotabsearchtextbox");
	By botonbusqueda =By.id("nav-search-submit-button");
	By checkbox =By.xpath("//*[@id=\"p_89/adidas\"]/span/a/span");
	By producto1=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] span[class='a-size-base-plus a-color-base a-text-normal']");
	By producto2=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2'] span[class='a-size-base-plus a-color-base a-text-normal']");
	By producto3=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3'] span[class='a-size-base-plus a-color-base a-text-normal']");
	By producto4=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_4'] span[class='a-size-base-plus a-color-base a-text-normal']");
	By producto5=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_5'] span[class='a-size-base-plus a-color-base a-text-normal']");
	By precio1=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] span[class='a-size-base s-underline-text']");
	By precio2=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2'] span[class='a-size-base s-underline-text']");
	By precio3=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3'] span[class='a-size-base s-underline-text']");
	By precio4=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_4'] span[class='a-size-base s-underline-text']");
	By precio5=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_5'] span[class='a-size-base s-underline-text']");
	By precio1r=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] span[class='a-price']");
	By precio2r=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2'] span[class='a-price']");
	By precio3r=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3'] span[class='a-price']");
	By precio4r=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_4'] span[class='a-price']");
	By precio5r=By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_5'] span[class='a-price']");
	By drop= By.id("a-autoid-0-announce");
	By opcion3= By.xpath("//*[@id=\"s-result-sort-select_2\"]");
	By filtro=By.xpath("//*[@id=\"brandsRefinements\"]/ul[2]/li[1]/span/a/span[2]");
	
	
	public Page_browse (WebDriver driver) {
	this.driver=driver;

}
	
	public void abrirnavegador() {
		try {
			
			
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/win/chromedriver.exe");	
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}catch (Exception e) {
			e.printStackTrace();
		}	
}
	public void ingresarPagina() {
		try {
			driver.navigate().to("http://amazon.com");
			driver.manage().window().maximize();
			assertTrue(driver.getTitle().contains("Amazon"));
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(driver.getTitle().contains("Amazon.com"))
		    //Pass
		    System.out.println("Se ingresó correctamente a la pagina Amazon");
		else
		    //Fail
		    System.out.println("No se ingresó a la pagina");
		
	}
	public void Busqueda(String word) {
		try {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			/*busqueda*/
			WebElement inputBusqueda=driver.findElement(txtsearch);
			js.executeScript("arguments[0].value='"+word+"';",inputBusqueda);
			inputBusqueda.submit();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void filtradomarca() {
		try {
			driver.findElement(checkbox).click();
			Assert.assertEquals("Amazon.com : zapatilla",driver.getTitle());
			System.out.println("Busqueda realizada correctamente");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void impord1() {
		try {
			String p1 = driver.findElement(producto1).getText();
			String p2 = driver.findElement(producto2).getText();
			String p3 = driver.findElement(producto3).getText();
			String p4 = driver.findElement(producto4).getText();
			String p5 = driver.findElement(producto5).getText();
			String px1= driver.findElement(precio1).getText();
			String px2= driver.findElement(precio2).getText();
			String px3= driver.findElement(precio3).getText();
			String px4= driver.findElement(precio4).getText();
			String px5= driver.findElement(precio5).getText();
			System.out.println("-----PRODUCTOS DE LA MARCA ADIDAS:\n1.- El primer producto mostrado es: "+p1+"y su precio es de: "+px1+ "\n"+
					"2.- El segundo producto mostrado es: "+p2 +"y su precio es de: "+px2+"\n"+
					"3.- El tercer producto mostrado es: "+p3 +"y su precio es de: "+px3+"\n"+
					"4.- El cuarto producto mostrado es: "+p4 +"y su precio es de: "+px4+"\n"+
					"5.- El quinto producto mostrado es: "+p5 +"y su precio es de: "+px5+"\n");
			driver.findElement(drop).click();	
			driver.findElement(opcion3).click();
			Thread.sleep(5000);
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	public void impord2() {
		try {
			String p1 = driver.findElement(producto1).getText();
			String p2 = driver.findElement(producto2).getText();
			String p3 = driver.findElement(producto3).getText();
			String p4 = driver.findElement(producto4).getText();
			String p5 = driver.findElement(producto5).getText();
			String px1= driver.findElement(precio1).getText();
			String px2= driver.findElement(precio2).getText();
			String px3= driver.findElement(precio3).getText();
			String px4= driver.findElement(precio4).getText();
			String px5= driver.findElement(precio5).getText();
			System.out.println("-----PRODUCTOS CON MAYOR PRECIO DE LA MARCA ADIDAS:\n1.- El primer producto de mayor precio es: "+p1+" con precio: "+px1+ "\n"+
					"2.- El segundo producto de mayor precio es: "+p2+" con precio de: "+px2+"\n"+
					"3.- El tercer producto de mayor precio es: "+p3+" con precio de: "+px3+"\n"+
					"4.- El cuarto producto de mayor precio es: "+p4+" con precio de: "+px4+"\n"+
					"5.- El quinto producto de mayor precio es: "+p5+" con precio de: "+px5+"\n");
			driver.findElement(filtro).click();	
			Thread.sleep(5000);
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	public void valida() {
	
		if(!driver.findElements(precio1r).isEmpty()){
			System.out.println("El 1er producto tiene su precio visible");
		}else{
			System.out.println("El 1er producto no tiene su precio visible");
		}
		
		if(!driver.findElements(precio2r).isEmpty()){
			System.out.println("El 2do producto tiene su precio visible");
		}else{
			System.out.println("El 2do producto no tiene su precio visible");
		}

		if(!driver.findElements(precio3r).isEmpty()){
			System.out.println("El 3er producto tiene su precio visible");
		}else{
			System.out.println("El 3er producto no tiene su precio visible");
		}
		if(!driver.findElements(precio4r).isEmpty()){
			System.out.println("El 4to producto tiene su precio visible");
		}else{
			System.out.println("El 4to producto no tiene su precio visible");
		}
		if(!driver.findElements(precio5r).isEmpty()){
			System.out.println("El 5to producto tiene su precio visible");
		}else{
			System.out.println("El 5to producto no tiene su precio visible");
		}
		driver.close();
	}
	}
	
		
		
	
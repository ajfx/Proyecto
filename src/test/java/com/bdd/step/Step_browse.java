package com.bdd.step;

import org.openqa.selenium.WebDriver;

import com.bdd.webpage.Page_browse;

public class Step_browse {
	
	WebDriver driver= null;
	
	Page_browse pgbrowse=new Page_browse(driver);


	public void abrirnavegador() {
	try {
		
		pgbrowse.abrirnavegador();
	}catch (Exception e) {
		e.printStackTrace();
		
	}
}
	public void ingresarPagina() {
		try {
			
			pgbrowse.ingresarPagina();
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}
	
	public void Busqueda(String word) {
		
		try {
			
			pgbrowse.Busqueda(word);
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
		public void filtradomarca() {
			
			try {
				
				pgbrowse.filtradomarca();
			}catch (Exception e) {
				e.printStackTrace();
				
			}
	}
		public void impord1() {
			
			try {
				
				pgbrowse.impord1();
			}catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		
		public void impord2() {
			
			try {
				
				pgbrowse.impord2();
			}catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		public void valida() {
			
			try {
				
				pgbrowse.valida();
			}catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		
	
}
package com.bdd.stepdefinition;

import com.bdd.step.Step_browse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Stepdefinitionbrowse {
	
	Step_browse stpbrowse=new Step_browse();
	
	@Given("que el usuario se encuentra en la pagina principal")
	public void que_el_usuario_se_encuentra_en_la_pagina_principal() {
		stpbrowse.abrirnavegador();
		stpbrowse.ingresarPagina();
	}
	@When("ingresa la busqueda (.*)$")
	public void ingresa_la_busqueda(String word) {
		stpbrowse.Busqueda(word);
	}
	@And("filtrar por la marca Adidas")
	public void filtrar_por_la_marca_Adidas() {
		stpbrowse.filtradomarca();
	}
	@And("Imprimir y Ordenar 5 primeros productos y precios")
	public void Imprimir_y_Ordenar_5_primeros_productos_y_precios() {
		stpbrowse.impord1();
	}
	@And("Imprimir y Deshabilitar filtro")
	public void Imprimir_y_Deshabilitar_filtro() {
		stpbrowse.impord2();
	}
	
	@Then("Validar 5 primeros productos")
	public void Validar_5_primeros_productos() {
		stpbrowse.valida();
	}
	}

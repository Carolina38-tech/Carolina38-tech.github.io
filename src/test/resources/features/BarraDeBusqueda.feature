#Author: Abel Cejas
#encoding: utf-8
@tag
Feature: Barra De Busqueda
	como usuario 
	quiero buscar un producto desde el buscador
	para que me despliegue los resultados de la busqueda

Background:
	Given que el usuario se encuentra en la pagina de automationpractice

  @escenarioExitoso
  Scenario: Buscar producto existente	
	When el usuario busca un producto existente
	Then se despliega el menu con los resultados de busqueda correspondientes
	
  @escenarioFallido
  Scenario: Buscar producto inexistente	
	When el usuario realiza una busqueda inexistente
	Then se visualiza el menu vacio junto al mensaje sin resultados de busqueda
	

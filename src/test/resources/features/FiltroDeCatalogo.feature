#Author: Abel Cejas
#encoding: utf-8
Feature: Filtro De Catalogo
	como usuario 
	quiero filtrar las prendas según mis preferencias
	para visualizar el stock que cumple dichas condiciones

  Scenario: 
	Given que el usuario se encuentra en el catalogo de automationpractice
	When el usuario realiza un filtro
	Then se muestran los resultados de la busqueda con el filtro
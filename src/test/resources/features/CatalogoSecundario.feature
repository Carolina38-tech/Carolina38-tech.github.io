#Author: Abel Cejas
#encoding: utf-8
Feature: catalogo secundario
	como usuario 
	quiero desplazarme entre las secciones de Popular y Best Sellers
	para visualizar los productos correspondientes de la sección elegida

 Scenario: desplazamiento entre catalogos
	Given que el usuario se encuentra en automationpractice
	When el usuario selecciona un catalogo
	Then se visualizan los productos correspondientes a la seccion
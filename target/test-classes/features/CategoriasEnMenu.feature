#Author: Abel Cejas
#encoding: utf-8

Feature: Menu categoria
	como usuario
	quiero desplazarme por las secciones y subsecciones del menú categorías
	para que se desplieguen los productos de la sección o subsección correspondiente

Background:
	Given que el usuario ingresa a automationpractice

  Scenario: Ingresar a una Categoría
	When el usuario selecciona una categoria del menu
	Then se despliega el menu con los productos de la categoria

  Scenario: Ingresar a una Subcategoría
	When el usuario selecciona una subcategoria del menu
	Then se despliega el menu con los productos de la subcategoria
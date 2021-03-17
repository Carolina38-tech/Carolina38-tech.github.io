#Author: Abel Cejas
#encoding: utf-8
Feature: Registro
	como navegante
	quiero registrarme en la pagina
	para obtener un usuario

Background:
	Given que el navegante se encuentra en la pagina automationpractice

  Scenario: Validacion Registro Fallido	
	When el navegante se registra incorrectamente
	Then el proceso de ingreso marca los campos de error
	
  Scenario: Validación Registro Exitoso	
	When el navegante se registra correctamente	
	Then se crea un usuario
#Author: Abel Cejas
#encoding: utf-8
Feature: Login
	como usuario
	quiero loguearme en la pagina
	para acceder a mi usuario

Background:
	Given que el usuario se encuentra en la pagina
	
  Scenario: Validación Login Exitoso  
	When el usuario ingresa las credenciales
	Then ingresa correctamente a la aplicación de automationpractice

  Scenario: Validación Login Fallido 
	When el usuario ingresa las credenciales incorrectas
	Then la aplicación despliega un cartel de error

  Scenario: Nueva Contraseña 
	When el usuario ingresa las credenciales fallidas
	And pide contraseña nueva
	Then se despliega un mensaje de email de recupero enviado
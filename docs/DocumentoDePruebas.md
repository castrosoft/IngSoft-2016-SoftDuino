
							DOCUMENTO DE PRUEBAS


***PRUEBAS UNITARIAS***:
-
**TEDat** = TestEnvioDato	
		
**TEC** = TestEnvioCloro	
		
**TEP** = TestEnvioPh	
		
**TEDiar** = TestEnvioDiaria	
		
**TRCC** = TestRecepcionCantidadCloro
			
**TRCP** = TestRecepcionCantidadPh	
		
**TRCDiar** = TestRecepcionCantidadesDiaria			




***PRUEBAS DE SISTEMA***:
-
Aclaraciones: La barra de progreso y las etiquetas están organizadas en grilla de 2 por 2 elementos, es decir que la barra de progreso en la posición (1,1) se corresponde con la etiqueta (1,1).

![](http://i.imgur.com/lM5p20r.jpg)

**PRUEBA ENVIO DE DOSIS DE CLORO**


- DESCRIPCIÓN: Mediante la interfaz de usuario de la aplicacion se debera enviar al sistema dosificador la cantidad de cloro a dosificar y esperar la respuesta del mismo.

- PRECONDICIONES: Tener abierto la aplicacion y la conexion establecida con el hardware (o simulador).

- PROCEDIMIENTO: 

	1. Ingresar cantidad de cloro en caja de texto correspondiente (valores enteros entre 1 y 63, porque son los que admiten el sistema dosificador).
	2. Presionar el botón "Enviar Cloro".


- RESULTADO ESPERADO: 

	- La aplicación vaya mostrando la cantidad de medidas de químico suministrado en la etiqueta nombrada como "Cloro suministrado: --" (los guiones -- corresponden al valor numérico). 
	- La cantidad anteriormente mencionada debe llegar al numero ingresado en la caja de texto.
	- La barra de progreso debe representar la cantidad de químico suministrado (instante a instante se debe corresponder con el valor numérico).



**PRUEBA ENVIO DE DOSIS DE PH**


- DESCRIPCIÓN: Mediante la interfaz de usuario de la aplicación deberá enviar al sistema dosificador la cantidad de PH a dosificar y esperar la respuesta del mismo.

- PRECONDICIONES: Tener abierto la aplicación y la conexión establecida con el hardware (o simulador).

- PROCEDIMIENTO: 

	1. Ingresar cantidad de PH en caja de texto correspondiente (valores enteros entre 1 y 63, porque son los que admiten el sistema dosificador).
	2. Presionar el botón "Enviar PH".


- RESULTADO ESPERADO: 

	- La aplicación vaya mostrando la cantidad de medidas de químico suministrado en la etiqueta nombrada como "PH suministrado: --" (los guiones -- corresponden al valor numérico). 
	- La cantidad anteriormente mencionada debe llegar al numero ingresado en la caja de texto.
	- La barra de progreso debe representar la cantidad de químico suministrado (instante a instante se debe corresponder con el valor numérico).

**PRUEBA FUNCIÓN DIARIA**

- DESCRIPCION: Mediante la interfaz grafica, la aplicacion debera enviar el comando de dosificacion diaria al sistema dosificador.

- PRECONDICIONES: Tener abierto la aplicación y la conexión establecida con el hardware (o simulador).


- PROCEDIMIENTOS:

	- Hacer click en boton "Diaria".



- RESULTADO ESPERADO: 
	 - Que la aplicación vaya mostrando la cantidad de medidas de químico suministrado en las etiquetas con los nombres de los quimicos. 
	 - Las cantidades anteriormente mencionadas deben llegar a los numeros correspondientes a la confguracion de dosificacion diaria que esta grabada en el sistema dosificador (en este caso 10 de cloro, 7 de ph, 5 de alguicida y 3 de clarificante). 
	- Las barras de progreso deben representar las cantidades de químicos suministrados (instante a instante se deben corresponder con su valor numérico).
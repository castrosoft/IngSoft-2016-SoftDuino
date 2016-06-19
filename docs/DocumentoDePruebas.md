
							DOCUMENTO DE PRUEBAS


***PRUEBAS UNITARIAS***
-
**TEDat** = TestEnvioDato	

Verifica si el dato se ha enviado correctamente, mediante la comprobación de que el dato enviado fue almacenado en una variable en la clase del simulador.
		
**TEC** = TestEnvioCloro
		

**TEP** = TestEnvioPh	

		
**TEDiar** = TestEnvioDiaria
	
Los tests de envío de funciones se realizan a través de verificar la variable de tipo de dato se corresponde con una "c" en el caso del cloro, con una "p" en el caso de ph y una "d" en el caso de diaria. Cada uno de los tests espera,mediante dormir el hilo, que el hardware simulado procese la información.

		
**TRCC** = TestRecepcionCantidadCloro

			
**TRCP** = TestRecepcionCantidadPh	

		
**TRCDiar** = TestRecepcionCantidadesDiaria			

Estas pruebas verifican que ele estado final de dosificación de un producto, variables que se encuentran dentro del modelo, cuando el sistema simulado termina  el proceso se corresponda con los valores ingresados en la caja de texto o con los valores 10 de cloro, 7 de ph, 5 de alguicida y 3 de clarificante, para el caso de función diaria.



***PRUEBAS DE SISTEMA***
-
Aclaraciones: La barra de progreso y las etiquetas están organizadas en grilla de 2 por 2 elementos, es decir que la barra de progreso en la posición (1,1) se corresponde con la etiqueta (1,1).

![](http://i.imgur.com/lM5p20r.jpg)

**PRUEBA ENVÍO DE DOSIS DE CLORO**


- DESCRIPCIÓN: Mediante la interfaz de usuario de la aplicación se deberá enviar al sistema dosificador la cantidad de cloro a dosificar y esperar la respuesta del mismo.

- PRECONDICIONES: Tener abierto la aplicación y la conexión establecida con el hardware (o simulador).

- PROCEDIMIENTO: 

	1. Ingresar cantidad de cloro en caja de texto correspondiente (valores enteros entre 1 y 63, porque son los que admiten el sistema dosificador).
	2. Presionar el botón "Enviar Cloro".


- RESULTADO ESPERADO: 

	- La aplicación vaya mostrando la cantidad de medidas de químico suministrado en la etiqueta nombrada como "Cloro suministrado: --" (los guiones -- corresponden al valor numérico). 
	- La cantidad anteriormente mencionada debe llegar al numero ingresado en la caja de texto.
	- La barra de progreso debe representar la cantidad de químico suministrado (instante a instante se debe corresponder con el valor numérico).



**PRUEBA ENVÍO DE DOSIS DE PH**


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

- DESCRIPCION: Mediante la interfaz gráfica, la aplicación deberá enviar el comando de dosificación diaria al sistema dosificador.

- PRECONDICIONES: Tener abierto la aplicación y la conexión establecida con el hardware (o simulador).


- PROCEDIMIENTOS:

	- Hacer click en botón "Diaria".



- RESULTADO ESPERADO: 
	 - Que la aplicación vaya mostrando la cantidad de medidas de químico suministrado en las etiquetas con los nombres de los quimicos. 
	 - Las cantidades anteriormente mencionadas deben llegar a los numeros correspondientes a la confguracion de dosificacion diaria que esta grabada en el sistema dosificador (en este caso 10 de cloro, 7 de ph, 5 de alguicida y 3 de clarificante). 
	- Las barras de progreso deben representar las cantidades de químicos suministrados (instante a instante se deben corresponder con su valor numérico).


**Matriz de trazabilidad**

![](http://i.imgur.com/9fmdVgJ.png)
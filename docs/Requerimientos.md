							  REQUERIMIENTOS DE USUARIO 


*Dosificar Cloro:* La aplicación deberá enviar la cantidad de dosis de cloro (en medida de unidad entera) al sistema dosificador para que este agregue el producto a la piscina.


*Dosificar PH:* La aplicación deberá enviar la cantidad de dosis de ph (en medida de unidad entera) al sistema dosificador para que este agregue el producto a la piscina.


*Dosificación diaria:* La aplicación deberá indicar al sistema dosificador que realice el proceso de dosificación diaria (10 de cloro, 7 de ph, 5 de alguicida y 3 de clarificante)

*Mostrar información:* La aplicación deberá permitir al usuario conocer en qué estado del proceso de dosificación de producto (cualquiera sea) se encuentra el sistema

![](http://i.imgur.com/FF0iIgA.jpg)



El siguiente diagrama de  secuencia describe las interacciones entre el usuario, la aplicación de control y el sistema dosificador para el caso de optar por el suministro de cloro o ph. 
 
![](http://i.imgur.com/jSkJMlb.jpg)



El diagrama de  secuencia a continuación describe las interacciones entre el usuario, la aplicación de control y el sistema dosificador para el caso de realizar una dosificación diaria (cloro, ph, alguicida y clarificante) 



![](http://i.imgur.com/zVfnNaX.jpg)


								REQUERIMIENTO DE SISTEMA

Dosificar Cloro:

- Deberá implementar un medio de comunicación entre el sistema dosificador y la aplicación de control
- l 
	
	 
 

Dosificar PH:

Dosificación diaria:

Mostrar información


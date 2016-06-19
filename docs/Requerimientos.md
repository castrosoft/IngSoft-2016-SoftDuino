							  REQUERIMIENTOS DE USUARIO 


*Dosificar Cloro:* La aplicación deberá enviar la cantidad de dosis de cloro (en medida de unidad entera) al sistema dosificador para que este agregue el producto a la piscina.


*Dosificar PH:* La aplicación deberá enviar la cantidad de dosis de ph (en medida de unidad entera) al sistema dosificador para que este agregue el producto a la piscina.


*Dosificación diaria:* La aplicación deberá indicar al sistema dosificador que realice el proceso de dosificación diaria (10 de cloro, 7 de ph, 5 de alguicida y 3 de clarificante)

*Mostrar información:* La aplicación deberá permitir al usuario conocer en qué estado del proceso de dosificación de producto (cualquiera sea) se encuentra el sistema

![](http://i.imgur.com/qVZjhNd.jpg)



El siguiente diagrama de  secuencia describe las interacciones entre el usuario, la aplicación de control y el sistema dosificador para el caso de optar por el suministro de cloro o ph. 
 
![](http://i.imgur.com/jSkJMlb.jpg)



El diagrama de  secuencia a continuación describe las interacciones entre el usuario, la aplicación de control y el sistema dosificador para el caso de realizar una dosificación diaria (cloro, ph, alguicida y clarificante) 



![](http://i.imgur.com/zVfnNaX.jpg)

Diagrama de actividad de quimico a dosificar.
![](http://i.imgur.com/muk74RN.jpg)

Diagrama de actividad de dosificacion diaria-

![](http://i.imgur.com/Sdzzyvo.jpg)

								REQUERIMIENTO DE SISTEMA


 

1.0 **INTRODUCCION**

En esta sección se presenta el documento de especificación de requisitos para el Sistema de Control de Dosificación (SCD). Eso proporciona el propósito y el alcance del sistema. Cualquier definiciones y las referencias se enumeran en esta sección como así como una visión general del documento de especificación de requisitos restante


1.1 **PROPOSITO**

Este documento de especificación de requisitos se describen las funciones y los requisitos especificados para el Sistema de Control de Dosificación (SCD). 



1.2 **DEFINICIONES, ACRONIMOS Y ABREVIACIONES**

	SCD: Sistema de Control de Dosificacion.


1.3 **PERSPECTIVA**

Este documento proporciona una descripción del SCD. Identifica el tipo de usuario que requerirá esta aplicación y ayuda a explicar las funciones de esta. El documento describe a continuación, el software general y las limitaciones del hardware. La mayoría de este documento se centra en la lista de requisitos específicos. Se describirán los requerimientos de usuario y luego en función de estos se profundizara para detallar los requerimientos de sistema.



2.0 **FUNCIONES DE SISTEMA**

La aplicación facilitará al usuario un método de comunicación con su dispositivo de dosificación para piscinas. Le proveerá funciones básicas como ser la dosificación de una cantidad especifica de cloro o ph, como así también una función para que el dispositivo realice una dosificación diaria, definida como "x" cantidad de cada producto, donde "x" viene dada por la configuración del dispositivo.
La aplicación tendrá la capacidad de mostrar al usuario, en tiempo real, el estado de la dosificación del producto indicado.


3.0 **CARACTERÍSTICAS DE USUARIO**

Los usuarios que usaran esta aplicación serán los que dispongan de hardware apropiado para hacer la dosificación de productos químicos en su piscina.



4.0 **RESTRICCIONES  GENERALES**

Restricciones de software: dispositivos con Windows 7 en adelante y maquina virtual java instalada.
Restricción de hardware: en caso de tener el dispositivo dosificador sera necesario tener un puerto USB disponible.


5.0 **LISTA DE REQUERIMIENTOS**

Esta sección contiene la lista de todos los requisitos para el SCD. La lista contiene los números y nombres de requisitos únicos con una breve descripción de cada requisito.

REQ 1: Deberá implementar un medio de comunicación entre el sistema dosificador y la aplicación de control.


REQ 2:  Al pulsar el botón "Enviar Cloro" la aplicación debe notificar al sistema  que dosifique la cantidad de Cloro indicada en la caja de texto correspondiente. 

REQ 3:  Si el usuario quiere confirmar una dosis de Ph debería presionar el botón "Enviar Ph", luego de haber ingresado la cantidad correspondiente.

REQ 4: Si el usuario desea un dosificación diaria debería presionar directamente el botón "Diaria".


REQ 5:La aplicación de control de dosificación deberá mostrar los valores numéricos de cada dosificación.

**Matriz de trazabilidad**

![](http://i.imgur.com/9fmdVgJ.png)



REQUERIMIENTOS NO FUNCIONALES (EN EDICION)

- La aplicación deberá utilizar elementos de fácil interacción para usuario con manejo básico de una computadora. Tomamos como "fácil interacción" a aquellos elementos que se encuentran disponibles en la pantalla principal (botones, caja de texto, etc).
- Las etiquetas mostradas en los elementos anteriormente descritos deberán tener nombres que representen funcionalidades directas del hardware del sistema dosificador.
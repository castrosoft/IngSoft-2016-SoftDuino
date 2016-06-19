							 GRUPO SOFTDUINO 



RELEASE NOTES
-


*INSTRUCCIONES DE USO*

- Descargar el archivo DosifierApp.jar de la carpeta ejecutables
- Ejecutar el jar (asegurándose de tener instalada una maquina virtual de java)
- El primer paso es hacer click en el botón conectado (es necesario tener conectado el hardware y el puerto COM3 asignado a este, de lo contrario la aplicación utilizara un simulador de hardware).
- Dependiendo del producto que se quiera dosificar cargar un valor numérico en la caja de texto con la etiqueta de "Dosis de [producto elegido]" y luego hacer click en el botón que tenga la etiqueta de "Enviar + [producto elegido]".
- Esperar a que termine la dosificación.


*BUGS CONOCIDOS*


- El botón "conectado" queda seleccionado por mas que no se haya hecho la conexión con el puerto.
- Al hacer click en un botón y la caja de texto esta vacía no se informa al usuario de que se debe ingresar un valor en este.
- Luego de terminar la dosificación la sección que informa sobre el estado de los productos dosificados no se reinicia hasta ejecutar una nueva tarea. 


*ORGANIZACIÓN DE CARPETAS DEL REPOSITORIO*

**DOCS**: Documentación sobre Requerimientos, Pruebas , información sobre el proyecto, Diseño e implementación , entre otros.

**SRC**: Codigo fuente del proyecto en lenguaje java.

**ARDUINO_SRC**: Código fuente para el hardware de dosificación. 

**LIBS**: Librería externa necesaria para el funcionamiento de la aplicación.

**EJECUTABLES**: Archivos ejecutables de extensión .jar de distintas etapas del proyecto.
##Contenido##

**INTRODUCCION**

1. Propósito y alcance	          				          
Propósito de las prácticas de SCM				         
Herramientas de CM						        

2. ROLES DEL CM						                
Gestores de configuración del proyecto					
Responsabilidades de la gestión de configuraciones			

3. GESTION DEL CAMBIO							 
Alcance								  
In Core Releases and Customer modules					  
Technical CCB (Change Control Board)					  

4. IDENTIFICACION DE LAS CONFIGURACIONES					  

5. EQUIPOS DE TRABAJO							

6. CM DEL CODIGO FUENTE							 
Norma de Etiquetado							   
Esquema de ramas							  
Estrategias de Combianción						  


----------

 **INTRODUCCION**  

Propósito y alcance 
 
El objetivo de este documento es presentar la estrategia general para la Administración de Configuraciones del Proyecto IngSoft-2016-SoftDuino.
Este documento describe las actividades de gestión de configuración de software que deben ser llevadas a cabo durante el proceso de desarrollo del proyecto. Aquí se definen tanto los productos que se pondrán bajo control de configuración como los procedimientos que deben ser seguidos por los integrantes del equipo de trabajo.
Propósito de las prácticas de SCM
* Asegurar la consistencia en las prácticas de las actividades SCM
* Definir los cuerpos de autoridades para el soporte de las prácticas de SCM
* Mantener la integridad del producto a lo largo de su ciclo de vida
* Informar grupos e individuos afectados al estado del proyecto
* Crear un historial verificable de los estados de los productos en trabajo
* Mejora del proceso


Herramientas de CM  

 GitHub: Esta herramienta será utilizada tanto como para informes de estado del proyecto,  gestión de documentos y control de versiones de documentos, como también para seguimiento de defectos, reporte de defectos descubiertos y sus estados. La segunda función se realizará a través de la sección "Issues" de la herramienta en cuestión. También brinda la capacidad de generar ramas en el código fuente y fusionarlas para el desarrollo en paralelo.
La forma de acceso a la herramienta es a través de la siguiente dirección URL:
https://github.com/castrosoft/IngSoft-2016-SoftDuino

 TravisCI:  
 Herramienta de gestión de configuración utilizado por el software, hardware, y los grupos de ingeniería para el control de calidad de código fuente y entornos construidos. Las construcciones se activan automáticamente en función de los cambios en los repositorios.
La forma de acceso a la herramienta es a través de la siguiente dirección URL:
[https://travis-ci.org/ramirofd/Calculadora-SoftDuino-IS2016](http://https://travis-ci.org/ramirofd/Calculadora-SoftDuino-IS2016)


----------

**ROLES DEL CM**  

Gestores de configuración del proyecto:
   
Las actividades de gestión de las configuraciones dentro del proyecto IngSoft-2016-SoftDuino serán coordinadas por el Global Project Configuration Manager (GPCM), rol que será asignado a una persona. Adicionalmente se designará un GPCM sustituto. Dentro de cada equipo de trabajo habrá un Configuration Manager TPCM para coordinar y gestionar las configuraciones dentro del campo de trabajo del equipo.

  Global PCM: DETKE, Ramiro F.  Sustituto: CASTRO, Pedro O. 

Responsabilidades de la gestión de configuraciones:  

Rol/Responsabilidades GPCM:  * En general tiene las responsabilidades sobre todos los ítems de configuración.  
* Creación de ramas y administrar sus políticas.  
* Responsable de aplicar las etiquetas en la rama principal y derivadas.  
* Coordinar actividades de CM dentro del proyecto.  
* Asegurar la correcta ejecución del plan de CM.  
* Asistencia en actividades de fusión de ramas.  
* Actividades de compilación en la rama principal y derivadas.  
* Participación en auditorías.  
TPCM:  * Asistir en la creación de ramas y etiquetas.  
* Asistir en actividades de fusión a la rama principal.  
* Actividades de construcción en ramas de equipos específicos.  
* Asegurar la integridad y seguimiento del producto en los items de configuración adquiridos por       el equipo.  
* Participar en auditorias.   
* Analizar todas las investigaciones relacionadas al CM.  
Responsabilidades CM

----------

**CONTROL DE CAMBIOS**  

Alcance  
La gestión del cambio es un proceso que ocurre después que la documentación, código fuente o hardware del producto es identificado y aprobado. Los cambios incluyen cambios internos en el enfoque documentado original debido a la simulación o resultados de pruebas o peticiones externas de cambios en las características o funciones.
In Core Releases and Customer modules
Technical CCB (Change Control Board)
El T_CCB es un grupo de personas que asegura que cada cambio se considera adecuado por todas las partes y es autorizado antes de su aplicación. El T_CCB es responsable de aprobar, supervisar y controlar las solicitudes de cambio para establecer líneas de base de los elementos de configuración.
Los elementos para ser revisados por el T_CCB son los cambios provocados por el Coordinador de Emisión, la silla T_CCB u otros miembros T_CCB.
El alcance de trabajo será la de aprobar / rechazar los cambios necesarios en los planes, documentos y código. Las decisiones se tomarán sobre las acciones que deben tomarse en base al resultado de las actividades de aseguramiento de la calidad del producto y del estado del producto después de cada ciclo de pruebas.
Miembros
La siguiente tabla muestra los miembros del equipo que asisten a las reuniones técnicas CCB. 
Rol T_CCBNombreEngineering Manager - CCB Chair<Nombre>Release Manager - IssueCoordinator<Nombre>GPCM<Nombre>      Tabla 6 - Miembros de la Technical CCB
Frecuencia

Reuniones CCBFrecuenciaIngSoft-2016-SoftDuino  CCB1 vez por semanaTabla 7 - Frecuencia de reuniones de la T_CCB
Herramienta de Gestión de Cambio
Se utilizará la sección "Issues" de GitHub para recibir pedidos de cambio, organizar mediante prioridades y aceptar o no el cambio requerido.
Mapa del proceso de gestión de cambio













Consideraciones
El "IssueCoordinator" será el encargado de determinar si el CR es duplicado de otro CR, en cuyo caso será etiquetado como duplicado en la herramienta.
Si un CR ya fue discutido en la CCB, éste será automáticamente rechazado. Un CR será rechazado después de que los miembros CCB están de acuerdo.
Si se rechaza el CR, se deberá informar del motivo por el cual fue rechazado a través de la herramienta.




IDENTIFICACION DE LAS CONFIGURACIONES
El esquema de directorios debe seguir una estructura como la descrita por la siguiente imagen:

Para el esquema descrito se debe seguir como norma que:
* En la carpeta "Main" se almacenará todo lo relacionado con el propio funcionamiento de la aplicación, mientras que en la carpeta "Test"  contendrá todo lo necesario para realizar las pruebas de la aplicación.
* Las carpetas "java" contendrán los archivos .java, los cuales sus nombres deben ser algo que identifique el funcionamiento de las clases. Deberá respetarse que la primera letra de cada palabra que componga el nombre sea una mayúscula, para el caso de las clases que realizan pruebas el nombre debe finalizar con la palabra "Test".
* Las carpetas "resources" almacenarán cualquier recurso necesario para el funcionamiento de la aplicación y para realizar las pruebas sobre la misma. El nombre de los archivos deberá ser escrito todo en minúscula, si contiene más de una palabra, estas deberán separarse por guiones medios "-".







EQUIPOS DE TRABAJO
Desarrolladores: Son los encargados de implementar el código de la aplicación y nuevas funcionalidades en general, también deben dedicarse a detectar y corregir errores.
Investigadores de Necesidades Profesionales: Se encargan de realizar estudios sobre la comunidad de usuarios que utilizarán la aplicación para detectar potenciales necesidades que se podrían añadir o implementar en el proyecto para mejorar la calidad del software desarrollado.
Documentadores: Encargados de crear y mantener la documentación que se le entregará al usuario tales como manual de usuario, ayuda online, etc.
Gestores de Entrega (Releases): Se encargan de realizar todas las pruebas necesarias para asegurar que una versión cumpla con las condiciones de calidad para ser entregada a los clientes. En caso de encontrar alguna falla deberán notificar a los desarrolladores.
CM DEL CODIGO FUENTE
En esta sección se describen diferentes ítems de la gestión del código fuente. Cubre aspectos sobre el esquema de ramas, etiquetado, estrategias de fusión, entre otras.
Norma de Etiquetado
Para el etiquetado se respetará la forma X1.X2.X3 donde:
* X1 comienza en 1 y aumenta siempre y cuando se realice un gran aumento en la cantidad de funcionalidades de la aplicación.
* X2 comienza en 0 y aumenta según se agregan funcionalidades menores.
* X3 comienza en 0 y se aumentará según se corrigen bugs sobre esa versión.
Esquema de ramas
Hay una rama principal (master) la cual contendrá las versiones definitivas a partir de la cual se crearán ramas paralelas para el desarrollo del proyecto. Una vez implementado con éxito un cambio se fusionará la rama de trabajo con la principal. Cualquier desarrollador puede trabajar en cualquier rama y de ser necesario un desarrollador puede crear ramas privadas para trabajar sin afectar el desarrollo principal de la aplicación.










Estrategias de combinación

Se debe realizar la combinación solo cuando la funcionalidad esté lista para entregarse como release.
Releases, entregas e instalación
La entrega del release se hará mediante un CD con el instalador, manual de usuario y guía de ayuda para problemas. Para soporte e informes sobre problemas, podrá dirigirse a un link mediante el cual se seguirán los informes recibidos por los usuarios:
https://github.com/castrosoft/IngSoft-2016-SoftDuino/issues

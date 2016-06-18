<h1 style="text-align: center;">Contenido</h1>
<p>&nbsp;</p>

<p style="text-align: left;"><a href="#_Toc447898562">INTRODUCCION</a></p>
<p style="padding-left: 30px; text-align: left;"><a href="#_Toc447898563">Prop&oacute;sito y alcance</a></p>
<p style="padding-left: 30px; text-align: left;"><a href="#_Toc447898564">Prop&oacute;sito de las pr&aacute;cticas de SCM</a></p>
<p style="padding-left: 30px; text-align: left;"><a href="#_Toc447898565">Herramientas de CM</a></p>
<p style="text-align: left;"><a href="#_Toc447898566">ROLES DEL CM</a></p>
<p style="padding-left: 30px; text-align: left;"><a href="#_Toc447898567">Gestores de configuraci&oacute;n del proyecto</a></p>
<p style="padding-left: 30px; text-align: left;"><a href="#_Toc447898568">Responsabilidades de la gesti&oacute;n de configuraciones</a></p>
<p style="text-align: left;"><a href="#_Toc447898569">GESTION DEL CAMBIO</a></p>
<p style="padding-left: 30px; text-align: left;"><a href="#_Toc447898570">Alcance</a></p>
<p style="padding-left: 30px; text-align: left;"><a href="#_Toc447898571">In Core Releases and Customer modules</a></p>
<p style="padding-left: 30px; text-align: left;"><a href="#_Toc447898572">Technical CCB (Change Control Board) </a></p>
<p style="text-align: left;"><a href="#_Toc447898573">IDENTIFICACION DE LAS CONFIGURACIONES</a></p>
<p style="text-align: left;"><a href="#_Toc447898574">EQUIPOS DE TRABAJO</a></p>
<p style="text-align: left;"><a href="#_Toc447898575">CM DEL CODIGO FUENTE</a></p>
<p style="padding-left: 30px; text-align: left;"><a href="#_Toc447898576">Norma de Etiquetado</a></p>
<p style="padding-left: 30px; text-align: left;"><a href="#_Toc447898577">Esquema de ramas</a></p>
<p style="padding-left: 30px; text-align: left;"><a href="#Merge">Estrategias de Combinaci&oacute;n</a></p>
<p><span style="text-align: left; color: #0000ff;"><a href="#CONTROL DE ENTREGAS">CONTROL DE ENTREGAS </a></span></p>
<p style="padding-left: 30px;"><a href="#Releases">Releases, entregas e instalaci&oacute;n</a></p>

<h1><a name="_Toc447898562"></a>INTRODUCCION</h1>
<h2 style="padding-left: 60px;"><a name="_Toc447898563"></a>Prop&oacute;sito y alcance</h2>
<p>El objetivo de este documento es presentar la estrategia general para la Administraci&oacute;n de Configuraciones del Proyecto IngSoft-2016-SoftDuino.</p>
<p>Este documento describe las actividades de gesti&oacute;n de configuraci&oacute;n de software que deben ser llevadas a cabo durante el proceso de desarrollo del proyecto. Aqu&iacute; se definen tanto los productos que se pondr&aacute;n bajo control de configuraci&oacute;n como los procedimientos que deben ser seguidos por los integrantes del equipo de trabajo.</p>
<h2 style="padding-left: 60px;"><a name="_Toc447898564"></a>Prop&oacute;sito de las pr&aacute;cticas de SCM</h2>
<ul>
<li>Asegurar la consistencia en las pr&aacute;cticas de las actividades SCM</li>
<li>Definir los cuerpos de autoridades para el soporte de las pr&aacute;cticas de SCM</li>
<li>Mantener la integridad del producto a lo largo de su ciclo de vida</li>
<li>Informar grupos e individuos afectados al estado del proyecto</li>
<li>Crear un historial verificable de los estados de los productos en trabajo</li>
<li>Mejora del proceso</li>
</ul>
<p>&nbsp;</p>
<table class="tg" style="margin-left: auto; margin-right: auto;">
<tbody>
<tr><th class="tg-baqh">Acr&oacute;nimo</th><th class="tg-baqh">Descripcion</th></tr>
<tr>
<td class="tg-baqh">CCB</td>
<td class="tg-yw4l">(Configuration Control Board) Comit&eacute; de Control de Configuraci&oacute;n.</td>
</tr>
<tr>
<td class="tg-baqh">CI</td>
<td class="tg-yw4l">(Configuration Item) elemento bajo gesti&oacute;n de Configuraci&oacute;n.</td>
</tr>
<tr>
<td class="tg-baqh">SCA</td>
<td class="tg-yw4l">(Software Change Authorization) Autorizaci&oacute;n de Cambio en el Software.</td>
</tr>
<tr>
<td class="tg-baqh">SCM</td>
<td class="tg-yw4l">(Software Configuration Management) Gesti&oacute;n de Configuraci&oacute;n del Software.</td>
</tr>
<tr>
<td class="tg-baqh">SCMR</td>
<td class="tg-yw4l">(SCM Responsable) Responsable de SCM.</td>
</tr>
<tr>
<td class="tg-baqh">SCR</td>
<td class="tg-yw4l">(System/Software Change Request) Petici&oacute;n de Cambio en el Sistema/Software.</td>
</tr>
<tr>
<td class="tg-baqh">SQA</td>
<td class="tg-yw4l">(Software Quality Assurance) Aseguramiento de la Calidad del Software.</td>
</tr>
<tr>
<td class="tg-baqh">SQAR</td>
<td class="tg-yw4l">(SQA Responsable) Responsable de SQA.</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>
<h2 style="padding-left: 60px;"><a name="_Toc447898565"></a>Herramientas de CM</h2>
<ul>
<li>GitHub</li>
</ul>
<p>Esta herramienta ser&aacute; utilizada tanto como para informes de estado del proyecto, &nbsp;gesti&oacute;n de documentos y control de versiones de documentos, como tambi&eacute;n para seguimiento de defectos, reporte de defectos descubiertos y sus estados. La segunda funci&oacute;n se realizar&aacute; a trav&eacute;s de la secci&oacute;n "Issues" de la herramienta en cuesti&oacute;n. Tambi&eacute;n brinda la capacidad de generar ramas en el c&oacute;digo fuente y fusionarlas para el desarrollo en paralelo.</p>
<p>La forma de acceso a la herramienta es a trav&eacute;s de la siguiente direcci&oacute;n URL:</p>
<p><a href="https://github.com/castrosoft/IngSoft-2016-SoftDuino">https://github.com/castrosoft/IngSoft-2016-SoftDuino</a></p>
<ul>
<li>TravisCI</li>
</ul>
<p>&nbsp;Herramienta de gesti&oacute;n de configuraci&oacute;n utilizado por el software, hardware, y los grupos de ingenier&iacute;a para el control de calidad de c&oacute;digo fuente y entornos construidos. Las construcciones se activan autom&aacute;ticamente en funci&oacute;n de los cambios en los repositorios.</p>
<p>La forma de acceso a la herramienta es a trav&eacute;s de la siguiente direcci&oacute;n URL:</p>
<p><a href="https://travis-ci.org/castrosoft/IngSoft-2016-SoftDuino">https://travis-ci.org/castrosoft/IngSoft-2016-SoftDuino</a></p>
<p>&nbsp;</p>
<h1>&nbsp;&nbsp;<a name="_Toc447898566"></a>ROLES DEL CM</h1>
<h2 style="padding-left: 60px;"><a name="_Toc447898567"></a>Gestores de configuraci&oacute;n del proyecto</h2>
<p>Las actividades de gesti&oacute;n de las configuraciones dentro del proyecto IngSoft-2016-SoftDuino ser&aacute;n coordinadas por el Global Project Configuration Manager (GPCM), rol que ser&aacute; asignado a una persona. Adicionalmente se designar&aacute; un GPCM sustituto. Dentro de cada equipo de trabajo habr&aacute; un Configuration Manager TPCM para coordinar y gestionar las configuraciones dentro del campo de trabajo del equipo.</p>
<table style="margin-left: auto; margin-right: auto;">
<tbody>
<tr>
<td>
<p><strong>Rol</strong></p>
</td>
<td>
<p><strong>Primario</strong></p>
</td>
<td>
<p><strong>Sustituto</strong></p>
</td>
</tr>
<tr>
<td>
<p>Global PCM</p>
</td>
<td>
<p>DETKE, Ramiro F.</p>
</td>
<td>
<p>CASTRO, Pedro O.</p>
</td>
</tr>
<tr>
<td>
<p>Team PCM</p>
</td>
<td>
<p>&lt;Nombre&gt;</p>
</td>
<td>
<p>&lt;Nombre&gt;</p>
</td>
</tr>
</tbody>
</table>
<p style="text-align: center;">Tabla 4 - Roles CM</p>
<h2 style="padding-left: 60px;">&nbsp;<a name="_Toc447898568"></a>Responsabilidades de la gesti&oacute;n de configuraciones</h2>
<table style="margin-left: auto; margin-right: auto;">
<tbody>
<tr>
<td>
<p><strong>Rol</strong></p>
</td>
<td>
<p><strong>Responsabilidades</strong></p>
</td>
</tr>
<tr>
<td>
<p>GPCM</p>
</td>
<td>
<ul>
<li>En general tiene las responsabilidades sobre todos los &iacute;tems de configuraci&oacute;n.</li>
<li>Creaci&oacute;n de ramas y administrar sus pol&iacute;ticas.</li>
<li>Responsable de aplicar las etiquetas en la rama principal y derivadas.</li>
<li>Coordinar actividades de CM dentro del proyecto.</li>
<li>Asegurar la correcta ejecuci&oacute;n del plan de CM.</li>
<li>Asistencia en actividades de fusi&oacute;n de ramas.</li>
<li>Actividades de compilaci&oacute;n en la rama principal y derivadas.</li>
<li>Participaci&oacute;n en auditor&iacute;as.</li>
</ul>
</td>
</tr>
<tr>
<td>
<p>TPCM</p>
</td>
<td>
<ul>
<li>Asistir en la creaci&oacute;n de ramas y etiquetas.</li>
<li>Asistir en actividades de fusi&oacute;n a la rama principal.</li>
<li>Actividades de construcci&oacute;n en ramas de equipos espec&iacute;ficos.</li>
<li>Asegurar la integridad y seguimiento del producto en los items de configuraci&oacute;n adquiridos por el equipo.</li>
<li>Participar en auditorias.</li>
<li>Analizar todas las investigaciones relacionadas al CM.</li>
</ul>
</td>
</tr>
</tbody>
</table>
<p style="text-align: center;">Tabla 5 - Responsabilidades CM</p>
<p style="text-align: center;">&nbsp;</p>
<h1><a name="_Toc447898569"></a>GESTION DEL CAMBIO</h1>
<h2 style="padding-left: 60px;"><a name="_Toc447898570"></a>Alcance</h2>
<p>La gesti&oacute;n del cambio es un proceso que ocurre despu&eacute;s que la documentaci&oacute;n, c&oacute;digo fuente o hardware del producto es identificado y aprobado. Los cambios incluyen cambios internos en el enfoque documentado original debido a la simulaci&oacute;n o resultados de pruebas o peticiones externas de cambios en las caracter&iacute;sticas o funciones.</p>
<h2 style="padding-left: 60px;"><a name="_Toc447898571"></a>In Core Releases and Customer modules</h2>
<h3 style="text-align: center;"><a name="_Toc447898572"></a><span style="text-decoration: underline;">Technical CCB (Change Control Board)</span></h3>
<p>El T_CCB es un grupo de personas que asegura que cada cambio se considera adecuado por todas las partes y es autorizado antes de su aplicaci&oacute;n. El T_CCB es responsable de aprobar, supervisar y controlar las solicitudes de cambio para establecer l&iacute;neas de base de los elementos de configuraci&oacute;n.</p>
<p>Los elementos para ser revisados por el T_CCB son los cambios provocados por el Coordinador de Emisi&oacute;n, la silla T_CCB u otros miembros T_CCB.</p>
<p>El alcance de trabajo ser&aacute; la de aprobar / rechazar los cambios necesarios en los planes, documentos y c&oacute;digo. Las decisiones se tomar&aacute;n sobre las acciones que deben tomarse en base al resultado de las actividades de aseguramiento de la calidad del producto y del estado del producto despu&eacute;s de cada ciclo de pruebas.</p>
<h4 style="text-align: center;"><strong><em>Miembros</em></strong></h4>
<p style="text-align: center;">La siguiente tabla muestra los miembros del equipo que asisten a las reuniones t&eacute;cnicas CCB.</p>
<table style="margin-left: auto; margin-right: auto;">
<tbody>
<tr>
<td>
<p><strong>Rol T_CCB</strong></p>
</td>
<td>
<p><strong>Nombre</strong></p>
</td>
</tr>
<tr>
<td>
<p>Engineering Manager - CCB Chair</p>
</td>
<td>
<p>&lt;Nombre&gt;</p>
</td>
</tr>
<tr>
<td>
<p>Release Manager - IssueCoordinator</p>
</td>
<td>
<p>&lt;Nombre&gt;</p>
</td>
</tr>
<tr>
<td>
<p>GPCM</p>
</td>
<td>
<p>&lt;Nombre&gt;</p>
</td>
</tr>
</tbody>
</table>
<p><strong>&nbsp;</strong></p>
<h4 style="text-align: center;">Frecuencia</h4>
<table style="margin-left: auto; margin-right: auto;" width="413">
<tbody>
<tr>
<td>
<p><strong>Reuniones CCB</strong></p>
</td>
<td>
<p><strong>Frecuencia</strong></p>
</td>
</tr>
<tr>
<td>
<p>IngSoft-2016-SoftDuino &nbsp;CCB</p>
</td>
<td>
<p>1 vez por semana</p>
</td>
</tr>
</tbody>
</table>
<p><strong>&nbsp;</strong></p>
<h4>Herramienta de Gesti&oacute;n de Cambio</h4>
<p>Se utilizar&aacute; la secci&oacute;n "<em>Issues" </em>de GitHub para recibir pedidos de cambio, organizar mediante prioridades y aceptar o no el cambio requerido.</p>
<h4>Mapa del proceso de gesti&oacute;n de cambio</h4>

![](http://i.imgur.com/lJ1s3AA.jpg)

<h4>Consideraciones</h4>
<p>El "<em>IssueCoordinator" </em>ser&aacute; el encargado de determinar si el CR es duplicado de otro CR, en cuyo caso ser&aacute; etiquetado como duplicado en la herramienta.</p>
<p>Si un CR ya fue discutido en la CCB, &eacute;ste ser&aacute; autom&aacute;ticamente rechazado. Un CR ser&aacute; rechazado despu&eacute;s de que los miembros CCB est&aacute;n de acuerdo.</p>
<p>Si se rechaza el CR, se deber&aacute; informar del motivo por el cual fue rechazado a trav&eacute;s de la herramienta.</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<h1><a name="_Toc447898573"></a>IDENTIFICACION DE LAS CONFIGURACIONES</h1>
<p>&nbsp;</p>
<ul>
<li>En la carpeta "<em>Main"</em> se almacenar&aacute; todo lo relacionado con el propio funcionamiento de la aplicaci&oacute;n, mientras que en la carpeta <em>"Test"</em> contendr&aacute; todo lo necesario para realizar las pruebas de la aplicaci&oacute;n.</li>
<li>Las carpetas "<em>java"</em> contendr&aacute;n los archivos .java, los cuales sus nombres deben ser algo que identifique el funcionamiento de las clases. Deber&aacute; respetarse que la primera letra de cada palabra que componga el nombre sea una may&uacute;scula, para el caso de las clases que realizan pruebas el nombre debe finalizar con la palabra <em>"Test"</em>.</li>
<li>Las carpetas <em>"resources" </em>almacenar&aacute;n cualquier recurso necesario para el funcionamiento de la aplicaci&oacute;n y para realizar las pruebas sobre la misma. El nombre de los archivos deber&aacute; ser escrito todo en min&uacute;scula, si contiene m&aacute;s de una palabra, estas deber&aacute;n separarse por guiones medios <em>"-"</em>.</li>
<li>La carpeta "arduino_src" contendr&aacute; archivos de extension ".ino" que corresponden a las configuraciones que se implementan sobre la placa Arduino.</li>
<li>la carpeta "libs" contendr&aacute; las librerias externas de las cuales se sirva la aplicacion.</li>
</ul>
<p>&nbsp;</p>
<h1><a name="_Toc447898574"></a>EQUIPOS DE TRABAJO</h1>
<p style="padding-left: 60px;"><strong>Desarrolladores: </strong>Son los encargados de implementar el c&oacute;digo de la aplicaci&oacute;n y nuevas funcionalidades en general, tambi&eacute;n deben dedicarse a detectar y corregir errores.</p>
<p style="padding-left: 60px;"><strong>Investigadores de Necesidades Profesionales: </strong>Se encargan de realizar estudios sobre la comunidad de usuarios que utilizar&aacute;n la aplicaci&oacute;n para detectar potenciales necesidades que se podr&iacute;an a&ntilde;adir o implementar en el proyecto para mejorar la calidad del software desarrollado.</p>
<p style="padding-left: 60px;"><strong>Documentadores: </strong>Encargados de crear y mantener la documentaci&oacute;n que se le entregar&aacute; al usuario tales como manual de usuario, ayuda online, etc.</p>
<p style="padding-left: 60px;"><strong>Gestores de Entrega (Releases): </strong>Se encargan de realizar todas las pruebas necesarias para asegurar que una versi&oacute;n cumpla con las condiciones de calidad para ser entregada a los clientes. En caso de encontrar alguna falla deber&aacute;n notificar a los desarrolladores.</p>
<h1>&nbsp;</h1>
<h1><a name="_Toc447898575"></a>CM DEL CODIGO FUENTE</h1>
<p>En esta secci&oacute;n se describen diferentes &iacute;tems de la gesti&oacute;n del c&oacute;digo fuente. Cubre aspectos sobre el esquema de ramas, etiquetado, estrategias de fusi&oacute;n, entre otras.</p>
<h2 style="padding-left: 60px;"><a name="_Toc447898576"></a>Norma de Etiquetado</h2>
<p>Para el etiquetado se respetar&aacute; la forma X1.X2.X3 donde:</p>
<ul>
<li>X1 comienza en 0 y aumenta siempre y cuando se realice un gran aumento en la cantidad de funcionalidades de la aplicaci&oacute;n.</li>
<li>X2 comienza en 0 y aumenta seg&uacute;n se agregan funcionalidades menores.</li>
<li>X3 comienza en 0 y se aumentar&aacute; seg&uacute;n se corrigen bugs sobre esa versi&oacute;n.</li>
</ul>
<h2 style="padding-left: 60px;"><a name="_Toc447898577"></a>Esquema de ramas</h2>
<p>Hay una rama principal (<em>master</em>) la cual contendr&aacute; las versiones definitivas a partir de la cual se crear&aacute;n ramas paralelas para el desarrollo del proyecto. Una vez implementado con &eacute;xito un cambio se fusionar&aacute; la rama de trabajo con la principal. Cualquier desarrollador puede trabajar en cualquier rama y de ser necesario un desarrollador puede crear ramas privadas para trabajar sin afectar el desarrollo principal de la aplicaci&oacute;n.</p>

![](http://i.imgur.com/6CcTqaj.png)

<p>&nbsp;</p>
<h2 style="padding-left: 60px;"><a id="Merge"></a>Estrategias de combinaci&oacute;n</h2>

![](http://i.imgur.com/NltFR2X.jpg)

<p>Se debe realizar la combinaci&oacute;n solo cuando la funcionalidad est&eacute; lista para entregarse como release.</p>
<h1>&nbsp;</h1>
<h1><a id="CONTROL DE ENTREGAS"></a>CONTROL DE ENTREGAS</h1>
<h2 style="padding-left: 60px;"><a id="Releases"></a>Releases, entregas e instalaci&oacute;n</h2>

La entrega del release se hará mediante un CD con el instalador, manual de usuario y guía de ayuda para problemas.
<p><br />Los archivos ser&aacute;n comprimidos en formato *.zip&nbsp; y enviados por email<br />a <a href="mailto:martinmiceli@gmail.com">martinmiceli@gmail.com</a>,&nbsp;<a href="mailto:noninojulian@gmail.com">noninojulian@gmail.com</a> <br />Los archivos a entregar son:<br />- Informe.<br />- Presentaci&oacute;n.<br />- Ejecutables (JARs) <br />- Direccion de acceso al repositorio.</p>
<p>Para soporte e informes sobre problemas, podr&aacute; dirigirse a un link mediante el cual se seguir&aacute;n los informes recibidos por los usuarios:</p>
<p><a href="https://github.com/castrosoft/IngSoft-2016-SoftDuino/issues">https://github.com/castrosoft/IngSoft-2016-SoftDuino/issues</a></p>
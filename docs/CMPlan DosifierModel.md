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
<p style="padding-left: 30px; text-align: left;"><a href="#_Toc447898578">Estrategias de Combianci&oacute;n<br /></a></p>
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


<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;margin:0px auto;}
.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
.tg .tg-baqh{text-align:center;vertical-align:top}
.tg .tg-yw4l{vertical-align:top}
</style>
<table class="tg">
  <tr>
    <th class="tg-baqh">Acrónimo</th>
    <th class="tg-baqh">Descripcion</th>
  </tr>
  <tr>
    <td class="tg-baqh">CCB</td>
    <td class="tg-yw4l">(Configuration Control Board) Comité de Control de Configuración.</td>
  </tr>
  <tr>
    <td class="tg-baqh">CI</td>
    <td class="tg-yw4l">(Configuration Item) elemento bajo gestión de Configuración.</td>
  </tr>
  <tr>
    <td class="tg-baqh">SCA</td>
    <td class="tg-yw4l">(Software Change Authorization) Autorización de Cambio en el  Software.</td>
  </tr>
  <tr>
    <td class="tg-baqh">SCM</td>
    <td class="tg-yw4l">(Software Configuration Management) Gestión de Configuración del Software.</td>
  </tr>
  <tr>
    <td class="tg-baqh">SCMR</td>
    <td class="tg-yw4l">(SCM Responsable) Responsable de SCM.</td>
  </tr>
  <tr>
    <td class="tg-baqh">SCR</td>
    <td class="tg-yw4l">(System/Software Change Request) Petición de Cambio en el Sistema/Software.</td>
  </tr>
  <tr>
    <td class="tg-baqh">SQA</td>
    <td class="tg-yw4l">(Software Quality Assurance) Aseguramiento de la Calidad del Software.</td>
  </tr>
  <tr>
    <td class="tg-baqh">SQAR</td>
    <td class="tg-yw4l">(SQA Responsable) Responsable de SQA.</td>
  </tr>
</table>
<p>&nbsp; </p>


<h2 style="padding-left: 60px;"><a name="_Toc447898565"></a>Herramientas de CM</h2>
<ul>
<li>GitHub</li>
</ul>
<p>Esta herramienta ser&aacute; utilizada tanto como para informes de estado del proyecto, &nbsp;gesti&oacute;n de documentos y control de versiones de documentos, como tambi&eacute;n para seguimiento de defectos, reporte de defectos descubiertos y sus estados. La segunda funci&oacute;n se realizar&aacute; a trav&eacute;s de la secci&oacute;n "Issues" de la herramienta en cuesti&oacute;n. Tambi&eacute;n brinda la capacidad de generar ramas en el c&oacute;digo fuente y fusionarlas para el desarrollo en paralelo.</p>
<p>La forma de acceso a la herramienta es a trav&eacute;s de la siguiente direcci&oacute;n URL:</p>
<p><a href="Contenido INTRODUCCION	2 Prop&oacute;sito y alcance	2 Prop&oacute;sito de las pr&aacute;cticas de SCM	2 Herramientas de CM	3 ROLES DEL CM	4 Gestores de configuraci&oacute;n del proyecto	4 Responsabilidades de la gesti&oacute;n de configuraciones	4 GESTION DEL CAMBIO	5 Alcance	5 In Core Releases and Customer modules	5 Technical CCB (Change Control Board)	5 IDENTIFICACION DE LAS CONFIGURACIONES	7 EQUIPOS DE TRABAJO	8 CM DEL CODIGO FUENTE	8 Norma de Etiquetado	8 Esquema de ramas	9 Estrategias de Combianci&oacute;n	9               INTRODUCCION Prop&oacute;sito y alcance El objetivo de este documento es presentar la estrategia general para la Administraci&oacute;n de Configuraciones del Proyecto IngSoft-2016-SoftDuino. Este documento describe las actividades de gesti&oacute;n de configuraci&oacute;n de software que deben ser llevadas a cabo durante el proceso de desarrollo del proyecto. Aqu&iacute; se definen tanto los productos que se pondr&aacute;n bajo control de configuraci&oacute;n como los procedimientos que deben ser seguidos por los integrantes del equipo de trabajo. Prop&oacute;sito de las pr&aacute;cticas de SCM &bull;	Asegurar la consistencia en las pr&aacute;cticas de las actividades SCM &bull;	Definir los cuerpos de autoridades para el soporte de las pr&aacute;cticas de SCM &bull;	Mantener la integridad del producto a lo largo de su ciclo de vida &bull;	Informar grupos e individuos afectados al estado del proyecto &bull;	Crear un historial verificable de los estados de los productos en trabajo &bull;	Mejora del proceso  Acr&oacute;nimo	Descripcion CCB	(Configuration Control Board) Comit&eacute; de Control de Configuraci&oacute;n. CI 	(Configuration Item) elemento bajo gesti&oacute;n de Configuraci&oacute;n. SCA 	(Software Change Authorization) Autorizaci&oacute;n de Cambio en el  Software. SCM 	(Software Configuration Management) Gesti&oacute;n de Configuraci&oacute;n del Software. SCMR 	(SCM Responsable) Responsable de SCM. SCR 	(System/Software Change Request) Petici&oacute;n de Cambio en el Sistema/Software. SQA 	(Software Quality Assurance) Aseguramiento de la Calidad del Software. SQAR 	(SQA Responsable) Responsable de SQA.      Herramientas de CM &bull;	GitHub Esta herramienta ser&aacute; utilizada tanto como para informes de estado del proyecto,  gesti&oacute;n de documentos y control de versiones de documentos, como tambi&eacute;n para seguimiento de defectos, reporte de defectos descubiertos y sus estados. La segunda funci&oacute;n se realizar&aacute; a trav&eacute;s de la secci&oacute;n &quot;Issues&quot; de la herramienta en cuesti&oacute;n. Tambi&eacute;n brinda la capacidad de generar ramas en el c&oacute;digo fuente y fusionarlas para el desarrollo en paralelo. La forma de acceso a la herramienta es a trav&eacute;s de la siguiente direcci&oacute;n URL: https://github.com/castrosoft/IngSoft-2016-SoftDuino &bull;	TravisCI  Herramienta de gesti&oacute;n de configuraci&oacute;n utilizado por el software, hardware, y los grupos de ingenier&iacute;a para el control de calidad de c&oacute;digo fuente y entornos construidos. Las construcciones se activan autom&aacute;ticamente en funci&oacute;n de los cambios en los repositorios. La forma de acceso a la herramienta es a trav&eacute;s de la siguiente direcci&oacute;n URL: https://travis-ci.org/ramirofd/Calculadora-SoftDuino-IS2016 &bull;	Google Drive Herramienta para el desarrollo paralelo de informes. El pedido de permiso para la edici&oacute;n de documentos se realiza a trav&eacute;s de la misma herramienta. La forma de acceso a la herramienta es a trav&eacute;s de la siguiente direcci&oacute;n URL: https://drive.google.com/open?id=0B36ICj5fHBkRejlwTnhqRDFjNkk          ROLES DEL CM Gestores de configuraci&oacute;n del proyecto Las actividades de gesti&oacute;n de las configuraciones dentro del proyecto IngSoft-2016-SoftDuino ser&aacute;n coordinadas por el Global Project Configuration Manager (GPCM), rol que ser&aacute; asignado a una persona. Adicionalmente se designar&aacute; un GPCM sustituto. Dentro de cada equipo de trabajo habr&aacute; un Configuration Manager TPCM para coordinar y gestionar las configuraciones dentro del campo de trabajo del equipo. Rol	Primario	Sustituto Global PCM	DETKE, Ramiro F.	CASTRO, Pedro O. Team PCM	&lt;Nombre&gt;	&lt;Nombre&gt; Tabla 4 - Roles CM  Responsabilidades de la gesti&oacute;n de configuraciones Rol	Responsabilidades GPCM	&bull;	En general tiene las responsabilidades sobre todos los &iacute;tems de configuraci&oacute;n. &bull;	Creaci&oacute;n de ramas y administrar sus pol&iacute;ticas. &bull;	Responsable de aplicar las etiquetas en la rama principal y derivadas. &bull;	Coordinar actividades de CM dentro del proyecto. &bull;	Asegurar la correcta ejecuci&oacute;n del plan de CM. &bull;	Asistencia en actividades de fusi&oacute;n de ramas. &bull;	Actividades de compilaci&oacute;n en la rama principal y derivadas. &bull;	Participaci&oacute;n en auditor&iacute;as. TPCM	&bull;	Asistir en la creaci&oacute;n de ramas y etiquetas. &bull;	Asistir en actividades de fusi&oacute;n a la rama principal. &bull;	Actividades de construcci&oacute;n en ramas de equipos espec&iacute;ficos. &bull;	Asegurar la integridad y seguimiento del producto en los items de configuraci&oacute;n adquiridos por el equipo. &bull;	Participar en auditorias.  &bull;	Analizar todas las investigaciones relacionadas al CM. Tabla 5 - Responsabilidades CM GESTION DEL CAMBIO Alcance La gesti&oacute;n del cambio es un proceso que ocurre despu&eacute;s que la documentaci&oacute;n, c&oacute;digo fuente o hardware del producto es identificado y aprobado. Los cambios incluyen cambios internos en el enfoque documentado original debido a la simulaci&oacute;n o resultados de pruebas o peticiones externas de cambios en las caracter&iacute;sticas o funciones. In Core Releases and Customer modules Technical CCB (Change Control Board) El T_CCB es un grupo de personas que asegura que cada cambio se considera adecuado por todas las partes y es autorizado antes de su aplicaci&oacute;n. El T_CCB es responsable de aprobar, supervisar y controlar las solicitudes de cambio para establecer l&iacute;neas de base de los elementos de configuraci&oacute;n. Los elementos para ser revisados por el T_CCB son los cambios provocados por el Coordinador de Emisi&oacute;n, la silla T_CCB u otros miembros T_CCB. El alcance de trabajo ser&aacute; la de aprobar / rechazar los cambios necesarios en los planes, documentos y c&oacute;digo. Las decisiones se tomar&aacute;n sobre las acciones que deben tomarse en base al resultado de las actividades de aseguramiento de la calidad del producto y del estado del producto despu&eacute;s de cada ciclo de pruebas. Miembros La siguiente tabla muestra los miembros del equipo que asisten a las reuniones t&eacute;cnicas CCB.  Rol T_CCB	Nombre Engineering Manager - CCB Chair	&lt;Nombre&gt; Release Manager - IssueCoordinator	&lt;Nombre&gt; GPCM	&lt;Nombre&gt; Tabla 6 - Miembros de la Technical CCB Frecuencia  Reuniones CCB	Frecuencia IngSoft-2016-SoftDuino  CCB	1 vez por semana Tabla 7 - Frecuencia de reuniones de la T_CCB Herramienta de Gesti&oacute;n de Cambio Se utilizar&aacute; la secci&oacute;n &quot;Issues&quot; de GitHub para recibir pedidos de cambio, organizar mediante prioridades y aceptar o no el cambio requerido. Mapa del proceso de gesti&oacute;n de cambio              Consideraciones El &quot;IssueCoordinator&quot; ser&aacute; el encargado de determinar si el CR es duplicado de otro CR, en cuyo caso ser&aacute; etiquetado como duplicado en la herramienta. Si un CR ya fue discutido en la CCB, &eacute;ste ser&aacute; autom&aacute;ticamente rechazado. Un CR ser&aacute; rechazado despu&eacute;s de que los miembros CCB est&aacute;n de acuerdo. Si se rechaza el CR, se deber&aacute; informar del motivo por el cual fue rechazado a trav&eacute;s de la herramienta.     IDENTIFICACION DE LAS CONFIGURACIONES El esquema de directorios debe seguir una estructura como la descrita por la siguiente imagen:   Para el esquema descrito se debe seguir como norma que: &bull;	En la carpeta &quot;Main&quot; se almacenar&aacute; todo lo relacionado con el propio funcionamiento de la aplicaci&oacute;n, mientras que en la carpeta &quot;Test&quot;  contendr&aacute; todo lo necesario para realizar las pruebas de la aplicaci&oacute;n. &bull;	Las carpetas &quot;java&quot; contendr&aacute;n los archivos .java, los cuales sus nombres deben ser algo que identifique el funcionamiento de las clases. Deber&aacute; respetarse que la primera letra de cada palabra que componga el nombre sea una may&uacute;scula, para el caso de las clases que realizan pruebas el nombre debe finalizar con la palabra &quot;Test&quot;. &bull;	Las carpetas &quot;resources&quot; almacenar&aacute;n cualquier recurso necesario para el funcionamiento de la aplicaci&oacute;n y para realizar las pruebas sobre la misma. El nombre de los archivos deber&aacute; ser escrito todo en min&uacute;scula, si contiene m&aacute;s de una palabra, estas deber&aacute;n separarse por guiones medios &quot;-&quot;.        EQUIPOS DE TRABAJO Desarrolladores: Son los encargados de implementar el c&oacute;digo de la aplicaci&oacute;n y nuevas funcionalidades en general, tambi&eacute;n deben dedicarse a detectar y corregir errores. Investigadores de Necesidades Profesionales: Se encargan de realizar estudios sobre la comunidad de usuarios que utilizar&aacute;n la aplicaci&oacute;n para detectar potenciales necesidades que se podr&iacute;an a&ntilde;adir o implementar en el proyecto para mejorar la calidad del software desarrollado. Documentadores: Encargados de crear y mantener la documentaci&oacute;n que se le entregar&aacute; al usuario tales como manual de usuario, ayuda online, etc. Gestores de Entrega (Releases): Se encargan de realizar todas las pruebas necesarias para asegurar que una versi&oacute;n cumpla con las condiciones de calidad para ser entregada a los clientes. En caso de encontrar alguna falla deber&aacute;n notificar a los desarrolladores. CM DEL CODIGO FUENTE En esta secci&oacute;n se describen diferentes &iacute;tems de la gesti&oacute;n del c&oacute;digo fuente. Cubre aspectos sobre el esquema de ramas, etiquetado, estrategias de fusi&oacute;n, entre otras. Norma de Etiquetado Para el etiquetado se respetar&aacute; la forma X1.X2.X3 donde: &bull;	X1 comienza en 1 y aumenta siempre y cuando se realice un gran aumento en la cantidad de funcionalidades de la aplicaci&oacute;n. &bull;	X2 comienza en 0 y aumenta seg&uacute;n se agregan funcionalidades menores. &bull;	X3 comienza en 0 y se aumentar&aacute; seg&uacute;n se corrigen bugs sobre esa versi&oacute;n. Esquema de ramas Hay una rama principal (master) la cual contendr&aacute; las versiones definitivas a partir de la cual se crear&aacute;n ramas paralelas para el desarrollo del proyecto. Una vez implementado con &eacute;xito un cambio se fusionar&aacute; la rama de trabajo con la principal. Cualquier desarrollador puede trabajar en cualquier rama y de ser necesario un desarrollador puede crear ramas privadas para trabajar sin afectar el desarrollo principal de la aplicaci&oacute;n.           Estrategias de combinaci&oacute;n   Se debe realizar la combinaci&oacute;n solo cuando la funcionalidad est&eacute; lista para entregarse como release. Releases, entregas e instalaci&oacute;n La entrega del release se har&aacute; mediante un CD con el instalador, manual de usuario y gu&iacute;a de ayuda para problemas. Para soporte e informes sobre problemas, podr&aacute; dirigirse a un link mediante el cual se seguir&aacute;n los informes recibidos por los usuarios: https://github.com/castrosoft/IngSoft-2016-SoftDuino">https://github.com/castrosoft/IngSoft-2016-SoftDuino</a></p>
<ul>
<li>TravisCI</li>
</ul>
<p>&nbsp;Herramienta de gesti&oacute;n de configuraci&oacute;n utilizado por el software, hardware, y los grupos de ingenier&iacute;a para el control de calidad de c&oacute;digo fuente y entornos construidos. Las construcciones se activan autom&aacute;ticamente en funci&oacute;n de los cambios en los repositorios.</p>
<p>La forma de acceso a la herramienta es a trav&eacute;s de la siguiente direcci&oacute;n URL:</p>
<p><a href="https://travis-ci.org">&lt;direccion de TRAVIS CI aqu&iacute;&gt;</a></p>
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
<h4 style="text-align: center;">Frecuencia </h4>
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
<p><img src="&lt;a href='http://postimg.org/image/mro249u17/' target='_blank'&gt;&lt;img src='http://s33.postimg.org/mro249u17/mapa_de_CR.jpg' border='0' alt=&quot;mapa de CR&quot; /&gt;&lt;/a&gt;" alt="" /></p>
<p>&nbsp; </p>
<h4>Consideraciones</h4>
<p>El "<em>IssueCoordinator" </em>ser&aacute; el encargado de determinar si el CR es duplicado de otro CR, en cuyo caso ser&aacute; etiquetado como duplicado en la herramienta.</p>
<p>Si un CR ya fue discutido en la CCB, &eacute;ste ser&aacute; autom&aacute;ticamente rechazado. Un CR ser&aacute; rechazado despu&eacute;s de que los miembros CCB est&aacute;n de acuerdo.</p>
<p>Si se rechaza el CR, se deber&aacute; informar del motivo por el cual fue rechazado a trav&eacute;s de la herramienta.</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<h1><a name="_Toc447898573"></a>IDENTIFICACION DE LAS CONFIGURACIONES</h1>
<p><span style="background-color: #ffff99;">El esquema de directorios debe seguir una estructura como la descrita por la siguiente imagen:</span></p>
<p>&nbsp;</p>
<p>Para el esquema descrito se debe seguir como norma que:</p>
<ul>
<li>En la carpeta "<em>Main"</em> se almacenar&aacute; todo lo relacionado con el propio funcionamiento de la aplicaci&oacute;n, mientras que en la carpeta <em>"Test"</em> contendr&aacute; todo lo necesario para realizar las pruebas de la aplicaci&oacute;n.</li>
<li>Las carpetas "<em>java"</em> contendr&aacute;n los archivos .java, los cuales sus nombres deben ser algo que identifique el funcionamiento de las clases. Deber&aacute; respetarse que la primera letra de cada palabra que componga el nombre sea una may&uacute;scula, para el caso de las clases que realizan pruebas el nombre debe finalizar con la palabra <em>"Test"</em>.</li>
<li>Las carpetas <em>"resources" </em>almacenar&aacute;n cualquier recurso necesario para el funcionamiento de la aplicaci&oacute;n y para realizar las pruebas sobre la misma. El nombre de los archivos deber&aacute; ser escrito todo en min&uacute;scula, si contiene m&aacute;s de una palabra, estas deber&aacute;n separarse por guiones medios <em>"-"</em>.</li>
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
<li>X1 comienza en 1 y aumenta siempre y cuando se realice un gran aumento en la cantidad de funcionalidades de la aplicaci&oacute;n.</li>
<li>X2 comienza en 0 y aumenta seg&uacute;n se agregan funcionalidades menores.</li>
<li>X3 comienza en 0 y se aumentar&aacute; seg&uacute;n se corrigen bugs sobre esa versi&oacute;n.</li>
</ul>
<h2 style="padding-left: 60px;"><a name="_Toc447898577"></a>Esquema de ramas</h2>
<p>Hay una rama principal (<em>master</em>) la cual contendr&aacute; las versiones definitivas a partir de la cual se crear&aacute;n ramas paralelas para el desarrollo del proyecto. Una vez implementado con &eacute;xito un cambio se fusionar&aacute; la rama de trabajo con la principal. Cualquier desarrollador puede trabajar en cualquier rama y de ser necesario un desarrollador puede crear ramas privadas para trabajar sin afectar el desarrollo principal de la aplicaci&oacute;n.</p>
<p>&nbsp; </p>
<h2 style="padding-left: 60px;">Estrategias de combinaci&oacute;n</h2>
<p>Se debe realizar la combinaci&oacute;n solo cuando la funcionalidad est&eacute; lista para entregarse como release.</p>
<h2 style="padding-left: 60px;">&nbsp;</h2>
<h2 style="padding-left: 60px;">Releases, entregas e instalaci&oacute;n</h2>
<p>La entrega del release se har&aacute; mediante un CD con el instalador, manual de usuario y gu&iacute;a de ayuda para problemas. Para soporte e informes sobre problemas, podr&aacute; dirigirse a un link mediante el cual se seguir&aacute;n los informes recibidos por los usuarios:</p>
<p><a href="https://github.com/castrosoft/IngSoft-2016-SoftDuino/issues">https://github.com/castrosoft/IngSoft-2016-SoftDuino/issues</a></p>
<h1><strong>Especificaci&oacute;n de Requerimientos</strong></h1>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
## <p><strong>Sistema Dosificador </strong></p> ##
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p><strong>&nbsp;</strong></p>
<p><strong>Presentado a:</strong></p>
<p>C&aacute;tedra de Ingenier&iacute;a de Software, UNC (Universidad Nacional de C&oacute;rdoba)</p>
<p>&nbsp;</p>
<p><strong>Presentado por:</strong></p>
<p>Castro Pedro, Detke Ramiro</p>
<p>&nbsp;</p>
<p><strong>Fecha de Presentacion:</strong></p>
<p>Junio 19, 2016</p>
<p>&nbsp;</p>
<hr />
<p>&nbsp;</p>
<p>&nbsp;</p>
<h1 style="text-align: center;">Contenido</h1>
<p>&nbsp;</p>
<ol>
<li><strong><a href="#Intro">Introducci&oacute;n</a></strong></li>
<li><a href="##2%20Descripcion"><strong>Descripci&oacute;n general</strong></a></li>
<li><strong><a href="##3 Restricciones Generales">Restricciones generales</a></strong></li>
<li><strong><a href="##4 Sup &amp; Dep">Supuestos y dependencias</a></strong></li>
<li><a href="##5%20Lista Reqs"><strong>Lista de requerimientos</strong></a></li>
<li><strong><a href="##6 Detalle de Reqs">Detalle de los requerimientos</a></strong></li>
<li><strong><a href="##6 Detalle de Reqs">Requerimientos externos</a></strong></li>
<li><strong><a href="##8 Restricciones Generales">Restricciones generales de dise&ntilde;o</a></strong></li>
</ol>
<p>&nbsp;</p>
<p>&nbsp;</p>
<hr />
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<ol>
<li>
<h2><a id="Intro"></a>Introducci&oacute;n</h2>
</li>
</ol>
<ul>
<li>Prop&oacute;sito</li>
<li>Alcance</li>
<li>Definiciones, acr&oacute;nimos y abreviaciones</li>
<li>Referencias</li>
<li>Visi&oacute;n global</li>
</ul>
<p>&nbsp;</p>
<ol start="2">
<li>
<h2><a id="#2 Descripcion"></a>Descripci&oacute;n general</h2>
</li>
</ol>
<ul>
<li>Funciones del sistema</li>
<li>Caracter&iacute;sticas de los usuarios</li>
</ul>
<p>&nbsp;</p>
<ol start="3">
<li>
<h2><a id="#3 Restricciones Generales"></a>Restricciones generales</h2>
</li>
</ol>
<p>Limitaciones del software:</p>
<p>&nbsp;</p>
<p>Limitaciones del Hardware:</p>
<p>&nbsp;</p>
<ol start="4">
<li>
<h2><a id="#4 Sup &amp; Dep"></a>Supuestos y dependencias</h2>
</li>
</ol>
<p>&nbsp;</p>
<ol start="5">
<li>
<h2><a id="#5 Lista Reqs"></a>Lista de requerimientos</h2>
</li>
</ol>
<p>&nbsp;</p>
<p>Esta secci&oacute;n contiene un listado de todos los requerimientos para el Sistema Dosificador. Cada requerimiento tiene un nombre que lo identifica, as&iacute; como tambi&eacute;n posee una breve descripci&oacute;n del mismo.</p>
<p>&nbsp;</p>
<ul>
<li><em>Dosificar Cloro:</em>La aplicaci&oacute;n deber&aacute; enviar la cantidad de dosis de cloro (en medida de unidad entera) al sistema dosificador para que este agregue el producto a la piscina.</li>
<li><em>Dosificar PH:</em>La aplicaci&oacute;n deber&aacute; enviar la cantidad de dosis de ph (en medida de unidad entera) al sistema dosificador para que este agregue el producto a la piscina.</li>
<li><em>Dosificaci&oacute;n diaria:</em>La aplicaci&oacute;n deber&aacute; indicar al sistema dosificador que realice el proceso de dosificaci&oacute;n diaria (10 de cloro, 7 de ph, 5 de alguicida y 3 de clarificante).</li>
<li><em>Mostrar informaci&oacute;n:</em>La aplicaci&oacute;n deber&aacute; permitir al usuario conocer en qu&eacute; estado del proceso de dosificaci&oacute;n de producto (cualquiera sea) se encuentra el sistema</li>
</ul>
<h2>&nbsp;</h2>
<ol start="6">
<li>
<h2><a id="#6 Detalle de Reqs"></a>Detalle de los requerimientos</h2>
</li>
</ol>
<p><em><strong>Dosificar Cloro:</strong></em><strong>&nbsp;</strong></p>
<table>
<tbody>
<tr>
<td width="299">
<p>Descripci&oacute;n</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>La aplicaci&oacute;n debe permitir al usuario ingresar un n&uacute;mero natural que representa la dosis deseada de cloro.</p>
</td>
</tr>
<tr>
<td width="299">
<p>Entradas</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>El usuario deber&aacute; introducir el n&uacute;mero (dosis deseada), en un campo de texto que ya es proporcionado por la GUI de la aplicaci&oacute;n DJTestDrive.</p>
</td>
</tr>
<tr>
<td width="299">
<p>Visualizaci&oacute;n</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>La aplicaci&oacute;n deber&aacute; mostrar en un campo de texto el n&uacute;mero que se est&aacute; intentando ingresar y un bot&oacute;n debidamente etiquetado &ldquo;Dosis Cloro&rdquo;, el cual al ser presionado iniciar&aacute; el proceso correspondiente.</p>
</td>
</tr>
<tr>
<td width="299">
<p>Proceso del sistema</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Salida del sistema</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Restricciones</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Madejo de la informaci&oacute;n</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>
<p><strong>&nbsp;</strong></p>
<p><em><strong>Dosificar PH:</strong></em><strong>&nbsp;</strong></p>
<table>
<tbody>
<tr>
<td width="299">
<p>Descripci&oacute;n</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Entradas</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Visualizaci&oacute;n</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Proceso del sistema</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Salida del sistema</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Restricciones</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Madejo de la informaci&oacute;n</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>
<p><em><strong>Dosificaci&oacute;n Diaria:</strong></em><strong>&nbsp;</strong></p>
<table>
<tbody>
<tr>
<td width="299">
<p>Descripci&oacute;n</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Entradas</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Visualizaci&oacute;n</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Proceso del sistema</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Salida del sistema</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Restricciones</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Madejo de la informaci&oacute;n</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>
<p><em><strong>Mostrar informaci&oacute;n:</strong></em></p>
<table>
<tbody>
<tr>
<td width="299">
<p>Descripci&oacute;n</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Entradas</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Visualizaci&oacute;n</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Proceso del sistema</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Salida del sistema</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Restricciones</p>
<p>&nbsp;</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="299">
<p>Madejo de la informaci&oacute;n</p>
</td>
<td width="299">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>
<ol start="7">
<li>
<h2><a id="#7 External Reqs"></a>Requerimientos externos</h2>
</li>
</ol>
<p>Esta secci&oacute;n describir&aacute; los requerimientos externos al Sistema Dosificador. Estos requerimientos especifican el modo en el que el usuario deber&aacute; interactuar con la aplicaci&oacute;n asi como definen &nbsp;los perif&eacute;ricos de hardware y de comunicaci&oacute;n requeridos por el software para almacenar y recuperar datos.</p>
<ul>
<li>Interfaces de usuario:</li>
<li>Interfaces de Hardware:</li>
<li>Interfaces de Software:</li>
<li>Interfaces de comunicaci&oacute;n:</li>
</ul>
<p>&nbsp;</p>
<ol start="8">
<li>
<h2><a id="#8 Restricciones Generales"></a>Restricciones generales de dise&ntilde;o.</h2>
</li>
</ol>
<p>El cliente requiere un Sistema Dosificador que pueda llevar a cabo las funciones detalladas en la lista de requerimientos y que pueda reutilizar la vista original (GUI) de la aplicaci&oacute;n DJTestDrive. Eventualmente se crear&aacute; una nueva vista (GUI) espec&iacute;fica para la aplicaci&oacute;n.</p>
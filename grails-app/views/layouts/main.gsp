<!DOCTYPE html>
<html lang="en">
   <head>        	  
      <r:require modules="bootstrap, custom, jquerygrails"/>      
      <g:layoutTitle/>
      <r:layoutResources/>
   </head>
   <body>
   <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<<g:link class="navbar-brand" action="index" controller="note" params="[code: params.code]"><g:message code="default.menu.mycloudnotes" /></g:link>					
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="https://github.com/rpeleias/cloudnotes" target="_blank"><g:message code="default.menu.sourcecode" /></a></li>	
					<li><g:link action="contact" controller="contact" params="[code: params.code]"><g:message code="default.menu.contactme" /></g:link></li>			
				</ul>
			</div>
		</div>
	</div>
	<div class="jumbotron">
		<g:layoutBody/>
        <r:layoutResources/>
	</div>     
   </body>

   <footer>
		<p><g:message code="default.pageFooter" /></p>
	</footer>
</html>
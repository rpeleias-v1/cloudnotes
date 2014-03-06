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
				<a class="navbar-brand" href="#">Cloud Notes</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="https://github.com/rpeleias/cloudnotes" target="_blank">Source Code</a></li>	
					<li><g:link action="contact" controller="contact" params="[code: params.code]">Contact Me</g:link></li>			
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
		<p>Developed and mantained by @rpeleias. All rigths reserved.</p>
	</footer>
</html>
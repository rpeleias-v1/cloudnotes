<html>
   <head>
      <meta name="layout" content="main"/>
      <r:require modules="bootstrap, custom"/>
   </head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Cloud Notes</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="#">Source Code</a></li>	
					<li><a href="#">Contact Me</a></li>			
				</ul>
			</div>
		</div>
	</div>
	<div class="jumbotron">
		<div class="starter-template" style="float:center;">
			<h2> Type your notes below:</h2>
			<p>Type everything you want. Access anywhere. Always get it!</p>
			<div class="input-group ">			
				<g:textArea cols="150" rows="16" name="noteArea" value="${note.content}" class="form-control pull-left" onkeyup="${remoteFunction(action: 'updateNote', controller: 'note', update: 'noteArea', , id:"${note.userCode}",params: '\'content=\' + this.value')}"/>							
			</div>			
		</div>

		<div class="buttons-area">
			<g:submitButton id="cleanButton" name="Clean" class="btn btn-lg btn-info" >Clean</g:submitButton>	
			<g:remoteLink class="btn btn-lg btn-info" >Change ID</g:remoteLink>	
		</div>	
	</div>

	<r:script>
		$('#cleanButton').click(function() {
			document.getElementById('noteArea').value = ""; return false;
		});
	</r:script>

	<footer>
		<p>Developed and mantained by @rpeleias. All rigths reserved.</p>
	</footer>
</body>
</html>
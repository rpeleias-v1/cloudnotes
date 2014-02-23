<html>
   <head>
      <meta name="layout" content="main"/>
     
   </head>
<body>	
	
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
	
	<r:script>
		$('#cleanButton').click(function() {
			document.getElementById('noteArea').value = ""; return false;
		});
	</r:script>
	
</body>
</html>
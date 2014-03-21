<html>
   <head>
      <meta name="layout" content="main"/>
      <g:javascript library="application" /> 
   </head>
<body>	
	
	<div class="starter-template" style="float:center;">
		<h2> Type your notes below:</h2>
		<p>Type everything you want. Access anywhere. Always get it!</p>
		
		<div class="input-group ">			
			<g:textArea cols="150" rows="16" name="noteArea" value="${note.content}" class="form-control pull-left" onkeyup="${remoteFunction(action: 'updateNote', controller: 'note', update: 'noteArea', id:"${note.userCode}",params: '\'content=\' + this.value')}"/>							
		</div>			
	</div>

	<div class="buttons-area">
		<g:submitButton id="cleanButton" name="Clean" class="btn btn-lg btn-info" >Clean</g:submitButton>			
		<button class="btn btn-lg btn-info" data-toggle="modal" data-target="#myModal">
			Change ID
		</button>	
	</div>	
	

	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
    	  <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	        <h4 class="modal-title" id="myModalLabel">Change Identification Code</h4>
	      </div>

	      <g:formRemote name="myForm" url="[controller: 'note', action: 'changeCode', params: [userCode: note.userCode]]" update="[success:'message']">
		      <div class="modal-body">			      
					<div class="form-group">
						<div id="message" > 
				  		</div>	
						<label for="userName" class="col-sm-2 control-label" >New Id</label>
						<div class="col-sm-10">
							<g:textField name="newCode" class="form-control pull-left"  value="${newCode}" />
						</div>	
					</div>												  			       
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-lg btn-info" data-dismiss="modal">Close</button>
		        <g:submitButton id="changeCode" name="Change" class="btn btn-lg btn-info">Change</g:submitButton>
		      </div>
	      </g:formRemote>		   
	    </div>
	  </div>
	</div>  	
</body>
</html>
<html>
   <head>
      <meta name="layout" content="main"/>
      <g:javascript library="application" /> 
   </head>
<body>	
	
	<div class="starter-template" style="float:center;">
		<h2> Contact Me!</h2>
		<p>If you have any problems or suggestions, feel free!</p>
		<g:hasErrors bean="${contact}">
			<ul class="errors" role="alert">
				<g:eachError bean="${contact}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>>
					<div class="alert alert-danger">
						<g:message error="${error}"/>						
					</div>
				</li>
				</g:eachError>
			</ul>
		</g:hasErrors>

		<g:form action="save" controller="contact" class="form-horizontal" >
			
			<div class="input-group ">
				<div class="form-group">
					<label for="userName" class="col-sm-2 control-label" >Name</label>
					<div class="col-sm-10">
						<g:textField name="userName" value="${contact.userName}" class="form-control pull-left" required="true"/>
					</div>	
				</div>
				<div class="form-group">
					<label for="email" class="col-sm-2 control-label" >Email </label>
					<div class="col-sm-10">
						<g:textField name="email" value="${contact.email}" class="form-control pull-left" required="true" />
					</div>
				</div>
				<div class="form-group">
					<label for="content" class="col-sm-2 control-label" >Content </label>
					<div class="col-sm-10">
						<g:textArea cols="100" rows="10" name="content" value="${contact.content}" class="form-control pull-left" required="true" />
					</div>
				</div>				
			</div>			

			<div class="buttons-area">
				<g:submitButton id="submitEmail" name="Send Email" class="btn btn-lg btn-info" />							
			</div>	

		</g:form>		
	</div>
	
</body>
</html>
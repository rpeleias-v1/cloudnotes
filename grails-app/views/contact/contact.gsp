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
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
		</g:hasErrors>

		<g:form action="save" controller="contact">
			
			<div class="input-group ">
				<table>
					<tr>
						<td><label for="userName">Name</label></td>
						<td><g:textField name="userName" value="${contact.userName}" class="form-control pull-left" required="true"/></td>	
					</tr>
					<br/>
					<tr>
						<td><label for="email">Email </label></td>
						<td><g:textField name="email" value="${contact.email}" class="form-control pull-left" required="true" /></td>
					</tr>
					<br/>
					<tr>
						<td><label for="content">Content </label></td>
						<td><g:textArea cols="100" rows="10" name="content" value="${contact.content}" class="form-control pull-left" required="true" /></td>
					</tr>
				</table>
			</div>			

			<div class="buttons-area">
				<g:submitButton id="submitEmail" name="Send Email" class="btn btn-lg btn-info" />							
			</div>	

		</g:form>		
	</div>
	
</body>
</html>
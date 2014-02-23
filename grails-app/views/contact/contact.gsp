<html>
   <head>
      <meta name="layout" content="main"/>
      <g:javascript library="application" /> 
   </head>
<body>	
	
	<div class="starter-template" style="float:center;">
		<h2> Contact Me!</h2>
		<p>If you have any problems or suggestions, feel free!</p>
		<g:form action="save">

			<div class="input-group ">
				<table>
					<tr>
						<td><label for="userName">Name</label></td>
						<td><g:textField name="userName" value="${contact.userName}" class="form-control pull-left" /></td>	
					</tr>
					<br/>
					<tr>
						<td><label for="userEmail">Email </label></td>
						<td><g:textField name="userEmail" value="${contact.email}" class="form-control pull-left" /></td>
					</tr>
					<br/>
					<tr>
						<td><label for="emailContent">Content </label></td>
						<td><g:textArea cols="100" rows="10" name="emailContent" value="${contact.content}" class="form-control pull-left" /></td>
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
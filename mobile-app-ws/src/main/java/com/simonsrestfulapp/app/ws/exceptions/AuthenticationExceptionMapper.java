package com.simonsrestfulapp.app.ws.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.simonsrestfulapp.app.ws.ui.model.response.ErrorMessage;
import com.simonsrestfulapp.app.ws.ui.model.response.ErrorMessages;

@Provider
public class AuthenticationExceptionMapper implements ExceptionMapper<AuthenticationException> {
	
	@Override
	public Response toResponse(AuthenticationException exception) {
		
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 
				ErrorMessages.AUTHENTICATION_FAILED.name(), "http://stackoverflow.com");
		
		
		return Response.status(Response.Status.UNAUTHORIZED).
				entity(errorMessage).
				build();
		
	}


}

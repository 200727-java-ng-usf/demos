package com.revature.quizzard.web.aspects;

import com.revature.quizzard.exceptions.*;
import com.revature.quizzard.web.dtos.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Component
@RestControllerAdvice
public class ErrorResponseAspect {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.CONFLICT)
    public ErrorResponse handlePersistenceConflicts(ResourcePersistenceException rpe) {
        return new ErrorResponse(409, rpe.getMessage());
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleResourceNotFound(ResourceNotFoundException rnfe) {
        return new ErrorResponse(404, rnfe.getMessage());
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleInvalidRequests(InvalidRequestException ire) {
        return new ErrorResponse(400, ire.getMessage());
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ErrorResponse handleAuthenticationIssues(AuthenticationException ae) {
        return new ErrorResponse(401, ae.getMessage());
    }

    @ExceptionHandler
<<<<<<< HEAD
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleInternalServerErrors(Exception e) {
        return new ErrorResponse(500, e.getMessage());
    }

    @ExceptionHandler
=======
>>>>>>> 94ec4c8aac41b5b0457982f30f068c8d880c466d
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ErrorResponse handleForbiddenRequests(AuthorizationException ae) {
        return new ErrorResponse(403, ae.getMessage());
    }

}

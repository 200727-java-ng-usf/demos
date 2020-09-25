package com.revature.quizzard.web.aspects;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.quizzard.exceptions.AuthenticationException;
import com.revature.quizzard.exceptions.AuthorizationException;
import com.revature.quizzard.web.dtos.Principal;
import com.revature.quizzard.web.security.Secured;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

@Aspect
@Component
public class SecurityAspect {

    private HttpServletRequest request;

    @Autowired
    public  SecurityAspect (HttpServletRequest req) { // request-scoped version
        this.request = req;
    }

    @Around("@annotation(com.revature.quizzard.web.security.Secured)")
    public Object secureEndpoint (ProceedingJoinPoint pjp) throws Throwable {

        // get access to annotation
        Method method = ((MethodSignature) pjp.getSignature()).getMethod(); // object version of method
        Secured securedAnno = method.getAnnotation(Secured.class);

        List<String> allowedRoles = Arrays.asList(securedAnno.allowedRoles());
        Principal principal = new ObjectMapper().readValue((String) request.getAttribute("principal"), Principal.class);

        // if these are reached, you stop the user from reaching the endpoint (good)
        if (principal == null) {
            throw new AuthenticationException("An unauthenticated request was made to a protected endpoint!");
        }

        if (!allowedRoles.contains(principal.getRole().toString())) {
            throw new AuthorizationException("A forbidden request was made by " + principal.getUsername());
        }

        return pjp.proceed();

    }
}

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
    public SecurityAspect(HttpServletRequest req) {
        this.request = req;
    }

    @Around("@annotation(com.revature.quizzard.web.security.Secured)")
    public Object secureEndpoint(ProceedingJoinPoint pjp) throws Throwable {

        Method method = ((MethodSignature) pjp.getSignature()).getMethod();
        Secured securedAnno = method.getAnnotation(Secured.class);

        List<String> allowedRoles = Arrays.asList(securedAnno.allowedRoles());
        Principal principal = (Principal) request.getSession().getAttribute("principal");

        if (principal == null) {
<<<<<<< HEAD
            throw new AuthenticationException(("An unauthenticated request was made to a protected endpoint!"));
=======
            throw new AuthenticationException("An unauthenticated request was made to a protected endpoint!");
>>>>>>> 94ec4c8aac41b5b0457982f30f068c8d880c466d
        }

        if(!allowedRoles.contains(principal.getRole().toString())) {
            throw new AuthorizationException("A forbidden request was made by " + principal.getUsername());
        }

        Object target = pjp.proceed();

        System.out.println("An authenticated request was made by " + principal.getUsername());

        return target;

    }
<<<<<<< HEAD
=======

>>>>>>> 94ec4c8aac41b5b0457982f30f068c8d880c466d
}

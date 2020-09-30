package com.revature.quizzard.web.security;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) // reflection: java's ability to see the program at runtime and
// interface with the code that you've written
public @interface Secured {

    abstract String[] allowedRoles(); // implicitly abstract
    // access using values= param after annotation usage?

}

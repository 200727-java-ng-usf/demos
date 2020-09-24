package com.revature.quizzard.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test") // considered the root path to all this in this controller
public class TestController {

    @GetMapping("/test1")
    public @ResponseBody String test() { // put the string in the response body; this way we don't need an objectmapper
        return "/test/test1 works!";
    }

    @GetMapping(value="/test2") // prevent ambiguous mapping
    public @ResponseBody String test2() {
        return "/test/test2 works!";
    }

    @GetMapping(value="/test3")
    public @ResponseBody String test3(@RequestParam("someValue") String someValue) {
        return "/test/test3 works! Provided request param: " + someValue;
    }

    // can also use put, post, patch, and delete mapping
    // RESTful means not putting verbs in path names. Make a controller that has a verb name. No verbs in endpoint names.

    @GetMapping(value="/test4/{anotherValue}")
    public @ResponseBody String test4(@PathVariable String anotherValue) {
        return "/test/test4 works! Provided path variable is: " + anotherValue;
    }
}

package com.captain.app.rest.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class ApiController {
    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String getPage(){
        return "Welcome";
    }
}

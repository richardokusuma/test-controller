package com.foundation.testcontroller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Richardo Kusuma on 3/6/2019.
 */
@RestController
public class MainController {
    @RequestMapping("/")
    public String sayHello(){
        return "Hello test controller";
    }
}

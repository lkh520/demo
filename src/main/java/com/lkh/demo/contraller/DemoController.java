package com.lkh.demo.contraller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(path = "/demo")
    public String getDemo(){
        return "Hello world";
    }

}

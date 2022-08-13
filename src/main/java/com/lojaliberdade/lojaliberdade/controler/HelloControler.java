package com.lojaliberdade.lojaliberdade.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lojavirtualLiberdade/hello")
public class HelloControler {
    
    public String hello() { 
        return "Hello!";
    }

}

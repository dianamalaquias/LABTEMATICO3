package mx.cua.cua.RENTADORAAUTOS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")

public class TestController {
    @GetMapping("/HOLA")
    public String hola(){
        System.out.println("ejecutandohola");

        return "Hola by Spring";
    }

}

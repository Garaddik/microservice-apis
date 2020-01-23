package com.ms.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RestControllerDemo {

    @GetMapping
    public String serverStatus(){

        return "Service1 server2";
    }

}

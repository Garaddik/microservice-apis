package com.ms.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RestControllerService2 {

    @GetMapping
    public String status(){
        return "Service2 server1";
    }

}

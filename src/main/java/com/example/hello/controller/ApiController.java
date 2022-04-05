package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//해당 클래스는 REST API를 처리하는 controller로 명시됨
@RequestMapping("/api")//RequestMapping은 URI를 지정해주는 Annotation (주소할당)
public class ApiController {
    
    @GetMapping("hello") // http://localhost:9090/api/hello로 매핑이 됨
    public String hello(){
        return "Hello SpringBoot!!";
    }

}

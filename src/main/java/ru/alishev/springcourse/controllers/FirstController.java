package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//аннотация RequestMapping("/url") над классом говорит, что все методы будут вызываться  с этим префиксом урл
@RequestMapping("/first")
public class FirstController {
    //связывание урл с методом, который возвращает название представления
    @GetMapping("/hello")
    public String helloPage(){
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye";
    }
}

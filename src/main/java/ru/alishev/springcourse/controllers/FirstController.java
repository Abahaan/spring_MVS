package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//аннотация RequestMapping("/url") над классом говорит, что все методы будут вызываться  с этим префиксом урл
@RequestMapping("/first")
public class FirstController {
    //связывание урл с методом, который возвращает название представления
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,//аннотация внедряет параметры из гет запроса в переменные.
                            @RequestParam(value = "surname", required = false) String surname){//required = false передает нал если нет параметров
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");

        System.out.println("Hello, " + name + "  " + surname);

        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye";
    }
}

package ru.alishev.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//аннотация Controller наследуется от Component и компонент скан работает с ним как и с обычным компонентом
@Controller
//аннотация RequestMapping("/url") над классом говорит, что все методы будут вызываться  с этим префиксом урл
public class HelloController {
    //аннотация связывает метод  с адресом откуда вызовут этот метод
    @GetMapping("/hello-world")
    public String sayHello(){
        return "hello_world";
    }
}

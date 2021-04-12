package lesson_17.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {
    //все представления контроллера  FirstController должны лежать в одноименной папке
    @GetMapping("/hello")
    //value = "name", required = false - если параметры в url  не указаны, возвращается null
    public String helloPage(@RequestParam(value = "name", required = false) String name,@RequestParam(value = "surname",required = false) String surname) {
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");

        System.out.println("Hello, "+name+" "+surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByPage() {
        return "first/goodbye";
    }
}

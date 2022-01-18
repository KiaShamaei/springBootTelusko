package com.telsuko.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MainController {
    @RequestMapping("home")
    public String home (HttpServletRequest req){
        HttpSession session = req.getSession() ;

        String name = req.getParameter("name");
        session.setAttribute("name" , name);
        System.out.println("hello this first page !");
        return "home";
    }
}

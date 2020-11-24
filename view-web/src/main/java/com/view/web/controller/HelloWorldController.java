package com.view.web.controller;

import com.view.common.HelloUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * @author Bamboo
 */
@Slf4j
@Controller
@RequestMapping()
public class HelloWorldController {

    @Autowired
    private HelloUtils helloUtils;

    @GetMapping({"/", "/index", "/home"})
    public String index(HttpServletRequest request, Model model) {
        model.addAttribute("title", "Test Title ");
        model.addAttribute("addr", request.getLocalAddr());
        return "index";
    }



    @GetMapping
    public void helloWorld() {
        log.info("hello world !!");
        return;
    }

    @RequestMapping("hello1")
    public String hello() {
        log.info("hello !!");
        return "hello !!";
    }

    @PostMapping("hello2")
    public String helloPost() {
        log.info("hello Post !!");
        return helloUtils.hello();
    }


}

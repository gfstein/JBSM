package br.com.jbsm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicController {
    @RequestMapping("index")
    public String index(){
        return null;
    }
}

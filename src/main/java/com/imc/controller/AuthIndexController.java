package com.imc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author luoly
 * @date 2018/12/28 16:52
 * @description
 */

@Controller
@RequestMapping("/auth")
public class AuthIndexController {

    @GetMapping("/index")
    public String settings(ModelMap map, HttpServletRequest request){
        map.put("welcome","SpringBoot Hello World！");
        return "index";
    }
}

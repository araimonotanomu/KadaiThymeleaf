package com.lesson15;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {
    
    @GetMapping("/input")
    public String getInput(@RequestParam(name = "previous", required = false) String previous, Model mdl) {
        mdl.addAttribute("previous", previous);
        return "input";
    }
   
}
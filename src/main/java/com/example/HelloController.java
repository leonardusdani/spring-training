package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/host")
public class HelloController{

    @GetMapping("/hello")
    @ResponseBody
    public String helloGet(@RequestParam(value="message",defaultValue="HELLO") String message) {
        return "Your message from GET method: " + message;
    }
    
    @PostMapping("/hello")
    @ResponseBody
    public String helloPost(@RequestBody String message) {

        return "Your message from POST method: " + message;
    }
    
    @PutMapping("/hello/{message}")
    @ResponseBody
    public String helloPut(@PathVariable String message){
    	return "Your message from PUT method: " + message;
    }
}
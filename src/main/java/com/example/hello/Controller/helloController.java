package com.example.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloWord")
public class helloController {
	@GetMapping()	   
	public String hello() {
		return "HELLO-WORLD-asko";
	  }
}

package com.example.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testConteoller {
	@GetMapping("/Hii")
	public String test1(){
		return "Hii Welcome to the application";
	}
	
	@GetMapping("/Bye")
	public String test2(){
		return "Bye See you again";

}
}

package com.morphy.hello.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class Greeting {

	@GetMapping("/{id}")
	public String  greeting(@PathVariable String id) {
		return "Hello"+"\t"+id;
	}
}

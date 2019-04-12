package com.felix.demo.service1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("info")
public class Info {
	@GetMapping("/{id}")
	public String index(@PathVariable("id") String id) {
		return "show me the money: " + id;
	}
}

package com.felix.demo.server1.Controller;

import com.felix.demo.service1.Client1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Test {

	@Autowired
	private Client1 service1Client;

	@GetMapping("")
	public String index() {
		return "from server1: " + service1Client.infoGet("3389");
	}
}

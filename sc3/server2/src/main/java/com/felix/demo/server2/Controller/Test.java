package com.felix.demo.server2.Controller;

import com.felix.demo.service1.Client1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Test {

	@Autowired
	private Client1 client1;

	@GetMapping("")
	public String index() {
		return "from server2: " + client1.infoGet("3389");
	}
}

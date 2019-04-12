package com.felix.demo.service1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="service1")
public interface Client1 {
	@RequestMapping(value="/info/{id}", method = RequestMethod.GET)
	public String infoGet(@PathVariable("id") String id);
}

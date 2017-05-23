package com.bilelovic.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@RequestMapping("/")
	String index() {
		return "Salam";
	}

	@RequestMapping("/hello/{name}")
	String hello(@PathVariable String name) {
		return "Salam, " + name + "!";
	}

}
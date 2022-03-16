package com.accenture.lkm.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping(value = "hello",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getHello() {

		return new ResponseEntity<String>("Hello, My name is Sumedha. ", HttpStatus.OK);

	}

}

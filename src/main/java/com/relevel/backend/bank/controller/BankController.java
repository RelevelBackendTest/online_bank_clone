package com.relevel.backend.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}


package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.AccountDetailsDto;

@Controller
@RequestMapping("/account")
public class HomeController {
	
	@GetMapping(path = "/getAllAccounts")
	public ResponseEntity<?> getAllAccounts () {
		
		List<AccountDetailsDto> accDetailsDto = new ArrayList<AccountDetailsDto>();
		return new ResponseEntity<>(accDetailsDto, HttpStatus.OK);
		
	}

}

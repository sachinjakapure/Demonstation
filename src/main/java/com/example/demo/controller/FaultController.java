package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Fault;
import com.example.demo.service.FaultService;

@RestController
public class FaultController {
	@Autowired
	FaultService faultserviceobj;
	
	@PostMapping("/fault")
	public Fault createFault(@RequestBody Fault faultobj) {
		return faultserviceobj.createFault(faultobj);
		
	}
}

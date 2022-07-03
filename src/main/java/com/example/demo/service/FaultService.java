package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Fault;
import com.example.demo.repository.FaultRepositoy;

@Service
public class FaultService {
	
	@Autowired
    FaultRepositoy faultrepositoryobj;
    
	public Fault createFault(Fault faultobj) {
		return faultrepositoryobj.save(faultobj);
	}

	
}

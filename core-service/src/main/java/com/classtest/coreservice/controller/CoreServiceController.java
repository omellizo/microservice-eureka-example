package com.classtest.coreservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classtest.coreservice.dto.CoreServiceDTORequest;
import com.classtest.coreservice.dto.CoreServiceDTOResponse;
import com.classtest.coreservice.service.ICoreService;

@RestController
@RequestMapping("/core")
public class CoreServiceController {

	@Autowired
	private ICoreService coreService;
	
	@PostMapping("/calculate")
	public CoreServiceDTOResponse calculate(@RequestBody CoreServiceDTORequest request) {
		
		return coreService.calculate(request);
	}
}

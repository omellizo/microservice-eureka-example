package com.classtest.clientcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classtest.clientcore.dto.ClientCoreServiceDTORequest;
import com.classtest.clientcore.dto.ClientCoreServiceDTOResponse;
import com.classtest.clientcore.service.IClientCoreService;

@RestController
@RequestMapping("/client-core-service")
public class ClientCoreServiceController {

	@Autowired
	private IClientCoreService clientCoreService;
	
	@PostMapping
	public ClientCoreServiceDTOResponse calculate(@RequestBody ClientCoreServiceDTORequest clientCoreServiceDTORequest) {

		return clientCoreService.calculate(clientCoreServiceDTORequest);
	}
}

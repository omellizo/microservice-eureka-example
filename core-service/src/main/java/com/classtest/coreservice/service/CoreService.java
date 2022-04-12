package com.classtest.coreservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.classtest.coreservice.dto.CoreServiceDTORequest;
import com.classtest.coreservice.dto.CoreServiceDTOResponse;

@Service
public class CoreService implements ICoreService{

	@Value("${server.port}")
	private String portInstance;
	
	@Override
	public CoreServiceDTOResponse calculate(CoreServiceDTORequest request) {
		
		return new CoreServiceDTOResponse(portInstance, request.getOperador1() + request.getOperador2());
	}

}

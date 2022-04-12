package com.classtest.clientcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classtest.clientcore.dto.ClientCoreServiceDTORequest;
import com.classtest.clientcore.dto.ClientCoreServiceDTOResponse;
import com.classtest.clientcore.feign.CoreServiceFeign;

@Service
public class ClientCoreService implements IClientCoreService{

	@Autowired
	private CoreServiceFeign coreServiceFeign;
	
	@Override
	public ClientCoreServiceDTOResponse calculate(ClientCoreServiceDTORequest request) {
		
		return coreServiceFeign.calculate(request);
	}

}

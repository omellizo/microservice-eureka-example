package com.classtest.clientcore.service;

import com.classtest.clientcore.dto.ClientCoreServiceDTORequest;
import com.classtest.clientcore.dto.ClientCoreServiceDTOResponse;

public interface IClientCoreService {

	public ClientCoreServiceDTOResponse calculate(ClientCoreServiceDTORequest clientCoreServiceDTORequest);
}

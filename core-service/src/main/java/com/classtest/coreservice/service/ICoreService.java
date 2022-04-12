package com.classtest.coreservice.service;

import com.classtest.coreservice.dto.CoreServiceDTORequest;
import com.classtest.coreservice.dto.CoreServiceDTOResponse;

public interface ICoreService {

	public CoreServiceDTOResponse calculate(CoreServiceDTORequest coreServiceDTORequest);
}

package com.classtest.clientcore.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.classtest.clientcore.dto.ClientCoreServiceDTORequest;
import com.classtest.clientcore.dto.ClientCoreServiceDTOResponse;

@FeignClient(name = "core-service")
public interface CoreServiceFeign {

	@PostMapping("/core/calculate")
	public ClientCoreServiceDTOResponse calculate(@RequestBody ClientCoreServiceDTORequest request);
}

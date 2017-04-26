package com.fast.order.api;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient("fast-order-service")
public interface OrderApi {

	@RequestMapping(value = "/findUserOrderList", method = RequestMethod.GET)
	@ResponseBody
	List<Object> findUserOrderList(Object param);
	
}

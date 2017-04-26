package com.fast.core.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.fast.core.order.feignclient.AccountApiFeignClient;
import com.fast.core.order.service.OrderService;
import com.fast.order.api.OrderApi;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController implements OrderApi{

	@Autowired
	AccountApiFeignClient accountApi;
	
	@Autowired
	OrderService orderService;
	
	int count = 0;
	
	@RequestMapping(value = "/findUserOrderList", method = RequestMethod.GET)
	@ResponseBody
	public List<Object> findUserOrderList(Object param) {
		
		for(int i = 0; i < 1000; i++){
			new Thread(new Runnable() {
				public void run() {
					ArrayList<Long> ids = new ArrayList<Long>();
					ids.add(count++ * 1l);
					System.out.println("getUserInfos:" + JSONObject.toJSONString(accountApi.getUserList(ids)));
				}
			}).start();
		}
		
		return null;
	}
	
}

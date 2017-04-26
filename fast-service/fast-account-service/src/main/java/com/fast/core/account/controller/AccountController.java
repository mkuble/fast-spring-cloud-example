package com.fast.core.account.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.fast.account.api.AccountApi;
import com.fast.account.dto.UserDto;
import com.fast.base.domain.FastJSONResult;
import com.fast.core.account.service.AccountService;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountController implements AccountApi{

	@Autowired
	AccountService accountService;
	
	@RequestMapping(value = "/registe", method = RequestMethod.POST)
	public FastJSONResult registe(UserDto user) {
		
		System.out.println("====AccountController.registe");
		System.out.println(JSONObject.toJSONString(user));
		
		return new FastJSONResult().setAuthError();
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public FastJSONResult login(String userName, String password) {
		System.out.println("====AccountController.login");
		return null;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public FastJSONResult logout(String userName) {
		System.out.println("====AccountController.logout");
		return null;
	}

	@RequestMapping(value = "/getUserInfo", method = RequestMethod.POST)
	public UserDto getUserInfo(long userId) {
		System.out.println("====AccountController.getUserInfo");
		return new UserDto(userId, "som");
	}
	
	@RequestMapping(value = "/getUserList", method = RequestMethod.POST)
	public List<UserDto> getUserList(@RequestBody List<Long> ids){
		
		System.out.println("====AccountController.getUserInfo" + ids);
		
		UserDto user = new UserDto(1l, "tom111111111111111");
		
		List<UserDto> list = new ArrayList<UserDto>();
		list.add(user);
		
		return list;
	}
	
}

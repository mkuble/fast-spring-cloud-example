package com.fast.account.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fast.account.dto.UserDto;
import com.fast.base.domain.FastJSONResult;

public interface AccountApi {

	static final String SERVICE_HOSTNAME = "http://FAST-ACCOUNT-SERVICE1";
		
	static final String SERVICE_NAME = "FAST-ACCOUNT-SERVICE1";
	
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/registe", method = RequestMethod.POST)
	FastJSONResult registe(@RequestParam(value = "user")UserDto user);

	/**
	 * 登录
	 * @param userName
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	FastJSONResult login(@RequestParam(value = "userName")String userName, @RequestParam(value = "password")String password);

	/**
	 * 登出
	 * @param userName
	 * @return
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	FastJSONResult logout(@RequestParam(value = "userName")String userName);

	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/getUserInfo", method = RequestMethod.POST)
	UserDto getUserInfo(@RequestParam(value = "userId")long userId);
	
	/**
	 * 获取用户列表
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/getUserList", method = RequestMethod.POST)
	List<UserDto> getUserList(@RequestBody List<Long> ids);

}

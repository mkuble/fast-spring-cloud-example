package com.fast.account.dto;

import java.io.Serializable;

public class UserDto implements Serializable{

	private static final long serialVersionUID = 1299753001907961002L;

	public UserDto(){}
	
	public UserDto(Long id, String userName){
		this.id = id;
		this.userName = userName;
	}
	
	private Long id;
	
	private String userName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}

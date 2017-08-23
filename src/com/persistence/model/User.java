package com.persistence.model;

/**
 * Created by Administrator on 2016/9/21.
 */
public class User {

    private String userId; //用户Id

    private String userName; //用户中文名称
  
    private String cityId; //地市ID

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

    
    
}

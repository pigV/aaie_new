package com.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.ext.Provider;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.persistence.model.User;
import com.persistence.service.UserService;

import net.sf.json.JSONObject;

/**
 * 营销类产品查询
 */

@Path("/user")
@Provider
@Component
public class UserController {
	@Autowired
	private UserService userService;

	private static Logger logger = Logger.getLogger(UserController.class);

	/**
	 * @Description 根据用户ID 获取地市信息
	 * @param userId
	 *            用户ID
	 */
	@GET
	@Path("/getUserInfo")
	@Produces("application/json;charset=UTF-8")
	public String getUserInfo(
			@QueryParam("userId") String userId, 
			@QueryParam("jsoncallback") String jsoncallback) {

		JSONObject jsonObj = new JSONObject();
		String errorMsg = "查询用户信息记录成功!!";
		int state = 200;
		User userInfo = new User();
		try {
			
			userInfo = userService.getUser(userId);
			jsonObj.put("user", userInfo);
			jsonObj.put("state", state);
			jsonObj.put("errorMsg", errorMsg);

		} catch (Exception e) {
			logger.debug("查询用户信息记录成功!!-----------》》》》异常");
			e.printStackTrace();
		}
		return jsoncallback + "(" + jsonObj.toString() + ")";
	}
	
	public static void main(String[] args) {
		boolean m = true; 
		if(m = false) 
		System.out.println("False"); 
		else 
		System.out.println("True");
	}
}

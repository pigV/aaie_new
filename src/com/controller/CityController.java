package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.ext.Provider;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.persistence.model.CityInfo;
import com.persistence.service.CityService;

import net.sf.json.JSONObject;

/**
 * Created by xiaoyx on 2017/5/18.
 */
@Path("/city")
@Provider
@Component
public class CityController {

	@Autowired
	private CityService cityService;

	private static Logger logger = Logger.getLogger(CityController.class);

	/**
	 * @Description 根据标签的名称模糊查询
	 * 
	 */
	@GET
	@Path("/getCityList")
	@Produces("application/json;charset=UTF-8")
	public String getCityList(@QueryParam("jsoncallback") String jsoncallback) {

		List<CityInfo> list = new ArrayList<CityInfo>();
		JSONObject jsonObj = new JSONObject();
		try {
			list = cityService.getCityInfoList();

			jsonObj.put("cityList", list);

		} catch (Exception ex) {
			logger.debug("查询所有的标签 --异常");
			ex.printStackTrace();
		}
		return jsoncallback + "(" + jsonObj.toString() + ")";
	}

	/**
	 * @Description 根据标签的名称模糊查询
	 * 
	 */
	@GET
	@Path("/getCityInfo")
	@Produces("application/json;charset=UTF-8")
	public String getCityInfo(@QueryParam("cityId") String cityId, @QueryParam("jsoncallback") String jsoncallback) {

		CityInfo cityItem = new CityInfo();
		JSONObject jsonObj = new JSONObject();
		try {
			cityItem = cityService.getCityInfo(cityId);

			jsonObj.put("cityItem", cityItem);

		} catch (Exception ex) {
			logger.debug("查询所有的标签 --异常");
			ex.printStackTrace();
		}
		return jsoncallback + "(" + jsonObj.toString() + ")";
	}

	/**
	 * @Description 根据标签的名称模糊查询
	 * 
	 */
	@GET
	@Path("/getCountyListByCityId")
	@Produces("application/json;charset=UTF-8")
	public String getCountyListByCityId(
			@QueryParam("cityId") String cityId,
			@QueryParam("jsoncallback") String jsoncallback) {

		List<CityInfo> list = new ArrayList<CityInfo>();
		JSONObject jsonObj = new JSONObject();
		try {
			list = cityService.getCountyListByCityId(cityId,2);

			jsonObj.put("cityList", list);

		} catch (Exception ex) {
			logger.debug("查询所有的标签 --异常");
			ex.printStackTrace();
		}
		return jsoncallback + "(" + jsonObj.toString() + ")";
	}

}

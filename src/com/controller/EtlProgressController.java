package com.controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.persistence.model.*;
import com.persistence.service.EtlProcessService;
import com.sun.jersey.api.view.Viewable;

import net.sf.json.JSONObject;

/**
 * Created by xiaoyx on 2017/8/23.
 */
@Path("/etlPro")
@Provider
@Component
public class EtlProgressController {
	
	@Autowired
	private EtlProcessService etlService;

	private static Logger logger = Logger.getLogger(EtlProgressController.class);
	
	/**
	 * @Description 分页查询
	 */
	@GET
	@Path("/queryScheduleOfPage")
	@Produces("application/json;charset=UTF-8")
	public String queryScheduleOfPage(
		/*	@QueryParam("labelId") String labelId,
			@QueryParam("labelName") String labelName, 
			@QueryParam("productId") String productId,
			@QueryParam("productName") String productName, 
			@QueryParam("cityId") String cityId,
			@QueryParam("userCityId") String userCityId, */
			@QueryParam("currentPage") int currentPage,
			@QueryParam("itemsPerPage") int itemsPerPage) {

		JSONObject jsonObj = new JSONObject();
		Pager pager = new Pager();
		EtlProgress formItem = new EtlProgress();
		int status = 200;
		String errorMsg = "分页查询产品记录成功!!";

		try {

			List<EtlProgress> proList = new ArrayList<EtlProgress>();
			int maxentries = 0;
			pager.setCurrentPage(currentPage);
			pager.setItemsPerPage(itemsPerPage);

			/*if (StringUtils.isNotEmpty(cityId)) {
				fromItem.setCityId(cityId);
			}
			if (StringUtils.isNotEmpty(userCityId)) {
				fromItem.setUserCityId(userCityId);
			}
			if (StringUtils.isNotEmpty(productId)) {
				fromItem.setProductId(productId);
			}
			if (StringUtils.isNotEmpty(productName)) {
				productName = URLDecoder.decode(productName, "utf-8");
				fromItem.setProductName(productName);
			}
			// 根据标签信息查询关联产品
			if (StringUtils.isNotEmpty(labelId)) {
				fromItem.setLabelId(labelId);
			}
			if (StringUtils.isNotEmpty(labelName)) {
				labelName = URLDecoder.decode(labelName, "utf-8");
				fromItem.setLabelName(labelName);
			}*/

			proList = etlService.queryScheduleOfPage(formItem, pager);
			maxentries = etlService.queryScheduleTotal(formItem);

			jsonObj.put("currentPage", currentPage);
			jsonObj.put("maxentries", maxentries);
			jsonObj.put("rows", proList);
			jsonObj.put("status", status);
			jsonObj.put("errorMsg", errorMsg);

		} catch (Exception e) {
			logger.debug("查询所有的标签 --异常");
			e.printStackTrace();
		}
		return  jsonObj.toString();
	}
	/**
	 * @Description 分页查询
	 */
	@GET
	@Path("/scheduleMap")
	@Produces("application/json;charset=UTF-8")
	public Viewable scheduleMap(
			@QueryParam("jobId") String jobId ,
			@Context HttpServletRequest request){
		request.setAttribute("jobId", jobId); 
		return new Viewable("/schedule/scheduleMap.jsp", null); 
	}
	
	
	
	

}

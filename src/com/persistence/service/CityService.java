package com.persistence.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistence.mapper.CityMapper;
import com.persistence.model.CityInfo;

@Service("cityService")
public class CityService {
	
	private static Logger logger = Logger.getLogger(CityService.class);

	@Autowired
	private CityMapper cityMapper;
	
	public List<CityInfo> getCityInfoList() {
		List<CityInfo> cityList = new ArrayList<CityInfo>();
		cityList = cityMapper.getCityInfoList();
		return cityList;
	}

	public CityInfo getCityInfo(String cityId) {
		 CityInfo  cityItem = new CityInfo();
		 cityItem = cityMapper.getCityInfo(cityId);
		return cityItem;
	}

	public List<CityInfo> getCountyListByCityId(String cityId, int level) {
		List<CityInfo> cityList = new ArrayList<CityInfo>();
		cityList = cityMapper.getCountyListByCityId(cityId,level);
		return cityList;
	}

}

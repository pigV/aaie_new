package com.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.persistence.model.CityInfo;

public interface CityMapper {

	public List<CityInfo> getCityInfoList();

	public CityInfo getCityInfo(@Param(value="cityId") String cityId);

	public List<CityInfo> getCountyListByCityId(@Param(value="cityId")String cityId, @Param(value="level") int level);

}

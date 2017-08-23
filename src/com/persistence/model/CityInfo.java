package com.persistence.model;

/**
 * 地市参数
 */

public class CityInfo {

	private String cityId; // 地市id
	private String cityName; // 地市名称
	private String descTxt; // 地市描述

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDescTxt() {
		return descTxt;
	}

	public void setDescTxt(String descTxt) {
		this.descTxt = descTxt;
	}

}

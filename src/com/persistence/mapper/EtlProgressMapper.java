package com.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.persistence.model.EtlProgress;
import com.persistence.model.Pager;

public interface EtlProgressMapper {

	List<EtlProgress> queryScheduleOfPage(@Param(value="formItem")EtlProgress formItem, @Param(value="pager")Pager pager);

	int queryScheduleTotal(@Param(value="formItem")EtlProgress fromItem);

}

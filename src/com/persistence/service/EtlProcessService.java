package com.persistence.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistence.mapper.EtlProgressMapper;
import com.persistence.model.EtlProgress;
import com.persistence.model.Pager;

@Service("etlProcessService")
public class EtlProcessService {
	
	private static Logger logger = Logger.getLogger(EtlProcessService.class);

	@Autowired
	private EtlProgressMapper etlMapper;

	public List<EtlProgress> queryScheduleOfPage(EtlProgress formItem, Pager pager) {
		List<EtlProgress> list = new ArrayList<EtlProgress>();
		list= etlMapper.queryScheduleOfPage(formItem,pager );
		return list;
	}

	public int queryScheduleTotal(EtlProgress formItem) {
		int rowsNum = 0;
		rowsNum = etlMapper.queryScheduleTotal( formItem);
		return rowsNum;
	}
	
}

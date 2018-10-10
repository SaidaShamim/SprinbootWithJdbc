package com.org.serviceImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.org.model.BagItems;
import com.org.service.BagService;

@Service
public class BagServiceImpl implements BagService{
	
	JdbcTemplate jd;

	@Override
	public List<BagItems> getBag(BagItems bag) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

}

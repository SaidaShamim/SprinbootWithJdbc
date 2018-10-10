package com.org.service;

import java.util.List;

import com.org.model.BagItems;

public interface BagService {

	public List<BagItems> getBag(BagItems bag) throws Exception;
	
}

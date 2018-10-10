package com.org.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.model.BagItems;
import com.org.service.BagService;

@RestController
@RequestMapping("bag/v1")
public class BagResource {
	
	@Autowired
    BagService bagService;
	
    @GetMapping("/{bagId}")
	public List<BagItems> getBag(BagItems bag) throws Exception {
		
		return bagService.getBag(bag);
		
	}

}

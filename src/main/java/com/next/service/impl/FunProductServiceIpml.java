package com.next.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.next.db.mapper.FunProductMapper;
import com.next.db.model.FunProduct;
import com.next.service.FunProductService;

@Service
public class FunProductServiceIpml implements FunProductService {
	@Autowired
	private FunProductMapper funProductMapper;

	@Override
	public boolean save(FunProduct product) {
		int i = funProductMapper.insert(product);
		if (i == 1) {
			return true;
		}
		return false;
	}

}

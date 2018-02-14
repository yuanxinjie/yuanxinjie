package com.yuanxinjie.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuanxinjie.mapper.ProductMapper;
import com.yuanxinjie.pojo.User;
@Service
public class ProductServiceImpl implements ProductService {

	@Resource
	private ProductMapper mapper;
	
	@Override
	public User login(String username, String password) {
		
		return this.mapper.login(username,password);
	}

}

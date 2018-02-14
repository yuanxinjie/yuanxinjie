package com.yuanxinjie.service;

import org.springframework.transaction.annotation.Transactional;

import com.yuanxinjie.pojo.User;
@Transactional
public interface ProductService {

	User login(String username, String password);

}

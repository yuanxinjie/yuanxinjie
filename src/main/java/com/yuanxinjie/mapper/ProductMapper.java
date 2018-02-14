package com.yuanxinjie.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.yuanxinjie.pojo.User;

@Mapper
public interface ProductMapper {

	User login(@Param("username")String username,@Param("password") String password);
	
}

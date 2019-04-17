package com.csblog.service;


import com.csblog.model.Bloger;
import com.sun.org.apache.xpath.internal.operations.Bool;

public interface BlogerService {
	
	
	int deleteByPrimaryKey(Integer id);

    
    int insert(Bloger record);

    
    int insertSelective(Bloger record);

    
    Bloger selectByPrimaryKey(Integer id);

    
    int updateByPrimaryKeySelective(Bloger record);

    
    int updateByPrimaryKey(Bloger record);
    
     Bloger findUserByLoginName(String name);

     Boolean validateLogin(String name, String pwd);
	
}
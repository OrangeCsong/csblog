package com.csblog.mapper;


import com.csblog.model.Bloger;
import org.apache.ibatis.annotations.Param;

public interface BlogerMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(Bloger record);

    
    int insertSelective(Bloger record);

    
    Bloger selectByPrimaryKey(Integer id);

    
    int updateByPrimaryKeySelective(Bloger record);

    
    int updateByPrimaryKey(Bloger record);
    
    Bloger findUserByLoginName(String name);

    Boolean validateLogin(@Param("username") String username,@Param("password") String password);
}
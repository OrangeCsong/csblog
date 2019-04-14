package com.csblog.service;

import com.csblog.model.ResourceManager;

import java.util.List;
import java.util.Map;


public interface ResourceService {

	    int deleteByPrimaryKey(Integer id);
	    
	    int insert(ResourceManager record);

	    int insertSelective(ResourceManager record);

          ResourceManager selectByPrimaryKey(Integer id);

	    /**
	     * 模糊查询
	     * @param map
	     * @return
	     */
	    List<ResourceManager> selectLikeResourceListByPage(Map<String, Object> map);
	    
	    
	    List<?>  selectResourceListByStatus();
	    int updateByPrimaryKeySelective(ResourceManager record);
	    
	    int updateByPrimaryKey(ResourceManager record);
}

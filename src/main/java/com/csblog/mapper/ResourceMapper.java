package com.csblog.mapper;

import com.csblog.model.ResourceManager;

import java.util.List;
import java.util.Map;


public interface ResourceMapper {
	
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
    
    /**
 	 *  获取资源信息，根据状态分组查询
 	 * @return
 	 */
 	List<?>  selectResourceListByStatus();
    
    int updateByPrimaryKeySelective(ResourceManager record);
    
    int updateByPrimaryKey(ResourceManager record);
}
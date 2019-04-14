package com.csblog.service.impl;

import java.util.List;

import java.util.Map;

import com.csblog.mapper.ResourceMapper;
import com.csblog.model.ResourceManager;
import com.csblog.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	private ResourceMapper resourceMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		
		return resourceMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ResourceManager record) {
		// TODO Auto-generated method stub
		return resourceMapper.insert(record);
	}

	@Override
	public int insertSelective(ResourceManager record) {
		// TODO Auto-generated method stub
		return resourceMapper.insertSelective(record);
	}

	@Override
	public ResourceManager selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return resourceMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<ResourceManager> selectLikeResourceListByPage(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return resourceMapper.selectLikeResourceListByPage(map);
	}

	@Override
	public int updateByPrimaryKeySelective(ResourceManager record) {
		// TODO Auto-generated method stub
		return resourceMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ResourceManager record) {
		// TODO Auto-generated method stub
		return resourceMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<?> selectResourceListByStatus() {
		// TODO Auto-generated method stub
		return resourceMapper.selectResourceListByStatus();
	}

}

package com.wind.sound.system.service.impl;

import java.util.List;

import com.wind.sound.common.util.Convert;
import com.wind.sound.system.dao.domain.TaskVideoResource;
import com.wind.sound.system.dao.mapper.TaskVideoResourceMapper;
import com.wind.sound.system.service.ITaskVideoResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 录音资源 服务层实现
 * 
 * @author admin
 * @date 2019-12-30
 */
@Service
public class TaskVideoResourceServiceImpl implements ITaskVideoResourceService
{
	@Autowired
	private TaskVideoResourceMapper taskVideoResourceMapper;

	/**
     * 查询录音资源信息
     * 
     * @param id 录音资源ID
     * @return 录音资源信息
     */
    @Override
	public TaskVideoResource selectTaskVideoResourceById(String id)
	{
	    return taskVideoResourceMapper.selectTaskVideoResourceById(id);
	}
	
	/**
     * 查询录音资源列表
     * 
     * @param taskVideoResource 录音资源信息
     * @return 录音资源集合
     */
	@Override
	public List<TaskVideoResource> selectTaskVideoResourceList(TaskVideoResource taskVideoResource)
	{
	    return taskVideoResourceMapper.selectTaskVideoResourceList(taskVideoResource);
	}
	
    /**
     * 新增录音资源
     * 
     * @param taskVideoResource 录音资源信息
     * @return 结果
     */
	@Override
	public int insertTaskVideoResource(TaskVideoResource taskVideoResource)
	{
	    return taskVideoResourceMapper.insertTaskVideoResource(taskVideoResource);
	}
	
	/**
     * 修改录音资源
     * 
     * @param taskVideoResource 录音资源信息
     * @return 结果
     */
	@Override
	public int updateTaskVideoResource(TaskVideoResource taskVideoResource)
	{
	    return taskVideoResourceMapper.updateTaskVideoResource(taskVideoResource);
	}

	/**
     * 删除录音资源对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTaskVideoResourceByIds(String ids)
	{
		return taskVideoResourceMapper.deleteTaskVideoResourceByIds(Convert.toStrArray(ids));
	}
	
}

package com.wind.sound.system.service.impl;

import java.util.List;

import com.wind.sound.common.util.Convert;
import com.wind.sound.system.dao.domain.TaskControl;
import com.wind.sound.system.dao.mapper.TaskControlMapper;
import com.wind.sound.system.service.ITaskControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 任务控制 服务层实现
 * 
 * @author admin
 * @date 2019-12-30
 */
@Service
public class TaskControlServiceImpl implements ITaskControlService
{
	@Autowired
	private TaskControlMapper taskControlMapper;

	/**
     * 查询任务控制信息
     * 
     * @param id 任务控制ID
     * @return 任务控制信息
     */
    @Override
	public TaskControl selectTaskControlById(Long id)
	{
	    return taskControlMapper.selectTaskControlById(id);
	}
	
	/**
     * 查询任务控制列表
     * 
     * @param taskControl 任务控制信息
     * @return 任务控制集合
     */
	@Override
	public List<TaskControl> selectTaskControlList(TaskControl taskControl)
	{
	    return taskControlMapper.selectTaskControlList(taskControl);
	}
	
    /**
     * 新增任务控制
     * 
     * @param taskControl 任务控制信息
     * @return 结果
     */
	@Override
	public int insertTaskControl(TaskControl taskControl)
	{
	    return taskControlMapper.insertTaskControl(taskControl);
	}
	
	/**
     * 修改任务控制
     * 
     * @param taskControl 任务控制信息
     * @return 结果
     */
	@Override
	public int updateTaskControl(TaskControl taskControl)
	{
	    return taskControlMapper.updateTaskControl(taskControl);
	}

	/**
     * 删除任务控制对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTaskControlByIds(String ids)
	{
		return taskControlMapper.deleteTaskControlByIds(Convert.toStrArray(ids));
	}
	
}

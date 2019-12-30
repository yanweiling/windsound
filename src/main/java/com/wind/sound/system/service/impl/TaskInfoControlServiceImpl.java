package com.wind.sound.system.service.impl;

import java.util.List;

import com.wind.sound.common.util.Convert;
import com.wind.sound.system.dao.domain.TaskInfoControl;
import com.wind.sound.system.dao.mapper.TaskInfoControlMapper;
import com.wind.sound.system.service.ITaskInfoControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 采集任务控制关联 服务层实现
 * 
 * @author admin
 * @date 2019-12-30
 */
@Service
public class TaskInfoControlServiceImpl implements ITaskInfoControlService
{
	@Autowired
	private TaskInfoControlMapper taskInfoControlMapper;

	/**
     * 查询采集任务控制关联信息
     * 
     * @param id 采集任务控制关联ID
     * @return 采集任务控制关联信息
     */
    @Override
	public TaskInfoControl selectTaskInfoControlById(Long id)
	{
	    return taskInfoControlMapper.selectTaskInfoControlById(id);
	}
	
	/**
     * 查询采集任务控制关联列表
     * 
     * @param taskInfoControl 采集任务控制关联信息
     * @return 采集任务控制关联集合
     */
	@Override
	public List<TaskInfoControl> selectTaskInfoControlList(TaskInfoControl taskInfoControl)
	{
	    return taskInfoControlMapper.selectTaskInfoControlList(taskInfoControl);
	}
	
    /**
     * 新增采集任务控制关联
     * 
     * @param taskInfoControl 采集任务控制关联信息
     * @return 结果
     */
	@Override
	public int insertTaskInfoControl(TaskInfoControl taskInfoControl)
	{
	    return taskInfoControlMapper.insertTaskInfoControl(taskInfoControl);
	}
	
	/**
     * 修改采集任务控制关联
     * 
     * @param taskInfoControl 采集任务控制关联信息
     * @return 结果
     */
	@Override
	public int updateTaskInfoControl(TaskInfoControl taskInfoControl)
	{
	    return taskInfoControlMapper.updateTaskInfoControl(taskInfoControl);
	}

	/**
     * 删除采集任务控制关联对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTaskInfoControlByIds(String ids)
	{
		return taskInfoControlMapper.deleteTaskInfoControlByIds(Convert.toStrArray(ids));
	}
	
}

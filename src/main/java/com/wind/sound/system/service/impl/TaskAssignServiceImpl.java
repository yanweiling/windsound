package com.wind.sound.system.service.impl;

import java.util.List;

import com.wind.sound.common.util.Convert;
import com.wind.sound.system.dao.domain.TaskAssign;
import com.wind.sound.system.dao.mapper.TaskAssignMapper;
import com.wind.sound.system.service.ITaskAssignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户任务领取 服务层实现
 * 
 * @author admin
 * @date 2019-12-30
 */
@Service
public class TaskAssignServiceImpl implements ITaskAssignService
{
	@Autowired
	private TaskAssignMapper taskAssignMapper;

	/**
     * 查询用户任务领取信息
     * 
     * @param id 用户任务领取ID
     * @return 用户任务领取信息
     */
    @Override
	public TaskAssign selectTaskAssignById(Long id)
	{
	    return taskAssignMapper.selectTaskAssignById(id);
	}
	
	/**
     * 查询用户任务领取列表
     * 
     * @param taskAssign 用户任务领取信息
     * @return 用户任务领取集合
     */
	@Override
	public List<TaskAssign> selectTaskAssignList(TaskAssign taskAssign)
	{
	    return taskAssignMapper.selectTaskAssignList(taskAssign);
	}
	
    /**
     * 新增用户任务领取
     * 
     * @param taskAssign 用户任务领取信息
     * @return 结果
     */
	@Override
	public int insertTaskAssign(TaskAssign taskAssign)
	{
	    return taskAssignMapper.insertTaskAssign(taskAssign);
	}
	
	/**
     * 修改用户任务领取
     * 
     * @param taskAssign 用户任务领取信息
     * @return 结果
     */
	@Override
	public int updateTaskAssign(TaskAssign taskAssign)
	{
	    return taskAssignMapper.updateTaskAssign(taskAssign);
	}

	/**
     * 删除用户任务领取对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTaskAssignByIds(String ids)
	{
		return taskAssignMapper.deleteTaskAssignByIds(Convert.toStrArray(ids));
	}
	
}

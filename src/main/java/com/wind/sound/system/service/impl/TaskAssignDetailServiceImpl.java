package com.wind.sound.system.service.impl;

import java.util.List;

import com.wind.sound.common.util.Convert;
import com.wind.sound.system.dao.domain.TaskAssignDetail;
import com.wind.sound.system.dao.mapper.TaskAssignDetailMapper;
import com.wind.sound.system.service.ITaskAssignDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户任务分配任务详情 服务层实现
 * 
 * @author admin
 * @date 2019-12-30
 */
@Service
public class TaskAssignDetailServiceImpl implements ITaskAssignDetailService
{
	@Autowired
	private TaskAssignDetailMapper taskAssignDetailMapper;

	/**
     * 查询用户任务分配任务详情信息
     * 
     * @param id 用户任务分配任务详情ID
     * @return 用户任务分配任务详情信息
     */
    @Override
	public TaskAssignDetail selectTaskAssignDetailById(Long id)
	{
	    return taskAssignDetailMapper.selectTaskAssignDetailById(id);
	}
	
	/**
     * 查询用户任务分配任务详情列表
     * 
     * @param taskAssignDetail 用户任务分配任务详情信息
     * @return 用户任务分配任务详情集合
     */
	@Override
	public List<TaskAssignDetail> selectTaskAssignDetailList(TaskAssignDetail taskAssignDetail)
	{
	    return taskAssignDetailMapper.selectTaskAssignDetailList(taskAssignDetail);
	}
	
    /**
     * 新增用户任务分配任务详情
     * 
     * @param taskAssignDetail 用户任务分配任务详情信息
     * @return 结果
     */
	@Override
	public int insertTaskAssignDetail(TaskAssignDetail taskAssignDetail)
	{
	    return taskAssignDetailMapper.insertTaskAssignDetail(taskAssignDetail);
	}
	
	/**
     * 修改用户任务分配任务详情
     * 
     * @param taskAssignDetail 用户任务分配任务详情信息
     * @return 结果
     */
	@Override
	public int updateTaskAssignDetail(TaskAssignDetail taskAssignDetail)
	{
	    return taskAssignDetailMapper.updateTaskAssignDetail(taskAssignDetail);
	}

	/**
     * 删除用户任务分配任务详情对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTaskAssignDetailByIds(String ids)
	{
		return taskAssignDetailMapper.deleteTaskAssignDetailByIds(Convert.toStrArray(ids));
	}
	
}

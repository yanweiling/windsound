package com.wind.sound.system.service.impl;

import java.util.List;

import com.wind.sound.common.util.Convert;
import com.wind.sound.system.dao.domain.TaskInfo;
import com.wind.sound.system.dao.mapper.TaskInfoMapper;
import com.wind.sound.system.service.ITaskInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 采集任务 服务层实现
 * 
 * @author admin
 * @date 2019-12-30
 */
@Service
public class TaskInfoServiceImpl implements ITaskInfoService
{
	@Autowired
	private TaskInfoMapper taskInfoMapper;

	/**
     * 查询采集任务信息
     * 
     * @param id 采集任务ID
     * @return 采集任务信息
     */
    @Override
	public TaskInfo selectTaskInfoById(Long id)
	{
	    return taskInfoMapper.selectTaskInfoById(id);
	}
	
	/**
     * 查询采集任务列表
     * 
     * @param taskInfo 采集任务信息
     * @return 采集任务集合
     */
	@Override
	public List<TaskInfo> selectTaskInfoList(TaskInfo taskInfo)
	{
	    return taskInfoMapper.selectTaskInfoList(taskInfo);
	}
	
    /**
     * 新增采集任务
     * 
     * @param taskInfo 采集任务信息
     * @return 结果
     */
	@Override
	public int insertTaskInfo(TaskInfo taskInfo)
	{
	    return taskInfoMapper.insertTaskInfo(taskInfo);
	}
	
	/**
     * 修改采集任务
     * 
     * @param taskInfo 采集任务信息
     * @return 结果
     */
	@Override
	public int updateTaskInfo(TaskInfo taskInfo)
	{
	    return taskInfoMapper.updateTaskInfo(taskInfo);
	}

	/**
     * 删除采集任务对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTaskInfoByIds(String ids)
	{
		return taskInfoMapper.deleteTaskInfoByIds(Convert.toStrArray(ids));
	}
	
}

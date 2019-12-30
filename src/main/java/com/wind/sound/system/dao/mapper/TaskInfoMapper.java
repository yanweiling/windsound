package com.wind.sound.system.dao.mapper;

import com.wind.sound.system.dao.domain.TaskInfo;

import java.util.List;

/**
 * 采集任务 数据层
 * 
 * @author admin
 * @date 2019-12-30
 */
public interface TaskInfoMapper 
{
	/**
     * 查询采集任务信息
     * 
     * @param id 采集任务ID
     * @return 采集任务信息
     */
	public TaskInfo selectTaskInfoById(Long id);
	
	/**
     * 查询采集任务列表
     * 
     * @param taskInfo 采集任务信息
     * @return 采集任务集合
     */
	public List<TaskInfo> selectTaskInfoList(TaskInfo taskInfo);
	
	/**
     * 新增采集任务
     * 
     * @param taskInfo 采集任务信息
     * @return 结果
     */
	public int insertTaskInfo(TaskInfo taskInfo);
	
	/**
     * 修改采集任务
     * 
     * @param taskInfo 采集任务信息
     * @return 结果
     */
	public int updateTaskInfo(TaskInfo taskInfo);
	
	/**
     * 删除采集任务
     * 
     * @param id 采集任务ID
     * @return 结果
     */
	public int deleteTaskInfoById(Long id);
	
	/**
     * 批量删除采集任务
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTaskInfoByIds(String[] ids);
	
}
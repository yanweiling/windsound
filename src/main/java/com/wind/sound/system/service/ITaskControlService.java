package com.wind.sound.system.service;

import com.wind.sound.system.dao.domain.TaskControl;

import java.util.List;

/**
 * 任务控制 服务层
 * 
 * @author admin
 * @date 2019-12-30
 */
public interface ITaskControlService 
{
	/**
     * 查询任务控制信息
     * 
     * @param id 任务控制ID
     * @return 任务控制信息
     */
	public TaskControl selectTaskControlById(Long id);
	
	/**
     * 查询任务控制列表
     * 
     * @param taskControl 任务控制信息
     * @return 任务控制集合
     */
	public List<TaskControl> selectTaskControlList(TaskControl taskControl);
	
	/**
     * 新增任务控制
     * 
     * @param taskControl 任务控制信息
     * @return 结果
     */
	public int insertTaskControl(TaskControl taskControl);
	
	/**
     * 修改任务控制
     * 
     * @param taskControl 任务控制信息
     * @return 结果
     */
	public int updateTaskControl(TaskControl taskControl);
		
	/**
     * 删除任务控制信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTaskControlByIds(String ids);
	
}

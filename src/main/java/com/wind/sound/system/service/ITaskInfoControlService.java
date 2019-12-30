package com.wind.sound.system.service;

import com.wind.sound.system.dao.domain.TaskInfoControl;

import java.util.List;

/**
 * 采集任务控制关联 服务层
 * 
 * @author admin
 * @date 2019-12-30
 */
public interface ITaskInfoControlService 
{
	/**
     * 查询采集任务控制关联信息
     * 
     * @param id 采集任务控制关联ID
     * @return 采集任务控制关联信息
     */
	public TaskInfoControl selectTaskInfoControlById(Long id);
	
	/**
     * 查询采集任务控制关联列表
     * 
     * @param taskInfoControl 采集任务控制关联信息
     * @return 采集任务控制关联集合
     */
	public List<TaskInfoControl> selectTaskInfoControlList(TaskInfoControl taskInfoControl);
	
	/**
     * 新增采集任务控制关联
     * 
     * @param taskInfoControl 采集任务控制关联信息
     * @return 结果
     */
	public int insertTaskInfoControl(TaskInfoControl taskInfoControl);
	
	/**
     * 修改采集任务控制关联
     * 
     * @param taskInfoControl 采集任务控制关联信息
     * @return 结果
     */
	public int updateTaskInfoControl(TaskInfoControl taskInfoControl);
		
	/**
     * 删除采集任务控制关联信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTaskInfoControlByIds(String ids);
	
}

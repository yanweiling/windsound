package com.wind.sound.system.dao.mapper;

import com.wind.sound.system.dao.domain.TaskAssign;

import java.util.List;

/**
 * 用户任务领取 数据层
 * 
 * @author admin
 * @date 2019-12-30
 */
public interface TaskAssignMapper 
{
	/**
     * 查询用户任务领取信息
     * 
     * @param id 用户任务领取ID
     * @return 用户任务领取信息
     */
	public TaskAssign selectTaskAssignById(Long id);
	
	/**
     * 查询用户任务领取列表
     * 
     * @param taskAssign 用户任务领取信息
     * @return 用户任务领取集合
     */
	public List<TaskAssign> selectTaskAssignList(TaskAssign taskAssign);
	
	/**
     * 新增用户任务领取
     * 
     * @param taskAssign 用户任务领取信息
     * @return 结果
     */
	public int insertTaskAssign(TaskAssign taskAssign);
	
	/**
     * 修改用户任务领取
     * 
     * @param taskAssign 用户任务领取信息
     * @return 结果
     */
	public int updateTaskAssign(TaskAssign taskAssign);
	
	/**
     * 删除用户任务领取
     * 
     * @param id 用户任务领取ID
     * @return 结果
     */
	public int deleteTaskAssignById(Long id);
	
	/**
     * 批量删除用户任务领取
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTaskAssignByIds(String[] ids);
	
}
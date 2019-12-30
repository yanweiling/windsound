package com.wind.sound.system.dao.mapper;

import com.wind.sound.system.dao.domain.TaskAssignDetail;

import java.util.List;

/**
 * 用户任务分配任务详情 数据层
 * 
 * @author admin
 * @date 2019-12-30
 */
public interface TaskAssignDetailMapper 
{
	/**
     * 查询用户任务分配任务详情信息
     * 
     * @param id 用户任务分配任务详情ID
     * @return 用户任务分配任务详情信息
     */
	public TaskAssignDetail selectTaskAssignDetailById(Long id);
	
	/**
     * 查询用户任务分配任务详情列表
     * 
     * @param taskAssignDetail 用户任务分配任务详情信息
     * @return 用户任务分配任务详情集合
     */
	public List<TaskAssignDetail> selectTaskAssignDetailList(TaskAssignDetail taskAssignDetail);
	
	/**
     * 新增用户任务分配任务详情
     * 
     * @param taskAssignDetail 用户任务分配任务详情信息
     * @return 结果
     */
	public int insertTaskAssignDetail(TaskAssignDetail taskAssignDetail);
	
	/**
     * 修改用户任务分配任务详情
     * 
     * @param taskAssignDetail 用户任务分配任务详情信息
     * @return 结果
     */
	public int updateTaskAssignDetail(TaskAssignDetail taskAssignDetail);
	
	/**
     * 删除用户任务分配任务详情
     * 
     * @param id 用户任务分配任务详情ID
     * @return 结果
     */
	public int deleteTaskAssignDetailById(Long id);
	
	/**
     * 批量删除用户任务分配任务详情
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTaskAssignDetailByIds(String[] ids);
	
}
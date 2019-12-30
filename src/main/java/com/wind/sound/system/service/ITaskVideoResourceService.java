package com.wind.sound.system.service;

import com.wind.sound.system.dao.domain.TaskVideoResource;

import java.util.List;

/**
 * 录音资源 服务层
 * 
 * @author admin
 * @date 2019-12-30
 */
public interface ITaskVideoResourceService 
{
	/**
     * 查询录音资源信息
     * 
     * @param id 录音资源ID
     * @return 录音资源信息
     */
	public TaskVideoResource selectTaskVideoResourceById(String id);
	
	/**
     * 查询录音资源列表
     * 
     * @param taskVideoResource 录音资源信息
     * @return 录音资源集合
     */
	public List<TaskVideoResource> selectTaskVideoResourceList(TaskVideoResource taskVideoResource);
	
	/**
     * 新增录音资源
     * 
     * @param taskVideoResource 录音资源信息
     * @return 结果
     */
	public int insertTaskVideoResource(TaskVideoResource taskVideoResource);
	
	/**
     * 修改录音资源
     * 
     * @param taskVideoResource 录音资源信息
     * @return 结果
     */
	public int updateTaskVideoResource(TaskVideoResource taskVideoResource);
		
	/**
     * 删除录音资源信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTaskVideoResourceByIds(String ids);
	
}

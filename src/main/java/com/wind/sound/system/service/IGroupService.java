package com.wind.sound.system.service;

import com.wind.sound.system.dao.domain.Group;

import java.util.List;

/**
 * 词组 服务层
 * 
 * @author admin
 * @date 2019-12-30
 */
public interface IGroupService 
{
	/**
     * 查询词组信息
     * 
     * @param iD 词组ID
     * @return 词组信息
     */
	public Group selectGroupById(Long iD);
	
	/**
     * 查询词组列表
     * 
     * @param group 词组信息
     * @return 词组集合
     */
	public List<Group> selectGroupList(Group group);
	
	/**
     * 新增词组
     * 
     * @param group 词组信息
     * @return 结果
     */
	public int insertGroup(Group group);
	
	/**
     * 修改词组
     * 
     * @param group 词组信息
     * @return 结果
     */
	public int updateGroup(Group group);
		
	/**
     * 删除词组信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGroupByIds(String ids);
	
}

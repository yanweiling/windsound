package com.wind.sound.system.service.impl;

import java.util.List;

import com.wind.sound.common.util.Convert;
import com.wind.sound.system.dao.domain.Group;
import com.wind.sound.system.dao.mapper.GroupMapper;
import com.wind.sound.system.service.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 词组 服务层实现
 * 
 * @author admin
 * @date 2019-12-30
 */
@Service
public class GroupServiceImpl implements IGroupService
{
	@Autowired
	private GroupMapper groupMapper;

	/**
     * 查询词组信息
     * 
     * @param iD 词组ID
     * @return 词组信息
     */
    @Override
	public Group selectGroupById(Long iD)
	{
	    return groupMapper.selectGroupById(iD);
	}
	
	/**
     * 查询词组列表
     * 
     * @param group 词组信息
     * @return 词组集合
     */
	@Override
	public List<Group> selectGroupList(Group group)
	{
	    return groupMapper.selectGroupList(group);
	}
	
    /**
     * 新增词组
     * 
     * @param group 词组信息
     * @return 结果
     */
	@Override
	public int insertGroup(Group group)
	{
	    return groupMapper.insertGroup(group);
	}
	
	/**
     * 修改词组
     * 
     * @param group 词组信息
     * @return 结果
     */
	@Override
	public int updateGroup(Group group)
	{
	    return groupMapper.updateGroup(group);
	}

	/**
     * 删除词组对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteGroupByIds(String ids)
	{
		return groupMapper.deleteGroupByIds(Convert.toStrArray(ids));
	}
	
}

package com.wind.sound.system.service.impl;

import java.util.List;

import com.wind.sound.common.util.Convert;
import com.wind.sound.system.dao.domain.User;
import com.wind.sound.system.dao.mapper.UserMapper;
import com.wind.sound.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 微信用户 服务层实现
 * 
 * @author admin
 * @date 2019-12-30
 */
@Service
public class UserServiceImpl implements IUserService
{
	@Autowired
	private UserMapper userMapper;

	/**
     * 查询微信用户信息
     * 
     * @param id 微信用户ID
     * @return 微信用户信息
     */
    @Override
	public User selectUserById(String id)
	{
	    return userMapper.selectUserById(id);
	}
	
	/**
     * 查询微信用户列表
     * 
     * @param user 微信用户信息
     * @return 微信用户集合
     */
	@Override
	public List<User> selectUserList(User user)
	{
	    return userMapper.selectUserList(user);
	}
	
    /**
     * 新增微信用户
     * 
     * @param user 微信用户信息
     * @return 结果
     */
	@Override
	public int insertUser(User user)
	{
	    return userMapper.insertUser(user);
	}
	
	/**
     * 修改微信用户
     * 
     * @param user 微信用户信息
     * @return 结果
     */
	@Override
	public int updateUser(User user)
	{
	    return userMapper.updateUser(user);
	}

	/**
     * 删除微信用户对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteUserByIds(String ids)
	{
		return userMapper.deleteUserByIds(Convert.toStrArray(ids));
	}
	
}

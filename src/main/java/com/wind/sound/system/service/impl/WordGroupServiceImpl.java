package com.wind.sound.system.service.impl;

import java.util.List;

import com.wind.sound.common.util.Convert;
import com.wind.sound.system.dao.domain.WordGroup;
import com.wind.sound.system.dao.mapper.WordGroupMapper;
import com.wind.sound.system.service.IGroupService;
import com.wind.sound.system.service.IWordGroupService;
import com.wind.sound.system.service.IWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 词条组合关联 服务层实现
 * 
 * @author admin
 * @date 2019-12-30
 */
@Service
public class WordGroupServiceImpl implements IWordGroupService
{
	@Autowired
	private WordGroupMapper wordGroupMapper;

	/**
     * 查询词条组合关联信息
     * 
     * @param id 词条组合关联ID
     * @return 词条组合关联信息
     */
    @Override
	public WordGroup selectWordGroupById(Long id)
	{
	    return wordGroupMapper.selectWordGroupById(id);
	}
	
	/**
     * 查询词条组合关联列表
     * 
     * @param wordGroup 词条组合关联信息
     * @return 词条组合关联集合
     */
	@Override
	public List<WordGroup> selectWordGroupList(WordGroup wordGroup)
	{
	    return wordGroupMapper.selectWordGroupList(wordGroup);
	}
	
    /**
     * 新增词条组合关联
     * 
     * @param wordGroup 词条组合关联信息
     * @return 结果
     */
	@Override
	public int insertWordGroup(WordGroup wordGroup)
	{
	    return wordGroupMapper.insertWordGroup(wordGroup);
	}
	
	/**
     * 修改词条组合关联
     * 
     * @param wordGroup 词条组合关联信息
     * @return 结果
     */
	@Override
	public int updateWordGroup(WordGroup wordGroup)
	{
	    return wordGroupMapper.updateWordGroup(wordGroup);
	}

	/**
     * 删除词条组合关联对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteWordGroupByIds(String ids)
	{
		return wordGroupMapper.deleteWordGroupByIds(Convert.toStrArray(ids));
	}
	
}

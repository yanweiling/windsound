package com.wind.sound.system.service.impl;

import java.util.List;

import com.wind.sound.common.util.Convert;
import com.wind.sound.system.dao.domain.Word;
import com.wind.sound.system.dao.mapper.WordMapper;
import com.wind.sound.system.service.IWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 词条 服务层实现
 * 
 * @author admin
 * @date 2019-12-30
 */
@Service
public class WordServiceImpl implements IWordService
{
	@Autowired
	private WordMapper wordMapper;

	/**
     * 查询词条信息
     * 
     * @param id 词条ID
     * @return 词条信息
     */
    @Override
	public Word selectWordById(Long id)
	{
	    return wordMapper.selectWordById(id);
	}
	
	/**
     * 查询词条列表
     * 
     * @param word 词条信息
     * @return 词条集合
     */
	@Override
	public List<Word> selectWordList(Word word)
	{
	    return wordMapper.selectWordList(word);
	}
	
    /**
     * 新增词条
     * 
     * @param word 词条信息
     * @return 结果
     */
	@Override
	public int insertWord(Word word)
	{
	    return wordMapper.insertWord(word);
	}
	
	/**
     * 修改词条
     * 
     * @param word 词条信息
     * @return 结果
     */
	@Override
	public int updateWord(Word word)
	{
	    return wordMapper.updateWord(word);
	}

	/**
     * 删除词条对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteWordByIds(String ids)
	{
		return wordMapper.deleteWordByIds(Convert.toStrArray(ids));
	}
	
}

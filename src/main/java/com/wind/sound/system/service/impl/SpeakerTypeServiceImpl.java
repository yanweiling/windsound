package com.wind.sound.system.service.impl;

import java.util.List;

import com.wind.sound.common.util.Convert;
import com.wind.sound.system.dao.domain.SpeakerType;
import com.wind.sound.system.dao.mapper.SpeakerTypeMapper;
import com.wind.sound.system.service.ISpeakerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 说话人类型 服务层实现
 * 
 * @author admin
 * @date 2019-12-30
 */
@Service
public class SpeakerTypeServiceImpl implements ISpeakerTypeService
{
	@Autowired
	private SpeakerTypeMapper speakerTypeMapper;

	/**
     * 查询说话人类型信息
     * 
     * @param id 说话人类型ID
     * @return 说话人类型信息
     */
    @Override
	public SpeakerType selectSpeakerTypeById(Long id)
	{
	    return speakerTypeMapper.selectSpeakerTypeById(id);
	}
	
	/**
     * 查询说话人类型列表
     * 
     * @param speakerType 说话人类型信息
     * @return 说话人类型集合
     */
	@Override
	public List<SpeakerType> selectSpeakerTypeList(SpeakerType speakerType)
	{
	    return speakerTypeMapper.selectSpeakerTypeList(speakerType);
	}
	
    /**
     * 新增说话人类型
     * 
     * @param speakerType 说话人类型信息
     * @return 结果
     */
	@Override
	public int insertSpeakerType(SpeakerType speakerType)
	{
	    return speakerTypeMapper.insertSpeakerType(speakerType);
	}
	
	/**
     * 修改说话人类型
     * 
     * @param speakerType 说话人类型信息
     * @return 结果
     */
	@Override
	public int updateSpeakerType(SpeakerType speakerType)
	{
	    return speakerTypeMapper.updateSpeakerType(speakerType);
	}

	/**
     * 删除说话人类型对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSpeakerTypeByIds(String ids)
	{
		return speakerTypeMapper.deleteSpeakerTypeByIds(Convert.toStrArray(ids));
	}
	
}

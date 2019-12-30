package com.wind.sound.system.service;

import com.wind.sound.system.dao.domain.SpeakerType;

import java.util.List;

/**
 * 说话人类型 服务层
 * 
 * @author admin
 * @date 2019-12-30
 */
public interface ISpeakerTypeService 
{
	/**
     * 查询说话人类型信息
     * 
     * @param id 说话人类型ID
     * @return 说话人类型信息
     */
	public SpeakerType selectSpeakerTypeById(Long id);
	
	/**
     * 查询说话人类型列表
     * 
     * @param speakerType 说话人类型信息
     * @return 说话人类型集合
     */
	public List<SpeakerType> selectSpeakerTypeList(SpeakerType speakerType);
	
	/**
     * 新增说话人类型
     * 
     * @param speakerType 说话人类型信息
     * @return 结果
     */
	public int insertSpeakerType(SpeakerType speakerType);
	
	/**
     * 修改说话人类型
     * 
     * @param speakerType 说话人类型信息
     * @return 结果
     */
	public int updateSpeakerType(SpeakerType speakerType);
		
	/**
     * 删除说话人类型信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSpeakerTypeByIds(String ids);
	
}

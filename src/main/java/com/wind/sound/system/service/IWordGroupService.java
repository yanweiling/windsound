package com.wind.sound.system.service;

import com.wind.sound.system.dao.domain.WordGroup;

import java.util.List;

/**
 * 词条组合关联 服务层
 *
 * @author admin
 * @date 2019-12-30
 */
public interface IWordGroupService
{
    /**
     * 查询词条组合关联信息
     *
     * @param id 词条组合关联ID
     * @return 词条组合关联信息
     */
    public WordGroup selectWordGroupById(Long id);

    /**
     * 查询词条组合关联列表
     *
     * @param wordGroup 词条组合关联信息
     * @return 词条组合关联集合
     */
    public List<WordGroup> selectWordGroupList(WordGroup wordGroup);

    /**
     * 新增词条组合关联
     *
     * @param wordGroup 词条组合关联信息
     * @return 结果
     */
    public int insertWordGroup(WordGroup wordGroup);

    /**
     * 修改词条组合关联
     *
     * @param wordGroup 词条组合关联信息
     * @return 结果
     */
    public int updateWordGroup(WordGroup wordGroup);

    /**
     * 删除词条组合关联信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWordGroupByIds(String ids);

}

package com.wind.sound.system.dao.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 词条组合关联表 w_word_group
 * 
 * @author admin
 * @date 2019-12-30
 */
public class WordGroup
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/**  */
	private Long wordId;
	/**  */
	private Long groupId;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setWordId(Long wordId) 
	{
		this.wordId = wordId;
	}

	public Long getWordId() 
	{
		return wordId;
	}
	public void setGroupId(Long groupId) 
	{
		this.groupId = groupId;
	}

	public Long getGroupId() 
	{
		return groupId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("wordId", getWordId())
            .append("groupId", getGroupId())
            .toString();
    }
}

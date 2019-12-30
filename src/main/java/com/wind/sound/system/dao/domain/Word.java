package com.wind.sound.system.dao.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.util.Date;

/**
 * 词条表 w_word
 * 
 * @author admin
 * @date 2019-12-30
 */
public class Word
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/** 词条内容 */
	private String wordContent;
	/**  */
	private Date creatTime;
	/** 删除标志 */
	private Integer isDelete;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setWordContent(String wordContent) 
	{
		this.wordContent = wordContent;
	}

	public String getWordContent() 
	{
		return wordContent;
	}
	public void setCreatTime(Date creatTime) 
	{
		this.creatTime = creatTime;
	}

	public Date getCreatTime() 
	{
		return creatTime;
	}
	public void setIsDelete(Integer isDelete) 
	{
		this.isDelete = isDelete;
	}

	public Integer getIsDelete() 
	{
		return isDelete;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("wordContent", getWordContent())
            .append("creatTime", getCreatTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}

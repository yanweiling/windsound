package com.wind.sound.system.dao.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 词组表 w_group
 * 
 * @author admin
 * @date 2019-12-30
 */
public class Group implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long iD;
	/** 组合内容 */
	private String groupName;
	/** 唤醒词 */
	private String wakeWord;
	/** 说明 */
	private String info;
	/** 删除标志 1删除 0未删除 */
	private Integer isDelete;

	public void setID(Long iD) 
	{
		this.iD = iD;
	}

	public Long getID() 
	{
		return iD;
	}
	public void setGroupName(String groupName) 
	{
		this.groupName = groupName;
	}

	public String getGroupName() 
	{
		return groupName;
	}
	public void setWakeWord(String wakeWord) 
	{
		this.wakeWord = wakeWord;
	}

	public String getWakeWord() 
	{
		return wakeWord;
	}
	public void setInfo(String info) 
	{
		this.info = info;
	}

	public String getInfo() 
	{
		return info;
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
            .append("iD", getID())
            .append("groupName", getGroupName())
            .append("wakeWord", getWakeWord())
            .append("info", getInfo())
            .append("isDelete", getIsDelete())
            .toString();
    }
}

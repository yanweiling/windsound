package com.wind.sound.system.dao.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 任务控制表 w_task_control
 * 
 * @author admin
 * @date 2019-12-30
 */
public class TaskControl
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/** 说话人类型编码 */
	private Long speakerTypeId;
	/** 人数设定 */
	private Integer num;
	/** 口音-年龄段-性别 */
	private String speakerType;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setSpeakerTypeId(Long speakerTypeId) 
	{
		this.speakerTypeId = speakerTypeId;
	}

	public Long getSpeakerTypeId() 
	{
		return speakerTypeId;
	}
	public void setNum(Integer num) 
	{
		this.num = num;
	}

	public Integer getNum() 
	{
		return num;
	}
	public void setSpeakerType(String speakerType) 
	{
		this.speakerType = speakerType;
	}

	public String getSpeakerType() 
	{
		return speakerType;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("speakerTypeId", getSpeakerTypeId())
            .append("num", getNum())
            .append("speakerType", getSpeakerType())
            .toString();
    }
}

package com.wind.sound.system.dao.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.util.Date;

/**
 * 用户任务领取表 w_task_assign
 * 
 * @author admin
 * @date 2019-12-30
 */
public class TaskAssign
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/** 用户编码 */
	private String wxuserId;
	/** 词条组合编码 */
	private Long wordGroupId;
	/** 采集任务编码 */
	private Integer taskId;
	/** 说话人类型 口音-年龄段-性别 */
	private String speakerType;
	/** 领取时间 */
	private Date claimTime;
	/** 认领状态 1认领 2放弃 */
	private Integer claimStatus;
	/** 审核状态 0领取，待审 1 */
	private Integer verifyStatus;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setWxuserId(String wxuserId) 
	{
		this.wxuserId = wxuserId;
	}

	public String getWxuserId() 
	{
		return wxuserId;
	}
	public void setWordGroupId(Long wordGroupId) 
	{
		this.wordGroupId = wordGroupId;
	}

	public Long getWordGroupId() 
	{
		return wordGroupId;
	}
	public void setTaskId(Integer taskId) 
	{
		this.taskId = taskId;
	}

	public Integer getTaskId() 
	{
		return taskId;
	}
	public void setSpeakerType(String speakerType) 
	{
		this.speakerType = speakerType;
	}

	public String getSpeakerType() 
	{
		return speakerType;
	}
	public void setClaimTime(Date claimTime) 
	{
		this.claimTime = claimTime;
	}

	public Date getClaimTime() 
	{
		return claimTime;
	}
	public void setClaimStatus(Integer claimStatus) 
	{
		this.claimStatus = claimStatus;
	}

	public Integer getClaimStatus() 
	{
		return claimStatus;
	}
	public void setVerifyStatus(Integer verifyStatus) 
	{
		this.verifyStatus = verifyStatus;
	}

	public Integer getVerifyStatus() 
	{
		return verifyStatus;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("wxuserId", getWxuserId())
            .append("wordGroupId", getWordGroupId())
            .append("taskId", getTaskId())
            .append("speakerType", getSpeakerType())
            .append("claimTime", getClaimTime())
            .append("claimStatus", getClaimStatus())
            .append("verifyStatus", getVerifyStatus())
            .toString();
    }
}

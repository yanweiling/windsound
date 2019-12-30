package com.wind.sound.system.dao.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 采集任务表 w_task_info
 * 
 * @author admin
 * @date 2019-12-30
 */
public class TaskInfo
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/** 采集任务名称 */
	private String taskName;
	/** 词条组合编码 */
	private Long groupId;
	/** 采集价格 */
	private BigDecimal price;
	/** 微信状态 0隐藏，1公示进行中，2公示停止中，3公示完成 */
	private Integer wxStatus;
	/** 任务状态 1进行中，2手动停止 3完成 */
	private Integer taskStatus;
	/**  */
	private Date createTime;
	/** 完成时间 */
	private Date finishTime;
	/** 停止时间 */
	private Date stopTime;
	/** 发布时间 */
	private Date publishTime;
	/** 更新时间 */
	private Date updateTime;
	/** 删除标志 1删除  */
	private Integer isDelete;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setTaskName(String taskName) 
	{
		this.taskName = taskName;
	}

	public String getTaskName() 
	{
		return taskName;
	}
	public void setGroupId(Long groupId) 
	{
		this.groupId = groupId;
	}

	public Long getGroupId() 
	{
		return groupId;
	}
	public void setPrice(BigDecimal price) 
	{
		this.price = price;
	}

	public BigDecimal getPrice() 
	{
		return price;
	}
	public void setWxStatus(Integer wxStatus) 
	{
		this.wxStatus = wxStatus;
	}

	public Integer getWxStatus() 
	{
		return wxStatus;
	}
	public void setTaskStatus(Integer taskStatus) 
	{
		this.taskStatus = taskStatus;
	}

	public Integer getTaskStatus() 
	{
		return taskStatus;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setFinishTime(Date finishTime) 
	{
		this.finishTime = finishTime;
	}

	public Date getFinishTime() 
	{
		return finishTime;
	}
	public void setStopTime(Date stopTime) 
	{
		this.stopTime = stopTime;
	}

	public Date getStopTime() 
	{
		return stopTime;
	}
	public void setPublishTime(Date publishTime) 
	{
		this.publishTime = publishTime;
	}

	public Date getPublishTime() 
	{
		return publishTime;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
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
            .append("taskName", getTaskName())
            .append("groupId", getGroupId())
            .append("price", getPrice())
            .append("wxStatus", getWxStatus())
            .append("taskStatus", getTaskStatus())
            .append("createTime", getCreateTime())
            .append("finishTime", getFinishTime())
            .append("stopTime", getStopTime())
            .append("publishTime", getPublishTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}

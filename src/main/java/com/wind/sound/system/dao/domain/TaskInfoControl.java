package com.wind.sound.system.dao.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 采集任务控制关联表 w_task_info_control
 * 
 * @author admin
 * @date 2019-12-30
 */
public class TaskInfoControl
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/**  */
	private Long taskId;
	/**  */
	private Long taskControlId;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setTaskId(Long taskId) 
	{
		this.taskId = taskId;
	}

	public Long getTaskId() 
	{
		return taskId;
	}
	public void setTaskControlId(Long taskControlId) 
	{
		this.taskControlId = taskControlId;
	}

	public Long getTaskControlId() 
	{
		return taskControlId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("taskId", getTaskId())
            .append("taskControlId", getTaskControlId())
            .toString();
    }
}

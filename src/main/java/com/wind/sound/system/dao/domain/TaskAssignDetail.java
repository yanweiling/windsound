package com.wind.sound.system.dao.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 用户任务分配任务详情表 w_task_assign_detail
 * 
 * @author admin
 * @date 2019-12-30
 */
public class TaskAssignDetail
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/**  */
	private Long taskId;
	/**  */
	private String wxuserId;
	/**  */
	private Long wordId;
	/** 词条内容 */
	private String wordContent;
	/** 是否上传 */
	private Integer isUpload;
	/** 资源文件id */
	private String resourceId;
	/**  */
	private Integer isDelete;

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
	public void setWxuserId(String wxuserId) 
	{
		this.wxuserId = wxuserId;
	}

	public String getWxuserId() 
	{
		return wxuserId;
	}
	public void setWordId(Long wordId) 
	{
		this.wordId = wordId;
	}

	public Long getWordId() 
	{
		return wordId;
	}
	public void setWordContent(String wordContent) 
	{
		this.wordContent = wordContent;
	}

	public String getWordContent() 
	{
		return wordContent;
	}
	public void setIsUpload(Integer isUpload) 
	{
		this.isUpload = isUpload;
	}

	public Integer getIsUpload() 
	{
		return isUpload;
	}
	public void setResourceId(String resourceId) 
	{
		this.resourceId = resourceId;
	}

	public String getResourceId() 
	{
		return resourceId;
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
            .append("taskId", getTaskId())
            .append("wxuserId", getWxuserId())
            .append("wordId", getWordId())
            .append("wordContent", getWordContent())
            .append("isUpload", getIsUpload())
            .append("resourceId", getResourceId())
            .append("isDelete", getIsDelete())
            .toString();
    }
}

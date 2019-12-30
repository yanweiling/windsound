package com.wind.sound.system.dao.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.util.Date;

/**
 * 录音资源表 w_task_video_resource
 * 
 * @author admin
 * @date 2019-12-30
 */
public class TaskVideoResource
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private String id;
	/** 任务编码 */
	private Long taskId;
	/** 词条组合编码 */
	private Long wordGroupId;
	/** 词条编码 */
	private Long wordId;
	/** 任务认领编码 */
	private Long taskAssignId;
	/** 上传录制时间 */
	private Date uploadTime;
	/** 录音地址 */
	private String videoUrl;
	/** asr识别状态 不识别0 识别1 */
	private Integer isAsrKnown;
	/** 二次检查状态 待审核0 通过 1 不通过 2 */
	private Integer reCheckStatus;
	/** 录音最终状态 待审核0 通过 1 不通过 2 */
	private Integer vidoStatus;
	/** 删除标志 0正常 1删除 */
	private Integer isDelete;

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getId() 
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
	public void setWordGroupId(Long wordGroupId) 
	{
		this.wordGroupId = wordGroupId;
	}

	public Long getWordGroupId() 
	{
		return wordGroupId;
	}
	public void setWordId(Long wordId) 
	{
		this.wordId = wordId;
	}

	public Long getWordId() 
	{
		return wordId;
	}
	public void setTaskAssignId(Long taskAssignId) 
	{
		this.taskAssignId = taskAssignId;
	}

	public Long getTaskAssignId() 
	{
		return taskAssignId;
	}
	public void setUploadTime(Date uploadTime) 
	{
		this.uploadTime = uploadTime;
	}

	public Date getUploadTime() 
	{
		return uploadTime;
	}
	public void setVideoUrl(String videoUrl) 
	{
		this.videoUrl = videoUrl;
	}

	public String getVideoUrl() 
	{
		return videoUrl;
	}
	public void setIsAsrKnown(Integer isAsrKnown) 
	{
		this.isAsrKnown = isAsrKnown;
	}

	public Integer getIsAsrKnown() 
	{
		return isAsrKnown;
	}
	public void setReCheckStatus(Integer reCheckStatus) 
	{
		this.reCheckStatus = reCheckStatus;
	}

	public Integer getReCheckStatus() 
	{
		return reCheckStatus;
	}
	public void setVidoStatus(Integer vidoStatus) 
	{
		this.vidoStatus = vidoStatus;
	}

	public Integer getVidoStatus() 
	{
		return vidoStatus;
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
            .append("wordGroupId", getWordGroupId())
            .append("wordId", getWordId())
            .append("taskAssignId", getTaskAssignId())
            .append("uploadTime", getUploadTime())
            .append("videoUrl", getVideoUrl())
            .append("isAsrKnown", getIsAsrKnown())
            .append("reCheckStatus", getReCheckStatus())
            .append("vidoStatus", getVidoStatus())
            .append("isDelete", getIsDelete())
            .toString();
    }
}

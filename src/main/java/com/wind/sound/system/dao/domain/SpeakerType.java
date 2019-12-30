package com.wind.sound.system.dao.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 说话人类型表 w_speaker_type
 * 
 * @author admin
 * @date 2019-12-30
 */
public class SpeakerType
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/** 年龄段编码 */
	private String ageLevel;
	/** 性别 */
	private Integer gender;
	/** 口音类型编码 */
	private String accentType;
	/** 是否普通话 */
	private Integer isStandard;
	/** 口音-年龄段-性别 */
	private String speakerType;
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
	public void setAgeLevel(String ageLevel) 
	{
		this.ageLevel = ageLevel;
	}

	public String getAgeLevel() 
	{
		return ageLevel;
	}
	public void setGender(Integer gender) 
	{
		this.gender = gender;
	}

	public Integer getGender() 
	{
		return gender;
	}
	public void setAccentType(String accentType) 
	{
		this.accentType = accentType;
	}

	public String getAccentType() 
	{
		return accentType;
	}
	public void setIsStandard(Integer isStandard) 
	{
		this.isStandard = isStandard;
	}

	public Integer getIsStandard() 
	{
		return isStandard;
	}
	public void setSpeakerType(String speakerType) 
	{
		this.speakerType = speakerType;
	}

	public String getSpeakerType() 
	{
		return speakerType;
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
            .append("ageLevel", getAgeLevel())
            .append("gender", getGender())
            .append("accentType", getAccentType())
            .append("isStandard", getIsStandard())
            .append("speakerType", getSpeakerType())
            .append("isDelete", getIsDelete())
            .toString();
    }
}

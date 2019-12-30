package com.wind.sound.system.dao.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.util.Date;

/**
 * 微信用户表 wx_user
 * 
 * @author admin
 * @date 2019-12-30
 */
public class User
{
	private static final long serialVersionUID = 1L;
	
	/** UUID */
	private String id;
	/**  */
	private String openId;
	/** 昵称 */
	private String nickName;
	/** 微信头像 */
	private String headPhoto;
	/** 性别 */
	private String gender;
	/** 口音类型 */
	private String accentType;
	/** 是否是普通话 0方言 1普通话 */
	private Integer isStandard;
	/** 年龄段 */
	private String ageLevel;
	/** 手机号 */
	private String tel;
	/**  */
	private Date createTime;
	/** 用户类型 格式：口音-年龄阶段-性别 */
	private String speakerType;

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	public void setOpenId(String openId) 
	{
		this.openId = openId;
	}

	public String getOpenId() 
	{
		return openId;
	}
	public void setNickName(String nickName) 
	{
		this.nickName = nickName;
	}

	public String getNickName() 
	{
		return nickName;
	}
	public void setHeadPhoto(String headPhoto) 
	{
		this.headPhoto = headPhoto;
	}

	public String getHeadPhoto() 
	{
		return headPhoto;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	public String getGender() 
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
	public void setAgeLevel(String ageLevel) 
	{
		this.ageLevel = ageLevel;
	}

	public String getAgeLevel() 
	{
		return ageLevel;
	}
	public void setTel(String tel) 
	{
		this.tel = tel;
	}

	public String getTel() 
	{
		return tel;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
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
            .append("openId", getOpenId())
            .append("nickName", getNickName())
            .append("headPhoto", getHeadPhoto())
            .append("gender", getGender())
            .append("accentType", getAccentType())
            .append("isStandard", getIsStandard())
            .append("ageLevel", getAgeLevel())
            .append("tel", getTel())
            .append("createTime", getCreateTime())
            .append("speakerType", getSpeakerType())
            .toString();
    }
}

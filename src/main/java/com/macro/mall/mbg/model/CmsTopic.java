package com.macro.mall.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class CmsTopic implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic.category_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Long categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic.name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic.create_time
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic.start_time
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic.end_time
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic.attend_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Integer attendCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic.attention_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Integer attentionCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic.read_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Integer readCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic.award_name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String awardName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic.attend_type
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String attendType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic.content
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic.id
     *
     * @return the value of cms_topic.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic.id
     *
     * @param id the value for cms_topic.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic.category_id
     *
     * @return the value of cms_topic.category_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic.category_id
     *
     * @param categoryId the value for cms_topic.category_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic.name
     *
     * @return the value of cms_topic.name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic.name
     *
     * @param name the value for cms_topic.name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic.create_time
     *
     * @return the value of cms_topic.create_time
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic.create_time
     *
     * @param createTime the value for cms_topic.create_time
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic.start_time
     *
     * @return the value of cms_topic.start_time
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic.start_time
     *
     * @param startTime the value for cms_topic.start_time
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic.end_time
     *
     * @return the value of cms_topic.end_time
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic.end_time
     *
     * @param endTime the value for cms_topic.end_time
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic.attend_count
     *
     * @return the value of cms_topic.attend_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Integer getAttendCount() {
        return attendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic.attend_count
     *
     * @param attendCount the value for cms_topic.attend_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic.attention_count
     *
     * @return the value of cms_topic.attention_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Integer getAttentionCount() {
        return attentionCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic.attention_count
     *
     * @param attentionCount the value for cms_topic.attention_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setAttentionCount(Integer attentionCount) {
        this.attentionCount = attentionCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic.read_count
     *
     * @return the value of cms_topic.read_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic.read_count
     *
     * @param readCount the value for cms_topic.read_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic.award_name
     *
     * @return the value of cms_topic.award_name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getAwardName() {
        return awardName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic.award_name
     *
     * @param awardName the value for cms_topic.award_name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic.attend_type
     *
     * @return the value of cms_topic.attend_type
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getAttendType() {
        return attendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic.attend_type
     *
     * @param attendType the value for cms_topic.attend_type
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setAttendType(String attendType) {
        this.attendType = attendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic.content
     *
     * @return the value of cms_topic.content
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic.content
     *
     * @param content the value for cms_topic.content
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", attendCount=").append(attendCount);
        sb.append(", attentionCount=").append(attentionCount);
        sb.append(", readCount=").append(readCount);
        sb.append(", awardName=").append(awardName);
        sb.append(", attendType=").append(attendType);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
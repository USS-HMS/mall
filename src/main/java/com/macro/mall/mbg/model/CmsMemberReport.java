package com.macro.mall.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class CmsMemberReport implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.report_type
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Integer reportType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.report_member_name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String reportMemberName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.create_time
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.report_object
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String reportObject;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.report_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Integer reportStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.handle_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Integer handleStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.note
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_member_report
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.id
     *
     * @return the value of cms_member_report.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.id
     *
     * @param id the value for cms_member_report.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.report_type
     *
     * @return the value of cms_member_report.report_type
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Integer getReportType() {
        return reportType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.report_type
     *
     * @param reportType the value for cms_member_report.report_type
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.report_member_name
     *
     * @return the value of cms_member_report.report_member_name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getReportMemberName() {
        return reportMemberName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.report_member_name
     *
     * @param reportMemberName the value for cms_member_report.report_member_name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setReportMemberName(String reportMemberName) {
        this.reportMemberName = reportMemberName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.create_time
     *
     * @return the value of cms_member_report.create_time
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.create_time
     *
     * @param createTime the value for cms_member_report.create_time
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.report_object
     *
     * @return the value of cms_member_report.report_object
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getReportObject() {
        return reportObject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.report_object
     *
     * @param reportObject the value for cms_member_report.report_object
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setReportObject(String reportObject) {
        this.reportObject = reportObject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.report_status
     *
     * @return the value of cms_member_report.report_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Integer getReportStatus() {
        return reportStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.report_status
     *
     * @param reportStatus the value for cms_member_report.report_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.handle_status
     *
     * @return the value of cms_member_report.handle_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Integer getHandleStatus() {
        return handleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.handle_status
     *
     * @param handleStatus the value for cms_member_report.handle_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.note
     *
     * @return the value of cms_member_report.note
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.note
     *
     * @param note the value for cms_member_report.note
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
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
        sb.append(", reportType=").append(reportType);
        sb.append(", reportMemberName=").append(reportMemberName);
        sb.append(", createTime=").append(createTime);
        sb.append(", reportObject=").append(reportObject);
        sb.append(", reportStatus=").append(reportStatus);
        sb.append(", handleStatus=").append(handleStatus);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
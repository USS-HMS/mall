package com.macro.mall.mbg.model;

import java.io.Serializable;

public class UmsMemberReceiveAddress implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.member_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Long memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.phone_number
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String phoneNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.default_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Integer defaultStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.post_code
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String postCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.province
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.city
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.region
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String region;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.detail_address
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String detailAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.id
     *
     * @return the value of ums_member_receive_address.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.id
     *
     * @param id the value for ums_member_receive_address.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.member_id
     *
     * @return the value of ums_member_receive_address.member_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.member_id
     *
     * @param memberId the value for ums_member_receive_address.member_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.name
     *
     * @return the value of ums_member_receive_address.name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.name
     *
     * @param name the value for ums_member_receive_address.name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.phone_number
     *
     * @return the value of ums_member_receive_address.phone_number
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.phone_number
     *
     * @param phoneNumber the value for ums_member_receive_address.phone_number
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.default_status
     *
     * @return the value of ums_member_receive_address.default_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.default_status
     *
     * @param defaultStatus the value for ums_member_receive_address.default_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.post_code
     *
     * @return the value of ums_member_receive_address.post_code
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.post_code
     *
     * @param postCode the value for ums_member_receive_address.post_code
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.province
     *
     * @return the value of ums_member_receive_address.province
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.province
     *
     * @param province the value for ums_member_receive_address.province
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.city
     *
     * @return the value of ums_member_receive_address.city
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.city
     *
     * @param city the value for ums_member_receive_address.city
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.region
     *
     * @return the value of ums_member_receive_address.region
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getRegion() {
        return region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.region
     *
     * @param region the value for ums_member_receive_address.region
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.detail_address
     *
     * @return the value of ums_member_receive_address.detail_address
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.detail_address
     *
     * @param detailAddress the value for ums_member_receive_address.detail_address
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
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
        sb.append(", memberId=").append(memberId);
        sb.append(", name=").append(name);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", defaultStatus=").append(defaultStatus);
        sb.append(", postCode=").append(postCode);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", region=").append(region);
        sb.append(", detailAddress=").append(detailAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
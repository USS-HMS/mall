package com.macro.mall.mbg.model;

import java.io.Serializable;

public class UmsAdminPermissionRelation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin_permission_relation.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin_permission_relation.admin_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Long adminId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin_permission_relation.permission_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Long permissionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin_permission_relation.type
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_admin_permission_relation
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_permission_relation.id
     *
     * @return the value of ums_admin_permission_relation.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_permission_relation.id
     *
     * @param id the value for ums_admin_permission_relation.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_permission_relation.admin_id
     *
     * @return the value of ums_admin_permission_relation.admin_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_permission_relation.admin_id
     *
     * @param adminId the value for ums_admin_permission_relation.admin_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_permission_relation.permission_id
     *
     * @return the value of ums_admin_permission_relation.permission_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_permission_relation.permission_id
     *
     * @param permissionId the value for ums_admin_permission_relation.permission_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_permission_relation.type
     *
     * @return the value of ums_admin_permission_relation.type
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_permission_relation.type
     *
     * @param type the value for ums_admin_permission_relation.type
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_permission_relation
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
        sb.append(", adminId=").append(adminId);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
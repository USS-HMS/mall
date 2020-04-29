package com.macro.mall.mbg.model;

import java.io.Serializable;

public class UmsRoleMenuRelation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role_menu_relation.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role_menu_relation.role_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role_menu_relation.menu_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Long menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role_menu_relation.id
     *
     * @return the value of ums_role_menu_relation.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role_menu_relation.id
     *
     * @param id the value for ums_role_menu_relation.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role_menu_relation.role_id
     *
     * @return the value of ums_role_menu_relation.role_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role_menu_relation.role_id
     *
     * @param roleId the value for ums_role_menu_relation.role_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role_menu_relation.menu_id
     *
     * @return the value of ums_role_menu_relation.menu_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role_menu_relation.menu_id
     *
     * @param menuId the value for ums_role_menu_relation.menu_id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
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
        sb.append(", roleId=").append(roleId);
        sb.append(", menuId=").append(menuId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
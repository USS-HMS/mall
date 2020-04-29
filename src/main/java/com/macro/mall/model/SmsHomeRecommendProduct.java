package com.macro.mall.model;

import java.io.Serializable;

public class SmsHomeRecommendProduct implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_recommend_product.id
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_recommend_product.product_id
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_recommend_product.product_name
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_recommend_product.recommend_status
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    private Integer recommendStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_recommend_product.sort
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_home_recommend_product
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_recommend_product.id
     *
     * @return the value of sms_home_recommend_product.id
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_recommend_product.id
     *
     * @param id the value for sms_home_recommend_product.id
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_recommend_product.product_id
     *
     * @return the value of sms_home_recommend_product.product_id
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_recommend_product.product_id
     *
     * @param productId the value for sms_home_recommend_product.product_id
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_recommend_product.product_name
     *
     * @return the value of sms_home_recommend_product.product_name
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_recommend_product.product_name
     *
     * @param productName the value for sms_home_recommend_product.product_name
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_recommend_product.recommend_status
     *
     * @return the value of sms_home_recommend_product.recommend_status
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_recommend_product.recommend_status
     *
     * @param recommendStatus the value for sms_home_recommend_product.recommend_status
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_recommend_product.sort
     *
     * @return the value of sms_home_recommend_product.sort
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_recommend_product.sort
     *
     * @param sort the value for sms_home_recommend_product.sort
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbg.generated Wed Apr 29 21:38:58 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", recommendStatus=").append(recommendStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
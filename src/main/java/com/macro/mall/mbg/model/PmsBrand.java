package com.macro.mall.mbg.model;

import java.io.Serializable;

public class PmsBrand implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_brand.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_brand.name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_brand.first_letter
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String firstLetter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_brand.sort
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_brand.factory_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Integer factoryStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_brand.show_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Integer showStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_brand.product_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Integer productCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_brand.product_comment_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private Integer productCommentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_brand.logo
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String logo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_brand.big_pic
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String bigPic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_brand.brand_story
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private String brandStory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_brand
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_brand.id
     *
     * @return the value of pms_brand.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_brand.id
     *
     * @param id the value for pms_brand.id
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_brand.name
     *
     * @return the value of pms_brand.name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_brand.name
     *
     * @param name the value for pms_brand.name
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_brand.first_letter
     *
     * @return the value of pms_brand.first_letter
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getFirstLetter() {
        return firstLetter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_brand.first_letter
     *
     * @param firstLetter the value for pms_brand.first_letter
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_brand.sort
     *
     * @return the value of pms_brand.sort
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_brand.sort
     *
     * @param sort the value for pms_brand.sort
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_brand.factory_status
     *
     * @return the value of pms_brand.factory_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_brand.factory_status
     *
     * @param factoryStatus the value for pms_brand.factory_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_brand.show_status
     *
     * @return the value of pms_brand.show_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_brand.show_status
     *
     * @param showStatus the value for pms_brand.show_status
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_brand.product_count
     *
     * @return the value of pms_brand.product_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_brand.product_count
     *
     * @param productCount the value for pms_brand.product_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_brand.product_comment_count
     *
     * @return the value of pms_brand.product_comment_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public Integer getProductCommentCount() {
        return productCommentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_brand.product_comment_count
     *
     * @param productCommentCount the value for pms_brand.product_comment_count
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setProductCommentCount(Integer productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_brand.logo
     *
     * @return the value of pms_brand.logo
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getLogo() {
        return logo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_brand.logo
     *
     * @param logo the value for pms_brand.logo
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_brand.big_pic
     *
     * @return the value of pms_brand.big_pic
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getBigPic() {
        return bigPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_brand.big_pic
     *
     * @param bigPic the value for pms_brand.big_pic
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_brand.brand_story
     *
     * @return the value of pms_brand.brand_story
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public String getBrandStory() {
        return brandStory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_brand.brand_story
     *
     * @param brandStory the value for pms_brand.brand_story
     *
     * @mbg.generated Wed Apr 29 21:40:30 CST 2020
     */
    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
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
        sb.append(", name=").append(name);
        sb.append(", firstLetter=").append(firstLetter);
        sb.append(", sort=").append(sort);
        sb.append(", factoryStatus=").append(factoryStatus);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", productCount=").append(productCount);
        sb.append(", productCommentCount=").append(productCommentCount);
        sb.append(", logo=").append(logo);
        sb.append(", bigPic=").append(bigPic);
        sb.append(", brandStory=").append(brandStory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
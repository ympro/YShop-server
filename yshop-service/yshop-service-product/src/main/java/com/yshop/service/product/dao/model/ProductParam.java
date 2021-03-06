package com.yshop.service.product.dao.model;

import java.util.Date;

public class ProductParam {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_param.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_param.product_category_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Long productCategoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_param.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Date ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_param.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Date mtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_param.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Byte isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_param.param_data
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String paramData;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_param.id
     *
     * @return the value of product_param.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_param.id
     *
     * @param id the value for product_param.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_param.product_category_id
     *
     * @return the value of product_param.product_category_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_param.product_category_id
     *
     * @param productCategoryId the value for product_param.product_category_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_param.ctime
     *
     * @return the value of product_param.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_param.ctime
     *
     * @param ctime the value for product_param.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_param.mtime
     *
     * @return the value of product_param.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_param.mtime
     *
     * @param mtime the value for product_param.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_param.is_delete
     *
     * @return the value of product_param.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_param.is_delete
     *
     * @param isDelete the value for product_param.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_param.param_data
     *
     * @return the value of product_param.param_data
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_param.param_data
     *
     * @param paramData the value for product_param.param_data
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}
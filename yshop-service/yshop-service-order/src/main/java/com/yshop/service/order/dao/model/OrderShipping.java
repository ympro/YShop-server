package com.yshop.service.order.dao.model;

import java.util.Date;

public class OrderShipping {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shipping.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shipping.order_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shipping.receiver_name
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String receiverName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shipping.receiver_mobile
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String receiverMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shipping.state_code
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String stateCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shipping.city_code
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String cityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shipping.district_code
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String districtCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shipping.detail_address
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String detailAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shipping.zip_code
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String zipCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shipping.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Date ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shipping.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Date mtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shipping.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Byte isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shipping.id
     *
     * @return the value of order_shipping.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shipping.id
     *
     * @param id the value for order_shipping.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shipping.order_id
     *
     * @return the value of order_shipping.order_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shipping.order_id
     *
     * @param orderId the value for order_shipping.order_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shipping.receiver_name
     *
     * @return the value of order_shipping.receiver_name
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shipping.receiver_name
     *
     * @param receiverName the value for order_shipping.receiver_name
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shipping.receiver_mobile
     *
     * @return the value of order_shipping.receiver_mobile
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shipping.receiver_mobile
     *
     * @param receiverMobile the value for order_shipping.receiver_mobile
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shipping.state_code
     *
     * @return the value of order_shipping.state_code
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shipping.state_code
     *
     * @param stateCode the value for order_shipping.state_code
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode == null ? null : stateCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shipping.city_code
     *
     * @return the value of order_shipping.city_code
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shipping.city_code
     *
     * @param cityCode the value for order_shipping.city_code
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shipping.district_code
     *
     * @return the value of order_shipping.district_code
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shipping.district_code
     *
     * @param districtCode the value for order_shipping.district_code
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shipping.detail_address
     *
     * @return the value of order_shipping.detail_address
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shipping.detail_address
     *
     * @param detailAddress the value for order_shipping.detail_address
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shipping.zip_code
     *
     * @return the value of order_shipping.zip_code
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shipping.zip_code
     *
     * @param zipCode the value for order_shipping.zip_code
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shipping.ctime
     *
     * @return the value of order_shipping.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shipping.ctime
     *
     * @param ctime the value for order_shipping.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shipping.mtime
     *
     * @return the value of order_shipping.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shipping.mtime
     *
     * @param mtime the value for order_shipping.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shipping.is_delete
     *
     * @return the value of order_shipping.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shipping.is_delete
     *
     * @param isDelete the value for order_shipping.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}
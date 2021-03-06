package com.yshop.service.content.dao.model;

import java.util.Date;

public class Content {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.category_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Long categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.title
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.sub_title
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String subTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.url
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.pic
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Date ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Date mtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Byte isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.content
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.id
     *
     * @return the value of content.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.id
     *
     * @param id the value for content.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.category_id
     *
     * @return the value of content.category_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.category_id
     *
     * @param categoryId the value for content.category_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.title
     *
     * @return the value of content.title
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.title
     *
     * @param title the value for content.title
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.sub_title
     *
     * @return the value of content.sub_title
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.sub_title
     *
     * @param subTitle the value for content.sub_title
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.desc
     *
     * @return the value of content.desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.desc
     *
     * @param desc the value for content.desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.url
     *
     * @return the value of content.url
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.url
     *
     * @param url the value for content.url
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.pic
     *
     * @return the value of content.pic
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.pic
     *
     * @param pic the value for content.pic
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.ctime
     *
     * @return the value of content.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.ctime
     *
     * @param ctime the value for content.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.mtime
     *
     * @return the value of content.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.mtime
     *
     * @param mtime the value for content.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.is_delete
     *
     * @return the value of content.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.is_delete
     *
     * @param isDelete the value for content.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.content
     *
     * @return the value of content.content
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.content
     *
     * @param content the value for content.content
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
package com.snrtqi.buy.pojo;

/**
 * 分类信息类
 */
public class Category {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.cid
     *
     * @mbggenerated
     */
    private String cid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.cname
     *
     * @mbggenerated
     */
    private String cname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.cid
     *
     * @return the value of category.cid
     *
     * @mbggenerated
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.cid
     *
     * @param cid the value for category.cid
     *
     * @mbggenerated
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.cname
     *
     * @return the value of category.cname
     *
     * @mbggenerated
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.cname
     *
     * @param cname the value for category.cname
     *
     * @mbggenerated
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }
}
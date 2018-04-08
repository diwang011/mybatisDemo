package com.next.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class FunOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funorder.id
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funorder.orderNum
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    private String orderNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funorder.shopName
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    private String shopName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funorder.costs
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    private BigDecimal costs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funorder.shippingCost
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    private BigDecimal shippingCost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funorder.waybillNum
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    private String waybillNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funorder.status
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funorder.receiver
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    private String receiver;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funorder.receivingAddress
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    private String receivingAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funorder.createdBy
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funorder.createdDate
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    private Date createdDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funorder.lastModifiedBy
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    private String lastModifiedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funorder.lastModifiedDate
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    private Date lastModifiedDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funorder.id
     *
     * @return the value of funorder.id
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funorder.id
     *
     * @param id the value for funorder.id
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funorder.orderNum
     *
     * @return the value of funorder.orderNum
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funorder.orderNum
     *
     * @param orderNum the value for funorder.orderNum
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funorder.shopName
     *
     * @return the value of funorder.shopName
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funorder.shopName
     *
     * @param shopName the value for funorder.shopName
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funorder.costs
     *
     * @return the value of funorder.costs
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public BigDecimal getCosts() {
        return costs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funorder.costs
     *
     * @param costs the value for funorder.costs
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public void setCosts(BigDecimal costs) {
        this.costs = costs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funorder.shippingCost
     *
     * @return the value of funorder.shippingCost
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public BigDecimal getShippingCost() {
        return shippingCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funorder.shippingCost
     *
     * @param shippingCost the value for funorder.shippingCost
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public void setShippingCost(BigDecimal shippingCost) {
        this.shippingCost = shippingCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funorder.waybillNum
     *
     * @return the value of funorder.waybillNum
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public String getWaybillNum() {
        return waybillNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funorder.waybillNum
     *
     * @param waybillNum the value for funorder.waybillNum
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public void setWaybillNum(String waybillNum) {
        this.waybillNum = waybillNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funorder.status
     *
     * @return the value of funorder.status
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funorder.status
     *
     * @param status the value for funorder.status
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funorder.receiver
     *
     * @return the value of funorder.receiver
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funorder.receiver
     *
     * @param receiver the value for funorder.receiver
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funorder.receivingAddress
     *
     * @return the value of funorder.receivingAddress
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public String getReceivingAddress() {
        return receivingAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funorder.receivingAddress
     *
     * @param receivingAddress the value for funorder.receivingAddress
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funorder.createdBy
     *
     * @return the value of funorder.createdBy
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funorder.createdBy
     *
     * @param createdBy the value for funorder.createdBy
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funorder.createdDate
     *
     * @return the value of funorder.createdDate
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funorder.createdDate
     *
     * @param createdDate the value for funorder.createdDate
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funorder.lastModifiedBy
     *
     * @return the value of funorder.lastModifiedBy
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funorder.lastModifiedBy
     *
     * @param lastModifiedBy the value for funorder.lastModifiedBy
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funorder.lastModifiedDate
     *
     * @return the value of funorder.lastModifiedDate
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funorder.lastModifiedDate
     *
     * @param lastModifiedDate the value for funorder.lastModifiedDate
     *
     * @mbggenerated Sat Mar 03 21:49:17 CST 2018
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
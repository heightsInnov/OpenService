/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.union.bof.dao;

import java.io.Serializable;

 

/**
 *
 * @author aajibade
 */
public class FloatRateRequest implements Serializable {
     private String productCode;
    private String currencyCode;
    private String branchCode;
    private String amountSlab;
    private String tenor;
    private String fromDate;
    

     
  
    

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getAmountSlab() {
        return amountSlab;
    }

    public void setAmountSlab(String amountSlab) {
        this.amountSlab = amountSlab;
    }

    public String getTenor() {
        return tenor;
    }

    public void setTenor(String tenor) {
        this.tenor = tenor;
    }

    /**
     * @return the fromDate
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * @param fromDate the fromDate to set
     */
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

     

    
    
}

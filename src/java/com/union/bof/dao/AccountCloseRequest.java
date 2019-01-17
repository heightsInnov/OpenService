package com.union.bof.dao;

import java.io.Serializable;

public class AccountCloseRequest implements Serializable{
    
    
    
    private String accountNumber;
    private String customerNumber;
    private String CCY;
    private String BranchCode;
    private String ACCLS;
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCCY() {
        return CCY;
    }

    public void setCCY(String CCY) {
        this.CCY = CCY;
    }

    public String getBranchCode() {
        return BranchCode;
    }

    public void setBranchCode(String BranchCode) {
        this.BranchCode = BranchCode;
    }

    public String getACCLS() {
        return ACCLS;
    }

    public void setACCLS(String ACCLS) {
        this.ACCLS = ACCLS;
    }



}

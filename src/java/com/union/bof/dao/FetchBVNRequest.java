/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.union.bof.dao;

import java.io.Serializable;

/**
 *
 * @author tdashaolu
 */
public class FetchBVNRequest implements Serializable{
    private String branchcode;
    private String accountno;
    private String customerid;

    
    /**
     * @return the branchcode
     */
    public String getBranchcode() {
        return branchcode;
    }

    /**
     * @param branchcode the branchcode to set
     */
    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    /**
     * @return the accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
     * @param accountno the accountno to set
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
     * @return the customerid
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * @param customerid the customerid to set
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

      
}

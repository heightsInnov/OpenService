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
public class AccountReactivationRequest implements Serializable{
    private String accountnumber;
    private String customernumber;
    private String ccy;
    private String branchcode;
    private String accls;
    private String userid;
    private String statuscode;
	private String miscode;

    /**
     * @return the accountnumber
     */
    public String getAccountnumber() {
        return accountnumber;
    }

    /**
     * @param accountnumber the accountnumber to set
     */
    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    /**
     * @return the customernumber
     */
    public String getCustomernumber() {
        return customernumber;
    }

    /**
     * @param customernumber the customernumber to set
     */
    public void setCustomernumber(String customernumber) {
        this.customernumber = customernumber;
    }

    /**
     * @return the ccy
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * @param ccy the ccy to set
     */
    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

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
     * @return the accls
     */
    public String getAccls() {
        return accls;
    }

    /**
     * @param accls the accls to set
     */
    public void setAccls(String accls) {
        this.accls = accls;
    }

    /**
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return the statuscode
     */
    public String getStatuscode() {
        return statuscode;
    }

    /**
     * @param statuscode the statuscode to set
     */
    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

	public String getMiscode() {
		return miscode;
	}

	public void setMiscode(String miscode) {
		this.miscode = miscode;
	}

    
}

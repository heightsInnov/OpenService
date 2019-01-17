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
public class CreateAccountMemoRequest implements Serializable{
    private String account;
    private String memotxt;

    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return the memotxt
     */
    public String getMemotxt() {
        return memotxt;
    }

    /**
     * @param memotxt the memotxt to set
     */
    public void setMemotxt(String memotxt) {
        this.memotxt = memotxt;
    }
    
}

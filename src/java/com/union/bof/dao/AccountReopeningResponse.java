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
public class AccountReopeningResponse implements Serializable{
    private String responsecode;
    private String responsemessage;

    /**
     * @return the responsecode
     */
    public String getResponsecode() {
        return responsecode;
    }

    /**
     * @param responsecode the responsecode to set
     */
    public void setResponsecode(String responsecode) {
        this.responsecode = responsecode;
    }

    /**
     * @return the responsemessage
     */
    public String getResponsemessage() {
        return responsemessage;
    }

    /**
     * @param responsemessage the responsemessage to set
     */
    public void setResponsemessage(String responsemessage) {
        this.responsemessage = responsemessage;
    }
    
}

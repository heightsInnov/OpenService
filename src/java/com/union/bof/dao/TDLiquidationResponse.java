/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.union.bof.dao;

import java.io.Serializable;

/**
 *
 * @author wwakanni
 */
public class TDLiquidationResponse implements Serializable{

    private String responseCode;
    private String responseMessage;

    /**
     * @return the responseCode
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * @param responseCode the responseCode to set
     */
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * @return the responseMessage
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * @param responseMessage the responseMessage to set
     */
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

}

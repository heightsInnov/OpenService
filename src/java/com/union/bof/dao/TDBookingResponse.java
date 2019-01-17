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
public class TDBookingResponse implements Serializable{

    private String responseCode;
    private String contract_ref_no;
    private String  return_CODE;
    private String  response_message;

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
     * @return the contract_ref_no
     */
    public String getContract_ref_no() {
        return contract_ref_no;
    }

    /**
     * @param contract_ref_no the contract_ref_no to set
     */
    public void setContract_ref_no(String contract_ref_no) {
        this.contract_ref_no = contract_ref_no;
    }

    /**
     * @return the return_CODE
     */
    public String getReturn_CODE() {
        return return_CODE;
    }

    /**
     * @param return_CODE the return_CODE to set
     */
    public void setReturn_CODE(String return_CODE) {
        this.return_CODE = return_CODE;
    }

    /**
     * @return the response_message
     */
    public String getResponse_message() {
        return response_message;
    }

    /**
     * @param response_message the response_message to set
     */
    public void setResponse_message(String response_message) {
        this.response_message = response_message;
    }

    

}

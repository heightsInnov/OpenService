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
public class TDLiquidationRequest implements Serializable {

    private String fccref;
    private String prepaymentpenaltyamount;
    private String penaltyOption;
    

    /**
     * @return the fccref
     */
    public String getFccref() {
        return fccref;
    }

    /**
     * @param fccref the fccref to set
     */
    public void setFccref(String fccref) {
        this.fccref = fccref;
    }

    
    /**
     * @return the prepaymentpenaltyamount
     */
    public String getPrepaymentpenaltyamount() {
        return prepaymentpenaltyamount;
    }

    /**
     * @param prepaymentpenaltyamount the prepaymentpenaltyamount to set
     */
    public void setPrepaymentpenaltyamount(String prepaymentpenaltyamount) {
        this.prepaymentpenaltyamount = prepaymentpenaltyamount;
    }

    /**
     * @return the penaltyOption
     */
    public String getPenaltyOption() {
        return penaltyOption;
    }

    /**
     * @param penaltyOption the penaltyOption to set
     */
    public void setPenaltyOption(String penaltyOption) {
        this.penaltyOption = penaltyOption;
    }

   
}

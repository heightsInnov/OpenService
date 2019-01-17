/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.union.bof.dao;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author tdashaolu
 */
public class StandingInstructionCloseRequest implements Serializable{
    private String instrno;
    private String conrefno;
    private String draccount;
    private String craccount;
    private String amount;
    private String fccref;
    private BigDecimal latevnseqno;
    private BigDecimal instversionno;

    /**
     * @return the instrno
     */
    public String getInstrno() {
        return instrno;
    }

    /**
     * @param instrno the instrno to set
     */
    public void setInstrno(String instrno) {
        this.instrno = instrno;
    }

    /**
     * @return the draccount
     */
    public String getDraccount() {
        return draccount;
    }

    /**
     * @param draccount the draccount to set
     */
    public void setDraccount(String draccount) {
        this.draccount = draccount;
    }

    /**
     * @return the craccount
     */
    public String getCraccount() {
        return craccount;
    }

    /**
     * @param craccount the craccount to set
     */
    public void setCraccount(String craccount) {
        this.craccount = craccount;
    }

    

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    

    /**
     * @return the conrefno
     */
    public String getConrefno() {
        return conrefno;
    }

    /**
     * @param conrefno the conrefno to set
     */
    public void setConrefno(String conrefno) {
        this.conrefno = conrefno;
    }

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
     * @return the latevnseqno
     */
    public BigDecimal getLatevnseqno() {
        return latevnseqno;
    }

    /**
     * @param latevnseqno the latevnseqno to set
     */
    public void setLatevnseqno(BigDecimal latevnseqno) {
        this.latevnseqno = latevnseqno;
    }

    /**
     * @return the instversionno
     */
    public BigDecimal getInstversionno() {
        return instversionno;
    }

    /**
     * @param instversionno the instversionno to set
     */
    public void setInstversionno(BigDecimal instversionno) {
        this.instversionno = instversionno;
    }

  
    
    
}

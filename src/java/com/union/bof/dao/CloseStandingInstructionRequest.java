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
public class CloseStandingInstructionRequest implements Serializable{
    private String instr_no;
    private String cr_acct;
    private String dr_acct;
    private double amount;
    private String dr_acct_branch;
    private String cr_acct_branch;
    

    /**
     * @return the instr_no
     */
    public String getInstr_no() {
        return instr_no;
    }

    /**
     * @param instr_no the instr_no to set
     */
    public void setInstr_no(String instr_no) {
        this.instr_no = instr_no;
    }

    /**
     * @return the cr_acct
     */
    public String getCr_acct() {
        return cr_acct;
    }

    /**
     * @param cr_acct the cr_acct to set
     */
    public void setCr_acct(String cr_acct) {
        this.cr_acct = cr_acct;
    }

    /**
     * @return the dr_acct
     */
    public String getDr_acct() {
        return dr_acct;
    }

    /**
     * @param dr_acct the dr_acct to set
     */
    public void setDr_acct(String dr_acct) {
        this.dr_acct = dr_acct;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the dr_acct_branch
     */
    public String getDr_acct_branch() {
        return dr_acct_branch;
    }

    /**
     * @param dr_acct_branch the dr_acct_branch to set
     */
    public void setDr_acct_branch(String dr_acct_branch) {
        this.dr_acct_branch = dr_acct_branch;
    }

    /**
     * @return the cr_acct_branch
     */
    public String getCr_acct_branch() {
        return cr_acct_branch;
    }

    /**
     * @param cr_acct_branch the cr_acct_branch to set
     */
    public void setCr_acct_branch(String cr_acct_branch) {
        this.cr_acct_branch = cr_acct_branch;
    }
    
    
}

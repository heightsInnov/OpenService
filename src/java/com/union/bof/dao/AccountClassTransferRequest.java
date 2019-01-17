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
public class AccountClassTransferRequest implements Serializable{
   private String acct_branch;
   private String acctno;
   private String from_acct_class;
   private String to_acct_class;

    /**
     * @return the acct_branch
     */
    public String getAcct_branch() {
        return acct_branch;
    }

    /**
     * @param acct_branch the acct_branch to set
     */
    public void setAcct_branch(String acct_branch) {
        this.acct_branch = acct_branch;
    }

    /**
     * @return the acctno
     */
    public String getAcctno() {
        return acctno;
    }

    /**
     * @param acctno the acctno to set
     */
    public void setAcctno(String acctno) {
        this.acctno = acctno;
    }

    /**
     * @return the from_acct_class
     */
    public String getFrom_acct_class() {
        return from_acct_class;
    }

    /**
     * @param from_acct_class the from_acct_class to set
     */
    public void setFrom_acct_class(String from_acct_class) {
        this.from_acct_class = from_acct_class;
    }

    /**
     * @return the to_acct_class
     */
    public String getTo_acct_class() {
        return to_acct_class;
    }

    /**
     * @param to_acct_class the to_acct_class to set
     */
    public void setTo_acct_class(String to_acct_class) {
        this.to_acct_class = to_acct_class;
    }
           
         
 
      
}

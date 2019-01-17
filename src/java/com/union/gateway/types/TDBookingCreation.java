/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.union.gateway.types;

import java.io.Serializable;

/**
 *
 * @author wwakanni
 */
public class TDBookingCreation implements Serializable {

//    private Chgs[] Chgs;
//    private List<Ints> Ints;
    //private Ints Intsobj;
//    private MisDetails[] MisDetails;
//    private Schds[] Schds;
//    private Sttlment[] Sttlment;
//    private UDFDetails[] UDFDetails;
//    private taxs[] taxs;
    private String p_scode; // -- Source Code : CPC
    private String p_xref; // --- external reference number: LD0001/871T0-2
    private String p_brn; //  -- branch of booking: 789
    private String p_prd; // -- product:TDIC
    private String p_cpty; //  --- counter party : customer id : 314125
    private String p_amt; //  --- amount: 1000000
    private String p_ccy; //   --- currency: NGN
    private String p_orglstdt; // -- start date: 20141124
    private String p_trndt; //  -- txn date 20141124
    private String p_valdt; //  -- value date 20131124
    private String p_mattype; // --- Fixed (X) or floating (F) OR Call (C)--- USE F
    private String p_matdt; //   -- maturity date : 20141225
    private String p_tenor; //    --- TENOR: 31
    private String p_dfltacc; //  --- DEFAULT ACCOUNT :0016347613
    private String p_dfltaccbrn; //  --- ACCT BRANCH: 225
    private String p_tdesc; // -- DESCRIPTION/NARRATION: TD FOR 31DAYS @ 8% EXP 25/12/2014 PRIN + INT
    private String p_authstat; //  --- AUTH STAT: A
    private String p_uref; // -- USER REFERENCE: LD0001/871T0-2
    private String intrate; // -- Interest Rate

    /**
     * @return the p_scode
     */
    public String getP_scode() {
        return p_scode;
    }

    /**
     * @param p_scode the p_scode to set
     */
    public void setP_scode(String p_scode) {
        this.p_scode = p_scode;
    }

    /**
     * @return the p_xref
     */
    public String getP_xref() {
        return p_xref;
    }

    /**
     * @param p_xref the p_xref to set
     */
    public void setP_xref(String p_xref) {
        this.p_xref = p_xref;
    }

    /**
     * @return the p_brn
     */
    public String getP_brn() {
        return p_brn;
    }

    /**
     * @param p_brn the p_brn to set
     */
    public void setP_brn(String p_brn) {
        this.p_brn = p_brn;
    }

    /**
     * @return the p_prd
     */
    public String getP_prd() {
        return p_prd;
    }

    /**
     * @param p_prd the p_prd to set
     */
    public void setP_prd(String p_prd) {
        this.p_prd = p_prd;
    }

    /**
     * @return the p_cpty
     */
    public String getP_cpty() {
        return p_cpty;
    }

    /**
     * @param p_cpty the p_cpty to set
     */
    public void setP_cpty(String p_cpty) {
        this.p_cpty = p_cpty;
    }

    /**
     * @return the p_amt
     */
    public String getP_amt() {
        return p_amt;
    }

    /**
     * @param p_amt the p_amt to set
     */
    public void setP_amt(String p_amt) {
        this.p_amt = p_amt;
    }

    /**
     * @return the p_ccy
     */
    public String getP_ccy() {
        return p_ccy;
    }

    /**
     * @param p_ccy the p_ccy to set
     */
    public void setP_ccy(String p_ccy) {
        this.p_ccy = p_ccy;
    }

    /**
     * @return the p_orglstdt
     */
    public String getP_orglstdt() {
        return p_orglstdt;
    }

    /**
     * @param p_orglstdt the p_orglstdt to set
     */
    public void setP_orglstdt(String p_orglstdt) {
        this.p_orglstdt = p_orglstdt;
    }

    /**
     * @return the p_trndt
     */
    public String getP_trndt() {
        return p_trndt;
    }

    /**
     * @param p_trndt the p_trndt to set
     */
    public void setP_trndt(String p_trndt) {
        this.p_trndt = p_trndt;
    }

    /**
     * @return the p_valdt
     */
    public String getP_valdt() {
        return p_valdt;
    }

    /**
     * @param p_valdt the p_valdt to set
     */
    public void setP_valdt(String p_valdt) {
        this.p_valdt = p_valdt;
    }

    /**
     * @return the p_mattype
     */
    public String getP_mattype() {
        return p_mattype;
    }

    /**
     * @param p_mattype the p_mattype to set
     */
    public void setP_mattype(String p_mattype) {
        this.p_mattype = p_mattype;
    }

    /**
     * @return the p_matdt
     */
    public String getP_matdt() {
        return p_matdt;
    }

    /**
     * @param p_matdt the p_matdt to set
     */
    public void setP_matdt(String p_matdt) {
        this.p_matdt = p_matdt;
    }

    /**
     * @return the p_tenor
     */
    public String getP_tenor() {
        return p_tenor;
    }

    /**
     * @param p_tenor the p_tenor to set
     */
    public void setP_tenor(String p_tenor) {
        this.p_tenor = p_tenor;
    }

    /**
     * @return the p_dfltacc
     */
    public String getP_dfltacc() {
        return p_dfltacc;
    }

    /**
     * @param p_dfltacc the p_dfltacc to set
     */
    public void setP_dfltacc(String p_dfltacc) {
        this.p_dfltacc = p_dfltacc;
    }

    /**
     * @return the p_dfltaccbrn
     */
    public String getP_dfltaccbrn() {
        return p_dfltaccbrn;
    }

    /**
     * @param p_dfltaccbrn the p_dfltaccbrn to set
     */
    public void setP_dfltaccbrn(String p_dfltaccbrn) {
        this.p_dfltaccbrn = p_dfltaccbrn;
    }

   

    /**
     * @return the p_tdesc
     */
    public String getP_tdesc() {
        return p_tdesc;
    }

    /**
     * @param p_tdesc the p_tdesc to set
     */
    public void setP_tdesc(String p_tdesc) {
        this.p_tdesc = p_tdesc;
    }

    /**
     * @return the p_authstat
     */
    public String getP_authstat() {
        return p_authstat;
    }

    /**
     * @param p_authstat the p_authstat to set
     */
    public void setP_authstat(String p_authstat) {
        this.p_authstat = p_authstat;
    }

    

    /**
     * @return the p_uref
     */
    public String getP_uref() {
        return p_uref;
    }

    /**
     * @param p_uref the p_uref to set
     */
    public void setP_uref(String p_uref) {
        this.p_uref = p_uref;
    }

    /**
     * @return the intrate
     */
    public String getIntrate() {
        return intrate;
    }

    /**
     * @param intrate the intrate to set
     */
    public void setIntrate(String intrate) {
        this.intrate = intrate;
    }

    
//
//    /**
//     * @return the Ints
//     */
//    public List<Ints> getInts() {
//        if (Ints == null) {
//            Ints = new ArrayList<Ints>();
//        }
//        return Ints;
//    }
//
//    /**
//     * @param Ints the Ints to set
//     */
//    public void setInts(List<Ints> Ints) {
//        this.Ints = Ints;
//    }
//

//    /**
//     * @return the Intsobj
//     */
//    public Ints getIntsobj() {
//        return Intsobj;
//    }
//
//    /**
//     * @param Intsobj the Intsobj to set
//     */
//    public void setIntsobj(Ints Intsobj) {
//        this.Intsobj = Intsobj;
//    }
}

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
public class TDDetails implements Serializable {

    private String CONTRACT_REF_NO;
    private String VERSION_NO;
    private String EVENT_SEQ_NO;
    private String BRANCH;
    private String PRODUCT;
    private String PRODUCT_TYPE;
    private String MODULE;
    private String PAYMENT_METHOD;
    private String ROLLOVER_ALLOWED;
    private String USER_REF_NO;
    private String COUNTERPARTY;
    private String CURRENCY;
    private String AMOUNT;
    private String LCY_AMOUNT;
    private String ORIGINAL_START_DATE;
    private String BOOKING_DATE;
    private String VALUE_DATE;
    private String MATURITY_TYPE;
    private String MATURITY_DATE;
    private String REMARKS;
    private String MAIN_COMP;
    private String DFLT_SETTLE_AC;
    private String DFLT_SETTLE_AC_BRANCH;
    private String ICCF_STATUS;
    private String SETTLEMENT_STATUS;
    private String TAX_STATUS;
    private String BROKERAGE_STATUS;
    private String TENOR;
    private String ROLLOVER_COUNT;
    private String USER_DEFINED_STATUS;
    private String CONTRACT_STATUS;
    private String JOB_PICKED_UP;
    private String LOAN_STMT_TYPE;
    private String ANNUITY_LOAN;
    private String INT_PERIOD_BASIS;
    private String ROLLOVER_MECHANISM;
    private String ROLLOVER_METHOD;
    private String DESCRIPTION;
    private String COMP_MIS_2;
    private String accrued_interest;
    private String customer_name;

    public TDDetails(String CONTRACT_REF_NO,
            String VERSION_NO, String EVENT_SEQ_NO, String BRANCH,
            String PRODUCT, String PRODUCT_TYPE, String MODULE, String PAYMENT_METHOD, String ROLLOVER_ALLOWED,
            String USER_REF_NO, String COUNTERPARTY, String CURRENCY,
            String AMOUNT, String LCY_AMOUNT, String ORIGINAL_START_DATE,
            String BOOKING_DATE, String VALUE_DATE, String MATURITY_TYPE, String MATURITY_DATE,
            String REMARKS, String MAIN_COMP, String DFLT_SETTLE_AC, String DFLT_SETTLE_AC_BRANCH,
            String ICCF_STATUS, String SETTLEMENT_STATUS, String TAX_STATUS, String BROKERAGE_STATUS,
            String TENOR, String ROLLOVER_COUNT, String USER_DEFINED_STATUS, String CONTRACT_STATUS,
            String JOB_PICKED_UP, String LOAN_STMT_TYPE, String ANNUITY_LOAN, String INT_PERIOD_BASIS,
            String ROLLOVER_MECHANISM, String ROLLOVER_METHOD, String DESCRIPTION, String COMP_MIS_2,
            String accrued_interest, String customer_name) {
        this.CONTRACT_REF_NO = CONTRACT_REF_NO;
        this.VERSION_NO = VERSION_NO;
        this.EVENT_SEQ_NO = EVENT_SEQ_NO;
        this.BRANCH = BRANCH;
        this.PRODUCT = PRODUCT;
        this.PRODUCT_TYPE = PRODUCT_TYPE;
        this.MODULE = MODULE;
        this.PAYMENT_METHOD = PAYMENT_METHOD;
        this.ROLLOVER_ALLOWED = ROLLOVER_ALLOWED;
        this.USER_REF_NO = USER_REF_NO;
        this.COUNTERPARTY = COUNTERPARTY;
        this.CURRENCY = CURRENCY;
        this.AMOUNT = AMOUNT;
        this.LCY_AMOUNT = LCY_AMOUNT;
        this.ORIGINAL_START_DATE = ORIGINAL_START_DATE;
        this.BOOKING_DATE = BOOKING_DATE;
        this.VALUE_DATE = VALUE_DATE;
        this.MATURITY_TYPE = MATURITY_TYPE;
        this.MATURITY_DATE = MATURITY_DATE;
        this.REMARKS = REMARKS;
        this.MAIN_COMP = MAIN_COMP;
        this.DFLT_SETTLE_AC = DFLT_SETTLE_AC;
        this.DFLT_SETTLE_AC_BRANCH = DFLT_SETTLE_AC_BRANCH;
        this.ICCF_STATUS = ICCF_STATUS;
        this.SETTLEMENT_STATUS = SETTLEMENT_STATUS;
        this.TAX_STATUS = TAX_STATUS;
        this.BROKERAGE_STATUS = BROKERAGE_STATUS;
        this.TENOR = TENOR;
        this.ROLLOVER_COUNT = ROLLOVER_COUNT;
        this.USER_DEFINED_STATUS = USER_DEFINED_STATUS;
        this.CONTRACT_STATUS = CONTRACT_STATUS;
        this.JOB_PICKED_UP = JOB_PICKED_UP;
        this.LOAN_STMT_TYPE = LOAN_STMT_TYPE;
        this.ANNUITY_LOAN = ANNUITY_LOAN;
        this.INT_PERIOD_BASIS = INT_PERIOD_BASIS;
        this.ROLLOVER_MECHANISM = ROLLOVER_MECHANISM;
        this.ROLLOVER_METHOD = ROLLOVER_METHOD;
        this.DESCRIPTION = DESCRIPTION;
        this.COMP_MIS_2 = COMP_MIS_2;
        this.accrued_interest = accrued_interest;
        this.customer_name = customer_name;
    }

    public TDDetails(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public TDDetails() {
    }

    /**
     * @return the CONTRACT_REF_NO
     */
    public String getCONTRACT_REF_NO() {
        return CONTRACT_REF_NO;
    }

    /**
     * @param CONTRACT_REF_NO the CONTRACT_REF_NO to set
     */
    public void setCONTRACT_REF_NO(String CONTRACT_REF_NO) {
        this.CONTRACT_REF_NO = CONTRACT_REF_NO;
    }

    /**
     * @return the VERSION_NO
     */
    public String getVERSION_NO() {
        return VERSION_NO;
    }

    /**
     * @param VERSION_NO the VERSION_NO to set
     */
    public void setVERSION_NO(String VERSION_NO) {
        this.VERSION_NO = VERSION_NO;
    }

    /**
     * @return the EVENT_SEQ_NO
     */
    public String getEVENT_SEQ_NO() {
        return EVENT_SEQ_NO;
    }

    /**
     * @param EVENT_SEQ_NO the EVENT_SEQ_NO to set
     */
    public void setEVENT_SEQ_NO(String EVENT_SEQ_NO) {
        this.EVENT_SEQ_NO = EVENT_SEQ_NO;
    }

    /**
     * @return the BRANCH
     */
    public String getBRANCH() {
        return BRANCH;
    }

    /**
     * @param BRANCH the BRANCH to set
     */
    public void setBRANCH(String BRANCH) {
        this.BRANCH = BRANCH;
    }

    /**
     * @return the PRODUCT
     */
    public String getPRODUCT() {
        return PRODUCT;
    }

    /**
     * @param PRODUCT the PRODUCT to set
     */
    public void setPRODUCT(String PRODUCT) {
        this.PRODUCT = PRODUCT;
    }

    /**
     * @return the PRODUCT_TYPE
     */
    public String getPRODUCT_TYPE() {
        return PRODUCT_TYPE;
    }

    /**
     * @param PRODUCT_TYPE the PRODUCT_TYPE to set
     */
    public void setPRODUCT_TYPE(String PRODUCT_TYPE) {
        this.PRODUCT_TYPE = PRODUCT_TYPE;
    }

    /**
     * @return the MODULE
     */
    public String getMODULE() {
        return MODULE;
    }

    /**
     * @param MODULE the MODULE to set
     */
    public void setMODULE(String MODULE) {
        this.MODULE = MODULE;
    }

    /**
     * @return the PAYMENT_METHOD
     */
    public String getPAYMENT_METHOD() {
        return PAYMENT_METHOD;
    }

    /**
     * @param PAYMENT_METHOD the PAYMENT_METHOD to set
     */
    public void setPAYMENT_METHOD(String PAYMENT_METHOD) {
        this.PAYMENT_METHOD = PAYMENT_METHOD;
    }

    /**
     * @return the ROLLOVER_ALLOWED
     */
    public String getROLLOVER_ALLOWED() {
        return ROLLOVER_ALLOWED;
    }

    /**
     * @param ROLLOVER_ALLOWED the ROLLOVER_ALLOWED to set
     */
    public void setROLLOVER_ALLOWED(String ROLLOVER_ALLOWED) {
        this.ROLLOVER_ALLOWED = ROLLOVER_ALLOWED;
    }

    /**
     * @return the USER_REF_NO
     */
    public String getUSER_REF_NO() {
        return USER_REF_NO;
    }

    /**
     * @param USER_REF_NO the USER_REF_NO to set
     */
    public void setUSER_REF_NO(String USER_REF_NO) {
        this.USER_REF_NO = USER_REF_NO;
    }

    /**
     * @return the COUNTERPARTY
     */
    public String getCOUNTERPARTY() {
        return COUNTERPARTY;
    }

    /**
     * @param COUNTERPARTY the COUNTERPARTY to set
     */
    public void setCOUNTERPARTY(String COUNTERPARTY) {
        this.COUNTERPARTY = COUNTERPARTY;
    }

    /**
     * @return the CURRENCY
     */
    public String getCURRENCY() {
        return CURRENCY;
    }

    /**
     * @param CURRENCY the CURRENCY to set
     */
    public void setCURRENCY(String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }

    /**
     * @return the AMOUNT
     */
    public String getAMOUNT() {
        return AMOUNT;
    }

    /**
     * @param AMOUNT the AMOUNT to set
     */
    public void setAMOUNT(String AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    /**
     * @return the LCY_AMOUNT
     */
    public String getLCY_AMOUNT() {
        return LCY_AMOUNT;
    }

    /**
     * @param LCY_AMOUNT the LCY_AMOUNT to set
     */
    public void setLCY_AMOUNT(String LCY_AMOUNT) {
        this.LCY_AMOUNT = LCY_AMOUNT;
    }

    /**
     * @return the ORIGINAL_START_DATE
     */
    public String getORIGINAL_START_DATE() {
        return ORIGINAL_START_DATE;
    }

    /**
     * @param ORIGINAL_START_DATE the ORIGINAL_START_DATE to set
     */
    public void setORIGINAL_START_DATE(String ORIGINAL_START_DATE) {
        this.ORIGINAL_START_DATE = ORIGINAL_START_DATE;
    }

    /**
     * @return the BOOKING_DATE
     */
    public String getBOOKING_DATE() {
        return BOOKING_DATE;
    }

    /**
     * @param BOOKING_DATE the BOOKING_DATE to set
     */
    public void setBOOKING_DATE(String BOOKING_DATE) {
        this.BOOKING_DATE = BOOKING_DATE;
    }

    /**
     * @return the VALUE_DATE
     */
    public String getVALUE_DATE() {
        return VALUE_DATE;
    }

    /**
     * @param VALUE_DATE the VALUE_DATE to set
     */
    public void setVALUE_DATE(String VALUE_DATE) {
        this.VALUE_DATE = VALUE_DATE;
    }

    /**
     * @return the MATURITY_TYPE
     */
    public String getMATURITY_TYPE() {
        return MATURITY_TYPE;
    }

    /**
     * @param MATURITY_TYPE the MATURITY_TYPE to set
     */
    public void setMATURITY_TYPE(String MATURITY_TYPE) {
        this.MATURITY_TYPE = MATURITY_TYPE;
    }

    /**
     * @return the MATURITY_DATE
     */
    public String getMATURITY_DATE() {
        return MATURITY_DATE;
    }

    /**
     * @param MATURITY_DATE the MATURITY_DATE to set
     */
    public void setMATURITY_DATE(String MATURITY_DATE) {
        this.MATURITY_DATE = MATURITY_DATE;
    }

    /**
     * @return the REMARKS
     */
    public String getREMARKS() {
        return REMARKS;
    }

    /**
     * @param REMARKS the REMARKS to set
     */
    public void setREMARKS(String REMARKS) {
        this.REMARKS = REMARKS;
    }

    /**
     * @return the MAIN_COMP
     */
    public String getMAIN_COMP() {
        return MAIN_COMP;
    }

    /**
     * @param MAIN_COMP the MAIN_COMP to set
     */
    public void setMAIN_COMP(String MAIN_COMP) {
        this.MAIN_COMP = MAIN_COMP;
    }

    /**
     * @return the DFLT_SETTLE_AC
     */
    public String getDFLT_SETTLE_AC() {
        return DFLT_SETTLE_AC;
    }

    /**
     * @param DFLT_SETTLE_AC the DFLT_SETTLE_AC to set
     */
    public void setDFLT_SETTLE_AC(String DFLT_SETTLE_AC) {
        this.DFLT_SETTLE_AC = DFLT_SETTLE_AC;
    }

    /**
     * @return the DFLT_SETTLE_AC_BRANCH
     */
    public String getDFLT_SETTLE_AC_BRANCH() {
        return DFLT_SETTLE_AC_BRANCH;
    }

    /**
     * @param DFLT_SETTLE_AC_BRANCH the DFLT_SETTLE_AC_BRANCH to set
     */
    public void setDFLT_SETTLE_AC_BRANCH(String DFLT_SETTLE_AC_BRANCH) {
        this.DFLT_SETTLE_AC_BRANCH = DFLT_SETTLE_AC_BRANCH;
    }

    /**
     * @return the ICCF_STATUS
     */
    public String getICCF_STATUS() {
        return ICCF_STATUS;
    }

    /**
     * @param ICCF_STATUS the ICCF_STATUS to set
     */
    public void setICCF_STATUS(String ICCF_STATUS) {
        this.ICCF_STATUS = ICCF_STATUS;
    }

    /**
     * @return the SETTLEMENT_STATUS
     */
    public String getSETTLEMENT_STATUS() {
        return SETTLEMENT_STATUS;
    }

    /**
     * @param SETTLEMENT_STATUS the SETTLEMENT_STATUS to set
     */
    public void setSETTLEMENT_STATUS(String SETTLEMENT_STATUS) {
        this.SETTLEMENT_STATUS = SETTLEMENT_STATUS;
    }

    /**
     * @return the TAX_STATUS
     */
    public String getTAX_STATUS() {
        return TAX_STATUS;
    }

    /**
     * @param TAX_STATUS the TAX_STATUS to set
     */
    public void setTAX_STATUS(String TAX_STATUS) {
        this.TAX_STATUS = TAX_STATUS;
    }

    /**
     * @return the BROKERAGE_STATUS
     */
    public String getBROKERAGE_STATUS() {
        return BROKERAGE_STATUS;
    }

    /**
     * @param BROKERAGE_STATUS the BROKERAGE_STATUS to set
     */
    public void setBROKERAGE_STATUS(String BROKERAGE_STATUS) {
        this.BROKERAGE_STATUS = BROKERAGE_STATUS;
    }

    /**
     * @return the TENOR
     */
    public String getTENOR() {
        return TENOR;
    }

    /**
     * @param TENOR the TENOR to set
     */
    public void setTENOR(String TENOR) {
        this.TENOR = TENOR;
    }

    /**
     * @return the ROLLOVER_COUNT
     */
    public String getROLLOVER_COUNT() {
        return ROLLOVER_COUNT;
    }

    /**
     * @param ROLLOVER_COUNT the ROLLOVER_COUNT to set
     */
    public void setROLLOVER_COUNT(String ROLLOVER_COUNT) {
        this.ROLLOVER_COUNT = ROLLOVER_COUNT;
    }

    /**
     * @return the USER_DEFINED_STATUS
     */
    public String getUSER_DEFINED_STATUS() {
        return USER_DEFINED_STATUS;
    }

    /**
     * @param USER_DEFINED_STATUS the USER_DEFINED_STATUS to set
     */
    public void setUSER_DEFINED_STATUS(String USER_DEFINED_STATUS) {
        this.USER_DEFINED_STATUS = USER_DEFINED_STATUS;
    }

    /**
     * @return the CONTRACT_STATUS
     */
    public String getCONTRACT_STATUS() {
        return CONTRACT_STATUS;
    }

    /**
     * @param CONTRACT_STATUS the CONTRACT_STATUS to set
     */
    public void setCONTRACT_STATUS(String CONTRACT_STATUS) {
        this.CONTRACT_STATUS = CONTRACT_STATUS;
    }

    /**
     * @return the JOB_PICKED_UP
     */
    public String getJOB_PICKED_UP() {
        return JOB_PICKED_UP;
    }

    /**
     * @param JOB_PICKED_UP the JOB_PICKED_UP to set
     */
    public void setJOB_PICKED_UP(String JOB_PICKED_UP) {
        this.JOB_PICKED_UP = JOB_PICKED_UP;
    }

    /**
     * @return the LOAN_STMT_TYPE
     */
    public String getLOAN_STMT_TYPE() {
        return LOAN_STMT_TYPE;
    }

    /**
     * @param LOAN_STMT_TYPE the LOAN_STMT_TYPE to set
     */
    public void setLOAN_STMT_TYPE(String LOAN_STMT_TYPE) {
        this.LOAN_STMT_TYPE = LOAN_STMT_TYPE;
    }

    /**
     * @return the ANNUITY_LOAN
     */
    public String getANNUITY_LOAN() {
        return ANNUITY_LOAN;
    }

    /**
     * @param ANNUITY_LOAN the ANNUITY_LOAN to set
     */
    public void setANNUITY_LOAN(String ANNUITY_LOAN) {
        this.ANNUITY_LOAN = ANNUITY_LOAN;
    }

    /**
     * @return the INT_PERIOD_BASIS
     */
    public String getINT_PERIOD_BASIS() {
        return INT_PERIOD_BASIS;
    }

    /**
     * @param INT_PERIOD_BASIS the INT_PERIOD_BASIS to set
     */
    public void setINT_PERIOD_BASIS(String INT_PERIOD_BASIS) {
        this.INT_PERIOD_BASIS = INT_PERIOD_BASIS;
    }

    /**
     * @return the ROLLOVER_MECHANISM
     */
    public String getROLLOVER_MECHANISM() {
        return ROLLOVER_MECHANISM;
    }

    /**
     * @param ROLLOVER_MECHANISM the ROLLOVER_MECHANISM to set
     */
    public void setROLLOVER_MECHANISM(String ROLLOVER_MECHANISM) {
        this.ROLLOVER_MECHANISM = ROLLOVER_MECHANISM;
    }

    /**
     * @return the ROLLOVER_METHOD
     */
    public String getROLLOVER_METHOD() {
        return ROLLOVER_METHOD;
    }

    /**
     * @param ROLLOVER_METHOD the ROLLOVER_METHOD to set
     */
    public void setROLLOVER_METHOD(String ROLLOVER_METHOD) {
        this.ROLLOVER_METHOD = ROLLOVER_METHOD;
    }

    /**
     * @return the DESCRIPTION
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * @param DESCRIPTION the DESCRIPTION to set
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    /**
     * @return the COMP_MIS_2
     */
    public String getCOMP_MIS_2() {
        return COMP_MIS_2;
    }

    /**
     * @param COMP_MIS_2 the COMP_MIS_2 to set
     */
    public void setCOMP_MIS_2(String COMP_MIS_2) {
        this.COMP_MIS_2 = COMP_MIS_2;
    }

    /**
     * @return the accrued_interest
     */
    public String getAccrued_interest() {
        return accrued_interest;
    }

    /**
     * @param accrued_interest the accrued_interest to set
     */
    public void setAccrued_interest(String accrued_interest) {
        this.accrued_interest = accrued_interest;
    }

    /**
     * @return the customer_name
     */
    public String getCustomer_name() {
        return customer_name;
    }

    /**
     * @param customer_name the customer_name to set
     */
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
}

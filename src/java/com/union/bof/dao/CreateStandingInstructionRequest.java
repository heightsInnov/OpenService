/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.union.bof.dao;

import java.io.Serializable;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author tdashaolu
 */
public class CreateStandingInstructionRequest implements Serializable {

	private String prod;
	private String branchCode;
	private String excmonths;
	private XMLGregorianCalendar firstexcdate;
	private String counterparty;
	private String apply_chg_suxs;
	private String txnmis1;
	private String debitBranchCode;
	private String debitAccountNo;
	private String debitAccountcurrency;
	private String siAmount;
	private String creditAccountNo;
	private String creditAccountcurrency;
	private String remarks;
	private String siExpiryDate;
	private String creditBranchCode;

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getExcmonths() {
		return excmonths;
	}

	public void setExcmonths(String excmonths) {
		this.excmonths = excmonths;
	}

	public XMLGregorianCalendar getFirstexcdate() {
		return firstexcdate;
	}

	public void setFirstexcdate(XMLGregorianCalendar firstexcdate) {
		this.firstexcdate = firstexcdate;
	}

	public String getCounterparty() {
		return counterparty;
	}

	public void setCounterparty(String counterparty) {
		this.counterparty = counterparty;
	}

	public String getApply_chg_suxs() {
		return apply_chg_suxs;
	}

	public void setApply_chg_suxs(String apply_chg_suxs) {
		this.apply_chg_suxs = apply_chg_suxs;
	}

	public String getTxnmis1() {
		return txnmis1;
	}

	public void setTxnmis1(String txnmis1) {
		this.txnmis1 = txnmis1;
	}

	public String getDebitBranchCode() {
		return debitBranchCode;
	}

	public void setDebitBranchCode(String DebitBranchCode) {
		this.debitBranchCode = DebitBranchCode;
	}

	public String getDebitAccountNo() {
		return debitAccountNo;
	}

	public void setDebitAccountNo(String debitAccountNo) {
		this.debitAccountNo = debitAccountNo;
	}

	public String getDebitAccountcurrency() {
		return debitAccountcurrency;
	}

	public void setDebitAccountcurrency(String debitAccountcurrency) {
		this.debitAccountcurrency = debitAccountcurrency;
	}

	public String getSiAmount() {
		return siAmount;
	}

	public void setSiAmount(String siAmount) {
		this.siAmount = siAmount;
	}

	public String getCreditAccountNo() {
		return creditAccountNo;
	}

	public void setCreditAccountNo(String creditAccountNo) {
		this.creditAccountNo = creditAccountNo;
	}

	public String getCreditAccountcurrency() {
		return creditAccountcurrency;
	}

	public void setCreditAccountcurrency(String creditAccountcurrency) {
		this.creditAccountcurrency = creditAccountcurrency;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSiExpiryDate() {
		return siExpiryDate;
	}

	public void setSiExpiryDate(String siExpiryDate) {
		this.siExpiryDate = siExpiryDate;
	}

	public String getCreditBranchCode() {
		return creditBranchCode;
	}

	public void setCreditBranchCode(String CreditBranchCode) {
		this.creditBranchCode = CreditBranchCode;
	}
	
	
	
}

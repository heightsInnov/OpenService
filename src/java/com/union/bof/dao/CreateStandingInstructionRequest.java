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

	private String authstart;
	private String calholexcp;
	private String counterparty;
	private String disnonamndbl;
	private String excdays;
	private String excmonths;
	private String excyears;
	private XMLGregorianCalendar firstexcdate;
	private XMLGregorianCalendar firstvaluedate;
	private String fundid;
	private String instatus;
	private String instrno;
	private String instrtype;
	private String latestverno;
	private String mnthend;
	private XMLGregorianCalendar nextexcdate;
	private XMLGregorianCalendar nextvaldate;
	private String noofcontract;
	private String prcstime;
	private String prdtype;
	private String prod;
	private String proddesc;
	private String source;
	private String usrinstno;
	private String verno;
	private String xref;
	private String branchCode;
	private String debitAccountNo;
	private String debitAccountcurrency;
	private String siAmount;
	private String accountOpeningBranch;
	private String creditAccountNo;
	private String creditAccountcurrency;
	private String remarks;
	private String siExpiryDate;

	/**
	 * @return the authstart
	 */
	public String getAuthstart() {
		return authstart;
	}

	/**
	 * @param authstart the authstart to set
	 */
	public void setAuthstart(String authstart) {
		this.authstart = authstart;
	}

	/**
	 * @return the calholexcp
	 */
	public String getCalholexcp() {
		return calholexcp;
	}

	/**
	 * @param calholexcp the calholexcp to set
	 */
	public void setCalholexcp(String calholexcp) {
		this.calholexcp = calholexcp;
	}

	/**
	 * @return the counterparty
	 */
	public String getCounterparty() {
		return counterparty;
	}

	/**
	 * @param counterparty the counterparty to set
	 */
	public void setCounterparty(String counterparty) {
		this.counterparty = counterparty;
	}

	/**
	 * @return the disnonamndbl
	 */
	public String getDisnonamndbl() {
		return disnonamndbl;
	}

	/**
	 * @param disnonamndbl the disnonamndbl to set
	 */
	public void setDisnonamndbl(String disnonamndbl) {
		this.disnonamndbl = disnonamndbl;
	}

	/**
	 * @return the excdays
	 */
	public String getExcdays() {
		return excdays;
	}

	/**
	 * @param excdays the excdays to set
	 */
	public void setExcdays(String excdays) {
		this.excdays = excdays;
	}

	/**
	 * @return the excmonths
	 */
	public String getExcmonths() {
		return excmonths;
	}

	/**
	 * @param excmonths the excmonths to set
	 */
	public void setExcmonths(String excmonths) {
		this.excmonths = excmonths;
	}

	/**
	 * @return the excyears
	 */
	public String getExcyears() {
		return excyears;
	}

	/**
	 * @param excyears the excyears to set
	 */
	public void setExcyears(String excyears) {
		this.excyears = excyears;
	}

	/**
	 * @return the firstexcdate
	 */
	public XMLGregorianCalendar getFirstexcdate() {
		return firstexcdate;
	}

	/**
	 * @param firstexcdate the firstexcdate to set
	 */
	public void setFirstexcdate(XMLGregorianCalendar firstexcdate) {
		this.firstexcdate = firstexcdate;
	}

	/**
	 * @return the firstvaluedate
	 */
	public XMLGregorianCalendar getFirstvaluedate() {
		return firstvaluedate;
	}

	/**
	 * @param firstvaluedate the firstvaluedate to set
	 */
	public void setFirstvaluedate(XMLGregorianCalendar firstvaluedate) {
		this.firstvaluedate = firstvaluedate;
	}

	/**
	 * @return the fundid
	 */
	public String getFundid() {
		return fundid;
	}

	/**
	 * @param fundid the fundid to set
	 */
	public void setFundid(String fundid) {
		this.fundid = fundid;
	}

	/**
	 * @return the instatus
	 */
	public String getInstatus() {
		return instatus;
	}

	/**
	 * @param instatus the instatus to set
	 */
	public void setInstatus(String instatus) {
		this.instatus = instatus;
	}

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
	 * @return the instrtype
	 */
	public String getInstrtype() {
		return instrtype;
	}

	/**
	 * @param instrtype the instrtype to set
	 */
	public void setInstrtype(String instrtype) {
		this.instrtype = instrtype;
	}

	/**
	 * @return the latestverno
	 */
	public String getLatestverno() {
		return latestverno;
	}

	/**
	 * @param latestverno the latestverno to set
	 */
	public void setLatestverno(String latestverno) {
		this.latestverno = latestverno;
	}

	/**
	 * @return the mnthend
	 */
	public String getMnthend() {
		return mnthend;
	}

	/**
	 * @param mnthend the mnthend to set
	 */
	public void setMnthend(String mnthend) {
		this.mnthend = mnthend;
	}

	/**
	 * @return the nextexcdate
	 */
	public XMLGregorianCalendar getNextexcdate() {
		return nextexcdate;
	}

	/**
	 * @param nextexcdate the nextexcdate to set
	 */
	public void setNextexcdate(XMLGregorianCalendar nextexcdate) {
		this.nextexcdate = nextexcdate;
	}

	/**
	 * @return the nextvaldate
	 */
	public XMLGregorianCalendar getNextvaldate() {
		return nextvaldate;
	}

	/**
	 * @param nextvaldate the nextvaldate to set
	 */
	public void setNextvaldate(XMLGregorianCalendar nextvaldate) {
		this.nextvaldate = nextvaldate;
	}

	/**
	 * @return the noofcontract
	 */
	public String getNoofcontract() {
		return noofcontract;
	}

	/**
	 * @param noofcontract the noofcontract to set
	 */
	public void setNoofcontract(String noofcontract) {
		this.noofcontract = noofcontract;
	}

	/**
	 * @return the prcstime
	 */
	public String getPrcstime() {
		return prcstime;
	}

	/**
	 * @param prcstime the prcstime to set
	 */
	public void setPrcstime(String prcstime) {
		this.prcstime = prcstime;
	}

	/**
	 * @return the prdtype
	 */
	public String getPrdtype() {
		return prdtype;
	}

	/**
	 * @param prdtype the prdtype to set
	 */
	public void setPrdtype(String prdtype) {
		this.prdtype = prdtype;
	}

	/**
	 * @return the prod
	 */
	public String getProd() {
		return prod;
	}

	/**
	 * @param prod the prod to set
	 */
	public void setProd(String prod) {
		this.prod = prod;
	}

	/**
	 * @return the proddesc
	 */
	public String getProddesc() {
		return proddesc;
	}

	/**
	 * @param proddesc the proddesc to set
	 */
	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the usrinstno
	 */
	public String getUsrinstno() {
		return usrinstno;
	}

	/**
	 * @param usrinstno the usrinstno to set
	 */
	public void setUsrinstno(String usrinstno) {
		this.usrinstno = usrinstno;
	}

	/**
	 * @return the verno
	 */
	public String getVerno() {
		return verno;
	}

	/**
	 * @param verno the verno to set
	 */
	public void setVerno(String verno) {
		this.verno = verno;
	}

	/**
	 * @return the xref
	 */
	public String getXref() {
		return xref;
	}

	/**
	 * @param xref the xref to set
	 */
	public void setXref(String xref) {
		this.xref = xref;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getDebitAccountNo() {
		return debitAccountNo;
	}

	public void setDebitAccountNo(String debitAccountNo) {
		this.debitAccountNo = debitAccountNo;
	}

	public String getSiAmount() {
		return siAmount;
	}

	public void setSiAmount(String siAmount) {
		this.siAmount = siAmount;
	}

	public String getAccountOpeningBranch() {
		return accountOpeningBranch;
	}

	public void setAccountOpeningBranch(String accountOpeningBranch) {
		this.accountOpeningBranch = accountOpeningBranch;
	}

	public String getCreditAccountNo() {
		return creditAccountNo;
	}

	public void setCreditAccountNo(String creditAccountNo) {
		this.creditAccountNo = creditAccountNo;
	}

	public String getDebitAccountcurrency() {
		return debitAccountcurrency;
	}

	public void setDebitAccountcurrency(String debitAccountcurrency) {
		this.debitAccountcurrency = debitAccountcurrency;
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

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.union.bof.dao;

/**
 *
 * @author aojinadu
 */
public class StandingInstructionDetailsResponse {
	private String contract_ref_no;	
	private String instruction_no;	
	private String product_code;	
	private String branch_code;	
	private String account_number;
	private String account_name;	
	private String customer_id;	
	private String ccy;
	private String primary_acct;
	private String exec_mth;	
	private String si_type;	
	private String si_expiry_date;
	private String next_value_date;		
	private String si_amt;
	private String internal_remarks;
	private String response_code;

	public String getContract_ref_no() {
		return contract_ref_no;
	}

	public void setContract_ref_no(String contract_ref_no) {
		this.contract_ref_no = contract_ref_no;
	}

	public String getInstruction_no() {
		return instruction_no;
	}

	public void setInstruction_no(String instruction_no) {
		this.instruction_no = instruction_no;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getPrimary_acct() {
		return primary_acct;
	}

	public void setPrimary_acct(String primary_acct) {
		this.primary_acct = primary_acct;
	}

	public String getExec_mth() {
		return exec_mth;
	}

	public void setExec_mth(String exec_mth) {
		this.exec_mth = exec_mth;
	}

	public String getSi_type() {
		return si_type;
	}

	public void setSi_type(String si_type) {
		this.si_type = si_type;
	}

	public String getSi_expiry_date() {
		return si_expiry_date;
	}

	public void setSi_expiry_date(String si_expiry_date) {
		this.si_expiry_date = si_expiry_date;
	}

	public String getNext_value_date() {
		return next_value_date;
	}

	public void setNext_value_date(String next_value_date) {
		this.next_value_date = next_value_date;
	}

	public String getSi_amt() {
		return si_amt;
	}

	public void setSi_amt(String si_amt) {
		this.si_amt = si_amt;
	}

	public String getInternal_remarks() {
		return internal_remarks;
	}

	public void setInternal_remarks(String internal_remarks) {
		this.internal_remarks = internal_remarks;
	}

	public String getResponse_code() {
		return response_code;
	}

	public void setResponse_code(String response_code) {
		this.response_code = response_code;
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.union.gateway;

import com.union.bof.dao.AccountMaintenanceResponse;
import com.union.bof.dao.AccountReactivationRequest;
import com.union.bof.dao.AccountReactivationResponse;
import com.union.bof.dao.StandingInstructionDetailsResponse;
import com.unionbank.processor.GetConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author aojinadu
 */
public class ServiceProcessorOF {
	
	public AccountMaintenanceResponse changeCustNameOF(String customerID, String newAccountName, String newFirstName, String newMiddleName, String newLastName, String newShortName, String newCIC, String newAddress1, String newAddress2, String newAddress3, String newCity, String newState, String newMobileNumber, String newOfficePhoneLand, String newLGA, String newMaritalStatus, String newNationality, String newCountry, String newCountryOfResidence,
			String var_dateofbirth,     		
			String var_customerprefix,    		
			String var_mother_maiden_name,
			String var_employer,   
			String var_employer_address1,
			String var_employer_address2,    
			String var_employer_telephone,    
			String var_designation_profession,
			String var_tin,
			String var_occupation,
			String var_typeofid_card,        
			String var_id_card_no,        
			String var_id_iss_date,           
			String var_id_exp_date ) {
		String statusResponse = null;
		String statusMessage = null;
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		AccountMaintenanceResponse response = null;
		try {
			theConn = new GetConnection();
			response = new AccountMaintenanceResponse();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.chg_cust_name_of(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			System.out.println("Customer ID " + customerID);
			statusUpdate.registerOutParameter(1, 4);
			statusUpdate.registerOutParameter(21, 12);
			statusUpdate.registerOutParameter(22, OracleTypes.VARCHAR);
			statusUpdate.setString(2, customerID.trim());
			statusUpdate.setString(3, newAccountName);
			statusUpdate.setString(4, newFirstName);
			statusUpdate.setString(5, newMiddleName);
			statusUpdate.setString(6, newLastName);
			statusUpdate.setString(7, newShortName);
			statusUpdate.setString(8, newCIC);
			statusUpdate.setString(9, newAddress1);
			statusUpdate.setString(10, newAddress2);
			statusUpdate.setString(11, newAddress3);
			statusUpdate.setString(12, newCity);
			statusUpdate.setString(13, newState);
			statusUpdate.setString(14, newMobileNumber);
			statusUpdate.setString(15, newOfficePhoneLand);
			statusUpdate.setString(16, newLGA);
			statusUpdate.setString(17, newMaritalStatus);
			statusUpdate.setString(18, "NG");
			statusUpdate.setString(19, "NG");
			statusUpdate.setString(20, "NG");
			statusUpdate.setString(23, var_dateofbirth);
			statusUpdate.setString(24, var_customerprefix);
			statusUpdate.setString(25, var_mother_maiden_name);
			statusUpdate.setString(26, var_employer);
			statusUpdate.setString(27, var_employer_address1);
			statusUpdate.setString(28, var_employer_address2);
			statusUpdate.setString(29, var_employer_telephone);
			statusUpdate.setString(30, var_designation_profession);
			statusUpdate.setString(31, var_tin);
			statusUpdate.setString(32, var_occupation);
			statusUpdate.setString(33, var_typeofid_card);
			statusUpdate.setString(34, var_id_card_no);
			statusUpdate.setString(35, var_id_iss_date);
			statusUpdate.setString(36, var_id_exp_date);
			statusUpdate.execute();
			statusResponse = statusUpdate.getObject(1).toString();
			statusMessage = statusUpdate.getObject(21).toString();
			if (statusUpdate != null) {
				statusUpdate.close();
			}
			if (conn != null) {
				conn.close();
			}
			response.setResponseCode(statusResponse);
			response.setResponseMessage(statusMessage);
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statusUpdate != null) {
					statusUpdate.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return response;
	}
	
	public List<StandingInstructionDetailsResponse> getStandingInstructionOF(String acctNo) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement getsi = null;
		List<StandingInstructionDetailsResponse> response = new ArrayList<StandingInstructionDetailsResponse>();
		StandingInstructionDetailsResponse stdinst = null;
		ResultSet rs = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			getsi = conn.prepareCall("{call FCUBSLIVE.ubn_account_servicing_pkg.getsi(?,?)}");
			getsi.registerOutParameter(1, OracleTypes.CURSOR);
			getsi.setString(2, acctNo);
			getsi.execute();
			rs = (ResultSet) getsi.getObject(1);
			if (rs != null) {
				response = new ArrayList<StandingInstructionDetailsResponse>();
				while (rs.next()) {
					stdinst = new StandingInstructionDetailsResponse();
					stdinst.setResponse_code("00");
					stdinst.setContract_ref_no(rs.getString("CONTRACT_REF_NO"));
					stdinst.setInstruction_no(rs.getString("INSTRUCTION_NO"));
					stdinst.setProduct_code(rs.getString("PRODUCT_CODE"));
					stdinst.setBranch_code(rs.getString("BRANCH_CODE"));
					stdinst.setAccount_number(rs.getString("ACCOUNT NUMBER"));
					stdinst.setAccount_name(rs.getString("ACCOUNT NAME"));
					stdinst.setCustomer_id(rs.getString("CUSTOMER_ID"));
					stdinst.setCcy(rs.getString("CCY"));
					stdinst.setPrimary_acct(rs.getString("PRIMARY ACCT"));
					stdinst.setExec_mth(rs.getString("EXEC_MTHS"));
					stdinst.setSi_type(rs.getString("SI_TYPE"));
					stdinst.setSi_expiry_date(rs.getString("SI_EXPIRY_DATE"));
					stdinst.setNext_value_date(rs.getString("NEXT_VALUE_DATE"));
					stdinst.setSi_amt(rs.getString("SI_AMT"));
					stdinst.setCcy(rs.getString("INTERNAL_REMARKS"));

					response.add(stdinst);
				}
			} else {
				stdinst.setResponse_code("99");
				response.add(stdinst);
			}
			if (rs != null) {
				rs.close();
			}
			if (getsi != null) {
				getsi.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		} finally {
			try {
				if (getsi != null) {
					getsi.close();
				}
				if (rs != null) {
					rs.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return response;
	}
	
	public AccountReactivationResponse reactivateAcctOF(AccountReactivationRequest acctreactivateReq) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		AccountReactivationResponse response = null;
		try {
			response = new AccountReactivationResponse();
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.UPD_ACCT_STAT_OF(?,?,?,?)}");
			statusUpdate.registerOutParameter(1, 4);
			System.out.println("Account No " + acctreactivateReq.getAccountnumber());
			statusUpdate.setString(2, acctreactivateReq.getAccountnumber());
			statusUpdate.setString(3, acctreactivateReq.getMiscode());
			statusUpdate.setString(4, "5");
			statusUpdate.setString(5, statusMessage);

			statusUpdate.execute();
			statusResponse = statusUpdate.getObject(1).toString();
			if (statusUpdate != null) {
				statusUpdate.close();
			}
			if (conn != null) {
				conn.close();
			}
			if (statusResponse.equals("0")) {
				statusMessage = "AccountReactivation was Successful";
			} else {
				statusMessage = "AccountReactivation Failed";
			}
			response.setResponsecode(statusResponse);
			response.setResponsemessage(statusMessage);

		} catch (NamingException e) {
			response.setResponsecode("1");
			response.setResponsemessage(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			response.setResponsecode("1");
			response.setResponsemessage(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (statusUpdate != null) {
					statusUpdate.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return response;
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.union.gateway;

import com.union.bof.dao.AccountMaintenanceResponse;
import com.union.bof.dao.AccountReactivationRequest;
import com.union.bof.dao.AccountReactivationResponse;
import com.union.bof.dao.CloseStandingInstructionRequest;
import com.union.bof.dao.CreateStandingInstructionRequest;
import com.union.bof.dao.CreateStandingInstructionResponse;
import com.union.bof.dao.StandingInstructionCloseResponse;
import com.union.bof.dao.StandingInstructionDetailsResponse;
import com.union.bof.utilities.AestheticsUtil;
import com.unionbank.processor.GetConnection;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.naming.NamingException;
import oracle.jdbc.OracleTypes;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 *
 * @author aojinadu
 */
public class ServiceProcessorOF {

	ServiceProcessor sp = new ServiceProcessor();
	private String sipoint = null;

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
			String var_id_exp_date) {
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

	public CreateStandingInstructionResponse createStandingInstruction(CreateStandingInstructionRequest createRequest) {
		CreateStandingInstructionResponse response = new CreateStandingInstructionResponse();
		SimpleDateFormat formatted = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String currDate = formatted.format(date);
		try {
			AestheticsUtil xmlparser = new AestheticsUtil();
			String responseString = "";
			String outputString = "";
			sp.paramload();
			System.out.println("sipoint after param load in SI=====" + this.sipoint);
			URL url = null;
			url = new URL(this.sipoint.substring(0, this.sipoint.length() - 5));
			java.net.URLConnection connection = null;
			connection = url.openConnection();
			HttpURLConnection httpConn = (HttpURLConnection) connection;
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			String xmlInput = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:fcub=\"http://fcubs.ofss.com/service/FCUBSSIService\">\n"
					+ "   <soapenv:Header/>\n"
					+ "   <soapenv:Body>\n"
					+ "<CREATECONTRACT_FSFS_REQ xmlns=\"http://fcubs.ofss.com/service/FCUBSSIService\">\n"
					+ "         <FCUBS_HEADER>\n"
					+ "            <SOURCE>ESB</SOURCE>\n"
					+ "            <UBSCOMP>FCUBS</UBSCOMP>\n"
					+ "            <MSGID/>\n"
					+ "            <CORRELID>124578955</CORRELID>\n"
					+ "            <USERID>WEBSVCS</USERID>\n"
					+ "            <BRANCH>"+createRequest.getBranchCode()+"</BRANCH>\n"
					+ "            <MODULEID>SI</MODULEID>\n"
					+ "            <SERVICE>FCUBSSIService</SERVICE>\n"
					+ "            <OPERATION>CreateContract</OPERATION>\n"
					+ "            <SOURCE_OPERATION>CreateContract</SOURCE_OPERATION>\n"
					+ "            <DESTINATION>WEBSVCS</DESTINATION>\n"
					+ "            <FUNCTIONID>SIDTRONL</FUNCTIONID>\n"
					+ "            <ACTION>NEW</ACTION>\n"
					+ "         </FCUBS_HEADER>\n"
					+ "         <FCUBS_BODY>\n"
					+ "            <Sitbinstruction-Full>\n"
					+ "               <PRODUCT_CODE>"+createRequest.getProd()+"</PRODUCT_CODE>\n"
					+ "               <PRODUCT_TYPE>P</PRODUCT_TYPE>\n"
					+ "               <CAL_HOL_EXCP>F</CAL_HOL_EXCP>\n"
					+ "               <EXEC_DAYS>"+createRequest.getExcdays()+"</EXEC_DAYS> \n"
					+ "                <FRSTEXCDT>"+createRequest.getFirstexcdate()+"</FRSTEXCDT>\n"
					+ "               <MONTH_END_FLAG>N</MONTH_END_FLAG>\n"
					+ "               <COUNTERPARTY>"+createRequest.getCounterparty()+"</COUNTERPARTY>\n"
					+ "               <MAKER_ID>WEBSVCS</MAKER_ID>\n"
					+ "               <MAKER_DT_STAMP>"+currDate+"</MAKER_DT_STAMP>\n"
					+ "               <CHECKER_ID>WEBSVCS</CHECKER_ID>\n"
					+ "               <CHECKER_DT_STAMP>"+currDate+"</CHECKER_DT_STAMP>\n"
					+ "               <Contractmaster>\n"
					+ "                  <APPLY_CHG_SUXS>Y</APPLY_CHG_SUXS>\n"
					+ "                  <APPLY_CHG_PEXC>N</APPLY_CHG_PEXC>\n"
					+ "                  <APPLY_CHG_REJT>N</APPLY_CHG_REJT>\n"
					+ "                  <DR_ACC_BR>"+createRequest.getBranchCode()+"</DR_ACC_BR>\n"
					+ "                  <DR_ACCOUNT>"+createRequest.getDebitAccountNo()+"</DR_ACCOUNT>\n"
					+ "                  <DR_ACC_CCY>"+createRequest.getDebitAccountcurrency()+"</DR_ACC_CCY>\n"
					+ "                  <SI_AMT_CCY/>\n"
					+ "                  <SI_AMT>"+createRequest.getSiAmount()+"</SI_AMT>\n"
					+ "                  <CR_ACC_BR>"+createRequest.getAccountOpeningBranch()+"</CR_ACC_BR>\n"
					+ "                  <CR_ACCOUNT>"+createRequest.getCreditAccountNo()+"</CR_ACCOUNT>\n"
					+ "                  <CR_ACC_CCY>"+createRequest.getCreditAccountcurrency()+"</CR_ACC_CCY>\n"
					+ "                  <INTERNAL_REMARKS>"+createRequest.getRemarks()+"</INTERNAL_REMARKS>\n"
					+ "                  <SI_EXPIRY_DATE>"+createRequest.getSiExpiryDate()+"</SI_EXPIRY_DATE>\n"
					+ "                  <TANKED_STAT>N</TANKED_STAT>\n"
					+ "                  <AUTH_STATUS>A</AUTH_STATUS>\n"
					+ "                  <Misdetails>\n"
					+ "                     <COMPMIS2/>\n"
					+ "                     <COMPMIS4/>\n"
					+ "                     <COMPMIS8/>\n"
					+ "                  </Misdetails>\n"
					+ "               </Contractmaster>\n"
					+ "               <Charge-Details>\n"
					+ "                  <COMPONENT>SICHD</COMPONENT>\n"
					+ "                  <EVENT>SUXS</EVENT>\n"
					+ "                  <CHGCCY>NGN</CHGCCY>\n"
					+ "               </Charge-Details> \n"
					+ "            </Sitbinstruction-Full>\n"
					+ "         </FCUBS_BODY>\n"
					+ "      </CREATECONTRACT_FSFS_REQ>\n"
					+ "   </soapenv:Body>\n"
					+ "</soapenv:Envelope>";
			byte[] buffer = new byte[xmlInput.length()];
			buffer = xmlInput.getBytes();
			bout.write(buffer);
			byte[] b = bout.toByteArray();
			httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
			httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
			httpConn.setRequestMethod("POST");
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			OutputStream out = httpConn.getOutputStream();
			out.write(b);
			out.close();
			InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
			BufferedReader in = new BufferedReader(isr);
			while ((responseString = in.readLine()) != null) {
				outputString = outputString + responseString;
			}
			System.out.println("outputString=======" + outputString.toString());
			Document document = xmlparser.parseXmlFile(outputString);
			NodeList nodeLst = document.getElementsByTagName("EDESC");
			NodeList nodeLst2 = document.getElementsByTagName("WDESC");
			if (nodeLst.getLength() > 0) {
				response.setResponsecode("1");
				response.setResponsemessage(nodeLst.item(0).getTextContent());
			} else if (nodeLst2.getLength() > 0) {
				response.setResponsecode("0");
				response.setResponsemessage(nodeLst2.item(0).getTextContent());
			}
			String formattedSOAPResponse = xmlparser.formatXML(outputString);
			System.out.println(formattedSOAPResponse);
		} catch (Exception e) {
			e.printStackTrace();
			response.setResponsecode("1");
			response.setResponsemessage("Service Error");
		}
		return response;
	}
}

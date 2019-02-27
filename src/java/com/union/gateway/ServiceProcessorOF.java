/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.union.gateway;

import com.union.bof.dao.AccountMaintenanceResponse;
import com.union.bof.dao.AccountReactivationRequest;
import com.union.bof.dao.AccountReactivationResponse;
import com.union.bof.dao.CreateStandingInstructionRequest;
import com.union.bof.dao.CreateStandingInstructionResponse;
import com.union.bof.dao.StandingInstructionCloseResponse;
import com.union.bof.dao.StandingInstructionDetailsResponse;
import com.union.bof.dao.changeCustDetailsOFRequest;
import com.union.bof.utilities.AestheticsUtil;
import static com.union.gateway.ServiceProcessor.getPropertiesValue;
import com.unionbank.processor.GetConnection;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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

	public AccountMaintenanceResponse changeCustNameOF(changeCustDetailsOFRequest changeCustDetailsRequest) {
		String statusResponse = null;
		String statusMessage = null;
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		AccountMaintenanceResponse response = null;
		System.out.println("***********DOB*********" + changeCustDetailsRequest.getVar_dateofbirth() != null ? changeCustDetailsRequest.getVar_dateofbirth() : "00-00-0000");
		try {
			theConn = new GetConnection();
			response = new AccountMaintenanceResponse();
			conn = theConn.getPrConn().getConnection();
			//conn = getPrConn();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.chg_cust_name_of(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			System.out.println("Customer ID " + changeCustDetailsRequest.getCustomerID());
			statusUpdate.registerOutParameter(1, OracleTypes.INTEGER);
			statusUpdate.registerOutParameter(21, OracleTypes.VARCHAR);
			statusUpdate.registerOutParameter(22, OracleTypes.VARCHAR);
			statusUpdate.setString(2, changeCustDetailsRequest.getCustomerID().trim());
			statusUpdate.setString(3, changeCustDetailsRequest.getNewAccountName().trim());
			statusUpdate.setString(4, changeCustDetailsRequest.getNewFirstName().trim());
			statusUpdate.setString(5, changeCustDetailsRequest.getNewMiddleName().trim());
			statusUpdate.setString(6, changeCustDetailsRequest.getNewLastName().trim());
			statusUpdate.setString(7, changeCustDetailsRequest.getNewShortName().trim());
			statusUpdate.setString(8, changeCustDetailsRequest.getNewCIC().trim());
			statusUpdate.setString(9, changeCustDetailsRequest.getNewAddress1().trim());
			statusUpdate.setString(10, changeCustDetailsRequest.getNewAddress2().trim());
			statusUpdate.setString(11, changeCustDetailsRequest.getNewAddress3().trim());
			statusUpdate.setString(12, changeCustDetailsRequest.getNewCity().trim());
			statusUpdate.setString(13, changeCustDetailsRequest.getNewState().trim());
			statusUpdate.setString(14, changeCustDetailsRequest.getNewMobileNumber().trim());
			statusUpdate.setString(15, changeCustDetailsRequest.getNewOfficePhoneLand().trim());
			statusUpdate.setString(16, changeCustDetailsRequest.getNewLGA().trim());
			statusUpdate.setString(17, changeCustDetailsRequest.getNewMaritalStatus().trim());
			statusUpdate.setString(18, "NG");
			statusUpdate.setString(19, "NG");
			statusUpdate.setString(20, "NG");
			statusUpdate.setString(23, convertDate(changeCustDetailsRequest.getVar_dateofbirth().trim()));
			statusUpdate.setString(24, changeCustDetailsRequest.getVar_customerprefix().trim());
			statusUpdate.setString(25, changeCustDetailsRequest.getVar_mother_maiden_name().trim());
			statusUpdate.setString(26, changeCustDetailsRequest.getVar_employer().trim());
			statusUpdate.setString(27, changeCustDetailsRequest.getVar_employer_address1().trim());
			statusUpdate.setString(28, changeCustDetailsRequest.getVar_employer_address2().trim());
			statusUpdate.setString(29, changeCustDetailsRequest.getVar_employer_telephone().trim());
			statusUpdate.setString(30, changeCustDetailsRequest.getVar_designation_profession().trim());
			statusUpdate.setString(31, changeCustDetailsRequest.getVar_tin().trim());
			statusUpdate.setString(32, changeCustDetailsRequest.getVar_occupation().trim());
			statusUpdate.setString(33, changeCustDetailsRequest.getVar_typeofid_card().trim());
			statusUpdate.setString(34, changeCustDetailsRequest.getVar_id_card_no().trim());
			statusUpdate.setString(35, changeCustDetailsRequest.getVar_id_iss_date().trim());
			statusUpdate.setString(36, convertDate(changeCustDetailsRequest.getVar_id_exp_date().trim()));
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
			this.sipoint = getPropertiesValue("sipoint");
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
					+ "            <BRANCH>" + createRequest.getBranchCode() + "</BRANCH>\n"
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
					+ "               <PRODUCT_CODE>" + createRequest.getProd() + "</PRODUCT_CODE>\n"
					+ "               <PRODUCT_TYPE>P</PRODUCT_TYPE>\n"
					+ "               <CAL_HOL_EXCP>F</CAL_HOL_EXCP>\n"
					+ "				  <EXEC_MTHS>" + createRequest.getExcmonths() + "</EXEC_MTHS>"
					+ "               <FRSTEXCDT>" + createRequest.getFirstexcdate() + "</FRSTEXCDT>\n"
					+ "               <MONTH_END_FLAG>N</MONTH_END_FLAG>\n"
					+ "               <COUNTERPARTY>" + createRequest.getCounterparty() + "</COUNTERPARTY>\n"
					+ "               <MAKER_ID>WEBSVCS</MAKER_ID>\n"
					+ "               <MAKER_DT_STAMP>" + currDate + "</MAKER_DT_STAMP>\n"
					+ "               <CHECKER_ID>WEBSVCS</CHECKER_ID>\n"
					+ "               <CHECKER_DT_STAMP>" + currDate + "</CHECKER_DT_STAMP>\n"
					+ "               <Contractmaster>\n"
					+ "                  <APPLY_CHG_SUXS>" + createRequest.getApply_chg_suxs() + "</APPLY_CHG_SUXS>\n"
					+ "                  <APPLY_CHG_PEXC>N</APPLY_CHG_PEXC>\n"
					+ "                  <APPLY_CHG_REJT>N</APPLY_CHG_REJT>\n"
					+ "                  <DR_ACC_BR>" + createRequest.getDebitBranchCode() + "</DR_ACC_BR>\n"
					+ "                  <DR_ACCOUNT>" + createRequest.getDebitAccountNo() + "</DR_ACCOUNT>\n"
					+ "                  <DR_ACC_CCY>" + createRequest.getDebitAccountcurrency() + "</DR_ACC_CCY>\n"
					+ "                  <SI_AMT_CCY/>\n"
					+ "                  <SI_AMT>" + createRequest.getSiAmount() + "</SI_AMT>\n"
					+ "                  <CR_ACC_BR>" + createRequest.getCreditBranchCode() + "</CR_ACC_BR>\n"
					+ "                  <CR_ACCOUNT>" + createRequest.getCreditAccountNo() + "</CR_ACCOUNT>\n"
					+ "                  <CR_ACC_CCY>" + createRequest.getCreditAccountcurrency() + "</CR_ACC_CCY>\n"
					+ "                  <INTERNAL_REMARKS>" + createRequest.getRemarks() + "</INTERNAL_REMARKS>\n"
					+ "                  <SI_EXPIRY_DATE>" + createRequest.getSiExpiryDate() + "</SI_EXPIRY_DATE>\n"
					+ "                  <TANKED_STAT>N</TANKED_STAT>\n"
					+ "                  <AUTH_STATUS>A</AUTH_STATUS>\n"
					+ "                  <Misdetails>\n"
					+ "					 <TXNMIS1>" + createRequest.getTxnmis1() + "</TXNMIS1>"
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
			} else {
				response.setResponsecode("404");
				response.setResponsemessage("Bad Request!");
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

	public StandingInstructionCloseResponse closeStandingInstructionOF(String instrumentNo) {
		StandingInstructionCloseResponse response = new StandingInstructionCloseResponse();
		try {
			AestheticsUtil xmlparser = new AestheticsUtil();
			String responseString = "";
			String outputString = "";
			sp.paramload();
			this.sipoint = getPropertiesValue("sipoint");
			System.out.println("sipoint after param load in SI=====" + this.sipoint);
			URL url = null;
			url = new URL(this.sipoint.substring(0, this.sipoint.length() - 5));
			java.net.URLConnection connection = null;
			connection = url.openConnection();
			HttpURLConnection httpConn = (HttpURLConnection) connection;
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			String xmlInput = "";
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

	private String convertDate(String strDate) {
		String convdate = null;
		if (strDate != null && !strDate.isEmpty()) {
			String dtformat = "dd/MM/yyyy";
			SimpleDateFormat sdf = new SimpleDateFormat(dtformat);
			try {
				Date dt = sdf.parse(strDate);
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
				convdate = sdf2.format(dt);
				System.out.println(convdate);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return convdate;
	}

//	public Connection getPrConn() {
//		Connection connection = null;
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			connection = DriverManager.getConnection("jdbc:oracle:thin:@//10.8.64.72:1521/ubsoct24", "FCUBSLIVE", "Flexcube_24");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return connection;
//	}
//	public static void main(String[] args) {
//		ServiceProcessorOF pos = new ServiceProcessorOF();
//		AccountMaintenanceResponse res = new AccountMaintenanceResponse();
//		try{
//		res =  pos.changeCustNameOF(new changeCustDetailsOFRequest("006165008", 
//				"JOHNSON ASHABI OLUWAKEMI", 
//				"JOHNSON", "ASHABI", "OLUWAKEMI", "JOHNSON ASHABI", 
//				"", "1", "2", "3", "lagos", "lagos", "12345678909", "12345678909",
//				"OJO", "2", "NG", "NG", "NG", "10-02-2018", "Mr", "IFEOMA", "UNION BANK", "36", 
//				"", "12345678909", "BANKING", "123456", "BANKING", "VOTERS CARD", 
//				"098766", "01-03-2019", ""));
//		}catch(Exception e){
//			
//		}
//		System.out.println(convertDate("02/02/1989"));
//	}
}

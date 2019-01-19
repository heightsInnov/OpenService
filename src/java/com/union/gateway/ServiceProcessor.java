package com.union.gateway;

import com.ofss.fcubs.gw.ws.types.FCUBSAccService;
import com.ofss.fcubs.gw.ws.types.FCUBSAccServiceSEI;
import com.ofss.fcubs.gw.ws.types.FCUBSCustomerService;
import com.ofss.fcubs.gw.ws.types.FCUBSCustomerServiceSEI;
import com.ofss.fcubs.gw.ws.types.FCUBSLDService;
import com.ofss.fcubs.gw.ws.types.FCUBSLDServiceSEI;
import com.ofss.fcubs.service.fcubsaccservice.CLOSECUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CLOSECUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CREATECUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATECUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CustAccFullType;
import com.ofss.fcubs.service.fcubsaccservice.CustAccountMISFullType;
import com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTOMERFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTOMERFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.CustmisFullType;
import com.ofss.fcubs.service.fcubscustomerservice.CustomerFullType;
import com.ofss.fcubs.service.fcubsldservice.CREATELDCONTRACTFSFSREQ;
import com.ofss.fcubs.service.fcubsldservice.CREATELDCONTRACTFSFSRES;
import com.ofss.fcubs.service.fcubsldservice.CREATELDPAYMENTFSFSREQ;
import com.ofss.fcubs.service.fcubsldservice.CREATELDPAYMENTFSFSRES;
import com.ofss.fcubs.service.fcubsldservice.IntDetailType;
import com.ofss.fcubs.service.fcubsldservice.IntMainType;
import com.ofss.fcubs.service.fcubsldservice.LoansandDepositsFullType;
import com.ofss.fcubs.service.fcubsldservice.LoansandDepositsPaymentFullType;
import com.ofss.fcubs.service.fcubsldservice.ROLLOVERType2;
import com.union.bof.dao.AccountClassTransferRequest;
import com.union.bof.dao.AccountClassTransferResponse;
import com.union.bof.dao.AccountCloseResponse;
import com.union.bof.dao.AccountMaintenanceResponse;
import com.union.bof.dao.AccountOpeningGenericResponse;
import com.union.bof.dao.AccountOpeningResponse;
import com.union.bof.dao.AccountOpeningWithIDResponse;
import com.union.bof.dao.AccountReactivationRequest;
import com.union.bof.dao.AccountReactivationResponse;
import com.union.bof.dao.AccountReopeningRequest;
import com.union.bof.dao.AccountReopeningResponse;
import com.union.bof.dao.AccountRestrictionPNCRequest;
import com.union.bof.dao.AccountRestrictionPNCResponse;
import com.union.bof.dao.AccountRestrictionPNDRequest;
import com.union.bof.dao.AccountRestrictionPNDResponse;
import com.union.bof.dao.AccountRestrictionRequest;
import com.union.bof.dao.AccountRestrictionResponse;
import com.union.bof.dao.AcctDetailsResponse;
import com.union.bof.dao.CloseStandingInstructionRequest;
import com.union.bof.dao.CreateAccountMemoRequest;
import com.union.bof.dao.CreateAccountMemoResponse;
import com.union.bof.dao.CreateCorpCustomerResponse;
import com.union.bof.dao.CreateCustomerResponse;
import com.union.bof.dao.FloatRateRequest;
import com.union.bof.dao.FloatRateResponse;
import com.union.bof.dao.StandingInstructionCloseResponse;
import com.union.bof.dao.StandingInstructionDetailsResponse;
import com.union.bof.dao.TDBookingResponse;
import com.union.bof.dao.TDDetails;
import com.union.bof.dao.TDLiquidationResponse;
import com.union.bof.dao.UpdateBVNRequest;
import com.union.bof.dao.UpdateBVNResponse;
import com.union.bof.utilities.AestheticsUtil;
import com.union.gateway.types.TDBookingCreation;
import com.unionbank.processor.CountryList;
import com.unionbank.processor.CustomerRelationshipList;
import com.unionbank.processor.GetConnection;
import com.unionbank.processor.StateList;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.naming.NamingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import oracle.jdbc.OracleTypes;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class ServiceProcessor {

	public static String getTimeOut() {
		return timeOut;
	}

	public static void setTimeOut(String aTimeOut) {
		timeOut = aTimeOut;
	}

	SimpleDateFormat sdfproc = new SimpleDateFormat("dd-MMM-yyyy");
	SimpleDateFormat fcubsCreateDate = new SimpleDateFormat("yyyy-MM-dd");
	GregorianCalendar gc = new GregorianCalendar();
	GregorianCalendar gc1 = new GregorianCalendar();
	SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
	SimpleDateFormat sdfcic = new SimpleDateFormat("ddMMyy");
	Timestamp ts = new Timestamp(System.currentTimeMillis());
	String myDateProc = this.sdfYear.format(this.ts);
	SimpleDateFormat formatter = null;
	private FCUBSCustomerServiceSEI port = null;
	private FCUBSCustomerService service = null;
	private FCUBSAccService serviceAcct = null;
	private FCUBSAccServiceSEI portAcct = null;
	private FCUBSLDService serviceLD = null;
	private FCUBSLDServiceSEI portLD = null;
	private static String timeOut = null;
	private String HEADER_SOURCE = null;
	private String HEADER_USER = null;
	private String HEADER_BRANCH = null;
	private String HEADER_SERVICE = null;
	private String HEADER_OPERATION = null;
	private String HEADER_MODIFY_OPERATION = null;
	private String HEADER_ACCT_SOURCE = null;
	private String HEADER_ACCT_USER = null;
	private String HEADER_ACCT_BRANCH = null;
	private String HEADER_ACCT_SERVICE = null;
	private String HEADER_ACCT_OPERATION = null;
	private String HEADER_ACCT_REOPEN_OPERATION = null;
	private String HEADER_ACCT_MODIFY_OPERATION = null;
	private String HEADER_TD_SOURCE = null;
	private String HEADER_TD_USER = null;
	private String HEADER_TD_BRANCH = null;
	private String HEADER_TD_SERVICE = null;
	private String HEADER_TD_OPERATION = null;
	private String HEADER_TD_PMT_OPERATION = null;
	private String HEADER_SICLOSE_SOURCE = null;
	private String HEADER_SICLOSE_USER = null;
	private String HEADER_SICLOSE_BRANCH = null;
	private String HEADER_SICLOSE_SERVICE = null;
	private String HEADER_SICLOSE_OPERATION = null;
	private String sipoint = null;
	private String acctpoint = null;
	private String custpoint = null;
	private String ldpoint = null;

	public void paramload() {
		try {
			String theTimeOut = "20000";

			this.acctpoint = getPropertiesValue("acctpoint");
			this.custpoint = getPropertiesValue("custpoint");
			this.sipoint = getPropertiesValue("sipoint");
			this.ldpoint = getPropertiesValue("ldpoint");
			setTimeOut(theTimeOut);
			System.out.println("URL For Account Endpoint: " + this.acctpoint);
			System.out.println("URL For LD Endpoint: " + this.ldpoint);
			setService(new FCUBSCustomerService());
			setServiceAcct(new FCUBSAccService());
			setServiceLD(new FCUBSLDService());
			setPortAcct(getServiceAcct().getFCUBSAccServiceSEI());
			setPort(getService().getFCUBSCustomerServiceSEI());
			setPortLD(getServiceLD().getFCUBSLDServiceSEI());
			Map<String, Object> requestContext = ((BindingProvider) getPort()).getRequestContext();
			Map<String, Object> requestContextAcct = ((BindingProvider) getPortAcct()).getRequestContext();
			Map<String, Object> requestContextLD = ((BindingProvider) getPortLD()).getRequestContext();
			requestContextAcct.put("javax.xml.ws.service.endpoint.address", this.acctpoint);
			requestContext.put("javax.xml.ws.service.endpoint.address", this.custpoint);
			requestContextLD.put("javax.xml.ws.service.endpoint.address", this.ldpoint);
			setHEADER_SOURCE("ESB");
			setHEADER_USER("WEBSVCS");
			setHEADER_BRANCH("000");
			setHEADER_SERVICE("FCUBSCustomerService");
			setHEADER_OPERATION("CreateCustomer");
			setHEADER_ACCT_SOURCE("ESB");
			setHEADER_ACCT_USER("WEBSVCS");
			setHEADER_ACCT_BRANCH("000");
			setHEADER_ACCT_SERVICE("FCUBSAccService");
			setHEADER_ACCT_OPERATION("CreateCustAcc");
			setHEADER_ACCT_REOPEN_OPERATION("ReopenCustAcc");
			setHEADER_ACCT_MODIFY_OPERATION("ModifyCustAcc");
			setHEADER_MODIFY_OPERATION("ModifyCustomer");
			setHEADER_TD_SOURCE("ESB");
			setHEADER_TD_USER("WEBSVCS");
			setHEADER_TD_BRANCH("000");
			setHEADER_TD_SERVICE("FCUBSLDService");
			setHEADER_TD_OPERATION("CreateLDContract");
			setHEADER_TD_PMT_OPERATION("CreateLDPayment");
			setHEADER_SICLOSE_SOURCE("ESB");
			setHEADER_SICLOSE_USER("WEBSVCS");
			setHEADER_SICLOSE_BRANCH("000");
			setHEADER_SICLOSE_SERVICE("FCUBSSIService");
			setHEADER_MODIFY_OPERATION(this.HEADER_MODIFY_OPERATION);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public StandingInstructionCloseResponse closeStandingInstruction(String instrumentNo) {
		StandingInstructionCloseResponse response = new StandingInstructionCloseResponse();
		try {
			AestheticsUtil xmlparser = new AestheticsUtil();
			String responseString = "";
			String outputString = "";
			paramload();
			System.out.println("sipoint after param load in SI=====" + this.sipoint);
			URL url = null;
			url = new URL(this.sipoint.substring(0, this.sipoint.length() - 5));
			java.net.URLConnection connection = null;
			connection = url.openConnection();
			HttpURLConnection httpConn = (HttpURLConnection) connection;
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			String xmlInput = "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n  <env:Header />\n    <env:Body>\n    <CLOSECONTRACT_FSFS_REQ xmlns=\"http://fcubs.ofss.com/service/FCUBSSIService\">\n      <FCUBS_HEADER>\n        <SOURCE>ESB</SOURCE>\n        <UBSCOMP>FCUBS</UBSCOMP>\n        <MSGID />\n        <CORRELID />\n        <USERID>WEBSVCS</USERID>\n        <BRANCH>000</BRANCH>\n        <MODULEID>SI</MODULEID>\n        <SERVICE>FCUBSSIService</SERVICE>\n        <OPERATION>CloseContract</OPERATION>\n        <SOURCE_OPERATION />\n        <FUNCTIONID>SIGTRONL</FUNCTIONID>\n        <MSGSTAT>SUCCESS</MSGSTAT>\n      </FCUBS_HEADER>\n      <FCUBS_BODY>\n        <Sitbinstruction-Full>\n          <INST_VERSION_NO>1</INST_VERSION_NO>\n          <PRODUCT_CODE>SI01</PRODUCT_CODE>\n          <PRODUCT_TYPE>P</PRODUCT_TYPE>\n          <EXEC_DAYS></EXEC_DAYS>\n          <EXEC_MTHS />\n          <EXEC_YRS />\n          <FIRST_EXEC_DATE></FIRST_EXEC_DATE>\n          <NEXT_EXEC_DATE />\n          <FIRST_VALUE_DATE></FIRST_VALUE_DATE>\n          <NEXT_VALUE_DATE />\n          <USER_INST_NO />\n          <AUTH_STATUS />\n          <INSTRNO>" + instrumentNo + "</INSTRNO>\n" + "          <SOURCE_CODE>ESB</SOURCE_CODE>\n" + "          <Contractmaster>\n" + "            <DR_ACC_BR>014</DR_ACC_BR>\n" + "            <DR_ACCOUNT>0035548400</DR_ACCOUNT>\n" + "            <DR_ACC_CCY>NGN</DR_ACC_CCY>\n" + "            <SI_AMT_CCY />\n" + "            <SI_AMT>13000</SI_AMT>\n" + "            <CR_ACC_BR>195</CR_ACC_BR>\n" + "            <CR_ACCOUNT>0014561167</CR_ACCOUNT>\n" + "            <CR_ACC_CCY>NGN</CR_ACC_CCY>\n" + "            <PRIORITY />\n" + "            <CHARGE_WHOM />\n" + "            <SI_EXPIRY_DATE />\n" + "          </Contractmaster>\n" + "        </Sitbinstruction-Full>\n" + "      </FCUBS_BODY>\n" + "    </CLOSECONTRACT_FSFS_REQ>\n" + "  </env:Body>\n" + "  </env:Envelope>";
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

	public StandingInstructionCloseResponse closeStandingInstruction(CloseStandingInstructionRequest closeStandingInstr) {
		StandingInstructionCloseResponse response = new StandingInstructionCloseResponse();
		try {
			AestheticsUtil xmlparser = new AestheticsUtil();
			String responseString = "";
			String outputString = "";
			paramload();
			System.out.println("sipoint after param load in SI=====" + this.sipoint);
			URL url = null;
			url = new URL(this.sipoint.substring(0, this.sipoint.length() - 5));
			java.net.URLConnection connection = null;
			connection = url.openConnection();
			HttpURLConnection httpConn = (HttpURLConnection) connection;
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			String xmlInput = "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n  <env:Header />\n    <env:Body>\n    <CLOSECONTRACT_FSFS_REQ xmlns=\"http://fcubs.ofss.com/service/FCUBSSIService\">\n      <FCUBS_HEADER>\n        <SOURCE>ESB</SOURCE>\n        <UBSCOMP>FCUBS</UBSCOMP>\n        <MSGID />\n        <CORRELID />\n        <USERID>WEBSVCS</USERID>\n        <BRANCH>000</BRANCH>\n        <MODULEID>SI</MODULEID>\n        <SERVICE>FCUBSSIService</SERVICE>\n        <OPERATION>CloseContract</OPERATION>\n        <SOURCE_OPERATION />\n        <FUNCTIONID>SIGTRONL</FUNCTIONID>\n        <MSGSTAT>SUCCESS</MSGSTAT>\n      </FCUBS_HEADER>\n      <FCUBS_BODY>\n        <Sitbinstruction-Full>\n          <INST_VERSION_NO>1</INST_VERSION_NO>\n          <PRODUCT_CODE>SI01</PRODUCT_CODE>\n          <PRODUCT_TYPE>P</PRODUCT_TYPE>\n          <EXEC_DAYS></EXEC_DAYS>\n          <EXEC_MTHS />\n          <EXEC_YRS />\n          <FIRST_EXEC_DATE></FIRST_EXEC_DATE>\n          <NEXT_EXEC_DATE />\n          <FIRST_VALUE_DATE></FIRST_VALUE_DATE>\n          <NEXT_VALUE_DATE />\n          <USER_INST_NO />\n          <AUTH_STATUS />\n          <INSTRNO>" + closeStandingInstr.getInstr_no() + "</INSTRNO>\n" + "          <SOURCE_CODE>ESB</SOURCE_CODE>\n" + "          <Contractmaster>\n" + "            <DR_ACC_BR>" + closeStandingInstr.getDr_acct_branch() + "</DR_ACC_BR>\n" + "            <DR_ACCOUNT>" + closeStandingInstr.getDr_acct() + "</DR_ACCOUNT>\n" + "            <DR_ACC_CCY>NGN</DR_ACC_CCY>\n" + "            <SI_AMT_CCY />\n" + "            <SI_AMT>" + closeStandingInstr.getAmount() + "</SI_AMT>\n" + "            <CR_ACC_BR>" + closeStandingInstr.getCr_acct_branch() + "</CR_ACC_BR>\n" + "            <CR_ACCOUNT>" + closeStandingInstr.getCr_acct() + "</CR_ACCOUNT>\n" + "            <CR_ACC_CCY>NGN</CR_ACC_CCY>\n" + "            <PRIORITY />\n" + "            <CHARGE_WHOM />\n" + "            <SI_EXPIRY_DATE />\n" + "          </Contractmaster>\n" + "        </Sitbinstruction-Full>\n" + "      </FCUBS_BODY>\n" + "    </CLOSECONTRACT_FSFS_REQ>\n" + "  </env:Body>\n" + "  </env:Envelope>";
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

	public AccountClassTransferResponse transferAccountClass(AccountClassTransferRequest accountClassTransferRequest) {
		AccountClassTransferResponse response = new AccountClassTransferResponse();
		String errMsg = "";
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();

			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.transfer_acct_class(?,?,?,?,?)}");
			statusUpdate.registerOutParameter(1, 4);
			statusUpdate.registerOutParameter(6, 12);
			System.out.println("acctNoooooo " + accountClassTransferRequest.getAcctno());
			statusUpdate.setString(2, accountClassTransferRequest.getAcctno());
			statusUpdate.setString(3, accountClassTransferRequest.getAcct_branch());
			statusUpdate.setString(4, accountClassTransferRequest.getFrom_acct_class());
			statusUpdate.setString(5, accountClassTransferRequest.getTo_acct_class());
			statusUpdate.execute();
			errMsg = statusUpdate.getObject(6).toString();
			statusResponse = statusUpdate.getObject(1).toString();
			if (statusUpdate != null) {
				statusUpdate.close();
			}
			if (conn != null) {
				conn.close();
			}
			if (statusResponse.equals("0")) {
				statusMessage = "Account Transfer Successful";
			} else {
				statusMessage = "Account Transfer Failed";
			}
			response.setResponsecode(statusResponse);
			response.setResponsemessage(statusMessage);
		} catch (NamingException e) {
			response.setResponsecode("1");
			response.setResponsemessage(errMsg);
			e.printStackTrace();
		} catch (Exception e) {
			response.setResponsecode("1");
			response.setResponsemessage(errMsg);
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

	public com.union.bof.dao.CreateStandingInstructionResponse createStandingInstruction(com.union.bof.dao.CreateStandingInstructionRequest createRequest) {
		com.union.bof.dao.CreateStandingInstructionResponse response = new com.union.bof.dao.CreateStandingInstructionResponse();

		return response;
	}

	public AccountReopeningResponse reopenAccount(AccountReopeningRequest accountreopeningRequest) {
		AccountReopeningResponse response = new AccountReopeningResponse();
		try {
			AestheticsUtil xmlparser = new AestheticsUtil();
			String responseString = "";
			String outputString = "";
			paramload();
			System.out.println("acctpoint after param load in Reopening=====" + this.acctpoint);
			URL url = null;
			url = new URL(this.acctpoint.substring(0, this.acctpoint.length() - 5));
			java.net.URLConnection connection = null;
			connection = url.openConnection();

			HttpURLConnection httpConn = (HttpURLConnection) connection;
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			String xmlInput = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:fcub=\"http://fcubs.ofss.com/service/FCUBSAccService\">\n   <soapenv:Header/>\n   <soapenv:Body>\n<REOPENCUSTACC_FSFS_REQ xmlns=\"http://fcubs.ofss.com/service/FCUBSAccService\">\n  <FCUBS_HEADER>\n    <SOURCE>ESB</SOURCE>\n    <UBSCOMP>FCUBS</UBSCOMP>\n    <MSGID></MSGID>\n    <CORRELID></CORRELID>\n    <USERID>WEBSVCS</USERID>\n    <BRANCH>000</BRANCH>\n    <MODULEID>ST</MODULEID>\n    <SERVICE>FCUBSAccService</SERVICE>\n    <OPERATION>ReopenCustAcc</OPERATION>\n    <SOURCE_OPERATION></SOURCE_OPERATION>\n    <SOURCE_USERID></SOURCE_USERID>\n    <DESTINATION></DESTINATION>\n    <MULTITRIPID></MULTITRIPID>\n    <FUNCTIONID>STDCUSAC</FUNCTIONID>\n    <ACTION>REOPEN</ACTION>\n    <MSGSTAT>SUCCESS</MSGSTAT>\n    <PASSWORD></PASSWORD>\n    <ADDL>\n      <PARAM>\n        <NAME></NAME>\n        <VALUE></VALUE>\n      </PARAM>\n    </ADDL>\n  </FCUBS_HEADER>\n  <FCUBS_BODY>\n    <Cust-Account-Full>\n      <BRN>" + accountreopeningRequest.getBranchcode() + "</BRN>\n" + "      <ACC>" + accountreopeningRequest.getAccountnumber() + "</ACC>\n" + "      <CUSTNO>" + accountreopeningRequest.getCustomernumber() + "</CUSTNO>\n" + "      <ACCLS>" + accountreopeningRequest.getAccls() + "</ACCLS>\n" + "      <CCY>NGN</CCY>\n" + "      <CUSTNAME></CUSTNAME>\n" + "      <ADESC></ADESC>\n" + "      <ACSTATNODR></ACSTATNODR>\n" + "      <ACSTATNOCR></ACSTATNOCR>\n" + "      <ACSTATSTPAY></ACSTATSTPAY>\n" + "      <DORM></DORM>\n" + "      <ACCTYPE></ACCTYPE>   \n" + "    </Cust-Account-Full>\n" + "  </FCUBS_BODY>\n" + "</REOPENCUSTACC_FSFS_REQ>\n" + "   </soapenv:Body>\n" + "</soapenv:Envelope>";

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

	public UpdateBVNResponse updateBVNRecord(UpdateBVNRequest updatebvnrequest) {
		UpdateBVNResponse bvnresponse = new UpdateBVNResponse();
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{call acctenqry.union_bvn_pkg.updatesinglebvntocba(?,?,?)}");
			statusUpdate.registerOutParameter(1, 4);
			System.out.println("CustID " + updatebvnrequest.getCustid());
			statusUpdate.setString(2, updatebvnrequest.getCustid());
			statusUpdate.setString(3, updatebvnrequest.getBvnno());

			statusUpdate.execute();
			statusResponse = statusUpdate.getObject(1).toString();
			if (statusUpdate != null) {
				statusUpdate.close();
			}
			if (conn != null) {
				conn.close();
			}
			if (statusResponse.equals("0")) {
				statusMessage = "BVN Update Successful";
			} else {
				statusMessage = "BVN Update Failed";
			}
			bvnresponse.setResponsecode(statusResponse);
			bvnresponse.setResponsemessage(statusMessage);
			return bvnresponse;
		} catch (NamingException e) {
			bvnresponse.setResponsecode("1");
			bvnresponse.setResponsemessage(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			bvnresponse.setResponsecode("1");
			bvnresponse.setResponsemessage(e.getMessage());
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
		return bvnresponse;
	}

	public CreateAccountMemoResponse createAccountMemo(CreateAccountMemoRequest createAccountMemoRequest)
			throws Exception {
		CreateAccountMemoResponse memoresponse = new CreateAccountMemoResponse();
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.creatememo(?,?)}");
			statusUpdate.registerOutParameter(1, 4);
			System.out.println("Account No " + createAccountMemoRequest.getAccount());
			statusUpdate.setString(2, createAccountMemoRequest.getAccount());
			statusUpdate.setString(3, createAccountMemoRequest.getMemotxt());

			statusUpdate.execute();
			statusResponse = statusUpdate.getObject(1).toString();
			if (statusUpdate != null) {
				statusUpdate.close();
			}
			if (conn != null) {
				conn.close();
			}
			if (statusResponse.equals("0")) {
				statusMessage = "Memo Creation Successful for " + createAccountMemoRequest.getAccount();
			} else {
				statusMessage = "Create Memo Failed";
			}
			memoresponse.setResponsecode(statusResponse);
			memoresponse.setResponsemessage(statusMessage);

		} catch (NamingException e) {
			memoresponse.setResponsecode("1");
			memoresponse.setResponsemessage(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			memoresponse.setResponsecode("1");
			memoresponse.setResponsemessage(e.getMessage());
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
		return memoresponse;
	}

	public AccountReactivationResponse reactivateAcct(AccountReactivationRequest acctreactivateReq) {
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
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.UPD_ACCT_STAT(?,?,?)}");
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

	public AccountRestrictionPNCResponse restrictAcctToPNC(AccountRestrictionPNCRequest acctrestrictpncReq) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		AccountRestrictionPNCResponse response = new AccountRestrictionPNCResponse();
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.UPD_ACCT_STAT(?,?,?)}");
			statusUpdate.registerOutParameter(1, 4);
			statusUpdate.setString(2, acctrestrictpncReq.getAccountnumber());
			statusUpdate.setString(3, "5");
			statusUpdate.setString(4, "4");
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
				statusMessage = "AccountPNCRestriction was Successful";
			} else {
				statusMessage = "AccountPNCRestriction Failed";
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

	public AccountRestrictionPNDResponse restrictAcctToPND(AccountRestrictionPNDRequest acctrestrictpndReq) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		AccountRestrictionPNDResponse response = null;
		try {
			response = new AccountRestrictionPNDResponse();
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.UPD_ACCT_STAT(?,?,?)}");
			statusUpdate.registerOutParameter(1, 4);
			System.out.println("Account No " + acctrestrictpndReq.getAccountnumber());
			statusUpdate.setString(2, acctrestrictpndReq.getAccountnumber());
			statusUpdate.setString(3, "3");
			statusUpdate.setString(4, "4");
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
				statusMessage = "AccountPNDRestriction was Successful";
			} else {
				statusMessage = "AccountPNDRestriction Failed";
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

	public AccountRestrictionResponse restrictAcct(AccountRestrictionRequest acctrestrictReq) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		AccountRestrictionResponse response = null;
		try {
			response = new AccountRestrictionResponse();
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.UPD_ACCT_STAT(?,?,?)}");
			statusUpdate.registerOutParameter(1, 4);
			System.out.println("Account No " + acctrestrictReq.getAccountnumber());
			statusUpdate.setString(2, acctrestrictReq.getAccountnumber());
			statusUpdate.setString(3, "4");
			statusUpdate.setString(4, acctrestrictReq.getStatusCode());
			System.out.println("Passed status code ====" + acctrestrictReq.getStatusCode());
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
				statusMessage = "AccountRestriction was Successful";
			} else {
				statusMessage = "AccountRestriction Failed";
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

	public AccountOpeningResponse OpenAccountBOF(String title, String firstName, String middleName, String lastName, String dateOfBirth, String address, String address2, String address3, String address4, String state, String nationality, String motherMaidenName, String telephone, String telephone2, String profession, String maritaStatus, String gender, String email, String custIdNo, String issueDate, String expiryDate, String nextOfKin, String relatioship, String branch, String uniqueID, String acctCategory, String language, String theCity, String countryOfResident, String zipCode, String isStaff, String country, String productCode, byte[] customerSignature, byte[] customerpix, byte[] customerIDScan, byte[] customerUtilScan, byte[] custFingerPrintScan, String linkSignature, String linkcustomerpix, String linkcustomerIDScan, String linkcustomerUtilScan, String cardType, String internetBankingSubscribe, String unionMobileSubscribe, String nextOfKinMobileNumber, String rmCode, String initiatorID, String verifierID) {
		AccountOpeningResponse response = null;

		String acctNames = null;
		this.gc.setTime(new Date());
		System.out.println("Date Of Birth: " + this.fcubsCreateDate.format(new Date(dateOfBirth)));
		this.gc1.setTime(new Date(dateOfBirth));
		XMLGregorianCalendar xgcal = null;
		XMLGregorianCalendar xgcalDOB = null;
		CustomerFullType.Mfi1 Mfi1 = new CustomerFullType.Mfi1();
		paramload();
		CustomerFullType customerFullType = new CustomerFullType();
		CustmisFullType.Compositemis Compositemis = new CustmisFullType.Compositemis();
		ArrayList<CustmisFullType.Customermis> custMis = new ArrayList();
		CustmisFullType.Customermis Customermis = new CustmisFullType.Customermis();
		CustmisFullType.Customermis Custmis = new CustmisFullType.Customermis();
		CustmisFullType CustmisFullType = new CustmisFullType();
		com.ofss.fcubs.service.fcubscustomerservice.FCUBSHEADERType FCUBSHEADERType = new com.ofss.fcubs.service.fcubscustomerservice.FCUBSHEADERType();
		CREATECUSTOMERFSFSREQ.FCUBSBODY FCUBSBODY = new CREATECUSTOMERFSFSREQ.FCUBSBODY();
		CustomerFullType.Custpersonal Custpersonal = new CustomerFullType.Custpersonal();
		CustomerFullType.CustLiab CustLiab = new CustomerFullType.CustLiab();
		CREATECUSTACCFSFSRES resultAcct = null;
		com.ofss.fcubs.service.fcubsaccservice.FCUBSHEADERType HEADERType = new com.ofss.fcubs.service.fcubsaccservice.FCUBSHEADERType();
		CREATECUSTACCFSFSREQ.FCUBSBODY FCUBSBODYAcct = new CREATECUSTACCFSFSREQ.FCUBSBODY();
		CustAccountMISFullType CustAccountMISFullType = new CustAccountMISFullType();
		CustAccountMISFullType.Misdetails Misdetails = new CustAccountMISFullType.Misdetails();
		CustAccFullType custacctFullType = new CustAccFullType();
		GetConnection theConn = null;
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			response = new AccountOpeningResponse();
			if (middleName != null) {
				if (middleName.trim().length() > 0) {
					acctNames = lastName + " " + middleName.toUpperCase() + " " + firstName;
				} else {
					acctNames = lastName + " " + firstName;
				}
			} else {
				acctNames = lastName + " " + firstName;
			}

			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(this.gc);
			System.out.println("The Final Date: " + xgcalDOB);
			CREATECUSTOMERFSFSREQ requestMsg = new CREATECUSTOMERFSFSREQ();
			FCUBSHEADERType.setSOURCE(getHEADER_SOURCE());
			FCUBSHEADERType.setUBSCOMP(com.ofss.fcubs.service.fcubscustomerservice.UBSCOMPType.FCUBS);
			FCUBSHEADERType.setUSERID(getHEADER_USER());
			FCUBSHEADERType.setBRANCH("006");
			FCUBSHEADERType.setSERVICE(getHEADER_SERVICE());
			FCUBSHEADERType.setOPERATION(getHEADER_OPERATION());
			FCUBSHEADERType.setMSGSTAT(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.SUCCESS);
			requestMsg.setFCUBSHEADER(FCUBSHEADERType);

			Compositemis.setMISCLS("INT_CODE");
			Compositemis.setMISCD(rmCode);
			CustmisFullType.getCompositemis().add(Compositemis);

			Customermis.setMISCLS("BIZ_SEG");
			Customermis.setMISCD("REM_310");
			custMis.add(Customermis);

			Custmis.setMISCLS("RM_CODE");
			Custmis.setMISCD(rmCode);
			custMis.add(Custmis);

			CustmisFullType.getCustomermis().addAll(custMis);
			customerFullType.setCustmis(CustmisFullType);

			customerFullType.setCTYPE("I");
			customerFullType.setNAME(acctNames);
			customerFullType.setADDRLN1(address);
			customerFullType.setADDRLN2(address2);
			customerFullType.setADDRLN3(address3);
			customerFullType.setCOUNTRY("NG");
			customerFullType.setSNAME(lastName.toUpperCase().substring(0, 3) + firstName.toUpperCase().substring(0, 3) + this.sdfcic.format(new Date(dateOfBirth)));
			customerFullType.setNLTY("NG");
			customerFullType.setCCATEG(acctCategory);
			customerFullType.setFULLNAME(acctNames);
			customerFullType.setCIFCREATIONDT(xgcal);
			customerFullType.setMEDIA("MAIL");
			customerFullType.setLOC(state);
			Custpersonal.setFSTNAME(firstName);
			Custpersonal.setMIDNAME(middleName);
			Custpersonal.setLSTNAME(lastName);
			Custpersonal.setDOB(this.fcubsCreateDate.format(new Date(dateOfBirth)));
			Custpersonal.setTITLE(title);
			Custpersonal.setGENDR(gender);
			Custpersonal.setSEX(gender);
			Custpersonal.setTELEPHNO(telephone);
			Custpersonal.setMOBNUM(telephone);
			Custpersonal.setEMAILID(email);
			Custpersonal.setLANG("ENG");
			String myDateProc1 = this.sdfYear.format(new Date(dateOfBirth));
			int cal = Integer.parseInt(this.myDateProc) - Integer.parseInt(myDateProc1);
			System.out.println("The New Year " + cal);
			if (cal > 18) {
				System.out.println("This is the Year Based on Minor Status Over 18 " + cal);
				Custpersonal.setMINOR("N");
			} else {
				Custpersonal.setMINOR("Y");
				Custpersonal.setGUARDIAN(nextOfKin);
			}
			Custpersonal.setPLACEOFBIRTH("NG");
			Custpersonal.setBIRTHCOUNTRY("NG");
			CustLiab.setLIABILITYNUMBER(null);
			CustLiab.setLIABILTYNAME(acctNames);
			CustLiab.setLIABBRANCH("006");
			CustLiab.setLIABCCY("NGN");
			Mfi1.setACCOUNTOFFICER(rmCode);
			customerFullType.setMfi1(Mfi1);
			customerFullType.setCustLiab(CustLiab);
			customerFullType.setCustpersonal(Custpersonal);
			FCUBSBODY.setCustomerFull(customerFullType);
			requestMsg.setFCUBSBODY(FCUBSBODY);

			System.out.println("The Port " + getPort());
			CREATECUSTOMERFSFSRES result = getPort().createCustomerFS(requestMsg);
			System.out.println("response " + result);
			if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.FAILURE)) {
				response.setResponseCode("1");
				int i = 0;
				for (int n = result.getFCUBSBODY().getFCUBSERRORRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE() + " -- " + ((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
					System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE());
					System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
				}
			} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.WARNING)) {
				response.setResponseCode("1");
				for (int i = 0, n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWCODE() + " -- " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWDESC());
					System.out.println("This is the result Cust " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWCODE());
					System.out.println("This is the result Cust " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
				}
			} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.SUCCESS)) {
				response.setResponseCode("0");
				response.setCustomerID(result.getFCUBSBODY().getCustomerFull().getCUSTNO());
				for (int i = 0, n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC() + " -- " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
					System.out.println("This is the result Cust " + result.getFCUBSBODY().getCustomerFull().getCUSTNO());
				}
				CREATECUSTACCFSFSREQ requestMsgAcct = new CREATECUSTACCFSFSREQ();
				HEADERType.setSOURCE(getHEADER_ACCT_SOURCE());
				HEADERType.setUBSCOMP(com.ofss.fcubs.service.fcubsaccservice.UBSCOMPType.FCUBS);
				HEADERType.setUSERID(getHEADER_ACCT_USER());
				HEADERType.setBRANCH(branch);
				HEADERType.setSERVICE(getHEADER_ACCT_SERVICE());
				HEADERType.setOPERATION(getHEADER_ACCT_OPERATION());
				HEADERType.setMSGSTAT(com.ofss.fcubs.service.fcubsaccservice.MsgStatType.SUCCESS);
				requestMsgAcct.setFCUBSHEADER(HEADERType);
				custacctFullType.setCUSTNO(response.getCustomerID());
				custacctFullType.setBRN(branch);
				System.out.println("This " + custacctFullType.getBRN());
				custacctFullType.setCCY(unionMobileSubscribe);
				custacctFullType.setACCLS(productCode);
				custacctFullType.setADESC(acctNames);
				System.out.println("The Date " + xgcal);
				custacctFullType.setACCSTAT("NORM");

				custacctFullType.setDORMPRM("M");
				custacctFullType.setLOC(theCity);
				custacctFullType.setMEDIA("MAIL");
				custacctFullType.setACSTATNODR("Y");
				custacctFullType.setCOUNTRYCODE("NG");
				custacctFullType.setPOSTALLOWED("Y");
				CustAccountMISFullType.setBRN(branch);
				Misdetails.setRTFLAG("R");
				Misdetails.setTXNMIS1("D0100");
				Misdetails.setCOMPMIS1(rmCode);

				System.out.println("MIS" + Misdetails.getRTFLAG());
				CustAccountMISFullType.setMisdetails(Misdetails);
				custacctFullType.setCustAcc(CustAccountMISFullType);
				FCUBSBODYAcct.setCustAccountFull(custacctFullType);
				requestMsgAcct.setFCUBSBODY(FCUBSBODYAcct);

				System.out.println("Message " + requestMsgAcct);
				resultAcct = getPortAcct().createCustAccFS(requestMsgAcct);
				System.out.println("The Result" + result);
				System.out.println("The Result" + result.getFCUBSHEADER().getMSGSTAT());
				if (resultAcct.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsaccservice.MsgStatType.SUCCESS)) {
					response.setResponseCode("0");
					response.setAccountNumber(resultAcct.getFCUBSBODY().getCustAccountFull().getSttmsCustAccSwp().getCUSTACNO());
					System.out.println("Account Number " + response.getAccountNumber());
					response.setCustomerID(response.getCustomerID());
					for (int i = 0, n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
						response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
						System.out.println("This is the result Acct " + ((com.ofss.fcubs.service.fcubsaccservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.WARNINGType) resultAcct.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
					}
					String query = "insert into BOTF_ACCT_LOG (TITLE, FIRSTNAME, MIDDLENAME, LASTNAME, ACCOUNT_NO, CUSTOMER_ID, REF_NO, DATEOFBIRTH, ADDRESS, ADDRESS2, ADDRESS3, STATE, NATIONALITY, MOTHERMAIDENNAME, TELEPHONE, TELEPHONE2, PROFESSION, MARITASTATUS, GENDER, EMAIL, ISSUEDATE, EXPIRYDATE, NEXTOFKIN, RELATIOSHIP, BRANCH, ACCTCATEGORY, LANGUAGE, THECITY, COUNTRYOFRESIDENT, ZIPCODE, ISSTAFF, COUNTRY, PRODUCTCODE, LINKSIGNATURE, LINKCUSTOMERPIX,LINKCUSTOMERIDSCAN, LINKCUSTOMERUTILSCAN, CARDTYPE, ACCT_NAME, INTERNETBANKG, UNIONMOBILE, NEXTOFKINMOBILE) values ('" + title + "', " + "'" + firstName + "', '" + middleName + "', " + "'" + lastName + "', '" + response.getAccountNumber().trim() + "', " + "'" + response.getCustomerID().trim() + "', '" + uniqueID + "', " + "'" + dateOfBirth + "', '" + address + "', " + "'" + address2 + "', " + "'" + address3 + "', '" + state + "', " + "'" + nationality + "', " + "'" + motherMaidenName + "', '" + telephone + "', " + "'" + telephone2 + "', '" + profession + "', " + "'" + maritaStatus + "', '" + gender + "', '" + email + "', " + "'" + issueDate + "', '" + expiryDate + "', '" + nextOfKin + "', " + "'" + relatioship + "', '" + branch + "', '" + acctCategory + "', " + "'" + language + "', '" + theCity + "', " + "'" + countryOfResident + "', " + "'" + zipCode + "', '" + isStaff + "', " + "'" + country + "', '" + productCode + "', " + "'" + linkSignature + "', " + "'" + linkcustomerpix + "', '" + linkcustomerIDScan + "', " + "'" + linkcustomerUtilScan + "', " + "'" + cardType + "', '" + acctNames + "', " + "'" + internetBankingSubscribe + "', " + "'" + unionMobileSubscribe + "', " + "'" + nextOfKinMobileNumber + "')";
					System.out.println("This is the Query: " + query);
					pstmt = conn.prepareStatement(query);
					pstmt.executeUpdate();
				} else if (resultAcct.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsaccservice.MsgStatType.FAILURE)) {
					response.setResponseCode("1");
					for (int i = 0, n = resultAcct.getFCUBSBODY().getFCUBSERRORRESP().size(); i < n; i++) {
						response.setResponseMessage(((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) resultAcct.getFCUBSBODY().getFCUBSERRORRESP().get(0)).getERROR().get(0)).getECODE() + " -- " + ((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) resultAcct.getFCUBSBODY().getFCUBSERRORRESP().get(0)).getERROR().get(0)).getEDESC());
						System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) resultAcct.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE());
						System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) resultAcct.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
					}
				}
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
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

	public AccountOpeningGenericResponse OpenAccountGeneric(String title, String firstName, String middleName, String lastName, String dateOfBirth, String address, String address2, String address3, String state, String nationality, String motherMaidenName, String telephone, String telephone2, String profession, String maritaStatus, String gender, String email, String custIdNo, String issueDate, String expiryDate, String nextOfKin, String relatioship, String branch, String uniqueID, String acctCategory, String language, String theCity, String countryOfResident, String zipCode, String isStaff, String country, String productCode, String nextOfKinMobileNumber, boolean pnd, boolean smsAlert, String rmCode, String initiatorID, String verifierID) {
		AccountOpeningGenericResponse response = null;

		String acctNames = null;
		this.gc.setTime(new Date());
		this.gc1.setTime(new Date(dateOfBirth));
		XMLGregorianCalendar xgcal = null;
		XMLGregorianCalendar xgcalDOB = null;
		paramload();
		CustmisFullType.Compositemis Compositemis = new CustmisFullType.Compositemis();
		CustmisFullType.Customermis Custmis = new CustmisFullType.Customermis();
		CustmisFullType.Customermis Customermis = new CustmisFullType.Customermis();
		ArrayList<CustmisFullType.Customermis> custMis = new ArrayList();
		CustmisFullType CustmisFullType = new CustmisFullType();
		CustomerFullType customerFullType = new CustomerFullType();
		com.ofss.fcubs.service.fcubscustomerservice.FCUBSHEADERType FCUBSHEADERType = new com.ofss.fcubs.service.fcubscustomerservice.FCUBSHEADERType();
		CREATECUSTOMERFSFSREQ.FCUBSBODY FCUBSBODY = new CREATECUSTOMERFSFSREQ.FCUBSBODY();
		CustomerFullType.Custpersonal Custpersonal = new CustomerFullType.Custpersonal();
		CustomerFullType.Mfi1 Mfi1 = new CustomerFullType.Mfi1();
		CustomerFullType.CustLiab CustLiab = new CustomerFullType.CustLiab();
		CREATECUSTACCFSFSRES resultAcct = null;
		com.ofss.fcubs.service.fcubsaccservice.FCUBSHEADERType HEADERType = new com.ofss.fcubs.service.fcubsaccservice.FCUBSHEADERType();
		CREATECUSTACCFSFSREQ.FCUBSBODY FCUBSBODYAcct = new CREATECUSTACCFSFSREQ.FCUBSBODY();
		CustAccountMISFullType CustAccountMISFullType = new CustAccountMISFullType();
		CustAccountMISFullType.Misdetails Misdetails = new CustAccountMISFullType.Misdetails();
		CustAccFullType custacctFullType = new CustAccFullType();
		GetConnection theConn = null;
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			response = new AccountOpeningGenericResponse();
			if (middleName != null) {
				if (middleName.trim().length() > 0) {
					acctNames = lastName + " " + middleName.toUpperCase() + " " + firstName;
				} else {
					acctNames = lastName + " " + firstName;
				}
			} else {
				acctNames = lastName + " " + firstName;
			}

			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(this.gc);
			xgcalDOB = DatatypeFactory.newInstance().newXMLGregorianCalendar(this.gc1);
			CREATECUSTOMERFSFSREQ requestMsg = new CREATECUSTOMERFSFSREQ();
			FCUBSHEADERType.setSOURCE(getHEADER_SOURCE());
			FCUBSHEADERType.setUBSCOMP(com.ofss.fcubs.service.fcubscustomerservice.UBSCOMPType.FCUBS);
			FCUBSHEADERType.setUSERID(getHEADER_USER());
			FCUBSHEADERType.setBRANCH(branch);
			FCUBSHEADERType.setSERVICE(getHEADER_SERVICE());
			FCUBSHEADERType.setOPERATION(getHEADER_OPERATION());
			FCUBSHEADERType.setMSGSTAT(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.SUCCESS);
			requestMsg.setFCUBSHEADER(FCUBSHEADERType);

			System.out.println("relatioship " + relatioship);
			Compositemis.setMISCLS("INT_CODE");
			Compositemis.setMISCD(relatioship);
			CustmisFullType.getCompositemis().add(Compositemis);

			Customermis.setMISCLS(zipCode);
			System.out.println("zipCode " + zipCode);
			System.out.println("nextOfKinMobileNumber " + nextOfKinMobileNumber);
			Customermis.setMISCD(nextOfKinMobileNumber);
			custMis.add(Customermis);

			Custmis.setMISCLS("RM_CODE");
			System.out.println("rmCode " + rmCode);
			Custmis.setMISCD(rmCode);
			custMis.add(Custmis);

			CustmisFullType.getCustomermis().addAll(custMis);
			customerFullType.setCustmis(CustmisFullType);

			customerFullType.setMAKER(initiatorID);
			customerFullType.setMAKERSTAMP(this.fcubsCreateDate.format(this.ts));
			customerFullType.setCHECKER(verifierID);
			customerFullType.setCHECKERSTAMP(this.fcubsCreateDate.format(this.ts));

			customerFullType.setCTYPE(acctCategory.substring(0, 1));
			System.out.println(" acctNames " + acctNames);
			customerFullType.setNAME(acctNames);
			System.out.println(" address " + address);
			customerFullType.setADDRLN1(address);
			System.out.println(" address2 " + address2);
			customerFullType.setADDRLN2(address2);
			System.out.println(" address3 " + address3);
			customerFullType.setADDRLN3(address3);
			System.out.println(" acctNames " + acctNames);
			customerFullType.setCOUNTRY(countryOfResident);
			System.out.println(" SNAME " + lastName.toUpperCase() + firstName.toUpperCase() + this.sdfcic.format(new Date(dateOfBirth)));
			customerFullType.setSNAME(lastName.toUpperCase().substring(0, 3) + firstName.toUpperCase().substring(0, 3) + this.sdfcic.format(new Date(dateOfBirth)));
			customerFullType.setNLTY(country);
			customerFullType.setCCATEG(acctCategory);
			System.out.println(" FullName " + acctNames);
			customerFullType.setFULLNAME(acctNames);
			System.out.println(" xgcal " + xgcal);
			customerFullType.setCIFCREATIONDT(xgcal);
			customerFullType.setMEDIA("MAIL");
			customerFullType.setLOC(state);

			Custpersonal.setTITLE(title);
			System.out.println(" firstName " + firstName);
			Custpersonal.setFSTNAME(firstName);
			System.out.println(" middleName " + middleName);
			Custpersonal.setMIDNAME(middleName);
			System.out.println(" lastName " + lastName);
			Custpersonal.setLSTNAME(lastName);
			System.out.println(" xgcalDOB " + xgcalDOB);
			Custpersonal.setDOB(this.fcubsCreateDate.format(new Date(dateOfBirth)));
			System.out.println(" gender " + gender);
			Custpersonal.setGENDR(gender);
			System.out.println(" gender " + gender);
			Custpersonal.setSEX(gender);
			System.out.println(" telephone " + telephone);
			Custpersonal.setTELEPHNO(telephone);
			Custpersonal.setMOBNUM(telephone);
			System.out.println(" email " + email);
			Custpersonal.setEMAILID(email);
			Custpersonal.setLANG("ENG");
			String myDateProc1 = this.sdfYear.format(new Date(dateOfBirth));
			int cal = Integer.parseInt(this.myDateProc) - Integer.parseInt(myDateProc1);
			System.out.println("The New Year " + cal);
			if (cal > 18) {
				System.out.println("This is the Year Based on Minor Status Over 18 " + cal);
				Custpersonal.setMINOR("N");
			} else {
				Custpersonal.setMINOR("Y");
				Custpersonal.setGUARDIAN(nextOfKin);
			}
			Custpersonal.setPLACEOFBIRTH("NG");
			Custpersonal.setBIRTHCOUNTRY("NG");
			CustLiab.setLIABILITYNUMBER(null);
			CustLiab.setLIABILTYNAME(acctNames);
			CustLiab.setLIABBRANCH(branch);
			CustLiab.setLIABCCY("NGN");
			Mfi1.setACCOUNTOFFICER(rmCode);
			customerFullType.setMfi1(Mfi1);
			customerFullType.setCustLiab(CustLiab);
			customerFullType.setCustpersonal(Custpersonal);
			FCUBSBODY.setCustomerFull(customerFullType);
			requestMsg.setFCUBSBODY(FCUBSBODY);

			CREATECUSTOMERFSFSRES result = getPort().createCustomerFS(requestMsg);
			System.out.println("response " + result);
			if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.FAILURE)) {
				response.setResponseCode("1");
				for (int i = 0, n = result.getFCUBSBODY().getFCUBSERRORRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE() + " -- " + ((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
					System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE());
					System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
				}
			} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.WARNING)) {
				response.setResponseCode("1");
				for (int i = 0, n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWCODE() + " -- " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWDESC());
					System.out.println("This is the result Cust " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWCODE());
					System.out.println("This is the result Cust " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
				}
			} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.SUCCESS)) {
				response.setResponseCode("0");
				response.setCustomerID(result.getFCUBSBODY().getCustomerFull().getCUSTNO());
				for (int i = 0, n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC() + " -- " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
					System.out.println("This is the result Cust " + result.getFCUBSBODY().getCustomerFull().getCUSTNO());
				}
				CREATECUSTACCFSFSREQ requestMsgAcct = new CREATECUSTACCFSFSREQ();
				HEADERType.setSOURCE(getHEADER_ACCT_SOURCE());
				HEADERType.setUBSCOMP(com.ofss.fcubs.service.fcubsaccservice.UBSCOMPType.FCUBS);
				HEADERType.setUSERID(getHEADER_ACCT_USER());
				HEADERType.setBRANCH(branch);
				HEADERType.setSERVICE(getHEADER_ACCT_SERVICE());
				HEADERType.setOPERATION(getHEADER_ACCT_OPERATION());
				HEADERType.setMSGSTAT(com.ofss.fcubs.service.fcubsaccservice.MsgStatType.SUCCESS);
				requestMsgAcct.setFCUBSHEADER(HEADERType);

				custacctFullType.setMAKER(initiatorID);
				custacctFullType.setMAKERSTAMP(this.fcubsCreateDate.format(this.ts));
				custacctFullType.setCHECKER(verifierID);
				custacctFullType.setCHECKERSTAMP(this.fcubsCreateDate.format(this.ts));

				custacctFullType.setCUSTNO(response.getCustomerID());
				System.out.println("Branch : " + branch);
				custacctFullType.setBRN(branch);
				System.out.println("This " + custacctFullType.getBRN());
				custacctFullType.setCCY("NGN");
				custacctFullType.setACCLS(productCode);
				custacctFullType.setADESC(acctNames);
				System.out.println("The Date " + xgcal);
				custacctFullType.setACCSTAT("NORM");
				custacctFullType.setDORMPRM("M");
				custacctFullType.setLOC("LAGOS ISLAND");
				custacctFullType.setMEDIA("MAIL");
				custacctFullType.setCOUNTRYCODE("NG");

				custacctFullType.setPOSTALLOWED("Y");
				if (pnd == true) {
					custacctFullType.setACSTATNODR("Y");
				} else {
					custacctFullType.setACSTATNODR("N");
				}
				CustAccountMISFullType.setBRN(branch);
				Misdetails.setRTFLAG("R");
				Misdetails.setTXNMIS1("D0100");
				Misdetails.setCOMPMIS1(rmCode);

				System.out.println("MIS" + Misdetails.getRTFLAG());
				CustAccountMISFullType.setMisdetails(Misdetails);
				custacctFullType.setCustAcc(CustAccountMISFullType);
				FCUBSBODYAcct.setCustAccountFull(custacctFullType);
				requestMsgAcct.setFCUBSBODY(FCUBSBODYAcct);

				System.out.println("Message " + requestMsgAcct);
				resultAcct = getPortAcct().createCustAccFS(requestMsgAcct);
				System.out.println("The Result" + result);
				System.out.println("The Result" + result.getFCUBSHEADER().getMSGSTAT());
				if (resultAcct.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsaccservice.MsgStatType.SUCCESS)) {
					response.setResponseCode("0");
					response.setAccountNumber(resultAcct.getFCUBSBODY().getCustAccountFull().getSttmsCustAccSwp().getCUSTACNO());
					System.out.println("Account Number " + response.getAccountNumber());
					response.setCustomerID(response.getCustomerID());
					for (int i=0, n = resultAcct.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
						response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
						System.out.println("This is the result Acct " + ((com.ofss.fcubs.service.fcubsaccservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.WARNINGType) resultAcct.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
					}
					String query = "insert into BOTF_ACCT_LOG (TITLE, FIRSTNAME, MIDDLENAME, LASTNAME, ACCOUNT_NO, CUSTOMER_ID, REF_NO, DATEOFBIRTH, ADDRESS, ADDRESS2, ADDRESS3, STATE, NATIONALITY, MOTHERMAIDENNAME, TELEPHONE, TELEPHONE2, PROFESSION, MARITASTATUS, GENDER, EMAIL, ISSUEDATE, EXPIRYDATE, NEXTOFKIN, RELATIOSHIP, BRANCH, ACCTCATEGORY, LANGUAGE, THECITY, COUNTRYOFRESIDENT, ZIPCODE, ISSTAFF, COUNTRY, PRODUCTCODE, ACCT_NAME, NEXTOFKINMOBILE) values ('" + title + "', " + "'" + firstName + "', '" + middleName + "', " + "'" + lastName + "', '" + response.getAccountNumber().trim() + "', " + "'" + response.getCustomerID().trim() + "', '" + uniqueID + "', " + "'" + dateOfBirth + "', '" + address + "', " + "'" + address2 + "', " + "'" + address3 + "', '" + state + "', " + "'" + nationality + "', " + "'" + motherMaidenName + "', '" + telephone + "', " + "'" + telephone2 + "', '" + profession + "', " + "'" + maritaStatus + "', '" + gender + "', '" + email + "', " + "'" + issueDate + "', '" + expiryDate + "', '" + nextOfKin + "', " + "'" + relatioship + "', '" + branch + "', '" + acctCategory + "', " + "'" + language + "', '" + theCity + "', " + "'" + countryOfResident + "', " + "'" + zipCode + "', '" + isStaff + "', " + "'" + country + "', '" + productCode + "', " + "'" + acctNames + "', " + "'" + nextOfKinMobileNumber + "')";

					System.out.println("This is the Query: " + query);
					pstmt = conn.prepareStatement(query);
					pstmt.executeUpdate();
				} else if (resultAcct.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsaccservice.MsgStatType.FAILURE)) {
					response.setResponseCode("1");
					for (int i = 0, n = resultAcct.getFCUBSBODY().getFCUBSERRORRESP().size(); i < n; i++) {
						response.setResponseMessage(((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) resultAcct.getFCUBSBODY().getFCUBSERRORRESP().get(0)).getERROR().get(0)).getECODE() + " -- " + ((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) resultAcct.getFCUBSBODY().getFCUBSERRORRESP().get(0)).getERROR().get(0)).getEDESC());
						System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) resultAcct.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE());
						System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) resultAcct.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
					}
				}
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
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

	public AccountOpeningWithIDResponse OpenAccountWithExistingID(String title, String custID, String productCode, String linkSignature, String linkcustomerpix, String linkcustomerIDScan, String linkcustomerUtilScan, String cardType, String internetBankingSubscribe, String unionMobileSubscribe, String custID1, String custID2, boolean pnd, String relationship1, String relationship2, String relationship3, String branchCode, String dateOfBirth, String rmCode, String initiatorID, String verifierID) {
		GetConnection theConn = null;
		Connection conn = null;
		AccountOpeningWithIDResponse response = null;
		PreparedStatement pstmt = null;
		CREATECUSTACCFSFSRES result = null;
		com.ofss.fcubs.service.fcubsaccservice.FCUBSHEADERType HEADERType = new com.ofss.fcubs.service.fcubsaccservice.FCUBSHEADERType();
		CREATECUSTACCFSFSREQ.FCUBSBODY FCUBSBODY = new CREATECUSTACCFSFSREQ.FCUBSBODY();
		this.gc.setTime(new Date());

		this.gc1.setTime(new Date(dateOfBirth));
		XMLGregorianCalendar xgcal = null;
		XMLGregorianCalendar xgcalDOB = null;
		com.ofss.fcubs.service.fcubsaccservice.BillingprefmasterFullType BillingprefmasterFullType = new com.ofss.fcubs.service.fcubsaccservice.BillingprefmasterFullType();
		CustAccountMISFullType CustAccountMISFullType = new CustAccountMISFullType();
		CustAccountMISFullType.Misdetails Misdetails = new CustAccountMISFullType.Misdetails();
		paramload();
		CustAccFullType custacctFullType = new CustAccFullType();
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			response = new AccountOpeningWithIDResponse();
			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(this.gc);
			xgcalDOB = DatatypeFactory.newInstance().newXMLGregorianCalendar(this.gc1);

			CREATECUSTACCFSFSREQ requestMsg = new CREATECUSTACCFSFSREQ();
			HEADERType.setSOURCE(getHEADER_ACCT_SOURCE());
			HEADERType.setUBSCOMP(com.ofss.fcubs.service.fcubsaccservice.UBSCOMPType.FCUBS);
			HEADERType.setUSERID(getHEADER_ACCT_USER());
			HEADERType.setBRANCH(branchCode);
			HEADERType.setSERVICE(getHEADER_ACCT_SERVICE());
			HEADERType.setOPERATION(getHEADER_ACCT_OPERATION());

			HEADERType.setMSGSTAT(com.ofss.fcubs.service.fcubsaccservice.MsgStatType.SUCCESS);
			requestMsg.setFCUBSHEADER(HEADERType);

			custacctFullType.setMAKER(initiatorID);
			custacctFullType.setMAKERSTAMP(this.fcubsCreateDate.format(this.ts));
			custacctFullType.setCHECKER(verifierID);
			custacctFullType.setCHECKERSTAMP(this.fcubsCreateDate.format(this.ts));

			custacctFullType.setCUSTNO(custID);
			custacctFullType.setBRN(branchCode);
			System.out.println("This " + custacctFullType.getBRN());
			custacctFullType.setCCY(unionMobileSubscribe);
			custacctFullType.setACCLS(productCode);
			custacctFullType.setADESC(title);
			System.out.println("The Date " + xgcal);

			custacctFullType.setACCSTAT("NORM");
			custacctFullType.setDORMPRM("M");
			custacctFullType.setLOC("LAGOS ISLAND");
			custacctFullType.setMEDIA("MAIL");
			custacctFullType.setCOUNTRYCODE("NG");

			if (pnd == true) {
				custacctFullType.setACSTATNODR("Y");
			} else {
				custacctFullType.setACSTATNODR("N");
			}
			CustAccountMISFullType.setBRN(branchCode);
			Misdetails.setRTFLAG("R");
			Misdetails.setTXNMIS1("D0100");
			Misdetails.setCOMPMIS1(rmCode);

			System.out.println("MIS" + Misdetails.getRTFLAG());
			CustAccountMISFullType.setMisdetails(Misdetails);
			custacctFullType.setCustAcc(CustAccountMISFullType);

			custacctFullType.setPOSTALLOWED("Y");
			if (pnd == true) {
				custacctFullType.setACSTATNODR("Y");
			} else {
				custacctFullType.setACSTATNODR("N");
			}
			FCUBSBODY.setCustAccountFull(custacctFullType);
			requestMsg.setFCUBSBODY(FCUBSBODY);

			System.out.println("Message " + requestMsg);
			result = getPortAcct().createCustAccFS(requestMsg);
			System.out.println("The Result" + result);
			System.out.println("The Result" + result.getFCUBSHEADER().getMSGSTAT());
			if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsaccservice.MsgStatType.SUCCESS)) {
				response.setResponseCode("0");
				response.setAccountNumber(result.getFCUBSBODY().getCustAccountFull().getSttmsCustAccSwp().getCUSTACNO());
				response.setCustomerID(custID);
				int i = 0;
				for (int n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubsaccservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
					System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubsaccservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
				}
				String query = "insert into BOTF_ACCT_LOG (ACCOUNT_NO, CUSTOMER_ID, PRODUCTCODE, LINKSIGNATURE, LINKCUSTOMERPIX,LINKCUSTOMERIDSCAN, LINKCUSTOMERUTILSCAN, CARDTYPE, ACCT_NAME, INTERNETBANKG, UNIONMOBILE) values ('" + response.getAccountNumber().trim() + "', " + "'" + response.getCustomerID() + "', '" + productCode + "', " + "'" + linkSignature + "', '" + linkcustomerpix + "', " + "'" + linkcustomerIDScan + "', " + "'" + linkcustomerUtilScan + "', '" + cardType + "', " + "'" + title + "', " + "'" + internetBankingSubscribe + "', " + "'" + unionMobileSubscribe + "')";

				pstmt = conn.prepareStatement(query);
				pstmt.executeUpdate();
			} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsaccservice.MsgStatType.FAILURE)) {
				response.setResponseCode("1");
				int i = 0;
				for (int n = result.getFCUBSBODY().getFCUBSERRORRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(0)).getERROR().get(0)).getECODE() + " -- " + ((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(0)).getERROR().get(0)).getEDESC());
					System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE());
					System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
				}
			}
			if (conn != null) {
				conn.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return response;
	}

	public CreateCustomerResponse createNewCustomer(String title, String firstName, String middleName, String lastName, String dateOfBirth, String address, String address2, String address3, String address4, String state, String nationality, String motherMaidenName, String telephone, String telephone2, String profession, String maritaStatus, String gender, String email, String custIdNo, String issueDate, String expiryDate, String nextOfKin, String relatioship, String branch, String uniqueID, String acctCategory, String language, String theCity, String countryOfResident, String zipCode, String isStaff, String country, String productCode, String nextOfKinMobileNumber, boolean smsAlert, String rmCode, String initiatorID, String verifierID, String misCode, String misClass, String introducerTag) {
		CreateCustomerResponse response = null;

		CustomerFullType.Mfi1 Mfi1 = new CustomerFullType.Mfi1();
		String acctNames = null;
		this.gc.setTime(new Date());
		System.out.println("Date Of Birth: " + dateOfBirth);
		this.gc1.setTime(new Date(dateOfBirth));
		XMLGregorianCalendar xgcal = null;
		XMLGregorianCalendar xgcalDOB = null;
		paramload();
		CustomerFullType customerFullType = new CustomerFullType();
		ArrayList<CustmisFullType.Customermis> custMis = new ArrayList();
		CustmisFullType.Compositemis Compositemis = new CustmisFullType.Compositemis();
		CustmisFullType.Customermis Customermis = new CustmisFullType.Customermis();
		CustmisFullType.Customermis Custmis = new CustmisFullType.Customermis();
		CustmisFullType CustmisFullType = new CustmisFullType();
		com.ofss.fcubs.service.fcubscustomerservice.FCUBSHEADERType FCUBSHEADERType = new com.ofss.fcubs.service.fcubscustomerservice.FCUBSHEADERType();
		CREATECUSTOMERFSFSREQ.FCUBSBODY FCUBSBODY = new CREATECUSTOMERFSFSREQ.FCUBSBODY();
		CustomerFullType.Custpersonal Custpersonal = new CustomerFullType.Custpersonal();
		CustomerFullType.CustLiab CustLiab = new CustomerFullType.CustLiab();
		try {
			response = new CreateCustomerResponse();
			if (middleName != null) {
				if (middleName.trim().length() > 0) {
					acctNames = lastName + " " + middleName.toUpperCase() + " " + firstName;
				} else {
					acctNames = lastName + " " + firstName;
				}
			} else {
				acctNames = lastName + " " + firstName;
			}

			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(this.gc);
			CREATECUSTOMERFSFSREQ requestMsg = new CREATECUSTOMERFSFSREQ();
			FCUBSHEADERType.setSOURCE(getHEADER_SOURCE());
			FCUBSHEADERType.setUBSCOMP(com.ofss.fcubs.service.fcubscustomerservice.UBSCOMPType.FCUBS);
			FCUBSHEADERType.setUSERID(getHEADER_USER());
			FCUBSHEADERType.setBRANCH(branch);
			FCUBSHEADERType.setSERVICE(getHEADER_SERVICE());
			FCUBSHEADERType.setOPERATION(getHEADER_OPERATION());
			FCUBSHEADERType.setMSGSTAT(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.SUCCESS);
			requestMsg.setFCUBSHEADER(FCUBSHEADERType);

			Compositemis.setMISCLS("INT_CODE");
			Compositemis.setMISCD(introducerTag);
			CustmisFullType.getCompositemis().add(Compositemis);

			Customermis.setMISCLS(misClass);
			Customermis.setMISCD(misCode);
			custMis.add(Customermis);

			Custmis.setMISCLS("RM_CODE");
			Custmis.setMISCD(rmCode);
			custMis.add(Custmis);
			System.out.println("The MIS " + custMis);
			System.out.println("The MIS " + custMis);

			CustmisFullType.getCustomermis().addAll(custMis);
			customerFullType.setCustmis(CustmisFullType);

			customerFullType.setMAKER(initiatorID);
			customerFullType.setMAKERSTAMP(this.fcubsCreateDate.format(this.ts));
			customerFullType.setCHECKER(verifierID);
			customerFullType.setCHECKERSTAMP(this.fcubsCreateDate.format(this.ts));

			customerFullType.setCTYPE(acctCategory.substring(0, 1));
			System.out.println(" acctNames " + acctNames);
			customerFullType.setNAME(acctNames);
			System.out.println(" address " + address);
			customerFullType.setADDRLN1(address);
			System.out.println(" address2 " + address2);
			customerFullType.setADDRLN2(address2);
			System.out.println(" address3 " + address3);
			customerFullType.setADDRLN3(address3);
			System.out.println(" acctNames " + acctNames);
			customerFullType.setCOUNTRY(countryOfResident);
			System.out.println(" SNAME " + lastName.toUpperCase() + firstName.toUpperCase() + this.sdfcic.format(new Date(dateOfBirth)));
			customerFullType.setSNAME(uniqueID);
			customerFullType.setNLTY(country);
			customerFullType.setCCATEG(acctCategory);
			System.out.println(" FullName " + acctNames);
			customerFullType.setFULLNAME(acctNames);
			System.out.println(" xgcal " + xgcal);
			customerFullType.setCIFCREATIONDT(xgcal);
			customerFullType.setMEDIA("MAIL");
			System.out.println("State: " + state);
			customerFullType.setLOC(state);

			Custpersonal.setTITLE(title);
			System.out.println(" firstName " + firstName);
			Custpersonal.setFSTNAME(firstName);
			System.out.println(" middleName " + middleName);
			Custpersonal.setMIDNAME(middleName);
			System.out.println(" lastName " + lastName);
			Custpersonal.setLSTNAME(lastName);
			System.out.println(" xgcalDOB " + dateOfBirth);
			Custpersonal.setDOB(this.fcubsCreateDate.format(new Date(dateOfBirth)));
			System.out.println(" gender " + gender);
			Custpersonal.setGENDR(gender);
			System.out.println(" gender " + gender);
			Custpersonal.setSEX(gender);
			System.out.println(" telephone " + telephone);
			Custpersonal.setTELEPHNO(telephone);
			Custpersonal.setMOBNUM(telephone);
			System.out.println(" email " + email);
			Custpersonal.setEMAILID(email);
			Custpersonal.setLANG("ENG");
			String myDateProc1 = this.sdfYear.format(new Date(dateOfBirth));
			int cal = Integer.parseInt(this.myDateProc) - Integer.parseInt(myDateProc1);
			System.out.println("The New Year " + cal);
			if (cal > 18) {
				System.out.println("This is the Year Based on Minor Status Over 18 " + cal);
				Custpersonal.setMINOR("N");
			} else {
				Custpersonal.setMINOR("Y");
				Custpersonal.setGUARDIAN(nextOfKin);
			}
			Custpersonal.setPLACEOFBIRTH("NG");
			Custpersonal.setBIRTHCOUNTRY("NG");
			CustLiab.setLIABILITYNUMBER(null);
			CustLiab.setLIABILTYNAME(acctNames);
			CustLiab.setLIABBRANCH(branch);
			CustLiab.setLIABCCY("NGN");
			Mfi1.setACCOUNTOFFICER(rmCode);
			customerFullType.setMfi1(Mfi1);
			customerFullType.setCustLiab(CustLiab);
			customerFullType.setCustpersonal(Custpersonal);
			FCUBSBODY.setCustomerFull(customerFullType);
			requestMsg.setFCUBSBODY(FCUBSBODY);

			CREATECUSTOMERFSFSRES result = getPort().createCustomerFS(requestMsg);
			System.out.println("response " + result);
			if (result != null) {
				if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.FAILURE)) {
					response.setResponseCode("1");
					int i = 0;
					for (int n = result.getFCUBSBODY().getFCUBSERRORRESP().size(); i < n; i++) {
						response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE() + " -- " + ((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
						System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE());
						System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
					}
				} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.WARNING)) {
					response.setResponseCode("1");
					int i = 0;
					for (int n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
						response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWCODE() + " -- " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWDESC());
						System.out.println("This is the result Cust " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWCODE());
						System.out.println("This is the result Cust " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
					}
				} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.SUCCESS)) {
					response.setResponseCode("0");
					response.setCustomerID(result.getFCUBSBODY().getCustomerFull().getCUSTNO());
					int i = 0;
					for (int n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
						response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC() + " -- " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
						System.out.println("This is the result Cust " + result.getFCUBSBODY().getCustomerFull().getCUSTNO());
					}
				}
			} else {
				response.setCustomerID(null);
				response.setResponseMessage("Unexpected Error From Service");
			}
		} catch (Exception e) {
			response.setCustomerID(null);
			response.setResponseMessage(e.getMessage());
			e.printStackTrace();
		}
		return response;
	}

	public CreateCorpCustomerResponse createNewCorpCustomer(String title, String dateOfBirth, String address, String address2, String address3, String address4, String state, String nationality, String telephone, String telephone2, String profession, String email, String branch, String acctCategory, String theCity, String country, String productCode, String regNumber, String rmCode, String initiatorID, String verifierID, String misCode, String misClass, String introducerTag) {
		CreateCorpCustomerResponse response = null;
		CREATECUSTOMERFSFSRES result = null;
		this.gc.setTime(new Date());
		this.gc1.setTime(new Date(dateOfBirth));
		XMLGregorianCalendar xgcal = null;
		XMLGregorianCalendar xgcalDOB = null;
		paramload();
		CustomerFullType customerFullType = new CustomerFullType();
		CustmisFullType.Compositemis Compositemis = new CustmisFullType.Compositemis();
		ArrayList<CustmisFullType.Customermis> custMis = new ArrayList();
		CustmisFullType.Customermis Customermis = new CustmisFullType.Customermis();
		CustmisFullType.Customermis Custmis = new CustmisFullType.Customermis();
		CustmisFullType CustmisFullType = new CustmisFullType();
		com.ofss.fcubs.service.fcubscustomerservice.FCUBSHEADERType FCUBSHEADERType = new com.ofss.fcubs.service.fcubscustomerservice.FCUBSHEADERType();
		CREATECUSTOMERFSFSREQ.FCUBSBODY FCUBSBODY = new CREATECUSTOMERFSFSREQ.FCUBSBODY();
		CustomerFullType.Custpersonal Custpersonal = new CustomerFullType.Custpersonal();
		CustomerFullType.Custcorp Custcorp = new CustomerFullType.Custcorp();
		CustomerFullType.CustLiab CustLiab = new CustomerFullType.CustLiab();
		CustomerFullType.Mfi1 Mfi1 = new CustomerFullType.Mfi1();
		try {
			response = new CreateCorpCustomerResponse();

			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(this.gc);
			xgcalDOB = DatatypeFactory.newInstance().newXMLGregorianCalendar(this.gc1);
			CREATECUSTOMERFSFSREQ requestMsg = new CREATECUSTOMERFSFSREQ();
			FCUBSHEADERType.setSOURCE(getHEADER_SOURCE());
			FCUBSHEADERType.setUBSCOMP(com.ofss.fcubs.service.fcubscustomerservice.UBSCOMPType.FCUBS);
			FCUBSHEADERType.setUSERID(getHEADER_USER());
			FCUBSHEADERType.setBRANCH(branch);
			FCUBSHEADERType.setSERVICE(getHEADER_SERVICE());
			FCUBSHEADERType.setOPERATION(getHEADER_OPERATION());
			FCUBSHEADERType.setMSGSTAT(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.SUCCESS);
			requestMsg.setFCUBSHEADER(FCUBSHEADERType);
			customerFullType.setCTYPE("C");
			customerFullType.setNAME(title);
			customerFullType.setADDRLN1(address);
			customerFullType.setADDRLN2(address2);
			customerFullType.setADDRLN3(address3);
			customerFullType.setCOUNTRY(country);
			customerFullType.setSNAME(regNumber.toUpperCase());
			customerFullType.setNLTY(nationality);
			customerFullType.setCCATEG(acctCategory);
			customerFullType.setFULLNAME(title);
			customerFullType.setCIFCREATIONDT(xgcal);
			customerFullType.setMEDIA("MAIL");

			Compositemis.setMISCLS("INT_CODE");
			Compositemis.setMISCD(introducerTag);
			CustmisFullType.getCompositemis().add(Compositemis);

			Customermis.setMISCLS(misClass);
			Customermis.setMISCD(misCode);
			custMis.add(Customermis);

			Custmis.setMISCLS("RM_CODE");
			Custmis.setMISCD(rmCode);
			custMis.add(Custmis);

			CustmisFullType.getCustomermis().addAll(custMis);
			customerFullType.setCustmis(CustmisFullType);

			customerFullType.setMAKER(initiatorID);
			customerFullType.setMAKERSTAMP(this.fcubsCreateDate.format(this.ts));
			customerFullType.setCHECKER(verifierID);
			customerFullType.setCHECKERSTAMP(this.fcubsCreateDate.format(this.ts));

			CustLiab.setLIABILITYNUMBER(null);
			CustLiab.setLIABILTYNAME(title);
			CustLiab.setLIABBRANCH(branch);
			CustLiab.setLIABCCY("NGN");
			customerFullType.setCustLiab(CustLiab);
			Custpersonal.setTELEPHNO(telephone);
			Custpersonal.setMOBNUM(telephone);
			Custpersonal.setEMAILID(email);
			Custpersonal.setLANG("ENG");
			Custcorp.setCORPDESC(title);
			Custcorp.setCORPNAME(title);
			Custcorp.setCADDR1(address);
			Custcorp.setCADDR2(address2);
			Custcorp.setCADDR3(address3);
			Custcorp.setINCORPDT(this.fcubsCreateDate.format(new Date(dateOfBirth)));
			Custcorp.setINCORPCNTRY(country);
			Custcorp.setREGADD1(address);
			Custcorp.setREGADD2(address2);
			Custcorp.setREGADD3(address3);
			Custcorp.setREGADD4(state);
			Custcorp.setNATIONALITY(country);
			Custcorp.setEMAILID(email);
			Custcorp.setTELEPHONE(telephone);
			Custcorp.setMOBILENUMBER(telephone2);
			Custcorp.setNATIONID(regNumber.toUpperCase());
			Mfi1.setACCOUNTOFFICER(rmCode);
			customerFullType.setMfi1(Mfi1);
			customerFullType.setCustcorp(Custcorp);
			customerFullType.setCustpersonal(Custpersonal);
			FCUBSBODY.setCustomerFull(customerFullType);
			requestMsg.setFCUBSBODY(FCUBSBODY);

			result = getPort().createCustomerFS(requestMsg);
			System.out.println("Result 1 = " + result.getFCUBSHEADER().getMSGSTAT());
			if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.FAILURE)) {
				response.setResponseCode("1");
				int i = 0;
				for (int n = result.getFCUBSBODY().getFCUBSERRORRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE() + " -- " + ((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
					System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE());
					System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubscustomerservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
				}
			} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.WARNING)) {
				response.setResponseCode("1");
				int i = 0;
				for (int n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWCODE() + " -- " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWDESC());
					System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWCODE());
					System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
				}
			} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubscustomerservice.MsgStatType.SUCCESS)) {
				response.setResponseCode("0");
				response.setCustomerID(result.getFCUBSBODY().getCustomerFull().getCUSTNO());
				int i = 0;
				for (int n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC() + " -- " + ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubscustomerservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
					System.out.println("This is the result " + result.getFCUBSBODY().getCustomerFull().getCUSTNO());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	public AccountMaintenanceResponse upDateAcctStatus(String acctNo, String statusCode, String StatusMessage) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.UPD_ACCT_STAT(?,?,?)}");
			statusUpdate.registerOutParameter(1, 4);
			statusUpdate.setString(2, acctNo);
			statusUpdate.setString(3, "5");
			statusUpdate.setString(4, statusCode);
			statusUpdate.setString(5, StatusMessage);
			statusUpdate.execute();
			statusResponse = statusUpdate.getObject(1).toString();
			if (statusUpdate != null) {
				statusUpdate.close();
			}
			if (conn != null) {
				conn.close();
			}
			if (statusResponse.equals("0")) {
				statusMessage = "Modification was Successful";
			} else {
				statusMessage = "Modification Failed";
			}
			response.setResponseCode(statusResponse);
			response.setResponseMessage(statusMessage);
		} catch (NamingException e) {
			response.setResponseCode("1");
			response.setResponseMessage(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			response.setResponseCode("1");
			response.setResponseMessage(e.getMessage());
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

	public StateList[] getStateList() {
		GetConnection theConn = null;
		StateList[] var = null;
		Connection conn = null;
		CallableStatement stateCode = null;
		ArrayList activityLog = null;
		ResultSet rs = null;
		String[] columnData = null;
		String[] dataContent = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			stateCode = conn.prepareCall("{call union_account_pkg.getstatelist(?)}");
			stateCode.registerOutParameter(1, -10);
			stateCode.execute();
			rs = (ResultSet) stateCode.getObject(1);
			activityLog = new ArrayList();
			while (rs.next()) {
				columnData = new String[2];
				columnData[0] = rs.getString("cod_state");
				columnData[1] = rs.getString("nam_state");
				activityLog.add(columnData);
			}
			var = new StateList[activityLog.size()];
			for (int i = 0; i < activityLog.size(); i++) {
				dataContent = (String[]) activityLog.get(i);
				StateList stInfo = new StateList("", "");
				stInfo.setStateCode(dataContent[0]);
				stInfo.setStateName(dataContent[1]);
				var[i] = stInfo;
			}
			if (rs != null) {
				rs.close();
			}
			if (stateCode != null) {
				stateCode.close();
			}
			if (conn != null) {
				conn.close();
			}
			activityLog = null;

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stateCode != null) {
					stateCode.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return var;
	}

	public CountryList[] getCountryList() {
		GetConnection theConn = null;
		CountryList[] var = null;
		Connection conn = null;
		CallableStatement stateCode = null;
		ArrayList activityLog = null;
		ResultSet rs = null;
		String[] columnData = null;
		String[] dataContent = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			stateCode = conn.prepareCall("{call union_account_pkg.getcountrylist(?)}");
			stateCode.registerOutParameter(1, -10);
			stateCode.execute();
			rs = (ResultSet) stateCode.getObject(1);
			activityLog = new ArrayList();
			while (rs.next()) {
				columnData = new String[2];
				columnData[0] = rs.getString("country_code");
				columnData[1] = rs.getString("description");
				activityLog.add(columnData);
			}
			var = new CountryList[activityLog.size()];
			for (int i = 0; i < activityLog.size(); i++) {
				dataContent = (String[]) activityLog.get(i);
				CountryList stInfo = new CountryList("", "");
				stInfo.setCountryCode(dataContent[0]);
				stInfo.setCountryName(dataContent[1]);
				var[i] = stInfo;
			}
			if (rs != null) {
				rs.close();
			}
			if (stateCode != null) {
				stateCode.close();
			}
			if (conn != null) {
				conn.close();
			}
			activityLog = null;

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stateCode != null) {
					stateCode.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return var;
	}

	public AccountMaintenanceResponse addCustIDToAccount(String customerID, String accountNo, String acctBal, String acctStatus, String branchCode, String produstCode, String relationship) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		AccountMaintenanceResponse response = null;
		try {
			theConn = new GetConnection();
			response = new AccountMaintenanceResponse();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.add_cust_id(?,?,?,?,?,?,?)}");
			statusUpdate.registerOutParameter(1, 4);
			statusUpdate.setString(2, customerID);
			statusUpdate.setString(3, accountNo);
			statusUpdate.setString(4, acctBal);
			statusUpdate.setString(5, acctStatus);
			statusUpdate.setString(6, branchCode);
			statusUpdate.setString(7, produstCode);
			statusUpdate.setString(8, relationship);
			statusUpdate.execute();
			statusResponse = statusUpdate.getObject(1).toString();
			if (statusUpdate != null) {
				statusUpdate.close();
			}
			if (conn != null) {
				conn.close();
			}
			if (statusResponse.equals("0")) {
				statusMessage = "Modification was Successful";
			} else {
				statusMessage = "Failed To Insert, Uniqie Constraint Violated";
			}
			response.setResponseCode(statusResponse);
			response.setResponseMessage(statusMessage);
		} catch (NamingException e) {
			response.setResponseCode("1");
			e.printStackTrace();
		} catch (Exception e) {
			response.setResponseCode("1");
			response.setResponseMessage("Failed To Insert, Uniqie Constraint Violated");
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

	public AccountMaintenanceResponse changeCustName(String customerID, String newAccountName, String newFirstName, String newMiddleName, String newLastName, String newShortName, String newCIC, String newAddress1, String newAddress2, String newAddress3, String newCity, String newState, String newMobileNumber, String newOfficePhoneLand, String newLGA, String newMaritalStatus, String newNationality, String newCountry, String newCountryOfResidence,
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
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.chg_cust_name(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			System.out.println("Customer ID " + customerID);
			statusUpdate.registerOutParameter(1, 4);
			statusUpdate.registerOutParameter(21, 12);
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
			statusUpdate.setString(21, "NG");
			statusUpdate.setString(22, "NG");
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

	public AccountMaintenanceResponse changeCustAccountName(String accountNumber, String customerNewName) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.chg_cust_acct_name(?,?,?,?)}");
			statusUpdate.registerOutParameter(1, 4);
			statusUpdate.registerOutParameter(4, 12);
			statusUpdate.setString(2, accountNumber.trim());
			statusUpdate.setString(3, customerNewName);
			statusUpdate.setString(4, customerNewName);
			statusUpdate.setString(5, accountNumber);
			statusUpdate.execute();
			statusResponse = statusUpdate.getObject(1).toString();
			statusMessage = statusUpdate.getObject(4).toString();
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

	public AccountMaintenanceResponse changeEmailaddress(String customerID, String customerNewEmail) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.chg_email_addr(?,?,?)}");
			statusUpdate.registerOutParameter(1, 4);
			statusUpdate.registerOutParameter(4, 12);
			statusUpdate.setString(2, customerID.trim());
			statusUpdate.setString(3, customerNewEmail);
			statusUpdate.setString(4, customerNewEmail);
			statusUpdate.execute();
			statusResponse = statusUpdate.getObject(1).toString();
			statusMessage = statusUpdate.getObject(4).toString();
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

	public AccountMaintenanceResponse changePhoneNumber(String customerID, String customerMobilePhone, String customerOfficePhone) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.chg_phone_no(?,?,?,?)}");
			statusUpdate.registerOutParameter(1, 4);
			statusUpdate.registerOutParameter(5, 12);
			statusUpdate.setString(2, customerID);
			statusUpdate.setString(3, customerMobilePhone);
			statusUpdate.setString(4, customerOfficePhone);
			statusUpdate.execute();
			statusResponse = statusUpdate.getObject(1).toString();
			statusMessage = statusUpdate.getObject(5).toString();
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

	public AccountMaintenanceResponse activitateSMSAlert(String customerID, String customerMobilePhone) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.activate_sms_alert(?,?,?)}");
			System.out.println("After Calling " + customerID);
			System.out.println("After Calling " + customerMobilePhone);
			statusUpdate.registerOutParameter(1, 4);
			statusUpdate.registerOutParameter(4, 12);
			statusUpdate.setString(2, customerID);
			statusUpdate.setString(3, customerMobilePhone);
			statusUpdate.execute();
			statusResponse = statusUpdate.getObject(1).toString();
			System.out.println("My Final Response " + statusResponse);
			statusMessage = statusUpdate.getObject(4).toString();
			if (statusUpdate != null) {
				statusUpdate.close();
			}
			if (conn != null) {
				conn.close();
			}
			response.setResponseCode(statusResponse);
			response.setResponseMessage(statusMessage);

		} catch (NamingException e) {
			response.setResponseCode("99");
			response.setResponseMessage(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			response.setResponseCode("99");
			response.setResponseMessage(e.getMessage());
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

	public AccountMaintenanceResponse deactivitateSMSAlert(String customerID) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.deactivate_sms_alert(?,?)}");
			System.out.println("After Calling " + customerID);
			statusUpdate.registerOutParameter(1, 4);
			statusUpdate.registerOutParameter(3, 12);
			statusUpdate.setString(2, customerID);
			statusUpdate.execute();
			statusResponse = statusUpdate.getObject(1).toString();
			System.out.println("My Final Response " + statusResponse);
			statusMessage = statusUpdate.getObject(3).toString();
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
				response.setResponseCode("99");
				response.setResponseMessage(ex.getMessage());
				ex.printStackTrace();
			}
		}
		return response;
	}

	public AccountMaintenanceResponse removeCustIDFromAccount(String customerID, String accountNo) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement statusUpdate = null;
		String statusResponse = null;
		String statusMessage = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			statusUpdate = conn.prepareCall("{ ? = call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.del_cust_id(?,?)}");
			statusUpdate.registerOutParameter(1, 4);
			statusUpdate.setString(2, customerID);
			statusUpdate.setString(3, accountNo);
			statusUpdate.execute();
			statusResponse = statusUpdate.getObject(1).toString();
			if (statusUpdate != null) {
				statusUpdate.close();
			}
			if (conn != null) {
				conn.close();
			}
			if (statusResponse.equals("0")) {
				statusMessage = "Modification was Successful";
			} else {
				statusMessage = "Modification Failed";
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

	public AcctDetailsResponse getAcctDetails(String acctNo) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement acctStatus = null;
		CallableStatement isCurrent = null;
		AcctDetailsResponse response = null;
		ResultSet rs = null;
		ResultSet rs1 = null;
		String acctTitle = null;
		String acctName = null;
		String firstName = null;
		String lastName = null;
		String middleName = null;
		String custID = null;
		String custEmail = null;
		String custPhone = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			acctStatus = conn.prepareCall("{call FCUBSLIVE.union_account_pkg.getacctdetails(?,?)}");
			acctStatus.registerOutParameter(1, -10);
			acctStatus.setString(2, acctNo);
			acctStatus.execute();
			rs = (ResultSet) acctStatus.getObject(1);
			if (rs != null) {
				response = new AcctDetailsResponse();

				while (rs.next()) {
					acctTitle = rs.getString("txt_cust_prefix");
					System.out.println(" acctTitle " + rs.getString("txt_cust_prefix"));
					acctName = rs.getString("accountname");
					firstName = rs.getString("nam_cust_first");
					lastName = rs.getString("nam_cust_last");
					middleName = rs.getString("nam_cust_mid");
					custID = rs.getString("custid");
					System.out.println(" Email " + rs.getString("ref_cust_email"));
					custEmail = rs.getString("ref_cust_email");
					System.out.println(" Phone number " + rs.getString("ref_cust_telex"));
					custPhone = rs.getString("ref_cust_telex");
					response.setTitle(acctTitle);
					response.setFirstName(acctName);
					response.setFirstName(firstName);
					response.setLastName(lastName);
					response.setMiddleName(middleName);
					response.setCustID(custID);
					response.setEmailAddress(custEmail);
					response.setCustPhone(custPhone);
					System.out.println(" Cust Id " + custID);
					isCurrent = conn.prepareCall("{call union_account_pkg.getaccttype(?,?)}");
					isCurrent.registerOutParameter(1, -10);
					isCurrent.setString(2, custID);
					isCurrent.execute();
					System.out.println(" Cust Id " + isCurrent.getObject(1));
					rs1 = (ResultSet) isCurrent.getObject(1);
					if (rs1 != null) {
						System.out.println(" Cust Id " + isCurrent.getObject(1));
						while (rs1.next()) {
							System.out.println(" Cust Id " + isCurrent.getObject(1));
							response.setIsCurrent("Y");
						}
					} else {
						response.setIsCurrent("N");
					}
				}
			}
			if (isCurrent != null) {
				isCurrent.close();
			}
			if (acctStatus != null) {
				acctStatus.close();
			}
			if (rs != null) {
				rs.close();
			}
			if (rs1 != null) {
				rs1.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (isCurrent != null) {
					isCurrent.close();
				}
				if (acctStatus != null) {
					acctStatus.close();
				}
				if (rs != null) {
					rs.close();
				}
				if (rs1 != null) {
					rs1.close();
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

	public CustomerRelationshipList[] getAccountRelationship(String accountNumber) {
		GetConnection theConn = null;
		CustomerRelationshipList[] var = null;
		Connection conn = null;
		CallableStatement acctRel = null;
		ArrayList activityLog = null;
		ResultSet rs = null;
		String[] columnData = null;
		String[] dataContent = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			acctRel = conn.prepareCall("{call FCUBSLIVE.ubn_account_servicing_pkg.getrelrecord(?,?)}");
			acctRel.registerOutParameter(1, -10);
			acctRel.setString(2, accountNumber);
			acctRel.execute();
			rs = (ResultSet) acctRel.getObject(1);
			activityLog = new ArrayList();
			while (rs.next()) {
				columnData = new String[5];
				columnData[0] = rs.getString("cod_acct_no");
				columnData[1] = rs.getString("customerid");
				columnData[2] = rs.getString("relationship");
				columnData[3] = rs.getString("branchcode");
				columnData[4] = rs.getString("productcode");
				activityLog.add(columnData);
			}
			var = new CustomerRelationshipList[activityLog.size()];
			for (int i = 0; i < activityLog.size(); i++) {
				dataContent = (String[]) activityLog.get(i);
				CustomerRelationshipList stInfo = new CustomerRelationshipList("", "", "", "", "");
				stInfo.setCod_acct_no(dataContent[0]);
				stInfo.setCustomerid(dataContent[1]);
				stInfo.setRelationship(dataContent[2]);
				stInfo.setBranchcode(dataContent[3]);
				stInfo.setProductcode(dataContent[4]);
				var[i] = stInfo;
			}
			if (rs != null) {
				rs.close();
			}
			if (acctRel != null) {
				acctRel.close();
			}
			if (conn != null) {
				conn.close();
			}
			activityLog = null;

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (acctRel != null) {
					acctRel.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return var;
	}

	public boolean MT103Outward(String reference_no, String transaction_amount, String transaction_date, String currency, String ordering_customer, String ordering_customer_acct, String ordering_customer_address_line1, String ordering_customr_address_line2, String beneficiary_acct, String beneficiary_name, String payment_details, String value_date, String runningNo, String p_field_56A, String p_field_57b, String p_field_71a, String receiver_Bic, String p_field_59, String p_fed_wire_ind, String p_fed_wire_data) {
		boolean result = false;
		GetConnection theConn = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		CallableStatement FundsMT103 = null;
		ResultSet res = null;
		int counter = -1;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			String sql1 = " select nvl(count(*),0) MyCoutOFrecord from fcclive.mstb_dly_msg_out where reference_no ='" + reference_no + "' ";

			pstmt = conn.prepareStatement(sql1);
			System.out.println("sql1 " + sql1);
			if (pstmt.execute()) {
				res = pstmt.getResultSet();
				if (res.next()) {
					counter = res.getInt("MyCoutOFrecord");
				}
			}
			if (counter == 0) {
				FundsMT103 = conn.prepareCall("{ ? = call fcclive.fn_generate_mt103(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

				System.out.println("The conn " + conn);
				FundsMT103.registerOutParameter(1, 4);
				FundsMT103.setString(2, reference_no);
				FundsMT103.setString(3, transaction_amount);
				FundsMT103.setString(4, transaction_date);
				FundsMT103.setString(5, currency);
				FundsMT103.setString(6, ordering_customer);
				FundsMT103.setString(7, ordering_customer_acct);
				FundsMT103.setString(8, ordering_customer_address_line1);
				FundsMT103.setString(9, ordering_customr_address_line2);
				FundsMT103.setString(10, beneficiary_acct);
				FundsMT103.setString(11, beneficiary_name);
				FundsMT103.setString(12, payment_details);
				FundsMT103.setString(13, value_date);
				FundsMT103.setString(14, runningNo);
				FundsMT103.setString(15, p_field_56A);
				FundsMT103.setString(16, p_field_57b);
				FundsMT103.setString(17, p_field_59);
				FundsMT103.setString(18, p_field_71a);
				FundsMT103.setString(19, receiver_Bic);
				FundsMT103.setString(20, p_fed_wire_ind);
				FundsMT103.setString(21, p_fed_wire_data);
				System.out.println("" + FundsMT103);
				System.out.println("" + receiver_Bic);
				System.out.println("beneficiary_acct: " + beneficiary_acct);
				System.out.println("ordering_customer: " + ordering_customer);
				System.out.println("Field 59: " + p_field_59);
				System.out.println("Ordering Customer: " + ordering_customer);
				FundsMT103.execute();
				System.out.println("" + receiver_Bic);
				if (FundsMT103.getObject(1) != null) {
					System.out.println("The Response " + FundsMT103.getObject(1).toString());
					if (FundsMT103.getObject(1).toString().equals("0")) {
						result = true;
					} else {
						result = false;
					}
				}
			} else if (counter >= 1) {
				result = false;
			}
			if (FundsMT103 != null) {
				FundsMT103.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (FundsMT103 != null) {
					FundsMT103.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	public String MT103Display(String reference_no, String transaction_amount, String transaction_date, String currency, String ordering_customer, String ordering_customer_acct, String ordering_customer_address_line1, String ordering_customr_address_line2, String beneficiary_acct, String beneficiary_name, String payment_details, String value_date, String runningNo, String p_field_56A, String p_field_57b, String p_field_71a, String receiver_Bic, String p_field_59, String p_fed_wire_ind, String p_fed_wire_data) {
		String result = null;
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement FundsMT103 = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();

			FundsMT103 = conn.prepareCall("{ ? = call fcclive.fn_display_mt103(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

			System.out.println("The conn " + conn);
			FundsMT103.registerOutParameter(1, 12);
			FundsMT103.setString(2, reference_no);
			FundsMT103.setString(3, transaction_amount);
			FundsMT103.setString(4, transaction_date);
			FundsMT103.setString(5, currency);
			FundsMT103.setString(6, ordering_customer);
			FundsMT103.setString(7, ordering_customer_acct);
			FundsMT103.setString(8, ordering_customer_address_line1);
			FundsMT103.setString(9, ordering_customr_address_line2);
			FundsMT103.setString(10, beneficiary_acct);
			FundsMT103.setString(11, beneficiary_name);
			FundsMT103.setString(12, payment_details);
			FundsMT103.setString(13, value_date);
			FundsMT103.setString(14, runningNo);
			FundsMT103.setString(15, p_field_56A);
			FundsMT103.setString(16, p_field_57b);
			FundsMT103.setString(17, p_field_59);
			FundsMT103.setString(18, p_field_71a);
			FundsMT103.setString(19, receiver_Bic);
			FundsMT103.setString(20, p_fed_wire_ind);
			FundsMT103.setString(21, p_fed_wire_data);
			System.out.println("" + FundsMT103);
			System.out.println("" + receiver_Bic);
			System.out.println("beneficiary_acct: " + beneficiary_acct);
			System.out.println("ordering_customer: " + ordering_customer);
			System.out.println("Field 59: " + p_field_59);
			System.out.println("Ordering Customer: " + ordering_customer);
			FundsMT103.execute();
			result = FundsMT103.getObject(1).toString();
			if (FundsMT103 != null) {
				FundsMT103.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (FundsMT103 != null) {
					FundsMT103.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	public TDBookingResponse BookAndCreateDeposit(TDBookingCreation tdBookingCreation) {
		paramload();

		com.ofss.fcubs.service.fcubsldservice.FCUBSHEADERType FCUBSHEADERType = new com.ofss.fcubs.service.fcubsldservice.FCUBSHEADERType();
		com.ofss.fcubs.service.fcubsldservice.CREATELDCONTRACTFSFSREQ.FCUBSBODY FCUBSBODY = new com.ofss.fcubs.service.fcubsldservice.CREATELDCONTRACTFSFSREQ.FCUBSBODY();
		LoansandDepositsFullType LoansandDepositsFullType = new LoansandDepositsFullType();
		TDBookingResponse response = null;
		ROLLOVERType2 ROLLOVERType2 = new ROLLOVERType2();
		IntMainType IntMainType = new IntMainType();
		IntDetailType IntDetailType = new IntDetailType();
		LoansandDepositsFullType.ContractEventLog ContractEventLog = new LoansandDepositsFullType.ContractEventLog();
		try {
			response = new TDBookingResponse();
			CREATELDCONTRACTFSFSREQ requestMsg = new CREATELDCONTRACTFSFSREQ();
			FCUBSHEADERType.setSOURCE(getHEADER_TD_SOURCE());
			FCUBSHEADERType.setUBSCOMP(com.ofss.fcubs.service.fcubsldservice.UBSCOMPType.FCUBS);
			FCUBSHEADERType.setUSERID(getHEADER_TD_USER());
			FCUBSHEADERType.setBRANCH(tdBookingCreation.getP_brn());
			FCUBSHEADERType.setSERVICE(getHEADER_TD_SERVICE());
			FCUBSHEADERType.setOPERATION(getHEADER_TD_OPERATION());
			FCUBSHEADERType.setSOURCEOPERATION(getHEADER_TD_OPERATION());
			FCUBSHEADERType.setMSGSTAT(com.ofss.fcubs.service.fcubsldservice.MsgStatType.SUCCESS);
			requestMsg.setFCUBSHEADER(FCUBSHEADERType);
			LoansandDepositsFullType.setXREF(tdBookingCreation.getP_xref());
			LoansandDepositsFullType.setBRN(tdBookingCreation.getP_brn());
			LoansandDepositsFullType.setAMT(new BigDecimal(tdBookingCreation.getP_amt()));
			LoansandDepositsFullType.setBOOKDT(this.fcubsCreateDate.format(new Date(tdBookingCreation.getP_trndt())));
			LoansandDepositsFullType.setVALDT(this.fcubsCreateDate.format(new Date(tdBookingCreation.getP_valdt())));
			LoansandDepositsFullType.setCPTY(tdBookingCreation.getP_cpty());
			LoansandDepositsFullType.setCCY(tdBookingCreation.getP_ccy());
			LoansandDepositsFullType.setDFLTACC(tdBookingCreation.getP_dfltacc());
			LoansandDepositsFullType.setDFLTACCBRN(tdBookingCreation.getP_dfltaccbrn());
			LoansandDepositsFullType.setDRSETLAC(tdBookingCreation.getP_dfltacc());
			LoansandDepositsFullType.setDRSETLACBR(tdBookingCreation.getP_dfltaccbrn());
			LoansandDepositsFullType.setMATDT(this.fcubsCreateDate.format(new Date(tdBookingCreation.getP_matdt())));
			LoansandDepositsFullType.setPRD(tdBookingCreation.getP_prd());
			LoansandDepositsFullType.setUREF(tdBookingCreation.getP_uref());
			LoansandDepositsFullType.setTDESC(tdBookingCreation.getP_tdesc());
			LoansandDepositsFullType.setROLLALLW(tdBookingCreation.getP_scode());
			IntDetailType.setTXNDT(this.fcubsCreateDate.format(new Date(tdBookingCreation.getP_trndt())));
			IntDetailType.setVALDT(this.fcubsCreateDate.format(new Date(tdBookingCreation.getP_valdt())));
			IntDetailType.setINTCCY(tdBookingCreation.getP_ccy());
			IntDetailType.setESN(new java.math.BigInteger("1"));
			IntDetailType.setRTTYPE("F");
			IntDetailType.setINTRATECODE("CD_FLOAT");
			IntDetailType.setINTSPREAD(new BigDecimal(tdBookingCreation.getIntrate()));
			IntMainType.getInterestDetails().add(IntDetailType);
			ROLLOVERType2.setAPPCHG("Y");
			System.out.println("tdBookingCreation.getP_authstat() " + tdBookingCreation.getP_authstat());
			ROLLOVERType2.setROLLAMTTYP(tdBookingCreation.getP_authstat());
			LoansandDepositsFullType.getContractRollover().add(ROLLOVERType2);
			IntMainType.setEFFCTIVERATE(new BigDecimal(tdBookingCreation.getIntrate()));

			IntMainType.setINTRATECODE("CD_FLOAT");
			IntMainType.setINTSPREAD(new BigDecimal(tdBookingCreation.getIntrate()));
			IntMainType.setINTCOMP("DP_FIXINT");
			IntMainType.setTXNDT(this.fcubsCreateDate.format(new Date(tdBookingCreation.getP_trndt())));
			IntMainType.setVALDT(this.fcubsCreateDate.format(new Date(tdBookingCreation.getP_valdt())));
			IntMainType.setCHDAMDMNT("Y");
			IntMainType.setINTCCY(tdBookingCreation.getP_ccy());
			IntMainType.setEVNT("BOOK");
			IntMainType.setESN(new java.math.BigInteger("1"));
			IntMainType.setPKUPEVSQ(new java.math.BigInteger("1"));
			IntMainType.setINTBASIS("9");
			IntMainType.setWAIVER("N");
			IntMainType.setACREQD("Y");
			IntMainType.setRTTYPE("F");
			IntMainType.setRTCALCTYP("U");
			IntMainType.setUNT("D");
			IntMainType.setRTCDUSE("A");
			ContractEventLog.setAUTHSTAT("A");
			ContractEventLog.setCONTSTAT("Y");
			LoansandDepositsFullType.setContractEventLog(ContractEventLog);
			LoansandDepositsFullType.getInterestMain().add(IntMainType);
			FCUBSBODY.setContractMaster(LoansandDepositsFullType);
			requestMsg.setFCUBSBODY(FCUBSBODY);

			CREATELDCONTRACTFSFSRES result = getPortLD().createLDContractFS(requestMsg);
			try {
				JAXBContext jaxbContext = JAXBContext.newInstance(new Class[]{requestMsg.getClass()});
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

				jaxbMarshaller.setProperty("jaxb.formatted.output", Boolean.valueOf(true));
				jaxbMarshaller.marshal(requestMsg, System.out);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			System.out.println("response <>12 " + result);
			if (result != null) {
				if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsldservice.MsgStatType.FAILURE)) {
					response.setResponseCode("1");
					int i = 0;
					for (int n = result.getFCUBSBODY().getFCUBSERRORRESP().size(); i < n; i++) {
						response.setResponse_message(((com.ofss.fcubs.service.fcubsldservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE() + " -- " + ((com.ofss.fcubs.service.fcubsldservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
						System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubsldservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE());
						System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubsldservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
					}
				} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsldservice.MsgStatType.WARNING)) {
					response.setResponseCode("1");
					int i = 0;
					for (int n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
						response.setResponse_message(((com.ofss.fcubs.service.fcubsldservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWCODE() + " -- " + ((com.ofss.fcubs.service.fcubsldservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWDESC());
						System.out.println("This is the result Cust " + ((com.ofss.fcubs.service.fcubsldservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWCODE());
						System.out.println("This is the result Cust " + ((com.ofss.fcubs.service.fcubsldservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
					}
				} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsldservice.MsgStatType.SUCCESS)) {
					response.setResponseCode("0");
					response.setContract_ref_no(result.getFCUBSBODY().getContractMaster().getFCCREF());
					int i = 0;
					for (int n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
						response.setResponse_message(((com.ofss.fcubs.service.fcubsldservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC() + " -- " + ((com.ofss.fcubs.service.fcubsldservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
						System.out.println("This is the result Cust " + result.getFCUBSBODY().getContractMaster().getFCCREF());
					}
				}
			} else {
				response.setContract_ref_no(null);
				response.setResponse_message("Unexpected Error From Service");
			}
		} catch (Exception e) {
			response.setContract_ref_no(null);
			response.setResponse_message(e.getMessage());
			e.printStackTrace();
		}
		return response;
	}

	public TDDetails[] getTDDetailsWithAccountNumber(String accountNumber, String custID) {
		GetConnection theConn = null;
		TDDetails[] var = null;
		Connection conn = null;
		CallableStatement tdDetails = null;
		ArrayList activityLog = null;
		ResultSet rs = null;
		String[] columnData = null;
		String[] dataContent = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			tdDetails = conn.prepareCall("{call FCUBSLIVE.td_inquiry_pkg.fetchdetailswithaccountnumber(?,?,?)}");
			tdDetails.registerOutParameter(1, -10);
			tdDetails.setString(2, accountNumber);
			tdDetails.setString(3, custID);
			tdDetails.execute();
			rs = (ResultSet) tdDetails.getObject(1);
			activityLog = new ArrayList();
			while (rs.next()) {
				columnData = new String[40];
				columnData[0] = rs.getString("contract_ref_no");
				columnData[1] = rs.getString("version_no");
				columnData[2] = rs.getString("event_seq_no");
				columnData[3] = rs.getString("branch");
				columnData[4] = rs.getString("product");
				columnData[5] = rs.getString("product_type");
				columnData[6] = rs.getString("module");
				columnData[7] = rs.getString("payment_method");
				columnData[8] = rs.getString("rollover_allowed");
				columnData[9] = rs.getString("user_ref_no");
				columnData[10] = rs.getString("counterparty");
				columnData[11] = rs.getString("currency");
				columnData[12] = rs.getString("amount");
				columnData[13] = rs.getString("lcy_amount");
				columnData[14] = rs.getString("original_start_date");
				columnData[15] = rs.getString("booking_date");
				columnData[16] = rs.getString("value_date");
				columnData[17] = rs.getString("maturity_type");
				columnData[18] = rs.getString("maturity_date");
				columnData[19] = rs.getString("remarks");
				columnData[20] = rs.getString("main_comp");
				columnData[21] = rs.getString("dflt_settle_ac");
				columnData[22] = rs.getString("dflt_settle_ac_branch");
				columnData[23] = rs.getString("iccf_status");
				columnData[24] = rs.getString("settlement_status");
				columnData[25] = rs.getString("tax_status");
				columnData[26] = rs.getString("brokerage_status");
				columnData[27] = rs.getString("tenor");
				columnData[28] = rs.getString("rollover_count");
				columnData[29] = rs.getString("user_defined_status");
				columnData[30] = rs.getString("contract_status");
				columnData[31] = rs.getString("job_picked_up");
				columnData[32] = rs.getString("loan_stmt_type");
				columnData[33] = rs.getString("annuity_loan");
				columnData[34] = rs.getString("int_period_basis");
				columnData[35] = rs.getString("rollover_mechanism");
				columnData[36] = rs.getString("rollover_method");
				columnData[37] = rs.getString("COMP_MIS_2");
				columnData[38] = rs.getString("accrued_interest");
				columnData[39] = rs.getString("customer_name");
				activityLog.add(columnData);
			}
			if (activityLog.size() >= 1) {
				var = new TDDetails[activityLog.size()];
				for (int i = 0; i < activityLog.size(); i++) {
					TDDetails stInfo = new TDDetails("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");

					dataContent = (String[]) activityLog.get(i);
					stInfo.setCONTRACT_REF_NO(dataContent[0]);
					stInfo.setVERSION_NO(dataContent[1]);
					stInfo.setEVENT_SEQ_NO(dataContent[2]);
					stInfo.setBRANCH(dataContent[3]);
					stInfo.setPRODUCT(dataContent[4]);
					stInfo.setPRODUCT_TYPE(dataContent[5]);
					stInfo.setMODULE(dataContent[6]);
					stInfo.setPAYMENT_METHOD(dataContent[7]);
					stInfo.setROLLOVER_ALLOWED(dataContent[8]);
					stInfo.setUSER_REF_NO(dataContent[9]);
					stInfo.setCOUNTERPARTY(dataContent[10]);
					stInfo.setCURRENCY(dataContent[11]);
					stInfo.setAMOUNT(dataContent[12]);
					stInfo.setLCY_AMOUNT(dataContent[13]);
					stInfo.setORIGINAL_START_DATE(dataContent[14]);
					stInfo.setBOOKING_DATE(dataContent[15]);
					stInfo.setVALUE_DATE(dataContent[16]);
					stInfo.setMATURITY_TYPE(dataContent[17]);
					stInfo.setMATURITY_DATE(dataContent[18]);
					stInfo.setREMARKS(dataContent[19]);
					stInfo.setMAIN_COMP(dataContent[20]);
					stInfo.setDFLT_SETTLE_AC(dataContent[21]);
					stInfo.setDFLT_SETTLE_AC_BRANCH(dataContent[22]);
					stInfo.setICCF_STATUS(dataContent[23]);
					stInfo.setSETTLEMENT_STATUS(dataContent[24]);
					stInfo.setTAX_STATUS(dataContent[25]);
					stInfo.setBROKERAGE_STATUS(dataContent[26]);
					stInfo.setTENOR(dataContent[27]);
					stInfo.setROLLOVER_COUNT(dataContent[28]);
					stInfo.setUSER_DEFINED_STATUS(dataContent[29]);
					stInfo.setCONTRACT_STATUS(dataContent[30]);
					stInfo.setJOB_PICKED_UP(dataContent[31]);
					stInfo.setLOAN_STMT_TYPE(dataContent[32]);
					stInfo.setANNUITY_LOAN(dataContent[33]);
					stInfo.setINT_PERIOD_BASIS(dataContent[34]);
					stInfo.setROLLOVER_MECHANISM(dataContent[35]);
					stInfo.setROLLOVER_METHOD(dataContent[36]);
					stInfo.setCOMP_MIS_2(dataContent[37]);
					stInfo.setAccrued_interest(dataContent[38]);
					stInfo.setCustomer_name(dataContent[39]);
					stInfo.setDESCRIPTION("Row Fetched: " + activityLog.size());
					var[i] = stInfo;
				}
			} else {
				var = new TDDetails[1];
				TDDetails stInfo = new TDDetails("");
				stInfo.setDESCRIPTION("Row Fetched: " + activityLog.size());
				var[0] = stInfo;
			}
			if (rs != null) {
				rs.close();
			}
			if (tdDetails != null) {
				tdDetails.close();
			}
			if (conn != null) {
				conn.close();
			}
			activityLog = null;

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (tdDetails != null) {
					tdDetails.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return var;
	}

	public TDDetails[] getTDDetailsWithCustID(String custID) {
		GetConnection theConn = null;
		TDDetails[] var = null;
		Connection conn = null;
		CallableStatement tdDetails = null;
		ArrayList activityLog = null;
		ResultSet rs = null;
		String[] columnData = null;
		String[] dataContent = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			tdDetails = conn.prepareCall("{call FCUBSLIVE.td_inquiry_pkg.fetchtdaccountwithid(?,?)}");
			tdDetails.registerOutParameter(1, -10);
			tdDetails.setString(2, custID);
			tdDetails.execute();
			rs = (ResultSet) tdDetails.getObject(1);
			activityLog = new ArrayList();
			while (rs.next()) {
				columnData = new String[40];
				columnData[0] = rs.getString("contract_ref_no");
				columnData[1] = rs.getString("version_no");
				columnData[2] = rs.getString("event_seq_no");
				columnData[3] = rs.getString("branch");
				columnData[4] = rs.getString("product");
				columnData[5] = rs.getString("product_type");
				columnData[6] = rs.getString("module");
				columnData[7] = rs.getString("payment_method");
				columnData[8] = rs.getString("rollover_allowed");
				columnData[9] = rs.getString("user_ref_no");
				columnData[10] = rs.getString("counterparty");
				columnData[11] = rs.getString("currency");
				columnData[12] = rs.getString("amount");
				columnData[13] = rs.getString("lcy_amount");
				columnData[14] = rs.getString("original_start_date");
				columnData[15] = rs.getString("booking_date");
				columnData[16] = rs.getString("value_date");
				columnData[17] = rs.getString("maturity_type");
				columnData[18] = rs.getString("maturity_date");
				columnData[19] = rs.getString("remarks");
				columnData[20] = rs.getString("main_comp");
				columnData[21] = rs.getString("dflt_settle_ac");
				columnData[22] = rs.getString("dflt_settle_ac_branch");
				columnData[23] = rs.getString("iccf_status");
				columnData[24] = rs.getString("settlement_status");
				columnData[25] = rs.getString("tax_status");
				columnData[26] = rs.getString("brokerage_status");
				columnData[27] = rs.getString("tenor");
				columnData[28] = rs.getString("rollover_count");
				columnData[29] = rs.getString("user_defined_status");
				columnData[30] = rs.getString("contract_status");
				columnData[31] = rs.getString("job_picked_up");
				columnData[32] = rs.getString("loan_stmt_type");
				columnData[33] = rs.getString("annuity_loan");
				columnData[34] = rs.getString("int_period_basis");
				columnData[35] = rs.getString("rollover_mechanism");
				columnData[36] = rs.getString("rollover_method");
				columnData[37] = rs.getString("COMP_MIS_2");
				columnData[38] = rs.getString("accrued_interest");
				columnData[39] = rs.getString("customer_name");
				activityLog.add(columnData);
			}
			if (activityLog.size() >= 1) {
				var = new TDDetails[activityLog.size()];
				for (int i = 0; i < activityLog.size(); i++) {
					TDDetails stInfo = new TDDetails("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");

					dataContent = (String[]) activityLog.get(i);
					stInfo.setCONTRACT_REF_NO(dataContent[0]);
					stInfo.setVERSION_NO(dataContent[1]);
					stInfo.setEVENT_SEQ_NO(dataContent[2]);
					stInfo.setBRANCH(dataContent[3]);
					stInfo.setPRODUCT(dataContent[4]);
					stInfo.setPRODUCT_TYPE(dataContent[5]);
					stInfo.setMODULE(dataContent[6]);
					stInfo.setPAYMENT_METHOD(dataContent[7]);
					stInfo.setROLLOVER_ALLOWED(dataContent[8]);
					stInfo.setUSER_REF_NO(dataContent[9]);
					stInfo.setCOUNTERPARTY(dataContent[10]);
					stInfo.setCURRENCY(dataContent[11]);
					stInfo.setAMOUNT(dataContent[12]);
					stInfo.setLCY_AMOUNT(dataContent[13]);
					stInfo.setORIGINAL_START_DATE(dataContent[14]);
					stInfo.setBOOKING_DATE(dataContent[15]);
					stInfo.setVALUE_DATE(dataContent[16]);
					stInfo.setMATURITY_TYPE(dataContent[17]);
					stInfo.setMATURITY_DATE(dataContent[18]);
					stInfo.setREMARKS(dataContent[19]);
					stInfo.setMAIN_COMP(dataContent[20]);
					stInfo.setDFLT_SETTLE_AC(dataContent[21]);
					stInfo.setDFLT_SETTLE_AC_BRANCH(dataContent[22]);
					stInfo.setICCF_STATUS(dataContent[23]);
					stInfo.setSETTLEMENT_STATUS(dataContent[24]);
					stInfo.setTAX_STATUS(dataContent[25]);
					stInfo.setBROKERAGE_STATUS(dataContent[26]);
					stInfo.setTENOR(dataContent[27]);
					stInfo.setROLLOVER_COUNT(dataContent[28]);
					stInfo.setUSER_DEFINED_STATUS(dataContent[29]);
					stInfo.setCONTRACT_STATUS(dataContent[30]);
					stInfo.setJOB_PICKED_UP(dataContent[31]);
					stInfo.setLOAN_STMT_TYPE(dataContent[32]);
					stInfo.setANNUITY_LOAN(dataContent[33]);
					stInfo.setINT_PERIOD_BASIS(dataContent[34]);
					stInfo.setROLLOVER_MECHANISM(dataContent[35]);
					stInfo.setROLLOVER_METHOD(dataContent[36]);
					stInfo.setCOMP_MIS_2(dataContent[37]);
					stInfo.setAccrued_interest(dataContent[38]);
					stInfo.setCustomer_name(dataContent[39]);
					stInfo.setDESCRIPTION("Row Fetched: " + activityLog.size());
					var[i] = stInfo;
				}
			} else {
				var = new TDDetails[1];
				TDDetails stInfo = new TDDetails("");
				stInfo.setDESCRIPTION("Row Fetched: " + activityLog.size());
				var[0] = stInfo;
			}
			if (rs != null) {
				rs.close();
			}
			if (tdDetails != null) {
				tdDetails.close();
			}
			if (conn != null) {
				conn.close();
			}
			activityLog = null;

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (tdDetails != null) {
					tdDetails.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return var;
	}

	public TDDetails[] getTDDetailsWithRefNo(String refNo) {
		GetConnection theConn = null;
		TDDetails[] var = null;
		Connection conn = null;
		CallableStatement tdDetails = null;
		ArrayList activityLog = null;
		ResultSet rs = null;
		String[] columnData = null;
		String[] dataContent = null;
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			tdDetails = conn.prepareCall("{call FCUBSLIVE.td_inquiry_pkg.fetchtddetailswithrefno(?,?)}");
			tdDetails.registerOutParameter(1, -10);
			tdDetails.setString(2, refNo);
			tdDetails.execute();
			rs = (ResultSet) tdDetails.getObject(1);
			activityLog = new ArrayList();
			while (rs.next()) {
				columnData = new String[40];
				columnData[0] = rs.getString("contract_ref_no");
				columnData[1] = rs.getString("version_no");
				columnData[2] = rs.getString("event_seq_no");
				columnData[3] = rs.getString("branch");
				columnData[4] = rs.getString("product");
				columnData[5] = rs.getString("product_type");
				columnData[6] = rs.getString("module");
				columnData[7] = rs.getString("payment_method");
				columnData[8] = rs.getString("rollover_allowed");
				columnData[9] = rs.getString("user_ref_no");
				columnData[10] = rs.getString("counterparty");
				columnData[11] = rs.getString("currency");
				columnData[12] = rs.getString("amount");
				columnData[13] = rs.getString("lcy_amount");
				columnData[14] = rs.getString("original_start_date");
				columnData[15] = rs.getString("booking_date");
				columnData[16] = rs.getString("value_date");
				columnData[17] = rs.getString("maturity_type");
				columnData[18] = rs.getString("maturity_date");
				columnData[19] = rs.getString("remarks");
				columnData[20] = rs.getString("main_comp");
				columnData[21] = rs.getString("dflt_settle_ac");
				columnData[22] = rs.getString("dflt_settle_ac_branch");
				columnData[23] = rs.getString("iccf_status");
				columnData[24] = rs.getString("settlement_status");
				columnData[25] = rs.getString("tax_status");
				columnData[26] = rs.getString("brokerage_status");
				columnData[27] = rs.getString("tenor");
				columnData[28] = rs.getString("rollover_count");
				columnData[29] = rs.getString("user_defined_status");
				columnData[30] = rs.getString("contract_status");
				columnData[31] = rs.getString("job_picked_up");
				columnData[32] = rs.getString("loan_stmt_type");
				columnData[33] = rs.getString("annuity_loan");
				columnData[34] = rs.getString("int_period_basis");
				columnData[35] = rs.getString("rollover_mechanism");
				columnData[36] = rs.getString("rollover_method");
				columnData[37] = rs.getString("COMP_MIS_2");
				columnData[38] = rs.getString("accrued_interest");
				columnData[39] = rs.getString("customer_name");
				activityLog.add(columnData);
			}
			if (activityLog.size() >= 1) {
				var = new TDDetails[activityLog.size()];
				for (int i = 0; i < activityLog.size(); i++) {
					TDDetails stInfo = new TDDetails("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");

					dataContent = (String[]) activityLog.get(i);
					stInfo.setCONTRACT_REF_NO(dataContent[0]);
					stInfo.setVERSION_NO(dataContent[1]);
					stInfo.setEVENT_SEQ_NO(dataContent[2]);
					stInfo.setBRANCH(dataContent[3]);
					stInfo.setPRODUCT(dataContent[4]);
					stInfo.setPRODUCT_TYPE(dataContent[5]);
					stInfo.setMODULE(dataContent[6]);
					stInfo.setPAYMENT_METHOD(dataContent[7]);
					stInfo.setROLLOVER_ALLOWED(dataContent[8]);
					stInfo.setUSER_REF_NO(dataContent[9]);
					stInfo.setCOUNTERPARTY(dataContent[10]);
					stInfo.setCURRENCY(dataContent[11]);
					stInfo.setAMOUNT(dataContent[12]);
					stInfo.setLCY_AMOUNT(dataContent[13]);
					stInfo.setORIGINAL_START_DATE(dataContent[14]);
					stInfo.setBOOKING_DATE(dataContent[15]);
					stInfo.setVALUE_DATE(dataContent[16]);
					stInfo.setMATURITY_TYPE(dataContent[17]);
					stInfo.setMATURITY_DATE(dataContent[18]);
					stInfo.setREMARKS(dataContent[19]);
					stInfo.setMAIN_COMP(dataContent[20]);
					stInfo.setDFLT_SETTLE_AC(dataContent[21]);
					stInfo.setDFLT_SETTLE_AC_BRANCH(dataContent[22]);
					stInfo.setICCF_STATUS(dataContent[23]);
					stInfo.setSETTLEMENT_STATUS(dataContent[24]);
					stInfo.setTAX_STATUS(dataContent[25]);
					stInfo.setBROKERAGE_STATUS(dataContent[26]);
					stInfo.setTENOR(dataContent[27]);
					stInfo.setROLLOVER_COUNT(dataContent[28]);
					stInfo.setUSER_DEFINED_STATUS(dataContent[29]);
					stInfo.setCONTRACT_STATUS(dataContent[30]);
					stInfo.setJOB_PICKED_UP(dataContent[31]);
					stInfo.setLOAN_STMT_TYPE(dataContent[32]);
					stInfo.setANNUITY_LOAN(dataContent[33]);
					stInfo.setINT_PERIOD_BASIS(dataContent[34]);
					stInfo.setROLLOVER_MECHANISM(dataContent[35]);
					stInfo.setROLLOVER_METHOD(dataContent[36]);
					stInfo.setCOMP_MIS_2(dataContent[37]);
					stInfo.setAccrued_interest(dataContent[38]);
					stInfo.setCustomer_name(dataContent[39]);
					stInfo.setDESCRIPTION("Row Fetched: " + activityLog.size());
					var[i] = stInfo;
				}
			} else {
				var = new TDDetails[1];
				TDDetails stInfo = new TDDetails("");
				stInfo.setDESCRIPTION("Row Fetched: " + activityLog.size());
				var[0] = stInfo;
			}
			if (rs != null) {
				rs.close();
			}
			if (tdDetails != null) {
				tdDetails.close();
			}
			if (conn != null) {
				conn.close();
			}
			activityLog = null;

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (tdDetails != null) {
					tdDetails.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return var;
	}

	public TDLiquidationResponse TDPreClosure(String fccref, String penaltyOption, String prepaymentpenaltyamount) {
		paramload();

		com.ofss.fcubs.service.fcubsldservice.FCUBSHEADERType FCUBSHEADERType = new com.ofss.fcubs.service.fcubsldservice.FCUBSHEADERType();
		com.ofss.fcubs.service.fcubsldservice.CREATELDPAYMENTFSFSREQ.FCUBSBODY FCUBSBODY = new com.ofss.fcubs.service.fcubsldservice.CREATELDPAYMENTFSFSREQ.FCUBSBODY();
		LoansandDepositsPaymentFullType LoansandDepositsPaymentFullType = new LoansandDepositsPaymentFullType();

		TDLiquidationResponse response = new TDLiquidationResponse();

		LoansandDepositsPaymentFullType.ScheduleDetails ScheduleDetails = new LoansandDepositsPaymentFullType.ScheduleDetails();
		try {
			System.out.println(" 11111111 ");
			TDDetails[] var = getTDDetailsWithRefNo(fccref);
			System.out.println(" 2222222222 ");
			try {
				if (var[0].getAccrued_interest() != null) {
					System.out.println(" getAccrued_interest " + var[0].getAccrued_interest());
				}

				if (var[0].getCONTRACT_REF_NO() != null) {
					System.out.println(" FCC Ref " + var[0].getCONTRACT_REF_NO());
				}
				if (var[0].getCOUNTERPARTY() != null) {
					System.out.println(" Counter Party " + var[0].getCOUNTERPARTY());
				}
				if (var[0].getCURRENCY() != null) {
					System.out.println(" Currency " + var[0].getCURRENCY());
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			try {
				if ((var[0].getCONTRACT_REF_NO() == null) || (var[0].getCOUNTERPARTY() == null) || (var[0].getCURRENCY() == null)) {
					System.out.println(" 333333333333333333333333333 ");
					response.setResponseCode("1");
					System.out.println(" 44444444444444444444 ");
					response.setResponseMessage(" TD Details Not Available ");
				} else {
					Timestamp ts = new Timestamp(System.currentTimeMillis());
					SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
					String msgid = formatter.format(ts);
					response = new TDLiquidationResponse();
					CREATELDPAYMENTFSFSREQ requestMsg = new CREATELDPAYMENTFSFSREQ();
					FCUBSHEADERType.setSOURCE(getHEADER_TD_SOURCE());
					FCUBSHEADERType.setUBSCOMP(com.ofss.fcubs.service.fcubsldservice.UBSCOMPType.FCUBS);
					FCUBSHEADERType.setMSGID(msgid);
					FCUBSHEADERType.setCORRELID("916014000610000");
					FCUBSHEADERType.setUSERID(getHEADER_TD_USER());
					FCUBSHEADERType.setBRANCH(var[0].getBRANCH());
					FCUBSHEADERType.setMODULEID("LD");
					FCUBSHEADERType.setSERVICE(getHEADER_TD_SERVICE());
					FCUBSHEADERType.setOPERATION(getHEADER_TD_PMT_OPERATION());
					FCUBSHEADERType.setSOURCEOPERATION("");
					FCUBSHEADERType.setSOURCEUSERID("");
					FCUBSHEADERType.setDESTINATION("ESB");
					FCUBSHEADERType.setMSGSTAT(com.ofss.fcubs.service.fcubsldservice.MsgStatType.SUCCESS);
					requestMsg.setFCUBSHEADER(FCUBSHEADERType);
					LoansandDepositsPaymentFullType.setFCCREF(fccref);
					LoansandDepositsPaymentFullType.setXREF("");
					LoansandDepositsPaymentFullType.setFCCREF(fccref);
					System.out.println(" 666666666666666666666666666666 ");
					LoansandDepositsPaymentFullType.setCPTY(var[0].getCOUNTERPARTY());
					LoansandDepositsPaymentFullType.setSTATUS("NORM");
					LoansandDepositsPaymentFullType.setOSBAL(new BigDecimal(var[0].getAMOUNT()));
					LoansandDepositsPaymentFullType.setOSBAL(new BigDecimal(var[0].getAMOUNT()));
					LoansandDepositsPaymentFullType.setCCY(var[0].getCURRENCY());
					LoansandDepositsPaymentFullType.setOLDMATDT(null);
					LoansandDepositsPaymentFullType.setNEWMATDT(null);
					LoansandDepositsPaymentFullType.setEFFFROM(null);
					LoansandDepositsPaymentFullType.setPREPMTBASIS(null);
					LoansandDepositsPaymentFullType.setPREPMTEFFFROM(null);

					System.out.println(" 777777777777777777777777777777 ");
					System.out.println("Amount : " + new BigDecimal(var[0].getAMOUNT()));
					LoansandDepositsPaymentFullType.setTOTPAID(new BigDecimal(var[0].getAMOUNT()).add(new BigDecimal(var[0].getAccrued_interest())));

					DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
					DateFormat dateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					Date date3 = dateFormat2.parse("29/02/2016");

					System.out.println("var[0].getVALUE_DATE() " + var[0].getVALUE_DATE());
					Date date2 = dateFormat3.parse(var[0].getVALUE_DATE());
					long time2 = date2.getTime();

					long time3 = date3.getTime();

					LoansandDepositsPaymentFullType.setLIMITDT(var[0].getVALUE_DATE());
					LoansandDepositsPaymentFullType.setVALDT(var[0].getVALUE_DATE());
					LoansandDepositsPaymentFullType.setDISCRATE(null);
					LoansandDepositsPaymentFullType.setTOTPREPAID(null);
					LoansandDepositsPaymentFullType.setLIMITAMT(null);
					LoansandDepositsPaymentFullType.setSUBSYSTEMSTAT(null);
					if (prepaymentpenaltyamount == null) {
						LoansandDepositsPaymentFullType.setPREPMTPENAMT(new BigDecimal("0"));
					} else {
						LoansandDepositsPaymentFullType.setPREPMTPENAMT(new BigDecimal(prepaymentpenaltyamount));
					}

					LoansandDepositsPaymentFullType.setCURRPMNT(new BigDecimal(var[0].getAMOUNT()).add(new BigDecimal(var[0].getAccrued_interest())));
					LoansandDepositsPaymentFullType.setTOTPAMNT(new BigDecimal(var[0].getAMOUNT()).add(new BigDecimal(var[0].getAccrued_interest())));

					List<LoansandDepositsPaymentFullType.PaymentBreakup> tPaymentBreakup = new ArrayList();
					LoansandDepositsPaymentFullType.PaymentBreakup PaymentBreakups = new LoansandDepositsPaymentFullType.PaymentBreakup();
					PaymentBreakups.setFCCREF(fccref);
					PaymentBreakups.setCOMP("PRINCIPAL");
					PaymentBreakups.setAMTPAID(new BigDecimal(var[0].getAMOUNT()));
					tPaymentBreakup.add(PaymentBreakups);

					PaymentBreakups = new LoansandDepositsPaymentFullType.PaymentBreakup();
					PaymentBreakups.setFCCREF(fccref);
					PaymentBreakups.setCOMP("DP_FIXINT");
					PaymentBreakups.setAMTPAID(new BigDecimal(var[0].getAccrued_interest()));
					tPaymentBreakup.add(PaymentBreakups);

					System.out.println("<<<<<<<<<>>>>>>>>>>>>>>Payment-Breakup <Payment-Breakup>\n                     <FCCREF>" + fccref + "</FCCREF>\n" + "                     <COMP>PRINCIPAL</COMP>\n" + "                     <AMTPAID>" + new BigDecimal(var[0].getAMOUNT()) + "</AMTPAID>\n" + "                     </Payment-Breakup>" + "<Payment-Breakup>\n" + "                     <FCCREF>" + fccref + "</FCCREF>\n" + "                     <COMP>DP_FIXINT</COMP>\n" + "                     <AMTPAID>" + new BigDecimal(var[0].getAccrued_interest()) + "</AMTPAID>\n" + "                     </Payment-Breakup>");

					LoansandDepositsPaymentFullType.getPaymentBreakup().addAll(tPaymentBreakup);

					System.out.println("LoansandDepositsPaymentFullType <<>>" + LoansandDepositsPaymentFullType.toString());

					try {
						DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
						Date date = dateFormat.parse("29/02/2016");
						long time = date.getTime();

						ScheduleDetails.setDUEDT(this.fcubsCreateDate.format(ts));
					} catch (Exception ex) {
						ex.printStackTrace();
					}

					LoansandDepositsPaymentFullType.setScheduleDetails(ScheduleDetails);
					FCUBSBODY.setPaymentSummary(LoansandDepositsPaymentFullType);
					requestMsg.setFCUBSBODY(FCUBSBODY);

					try {
						JAXBContext jaxbContext = JAXBContext.newInstance(new Class[]{requestMsg.getClass()});
						Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

						jaxbMarshaller.setProperty("jaxb.formatted.output", Boolean.valueOf(true));
						jaxbMarshaller.marshal(requestMsg, System.out);
					} catch (Exception ex) {
						ex.printStackTrace();
					}

					CREATELDPAYMENTFSFSRES result = getPortLD().createLDPaymentFS(requestMsg);
					System.out.println("response " + result.getFCUBSHEADER().getMSGSTAT());
					if (result != null) {
						if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsldservice.MsgStatType.FAILURE)) {
							response.setResponseCode("1");
							int i = 0;
							for (int n = result.getFCUBSBODY().getFCUBSERRORRESP().size(); i < n; i++) {
								response.setResponseMessage(((com.ofss.fcubs.service.fcubsldservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE() + " -- " + ((com.ofss.fcubs.service.fcubsldservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
								System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubsldservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE());
								System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubsldservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
							}
						} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsldservice.MsgStatType.WARNING)) {
							response.setResponseCode("1");
							int i = 0;
							for (int n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
								response.setResponseMessage(((com.ofss.fcubs.service.fcubsldservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWCODE() + " -- " + ((com.ofss.fcubs.service.fcubsldservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWDESC());
								System.out.println("This is the result Cust " + ((com.ofss.fcubs.service.fcubsldservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWCODE());
								System.out.println("This is the result Cust " + ((com.ofss.fcubs.service.fcubsldservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
							}
						} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsldservice.MsgStatType.SUCCESS)) {
							response.setResponseCode("0");
							int i = 0;
							for (int n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
								response.setResponseMessage(((com.ofss.fcubs.service.fcubsldservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC() + " -- " + ((com.ofss.fcubs.service.fcubsldservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsldservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
							}
						}
					} else {
						response.setResponseCode("1");
						response.setResponseMessage("Unexpected Error From Service");
					}
				}
			} catch (Exception e) {
				response.setResponseCode("1");
				System.out.println(" RRRRR4444444444444 ");
				response.setResponseMessage(" TD Details Not Available ");
				e.printStackTrace();
			}
		} catch (Exception e) {
			response.setResponseCode(null);
			response.setResponseMessage(e.getMessage());
			e.printStackTrace();
		}
		return response;
	}

	public FCUBSCustomerServiceSEI getPort() {
		return this.port;
	}

	public void setPort(FCUBSCustomerServiceSEI port) {
		this.port = port;
	}

	public FCUBSCustomerService getService() {
		return this.service;
	}

	public void setService(FCUBSCustomerService service) {
		this.service = service;
	}

	public String getHEADER_SOURCE() {
		return this.HEADER_SOURCE;
	}

	public void setHEADER_SOURCE(String HEADER_SOURCE) {
		this.HEADER_SOURCE = HEADER_SOURCE;
	}

	public String getHEADER_USER() {
		return this.HEADER_USER;
	}

	public void setHEADER_USER(String HEADER_USER) {
		this.HEADER_USER = HEADER_USER;
	}

	public String getHEADER_BRANCH() {
		return this.HEADER_BRANCH;
	}

	public void setHEADER_BRANCH(String HEADER_BRANCH) {
		this.HEADER_BRANCH = HEADER_BRANCH;
	}

	public String getHEADER_SERVICE() {
		return this.HEADER_SERVICE;
	}

	public void setHEADER_SERVICE(String HEADER_SERVICE) {
		this.HEADER_SERVICE = HEADER_SERVICE;
	}

	public String getHEADER_OPERATION() {
		return this.HEADER_OPERATION;
	}

	public void setHEADER_OPERATION(String HEADER_OPERATION) {
		this.HEADER_OPERATION = HEADER_OPERATION;
	}

	public String getHEADER_ACCT_SOURCE() {
		return this.HEADER_ACCT_SOURCE;
	}

	public void setHEADER_ACCT_SOURCE(String HEADER_ACCT_SOURCE) {
		this.HEADER_ACCT_SOURCE = HEADER_ACCT_SOURCE;
	}

	public String getHEADER_ACCT_USER() {
		return this.HEADER_ACCT_USER;
	}

	public void setHEADER_ACCT_USER(String HEADER_ACCT_USER) {
		this.HEADER_ACCT_USER = HEADER_ACCT_USER;
	}

	public String getHEADER_ACCT_BRANCH() {
		return this.HEADER_ACCT_BRANCH;
	}

	public void setHEADER_ACCT_BRANCH(String HEADER_ACCT_BRANCH) {
		this.HEADER_ACCT_BRANCH = HEADER_ACCT_BRANCH;
	}

	public String getHEADER_ACCT_SERVICE() {
		return this.HEADER_ACCT_SERVICE;
	}

	public void setHEADER_ACCT_SERVICE(String HEADER_ACCT_SERVICE) {
		this.HEADER_ACCT_SERVICE = HEADER_ACCT_SERVICE;
	}

	public String getHEADER_ACCT_OPERATION() {
		return this.HEADER_ACCT_OPERATION;
	}

	public void setHEADER_ACCT_OPERATION(String HEADER_ACCT_OPERATION) {
		this.HEADER_ACCT_OPERATION = HEADER_ACCT_OPERATION;
	}

	public FCUBSAccService getServiceAcct() {
		return this.serviceAcct;
	}

	public void setServiceAcct(FCUBSAccService serviceAcct) {
		this.serviceAcct = serviceAcct;
	}

	public FCUBSAccServiceSEI getPortAcct() {
		return this.portAcct;
	}

	public void setPortAcct(FCUBSAccServiceSEI portAcct) {
		this.portAcct = portAcct;
	}

	public String getHEADER_ACCT_MODIFY_OPERATION() {
		return this.HEADER_ACCT_MODIFY_OPERATION;
	}

	public void setHEADER_ACCT_MODIFY_OPERATION(String HEADER_ACCT_MODIFY_OPERATION) {
		this.HEADER_ACCT_MODIFY_OPERATION = HEADER_ACCT_MODIFY_OPERATION;
	}

	public String getHEADER_MODIFY_OPERATION() {
		return this.HEADER_MODIFY_OPERATION;
	}

	public void setHEADER_MODIFY_OPERATION(String HEADER_MODIFY_OPERATION) {
		this.HEADER_MODIFY_OPERATION = HEADER_MODIFY_OPERATION;
	}

	public String getHEADER_TD_SOURCE() {
		return this.HEADER_TD_SOURCE;
	}

	public void setHEADER_TD_SOURCE(String HEADER_TD_SOURCE) {
		this.HEADER_TD_SOURCE = HEADER_TD_SOURCE;
	}

	public String getHEADER_TD_USER() {
		return this.HEADER_TD_USER;
	}

	public void setHEADER_TD_USER(String HEADER_TD_USER) {
		this.HEADER_TD_USER = HEADER_TD_USER;
	}

	public String getHEADER_TD_BRANCH() {
		return this.HEADER_TD_BRANCH;
	}

	public void setHEADER_TD_BRANCH(String HEADER_TD_BRANCH) {
		this.HEADER_TD_BRANCH = HEADER_TD_BRANCH;
	}

	public String getHEADER_TD_SERVICE() {
		return this.HEADER_TD_SERVICE;
	}

	public void setHEADER_TD_SERVICE(String HEADER_TD_SERVICE) {
		this.HEADER_TD_SERVICE = HEADER_TD_SERVICE;
	}

	public String getHEADER_TD_OPERATION() {
		return this.HEADER_TD_OPERATION;
	}

	public void setHEADER_TD_OPERATION(String HEADER_TD_OPERATION) {
		this.HEADER_TD_OPERATION = HEADER_TD_OPERATION;
	}

	public FCUBSLDService getServiceLD() {
		return this.serviceLD;
	}

	public void setServiceLD(FCUBSLDService serviceLD) {
		this.serviceLD = serviceLD;
	}

	public FCUBSLDServiceSEI getPortLD() {
		return this.portLD;
	}

	public void setPortLD(FCUBSLDServiceSEI portLD) {
		this.portLD = portLD;
	}

	public String getHEADER_TD_PMT_OPERATION() {
		return this.HEADER_TD_PMT_OPERATION;
	}

	public void setHEADER_TD_PMT_OPERATION(String HEADER_TD_PMT_OPERATION) {
		this.HEADER_TD_PMT_OPERATION = HEADER_TD_PMT_OPERATION;
	}

	public String getRateCode(String productCode) {
		GetConnection theConn = null;
		Connection conn = null;
		CallableStatement rateCode = null;
		ResultSet rs = null;
		String rateValue = "";
		try {
			if (productCode != null) {
				theConn = new GetConnection();
				conn = theConn.getPrConn().getConnection();
				rateCode = conn.prepareCall("{call FCUBSLIVE.UBN_ACCOUNT_SERVICING_PKG.getratecode(?,?)}");
				rateCode.registerOutParameter(1, -10);
				rateCode.setString(2, productCode);
				rateCode.execute();
				rs = (ResultSet) rateCode.getObject(1);
				if (rs != null) {
					while (rs.next()) {
						rateValue = rs.getString("rate_code");
						if (rateValue == null) {
							rateValue = "";
						}
					}
				}

				if (rs != null) {
					rs.close();
				}
				if (rateCode != null) {
					rateCode.close();
				}
				if (conn != null) {
					conn.close();
				}
			}

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (rateCode != null) {
					rateCode.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return rateValue;
	}

	public FloatRateResponse getFloatRate(FloatRateRequest tFloatRateRequest) {
		FloatRateResponse response = null;
		GetConnection theConn = null;
		Connection conn = null;
		PreparedStatement pstmt = null;

		ResultSet res = null;
		String rateValue = "";
		String trateCode = "";
		response = new FloatRateResponse();
		if ((!tFloatRateRequest.getAmountSlab().equals("")) && (!tFloatRateRequest.getBranchCode().equals("")) && (!tFloatRateRequest.getBranchCode().equals("")) && (!tFloatRateRequest.getCurrencyCode().equals("")) && (!tFloatRateRequest.getProductCode().equals("")) && (!tFloatRateRequest.getTenor().equals(""))) {
			try {
				trateCode = getRateCode(tFloatRateRequest.getProductCode());
				System.out.println("productCode<<>>>" + trateCode);
			} catch (Exception e) {
				e.printStackTrace();
				response.setResponseCode("-1");
				response.setResponseMessage("Error Getting RateCode");
				response.setRateValue("");
			}
			if (tFloatRateRequest != null) {
				try {
					theConn = new GetConnection();
					conn = theConn.getPrConn().getConnection();
					String ddate = tFloatRateRequest.getFromDate();

					String sql1 = "select FCUBSLIVE.ubn_account_servicing_pkg.getratefromfcubs ('" + tFloatRateRequest.getBranchCode() + "',null,'" + tFloatRateRequest.getCurrencyCode() + "','" + tFloatRateRequest.getAmountSlab() + "','" + trateCode + "','" + tFloatRateRequest.getTenor() + "','" + ddate + "','" + tFloatRateRequest.getProductCode() + "')  from dual";
					System.out.println("sql1 " + sql1);
					pstmt = conn.prepareStatement(sql1);
					System.out.println("sql1 " + sql1);
					if (pstmt.execute()) {
						res = pstmt.getResultSet();
						if (res.next()) {
							rateValue = res.getString(1);
							System.out.println("counter===" + rateValue);
							if (rateValue == null) {
								response.setResponseCode("99");
								response.setResponseMessage("Rate not Available");
							} else {
								response.setResponseCode("00");
								response.setRateValue(rateValue);
								response.setResponseMessage("Successful");
							}
						}
					}

					if (pstmt != null) {
						pstmt.close();
					}
					if (conn != null) {
						conn.close();
					}

				} catch (NamingException e) {
					e.printStackTrace();
					response.setResponseCode("-1");
					response.setResponseMessage("Error Fetching Rate");
					response.setRateValue("");
				} catch (Exception e) {
					e.printStackTrace();
					response.setResponseCode("-1");
					response.setResponseMessage("Error Fetching Rate");
					response.setRateValue("");
				} finally {
					try {
						if (pstmt != null) {
							pstmt.close();
						}
						if (conn != null) {
							conn.close();
						}
					} catch (SQLException ex) {
						ex.printStackTrace();
						response.setResponseCode("-1");
						response.setResponseMessage("Error Fetching Rate");
						response.setRateValue("");
					}
				}
			}
		}
		return response;
	}

	public AccountCloseResponse CloseAccount(String accountNumber, String custNum, String ACCLS, String CCY, String BRN, String userID) {
		AccountCloseResponse response = new AccountCloseResponse();

		paramload();

		com.ofss.fcubs.service.fcubsaccservice.FCUBSHEADERType FCUBSHEADERType = new com.ofss.fcubs.service.fcubsaccservice.FCUBSHEADERType();
		com.ofss.fcubs.service.fcubsaccservice.CLOSECUSTACCFSFSREQ.FCUBSBODY FCUBSBODY = new com.ofss.fcubs.service.fcubsaccservice.CLOSECUSTACCFSFSREQ.FCUBSBODY();
		try {
			CLOSECUSTACCFSFSREQ requestMsg = new CLOSECUSTACCFSFSREQ();
			FCUBSHEADERType.setSOURCE(getHEADER_SOURCE());
			FCUBSHEADERType.setUBSCOMP(com.ofss.fcubs.service.fcubsaccservice.UBSCOMPType.FCUBS);
			FCUBSHEADERType.setUSERID(getHEADER_USER());
			FCUBSHEADERType.setBRANCH(BRN);
			FCUBSHEADERType.setSERVICE(getHEADER_ACCT_SERVICE());
			FCUBSHEADERType.setOPERATION("CloseCustAcc");
			FCUBSHEADERType.setMSGSTAT(com.ofss.fcubs.service.fcubsaccservice.MsgStatType.SUCCESS);
			requestMsg.setFCUBSHEADER(FCUBSHEADERType);
			CustAccFullType custaccFull = new CustAccFullType();
			custaccFull.setACC(accountNumber);
			custaccFull.setCUSTNO(custNum);
			custaccFull.setACCLS(ACCLS);
			custaccFull.setCCY(CCY);
			custaccFull.setBRN(BRN);
			FCUBSBODY.setCustAccountFull(custaccFull);
			requestMsg.setFCUBSBODY(FCUBSBODY);
			CLOSECUSTACCFSFSRES result = getPortAcct().closeCustAccFS(requestMsg);
			System.out.println("response<<<>>> " + result);
			System.out.println("response <>>>" + result.getFCUBSHEADER().getMSGSTAT());
			if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsaccservice.MsgStatType.FAILURE)) {
				response.setResponseCode("1");
				int i = 0;
				for (int n = result.getFCUBSBODY().getFCUBSERRORRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE() + " -- " + ((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
					System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getECODE());
					System.out.println("This is the result " + ((com.ofss.fcubs.service.fcubsaccservice.ERRORDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.ERRORType) result.getFCUBSBODY().getFCUBSERRORRESP().get(i)).getERROR().get(i)).getEDESC());
				}
			} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsaccservice.MsgStatType.WARNING)) {
				response.setResponseCode("1");
				int i = 0;
				for (int n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubsaccservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWCODE() + " -- " + ((com.ofss.fcubs.service.fcubsaccservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(0)).getWARNING().get(0)).getWDESC());
					System.out.println("This is the result Cust " + ((com.ofss.fcubs.service.fcubsaccservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWCODE());
					System.out.println("This is the result Cust " + ((com.ofss.fcubs.service.fcubsaccservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
				}
			} else if (result.getFCUBSHEADER().getMSGSTAT().equals(com.ofss.fcubs.service.fcubsaccservice.MsgStatType.SUCCESS)) {
				response.setResponseCode("0");
				int i = 0;
				for (int n = result.getFCUBSBODY().getFCUBSWARNINGRESP().size(); i < n; i++) {
					response.setResponseMessage(((com.ofss.fcubs.service.fcubsaccservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC() + " -- " + ((com.ofss.fcubs.service.fcubsaccservice.WARNINGDETAILSType) ((com.ofss.fcubs.service.fcubsaccservice.WARNINGType) result.getFCUBSBODY().getFCUBSWARNINGRESP().get(i)).getWARNING().get(i)).getWDESC());
					System.out.println("This is the result Cust " + result.getFCUBSBODY().getCustAccountFull().getCUSTNO());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	public String getHEADER_SICLOSE_SOURCE() {
		return this.HEADER_SICLOSE_SOURCE;
	}

	public void setHEADER_SICLOSE_SOURCE(String HEADER_SICLOSE_SOURCE) {
		this.HEADER_SICLOSE_SOURCE = HEADER_SICLOSE_SOURCE;
	}

	public String getHEADER_SICLOSE_USER() {
		return this.HEADER_SICLOSE_USER;
	}

	public void setHEADER_SICLOSE_USER(String HEADER_SICLOSE_USER) {
		this.HEADER_SICLOSE_USER = HEADER_SICLOSE_USER;
	}

	public String getHEADER_SICLOSE_BRANCH() {
		return this.HEADER_SICLOSE_BRANCH;
	}

	public void setHEADER_SICLOSE_BRANCH(String HEADER_SICLOSE_BRANCH) {
		this.HEADER_SICLOSE_BRANCH = HEADER_SICLOSE_BRANCH;
	}

	public String getHEADER_SICLOSE_SERVICE() {
		return this.HEADER_SICLOSE_SERVICE;
	}

	public void setHEADER_SICLOSE_SERVICE(String HEADER_SICLOSE_SERVICE) {
		this.HEADER_SICLOSE_SERVICE = HEADER_SICLOSE_SERVICE;
	}

	public String getHEADER_SICLOSE_OPERATION() {
		return this.HEADER_SICLOSE_OPERATION;
	}

	public void setHEADER_SICLOSE_OPERATION(String HEADER_SICLOSE_OPERATION) {
		this.HEADER_SICLOSE_OPERATION = HEADER_SICLOSE_OPERATION;
	}

	public String getHEADER_ACCT_REOPEN_OPERATION() {
		return this.HEADER_ACCT_REOPEN_OPERATION;
	}

	public void setHEADER_ACCT_REOPEN_OPERATION(String HEADER_ACCT_REOPEN_OPERATION) {
		this.HEADER_ACCT_REOPEN_OPERATION = HEADER_ACCT_REOPEN_OPERATION;
	}

	public static String getPropertiesValue(String key) {
		Properties prop = new Properties();
		java.io.InputStream input = null;
		String retValue = "";

		String config_path = "C:/deploy/wsconfig.properties";
		System.out.println("Config found on=====" + config_path);
		try {
			input = new java.io.FileInputStream(config_path);
			prop.load(input);
			String str1;
			return prop.getProperty(key);
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (input != null) {
				try {
					input.close();
					prop.clear();
				} catch (IOException e) {
					e.printStackTrace();
					return null;
				}
			}
		}
	}
	
	public static String getPropertiesValue1(String key) {
		Properties prop = new Properties();
		InputStream input = null;
		String retValue = "";
		String config_path = System.getenv("WSCONFIG_HOME") + File.separator + "wsconfig.properties";
		System.out.println("Config found on=====" + config_path);
		try {
			input = new FileInputStream(config_path);
			prop.load(input);
			retValue = prop.getProperty(key);
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
					return null;
				}
			}
		}
		return retValue;

	}

	public TDDetails[] getTDDetailsWithArrayOfAccountNumbers(List<String> accountNumberArray) {
		GetConnection theConn = null;
		TDDetails[] var = null;
		Connection conn = null;
		CallableStatement tdDetails = null;

		ArrayList activityLog = null;
		ResultSet rs = null;
		String[] columnData = null;
		String[] dataContent = null;
		Object[] batchTransactionItemsListArray = null;
		List<Object[]> transactionItemsList = new ArrayList();
		List<Object> batchTransactionItemsList = new ArrayList();
		try {
			theConn = new GetConnection();
			conn = theConn.getPrConn().getConnection();
			conn = (Connection) conn.unwrap(oracle.jdbc.OracleConnection.class);
			oracle.sql.ARRAY batchTransactionItemsArray = null;
			oracle.sql.ArrayDescriptor batchTransactionItems = oracle.sql.ArrayDescriptor.createDescriptor("FCUBSLIVE.ACCNUMARRY_TAB", conn);
			for (String itemsRequestData : accountNumberArray) {
				batchTransactionItemsList.add(itemsRequestData);
			}
			batchTransactionItemsListArray = batchTransactionItemsList.toArray(new Object[0]);
			batchTransactionItemsArray = new oracle.sql.ARRAY(batchTransactionItems, conn, batchTransactionItemsListArray);
			tdDetails = conn.prepareCall("{call FCUBSLIVE.td_inquiry_pkg.fetchdetailswitharrayacctno (?,?)}");
			tdDetails.registerOutParameter(1, -10);
			tdDetails.setArray(2, batchTransactionItemsArray);
			tdDetails.execute();
			rs = (ResultSet) tdDetails.getObject(1);
			activityLog = new ArrayList();
			while (rs.next()) {
				columnData = new String[41];
				columnData[0] = rs.getString("contract_ref_no");
				columnData[1] = rs.getString("version_no");
				columnData[2] = rs.getString("event_seq_no");
				columnData[3] = rs.getString("branch");
				columnData[4] = rs.getString("product");
				columnData[5] = rs.getString("product_type");
				columnData[6] = rs.getString("module");
				columnData[7] = rs.getString("payment_method");
				columnData[8] = rs.getString("rollover_allowed");
				columnData[9] = rs.getString("user_ref_no");
				columnData[10] = rs.getString("counterparty");
				columnData[11] = rs.getString("currency");
				columnData[12] = rs.getString("amount");
				columnData[13] = rs.getString("lcy_amount");
				columnData[14] = rs.getString("original_start_date");
				columnData[15] = rs.getString("booking_date");
				columnData[16] = rs.getString("value_date");
				columnData[17] = rs.getString("maturity_type");
				columnData[18] = rs.getString("maturity_date");
				columnData[19] = rs.getString("remarks");
				columnData[20] = rs.getString("main_comp");
				columnData[21] = rs.getString("dflt_settle_ac");
				columnData[22] = rs.getString("dflt_settle_ac_branch");
				columnData[23] = rs.getString("iccf_status");
				columnData[24] = rs.getString("settlement_status");
				columnData[25] = rs.getString("tax_status");
				columnData[26] = rs.getString("brokerage_status");
				columnData[27] = rs.getString("tenor");
				columnData[28] = rs.getString("rollover_count");
				columnData[29] = rs.getString("user_defined_status");
				columnData[30] = rs.getString("contract_status");
				columnData[31] = rs.getString("job_picked_up");
				columnData[32] = rs.getString("loan_stmt_type");
				columnData[33] = rs.getString("annuity_loan");
				columnData[34] = rs.getString("int_period_basis");
				columnData[35] = rs.getString("rollover_mechanism");
				columnData[36] = rs.getString("rollover_method");
				columnData[37] = rs.getString("COMP_MIS_2");
				columnData[38] = rs.getString("accrued_interest");
				columnData[39] = rs.getString("customer_name");
				columnData[40] = rs.getString("dflt_settle_ac");

				activityLog.add(columnData);
			}
			if (activityLog.size() >= 1) {
				var = new TDDetails[activityLog.size()];
				for (int i = 0; i < activityLog.size(); i++) {
					TDDetails stInfo = new TDDetails("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");

					dataContent = (String[]) activityLog.get(i);
					stInfo.setCONTRACT_REF_NO(dataContent[0]);
					stInfo.setVERSION_NO(dataContent[1]);
					stInfo.setEVENT_SEQ_NO(dataContent[2]);
					stInfo.setBRANCH(dataContent[3]);
					stInfo.setPRODUCT(dataContent[4]);
					stInfo.setPRODUCT_TYPE(dataContent[5]);
					stInfo.setMODULE(dataContent[6]);
					stInfo.setPAYMENT_METHOD(dataContent[7]);
					stInfo.setROLLOVER_ALLOWED(dataContent[8]);
					stInfo.setUSER_REF_NO(dataContent[9]);
					stInfo.setCOUNTERPARTY(dataContent[10]);
					stInfo.setCURRENCY(dataContent[11]);
					stInfo.setAMOUNT(dataContent[12]);
					stInfo.setLCY_AMOUNT(dataContent[13]);
					stInfo.setORIGINAL_START_DATE(dataContent[14]);
					stInfo.setBOOKING_DATE(dataContent[15]);
					stInfo.setVALUE_DATE(dataContent[16]);
					stInfo.setMATURITY_TYPE(dataContent[17]);
					stInfo.setMATURITY_DATE(dataContent[18]);
					stInfo.setREMARKS(dataContent[19]);
					stInfo.setMAIN_COMP(dataContent[20]);
					stInfo.setDFLT_SETTLE_AC(dataContent[21]);
					stInfo.setDFLT_SETTLE_AC_BRANCH(dataContent[22]);
					stInfo.setICCF_STATUS(dataContent[23]);
					stInfo.setSETTLEMENT_STATUS(dataContent[24]);
					stInfo.setTAX_STATUS(dataContent[25]);
					stInfo.setBROKERAGE_STATUS(dataContent[26]);
					stInfo.setTENOR(dataContent[27]);
					stInfo.setROLLOVER_COUNT(dataContent[28]);
					stInfo.setUSER_DEFINED_STATUS(dataContent[29]);
					stInfo.setCONTRACT_STATUS(dataContent[30]);
					stInfo.setJOB_PICKED_UP(dataContent[31]);
					stInfo.setLOAN_STMT_TYPE(dataContent[32]);
					stInfo.setANNUITY_LOAN(dataContent[33]);
					stInfo.setINT_PERIOD_BASIS(dataContent[34]);
					stInfo.setROLLOVER_MECHANISM(dataContent[35]);
					stInfo.setROLLOVER_METHOD(dataContent[36]);
					stInfo.setCOMP_MIS_2(dataContent[37]);
					stInfo.setAccrued_interest(dataContent[38]);
					stInfo.setCustomer_name(dataContent[39]);
					stInfo.setDFLT_SETTLE_AC(dataContent[40]);
					stInfo.setDESCRIPTION("Row Fetched: " + activityLog.size());
					var[i] = stInfo;
				}
			} else {
				var = new TDDetails[1];
				TDDetails stInfo = new TDDetails("");
				stInfo.setDESCRIPTION("Row Fetched: " + activityLog.size());
				var[0] = stInfo;
			}
			if (rs != null) {
				rs.close();
			}
			if (tdDetails != null) {
				tdDetails.close();
			}
			if (conn != null) {
				conn.close();
			}
			activityLog = null;
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (tdDetails != null) {
					tdDetails.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return var;
	}

	public List<StandingInstructionDetailsResponse> getStandingInstruction(String acctNo) {
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
	
//	public static void main(String[] args) {
//		 ServiceProcessor ss = new ServiceProcessor();
//		 List<StandingInstructionDetailsResponse> s = ss.getStandingInstruction("0047819468");
//		 System.out.println(s);
//		 
//	 }
}

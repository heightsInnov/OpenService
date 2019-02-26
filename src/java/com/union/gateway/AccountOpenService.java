package com.union.gateway;

import com.union.bof.dao.AccountClassTransferRequest;
import com.union.bof.dao.AccountClassTransferResponse;
import com.union.bof.dao.AccountCloseRequest;
import com.union.bof.dao.AccountCloseResponse;
import com.union.bof.dao.AccountMaintenanceResponse;
import com.union.bof.dao.AccountOpeningGenericRequest;
import com.union.bof.dao.AccountOpeningGenericResponse;
import com.union.bof.dao.AccountOpeningRequest;
import com.union.bof.dao.AccountOpeningResponse;
import com.union.bof.dao.AccountOpeningWithIDRequest;
import com.union.bof.dao.AccountOpeningWithIDResponse;
import com.union.bof.dao.AccountReactivationRequest;
import com.union.bof.dao.AccountReactivationResponse;
import com.union.bof.dao.AccountReopeningRequest;
import com.union.bof.dao.AccountReopeningResponse;
import com.union.bof.dao.AccountRestrictionRequest;
import com.union.bof.dao.AccountRestrictionResponse;
import com.union.bof.dao.AcctDetailsResponse;
import com.union.bof.dao.BVNRecords;
import com.union.bof.dao.CloseStandingInstructionRequest;
import com.union.bof.dao.CreateAccountMemoRequest;
import com.union.bof.dao.CreateAccountMemoResponse;
import com.union.bof.dao.CreateCorpCustomerRequest;
import com.union.bof.dao.CreateCorpCustomerResponse;
import com.union.bof.dao.CreateCustomerRequest;
import com.union.bof.dao.CreateCustomerResponse;
import com.union.bof.dao.CreateStandingInstructionRequest;
import com.union.bof.dao.CreateStandingInstructionResponse;
import com.union.bof.dao.FetchBVNRequest;
import com.union.bof.dao.FetchBVNResponse;
import com.union.bof.dao.FloatRateRequest;
import com.union.bof.dao.FloatRateResponse;
import com.union.bof.dao.FundsTransferOutwardRequest;
import com.union.bof.dao.StandingInstructionCloseResponse;
import com.union.bof.dao.StandingInstructionDetailsResponse;
import com.union.bof.dao.TDBookingResponse;
import com.union.bof.dao.TDDetails;
import com.union.bof.dao.TDLiquidationRequest;
import com.union.bof.dao.TDLiquidationResponse;
import com.union.bof.dao.UpdateBVNRequest;
import com.union.bof.dao.UpdateBVNResponse;
import com.union.bof.dao.changeCustDetailsOFRequest;
import com.union.bof.utilities.AestheticsUtil;
import com.union.gateway.types.TDBookingCreation;
import com.unionbank.processor.CountryList;
import com.unionbank.processor.CustomerRelationshipList;
import com.unionbank.processor.StateList;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class AccountOpenService {

	AccountOpeningRequest acctopenrequest;
	AccountOpeningWithIDRequest accountOpeningWithIDRequest;
	AccountOpeningGenericRequest accountOpeningGenericRequests;
	CreateCustomerRequest createcustomerrequest;
	CreateCorpCustomerRequest createCorpCustomerRequest;
	FundsTransferOutwardRequest fundsTransferOutwardRequest;
	TDBookingCreation tdBookingCreation;
	TDLiquidationRequest tdLiquidationRequest;
	FloatRateRequest tfloatRateRequest;
	AccountCloseRequest acctcloserequest;
	CreateAccountMemoRequest createAccountMemoRequests;
	UpdateBVNRequest updatebvnrequests;
	CreateStandingInstructionRequest createstandinginstructionrequests;

	@WebMethod(operationName = "openAccount")
	public AccountOpeningResponse openAccount(@WebParam(name = "accountopeningrequest") AccountOpeningRequest accountopeningrequest) {
		this.acctopenrequest = accountopeningrequest;
		AccountOpeningResponse response = null;
		ServiceProcessor serviceProcessor = new ServiceProcessor();
		try {
			response = new AccountOpeningResponse();
			serviceProcessor = new ServiceProcessor();
			System.out.println("First Name: " + accountopeningrequest.getFirstName());
			System.out.println("Middle Name: " + accountopeningrequest.getMiddleName());
			System.out.println("Last Name: " + accountopeningrequest.getLastName());
			System.out.println("Title: " + accountopeningrequest.getTitle());
			response = serviceProcessor.OpenAccountBOF(this.acctopenrequest.getTitle(), this.acctopenrequest.getFirstName().toUpperCase(), this.acctopenrequest.getMiddleName(), this.acctopenrequest.getLastName().toUpperCase(), this.acctopenrequest.getDateOfBirth(), this.acctopenrequest.getAddress().toUpperCase(), this.acctopenrequest.getAddress2(), this.acctopenrequest.getAddress3(), this.acctopenrequest.getAddress4(), this.acctopenrequest.getState().toUpperCase(), this.acctopenrequest.getNationality().toUpperCase(), this.acctopenrequest.getMotherMaidenName().toUpperCase(), this.acctopenrequest.getTelephone(), this.acctopenrequest.getTelephone2(), this.acctopenrequest.getProfession(), this.acctopenrequest.getMaritaStatus(), this.acctopenrequest.getGender().toUpperCase(), this.acctopenrequest.getEmail().toUpperCase(), this.acctopenrequest.getCustIdNo(), this.acctopenrequest.getIssueDate(), this.acctopenrequest.getExpiryDate(), this.acctopenrequest.getNextOfKin().toUpperCase(), this.acctopenrequest.getRelatioship().toUpperCase(), this.acctopenrequest.getBranch(), this.acctopenrequest.getUniqueID(), this.acctopenrequest.getAcctCategory().toUpperCase(), this.acctopenrequest.getLanguage().toUpperCase(), this.acctopenrequest.getTheCity().toUpperCase(), this.acctopenrequest.getCountryOfResident().toUpperCase(), this.acctopenrequest.getZipCode(), this.acctopenrequest.getIsStaff().toUpperCase(), this.acctopenrequest.getCountry().toUpperCase(), this.acctopenrequest.getProductCode(), this.acctopenrequest.getCustomerSignature(), this.acctopenrequest.getCustomerpix(), this.acctopenrequest.getCustomerIDScan(), this.acctopenrequest.getCustomerUtilScan(), this.acctopenrequest.getCustFingerPrintScan(), this.acctopenrequest.getLinkSignature(), this.acctopenrequest.getLinkcustomerpix(), this.acctopenrequest.getLinkcustomerIDScan(), this.acctopenrequest.getLinkcustomerUtilScan(), this.acctopenrequest.getCardType(), this.acctopenrequest.getInternetBankingSubscribe(), this.acctopenrequest.getUnionMobileSubscribe(), this.acctopenrequest.getNextOfKinMobileNo(), this.acctopenrequest.getRmCode(), this.acctopenrequest.getInitiatorID(), this.acctopenrequest.getVerifierID());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "openAccountGeneric")
	public AccountOpeningGenericResponse openAccountGeneric(@WebParam(name = "accountOpeningGenericRequest") AccountOpeningGenericRequest accountOpeningGenericRequest) {
		this.accountOpeningGenericRequests = accountOpeningGenericRequest;
		AccountOpeningGenericResponse response = null;
		ServiceProcessor serviceProcessor = null;
		try {
			response = new AccountOpeningGenericResponse();
			serviceProcessor = new ServiceProcessor();
			System.out.println("The Date From Service" + this.accountOpeningGenericRequests.getTitle());
			System.out.println("The Date From Service" + this.accountOpeningGenericRequests.getExpiryDate());
			System.out.println("The Date From Service" + this.accountOpeningGenericRequests.getDateOfBirth());
			response = serviceProcessor.OpenAccountGeneric(this.accountOpeningGenericRequests.getTitle(), this.accountOpeningGenericRequests.getFirstName().toUpperCase(), this.accountOpeningGenericRequests.getMiddleName(), this.accountOpeningGenericRequests.getLastName().toUpperCase(), this.accountOpeningGenericRequests.getDateOfBirth(), this.accountOpeningGenericRequests.getAddress().toUpperCase(), this.accountOpeningGenericRequests.getAddress2(), this.accountOpeningGenericRequests.getAddress3(), this.accountOpeningGenericRequests.getState().toUpperCase(), this.accountOpeningGenericRequests.getNationality().toUpperCase(), this.accountOpeningGenericRequests.getMotherMaidenName().toUpperCase(), this.accountOpeningGenericRequests.getTelephone(), this.accountOpeningGenericRequests.getTelephone2(), this.accountOpeningGenericRequests.getProfession().toUpperCase(), this.accountOpeningGenericRequests.getMaritaStatus().toUpperCase(), this.accountOpeningGenericRequests.getGender().toUpperCase(), this.accountOpeningGenericRequests.getEmail(), this.accountOpeningGenericRequests.getCustIdNo(), this.accountOpeningGenericRequests.getIssueDate().toUpperCase(), this.accountOpeningGenericRequests.getExpiryDate(), this.accountOpeningGenericRequests.getNextOfKin().toUpperCase(), this.accountOpeningGenericRequests.getRelatioship().toUpperCase(), this.accountOpeningGenericRequests.getBranch(), this.accountOpeningGenericRequests.getUniqueID(), this.accountOpeningGenericRequests.getAcctCategory().toUpperCase(), this.accountOpeningGenericRequests.getLanguage().toUpperCase(), this.accountOpeningGenericRequests.getTheCity().toUpperCase(), this.accountOpeningGenericRequests.getCountryOfResident().toUpperCase(), this.accountOpeningGenericRequests.getZipCode(), this.accountOpeningGenericRequests.getIsStaff().toUpperCase(), this.accountOpeningGenericRequests.getCountry().toUpperCase(), this.accountOpeningGenericRequests.getProductCode(), this.accountOpeningGenericRequests.getNextOfKinMobileNumber(), this.accountOpeningGenericRequests.isPnd(), this.accountOpeningGenericRequests.isSmsAlert(), this.accountOpeningGenericRequests.getRmCode(), this.accountOpeningGenericRequests.getInitiatorID(), this.accountOpeningGenericRequests.getVerifierID());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "closeStandingInstruction")
	public StandingInstructionCloseResponse closeStandingInstruction(@WebParam(name = "instrumentnumber") String instrumentnumber) {
		ServiceProcessorOF serviceProcessor = new ServiceProcessorOF();
		StandingInstructionCloseResponse response = new StandingInstructionCloseResponse();
		try {
			response = serviceProcessor.closeStandingInstructionOF(instrumentnumber);
		} catch (Exception e) {
			e.printStackTrace();
			response.setResponsecode("1");
			response.setResponsemessage("Instrument Number Received");
			response.setInstrno(instrumentnumber);
		}
		return response;
	}

	@WebMethod(operationName = "closeStandingInstructionn")
	public StandingInstructionCloseResponse closeStandingInstructionn(@WebParam(name = "closestandinginstructionrequest") CloseStandingInstructionRequest closestandinginstructionrequest) {
		ServiceProcessor serviceProcessor = new ServiceProcessor();
		StandingInstructionCloseResponse response = new StandingInstructionCloseResponse();
		response = serviceProcessor.closeStandingInstruction(closestandinginstructionrequest);
		return response;
	}

	@WebMethod(operationName = "createStandingInstructions")
	public CreateStandingInstructionResponse createStandingInstructions(@WebParam(name = "createstandinginstructionrequest") CreateStandingInstructionRequest createstandinginstructionrequest) {
		this.createstandinginstructionrequests = createstandinginstructionrequest;
		AestheticsUtil util = new AestheticsUtil();
		CreateStandingInstructionResponse response = new CreateStandingInstructionResponse();
		ServiceProcessorOF serviceProcessor = new ServiceProcessorOF();
		try {
			response = serviceProcessor.createStandingInstruction(createstandinginstructionrequest);
			System.out.println("Response successfully created!");
		} catch (Exception e) {
			e.printStackTrace();
			response.setInstrno("SI" + util.formatString(util.getCurrentTimeStamp().toString()).replaceAll("-", ""));
			response.setResponsecode("0");
			response.setResponsemessage("Standing Instruction Creation UnSuccessful");
		}
		return response;
	}

	@WebMethod(operationName = "transferAccountClass")
	public AccountClassTransferResponse transferAccountClass(@WebParam(name = "accountclasstransferrequest") AccountClassTransferRequest accountclasstransferrequest) {
		AccountClassTransferResponse response = new AccountClassTransferResponse();
		ServiceProcessor serviceProcessor = new ServiceProcessor();
		try {
			response = serviceProcessor.transferAccountClass(accountclasstransferrequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "openAccountWithExistingCustomerID")
	public AccountOpeningWithIDResponse openAccountWithExistingCustomerID(@WebParam(name = "accountOpeningWithIDRequest") AccountOpeningWithIDRequest accountOpeningWithIDRequests) {
		this.accountOpeningWithIDRequest = accountOpeningWithIDRequests;
		AccountOpeningWithIDResponse response = null;
		ServiceProcessor serviceProcessor = null;
		try {
			response = new AccountOpeningWithIDResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.OpenAccountWithExistingID(this.accountOpeningWithIDRequest.getTitle().toUpperCase(), this.accountOpeningWithIDRequest.getCustID(), this.accountOpeningWithIDRequest.getProductCode(), this.accountOpeningWithIDRequest.getLinkSignature(), this.accountOpeningWithIDRequest.getLinkcustomerpix(), this.accountOpeningWithIDRequest.getLinkcustomerIDScan(), this.accountOpeningWithIDRequest.getLinkcustomerUtilScan(), this.accountOpeningWithIDRequest.getCardType(), this.accountOpeningWithIDRequest.getInternetBankingSubscribe(), this.accountOpeningWithIDRequest.getUnionMobileSubscribe(), this.accountOpeningWithIDRequest.getCustID1(), this.accountOpeningWithIDRequest.getCustID2(), this.accountOpeningWithIDRequest.isPnd(), this.accountOpeningWithIDRequest.getRelationship1(), this.accountOpeningWithIDRequest.getRelationship2(), this.accountOpeningWithIDRequest.getRelationship3(), this.accountOpeningWithIDRequest.getBranchCode(), this.accountOpeningWithIDRequest.getDateOfBirth(), this.accountOpeningWithIDRequest.getRmCode(), this.accountOpeningWithIDRequest.getInitiatorID(), this.accountOpeningWithIDRequest.getVerifierID());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "createCustomerID")
	public CreateCustomerResponse createCustomerID(@WebParam(name = "createCustRequest") CreateCustomerRequest createCustRequest) {
		this.createcustomerrequest = createCustRequest;
		CreateCustomerResponse response = null;
		ServiceProcessor serviceProcessor = null;
		try {
			response = new CreateCustomerResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.createNewCustomer(this.createcustomerrequest.getTitle(), this.createcustomerrequest.getFirstName().toUpperCase(), this.createcustomerrequest.getMiddleName(), this.createcustomerrequest.getLastName().toUpperCase(), this.createcustomerrequest.getDateOfBirth(), this.createcustomerrequest.getAddress().toUpperCase(), this.createcustomerrequest.getAddress2(), this.createcustomerrequest.getAddress3(), this.createcustomerrequest.getAddress4(), this.createcustomerrequest.getState().toUpperCase(), this.createcustomerrequest.getNationality().toUpperCase(), this.createcustomerrequest.getMotherMaidenName().toUpperCase(), this.createcustomerrequest.getTelephone(), this.createcustomerrequest.getTelephone2(), this.createcustomerrequest.getProfession().toUpperCase(), this.createcustomerrequest.getMaritaStatus().toUpperCase(), this.createcustomerrequest.getGender().toUpperCase(), this.createcustomerrequest.getEmail().toUpperCase(), this.createcustomerrequest.getCustIdNo(), this.createcustomerrequest.getIssueDate(), this.createcustomerrequest.getExpiryDate(), this.createcustomerrequest.getNextOfKin().toUpperCase(), this.createcustomerrequest.getRelatioship().toUpperCase(), this.createcustomerrequest.getBranch(), this.createcustomerrequest.getUniqueID(), this.createcustomerrequest.getAcctCategory().toUpperCase(), this.createcustomerrequest.getLanguage().toUpperCase(), this.createcustomerrequest.getTheCity().toUpperCase(), this.createcustomerrequest.getCountryOfResident().toUpperCase(), this.createcustomerrequest.getZipCode(), this.createcustomerrequest.getIsStaff().toUpperCase(), this.createcustomerrequest.getCountry().toUpperCase(), this.createcustomerrequest.getProductCode(), this.createcustomerrequest.getNextOfKinMobileNumber(), this.createcustomerrequest.isSmsAlert(), this.createcustomerrequest.getRmCode(), this.createcustomerrequest.getInitiatorID(), this.createcustomerrequest.getVerifierID(), this.createcustomerrequest.getMisCode(), this.createcustomerrequest.getMisClass(), this.createcustomerrequest.getIntroducerTag());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "createCorpCustomerID")
	public CreateCorpCustomerResponse createCorpCustomerID(@WebParam(name = "createCorpRequest") CreateCorpCustomerRequest createCorpRequest) {
		this.createCorpCustomerRequest = createCorpRequest;
		CreateCorpCustomerResponse response = null;
		ServiceProcessor serviceProcessor = null;
		try {
			response = new CreateCorpCustomerResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.createNewCorpCustomer(this.createCorpCustomerRequest.getAcctName().toUpperCase(), this.createCorpCustomerRequest.getDateOfIncorp(), this.createCorpCustomerRequest.getAddress().toUpperCase(), this.createCorpCustomerRequest.getAddress2(), this.createCorpCustomerRequest.getAddress3(), this.createCorpCustomerRequest.getAddress4(), this.createCorpCustomerRequest.getState().toUpperCase(), this.createCorpCustomerRequest.getCountry().toUpperCase(), this.createCorpCustomerRequest.getTelephone(), this.createCorpCustomerRequest.getTelephone2(), this.createCorpCustomerRequest.getProfession().toUpperCase(), this.createCorpCustomerRequest.getEmail().toUpperCase(), this.createCorpCustomerRequest.getBranch(), this.createCorpCustomerRequest.getAcctCategory().toUpperCase(), this.createCorpCustomerRequest.getTheCity().toUpperCase(), this.createCorpCustomerRequest.getCountry().toUpperCase(), this.createCorpCustomerRequest.getProductCode(), this.createCorpCustomerRequest.getRegNumber(), this.createCorpCustomerRequest.getRmCode(), this.createCorpCustomerRequest.getInitiatorID(), this.createCorpCustomerRequest.getVerifierID(), this.createCorpCustomerRequest.getMisCode(), this.createCorpCustomerRequest.getMisClass(), this.createCorpCustomerRequest.getIntroducerTag());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "getStateList")
	public StateList[] getStateList() {
		StateList[] var = null;
		ServiceProcessor serviceProcessor = null;
		try {
			serviceProcessor = new ServiceProcessor();
			var = serviceProcessor.getStateList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return var;
	}

	@WebMethod(operationName = "getCountryList")
	public CountryList[] getCountryList() {
		CountryList[] var = null;
		ServiceProcessor serviceProcessor = null;
		try {
			serviceProcessor = new ServiceProcessor();
			var = serviceProcessor.getCountryList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return var;
	}

	@WebMethod(operationName = "updateInactiveState")
	public AccountMaintenanceResponse updateInactiveState(@WebParam(name = "acctNo") String acctNo, @WebParam(name = "statusMessage") String statusMessage) {
		ServiceProcessor serviceProcessor = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.upDateAcctStatus(acctNo, "3", statusMessage);
		} catch (Exception e) {
		}
		return response;
	}

	@WebMethod(operationName = "updateActiveStatus")
	public AccountMaintenanceResponse updateActiveStatus(@WebParam(name = "acctNo") String acctNo, @WebParam(name = "statusMessage") String statusMessage) {
		ServiceProcessor serviceProcessor = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.upDateAcctStatus(acctNo, "8", statusMessage);
		} catch (Exception e) {
		}
		return response;
	}

	@WebMethod(operationName = "updateAccountStatus")
	public AccountMaintenanceResponse updateAccountStatus(@WebParam(name = "acctNo") String acctNo, @WebParam(name = "statusCode") String statusCode, @WebParam(name = "statusMessage") String statusMessage) {
		ServiceProcessor serviceProcessor = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.upDateAcctStatus(acctNo, statusCode, statusMessage);
		} catch (Exception e) {
		}
		return response;
	}

	@WebMethod(operationName = "addCustIDToAccount")
	public AccountMaintenanceResponse addCustIDToAccount(@WebParam(name = "customerID") String customerID, @WebParam(name = "accountNo") String accountNo, @WebParam(name = "acctBal") String acctBal, @WebParam(name = "acctStatus") String acctStatus, @WebParam(name = "branchCode") String branchCode, @WebParam(name = "produstCode") String produstCode, @WebParam(name = "relationship") String relationship) {
		ServiceProcessor serviceProcessor = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.addCustIDToAccount(customerID, accountNo, acctBal, acctStatus, branchCode, produstCode, relationship);
		} catch (Exception e) {
		}
		return response;
	}

	@WebMethod(operationName = "deleteCustIDFromAccount")
	public AccountMaintenanceResponse deleteCustIDFromAccount(@WebParam(name = "customerID") String customerID, @WebParam(name = "accountNo") String accountNo) {
		ServiceProcessor serviceProcessor = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.removeCustIDFromAccount(customerID, accountNo);
		} catch (Exception e) {
		}
		return response;
	}

	@WebMethod(operationName = "changeCustDetailsOF")
	public AccountMaintenanceResponse changeCustDetails(
			@WebParam(name = "customerID") String customerID, 
			@WebParam(name = "newAccountName") String newAccountName, 
			@WebParam(name = "newFirstName") String newFirstName, 
			@WebParam(name = "newMiddleName") String newMiddleName, 
			@WebParam(name = "newLastName") String newLastName, 
			@WebParam(name = "newShortName") String newShortName, 
			@WebParam(name = "newCIC") String newCIC, 
			@WebParam(name = "newAddress1") String newAddress1, 
			@WebParam(name = "newAddress2") String newAddress2, 
			@WebParam(name = "newAddress3") String newAddress3, 
			@WebParam(name = "newCity") String newCity, 
			@WebParam(name = "newState") String newState, 
			@WebParam(name = "newMobileNumber") String newMobileNumber, 
			@WebParam(name = "newOfficePhoneLand") String newOfficePhoneLand, 
			@WebParam(name = "newLGA") String newLGA, 
			@WebParam(name = "newMaritalStatus") String newMaritalStatus, 
			@WebParam(name = "newNationality") String newNationality, 
			@WebParam(name = "newCountry") String newCountry, 
			@WebParam(name = "newCountryOfResidence") String newCountryOfResidence, 
			@WebParam(name = "originatingBr") String originatingBr
	) {
		ServiceProcessor serviceProcessor = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.changeCustName(
					customerID, newAccountName, newFirstName, newMiddleName, newLastName, 
					newShortName, newCIC, newAddress1, newAddress2, newAddress3, newCity, 
					newState, newMobileNumber, newOfficePhoneLand, newLGA, newMaritalStatus, 
					newNationality, newCountry, newCountryOfResidence
			);
		} catch (Exception e) {
		}
		return response;
	}

	@WebMethod(operationName = "changeCustAccountName")
	public AccountMaintenanceResponse changeCustAccountName(@WebParam(name = "accountNumber") String accountNumber, @WebParam(name = "customerNewName") String customerNewName, @WebParam(name = "customerNo") String customerNo) {
		ServiceProcessor serviceProcessor = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.changeCustAccountName(accountNumber, customerNewName);
		} catch (Exception e) {
		}
		return response;
	}

	@WebMethod(operationName = "changeEmailAddress")
	public AccountMaintenanceResponse changeEmailAddress(@WebParam(name = "customerID") String customerID, @WebParam(name = "customerNewEmail") String customerNewEmail) {
		ServiceProcessor serviceProcessor = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.changeEmailaddress(customerID, customerNewEmail);
		} catch (Exception e) {
		}
		return response;
	}

	@WebMethod(operationName = "deactivateSMSAlert")
	public AccountMaintenanceResponse deactivateSMSAlert(@WebParam(name = "customerID") String customerID) {
		ServiceProcessor serviceProcessor = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.deactivitateSMSAlert(customerID);
		} catch (Exception e) {
		}
		return response;
	}

	@WebMethod(operationName = "activateSMSAlert")
	public AccountMaintenanceResponse activateSMSAlert(@WebParam(name = "customerID") String customerID, @WebParam(name = "phoneNumber") String phoneNumber) {
		ServiceProcessor serviceProcessor = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.activitateSMSAlert(customerID, phoneNumber);
		} catch (Exception e) {
		}
		return response;
	}

	@WebMethod(operationName = "changePhoneNumber")
	public AccountMaintenanceResponse changePhoneNumber(@WebParam(name = "customerID") String customerID, @WebParam(name = "customerMobilePhone") String customerMobilePhone, @WebParam(name = "customerOfficePhone") String customerOfficePhone) {
		ServiceProcessor serviceProcessor = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.changePhoneNumber(customerID, customerMobilePhone, customerOfficePhone);
		} catch (Exception e) {
		}
		return response;
	}

	@WebMethod(operationName = "getExistingAcctDetails")
	public AcctDetailsResponse getExistingAcctDetails(@WebParam(name = "accounttNumber") String accounttNumber) {
		ServiceProcessor serviceProcessor = null;
		AcctDetailsResponse response = null;
		try {
			response = new AcctDetailsResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.getAcctDetails(accounttNumber);
			System.out.println("Response 222 " + response.getIsCurrent().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "getAcctRelationship")
	public CustomerRelationshipList[] getAcctRelationship(@WebParam(name = "accountNumber") String accountNumber) {
		CustomerRelationshipList[] var = null;
		ServiceProcessor serviceProcessor = null;
		try {
			serviceProcessor = new ServiceProcessor();
			var = serviceProcessor.getAccountRelationship(accountNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return var;
	}

	@WebMethod(operationName = "MT103Generation")
	public boolean MT103Generation(@WebParam(name = "fundsTransferOutwardReq") FundsTransferOutwardRequest fundsTransferOutwardReq) {
		this.fundsTransferOutwardRequest = fundsTransferOutwardReq;
		boolean result = false;
		ServiceProcessor serviceProcessor = null;
		try {
			serviceProcessor = new ServiceProcessor();
			result = serviceProcessor.MT103Outward(this.fundsTransferOutwardRequest.getReference_no(), this.fundsTransferOutwardRequest.getTransaction_amount(), this.fundsTransferOutwardRequest.getTransaction_date(), this.fundsTransferOutwardRequest.getCurrency(), this.fundsTransferOutwardRequest.getOrdering_customer(), this.fundsTransferOutwardRequest.getOrdering_customer_acct(), this.fundsTransferOutwardRequest.getOrdering_customer_address_line1(), this.fundsTransferOutwardRequest.getOrdering_customr_address_line2(), this.fundsTransferOutwardRequest.getBeneficiary_acct(), this.fundsTransferOutwardRequest.getBeneficiary_name(), this.fundsTransferOutwardRequest.getPayment_details(), this.fundsTransferOutwardRequest.getValue_date(), this.fundsTransferOutwardRequest.getRunning_no(), this.fundsTransferOutwardRequest.getIntermediary_bank(), this.fundsTransferOutwardRequest.getBeneficiary_bank(), this.fundsTransferOutwardRequest.getCharges_details(), this.fundsTransferOutwardRequest.getReceiver_Bic(), this.fundsTransferOutwardRequest.getP_field_59(), this.fundsTransferOutwardRequest.getP_fed_wire_ind(), this.fundsTransferOutwardRequest.getP_fed_wire_data());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@WebMethod(operationName = "MT103Display")
	public String MT103Display(@WebParam(name = "fundsTransferOutwardReq") FundsTransferOutwardRequest fundsTransferOutwardReq) {
		this.fundsTransferOutwardRequest = fundsTransferOutwardReq;
		String result = null;
		ServiceProcessor serviceProcessor = null;
		try {
			serviceProcessor = new ServiceProcessor();
			result = serviceProcessor.MT103Display(this.fundsTransferOutwardRequest.getReference_no(), this.fundsTransferOutwardRequest.getTransaction_amount(), this.fundsTransferOutwardRequest.getTransaction_date(), this.fundsTransferOutwardRequest.getCurrency(), this.fundsTransferOutwardRequest.getOrdering_customer(), this.fundsTransferOutwardRequest.getOrdering_customer_acct(), this.fundsTransferOutwardRequest.getOrdering_customer_address_line1(), this.fundsTransferOutwardRequest.getOrdering_customr_address_line2(), this.fundsTransferOutwardRequest.getBeneficiary_acct(), this.fundsTransferOutwardRequest.getBeneficiary_name(), this.fundsTransferOutwardRequest.getPayment_details(), this.fundsTransferOutwardRequest.getValue_date(), this.fundsTransferOutwardRequest.getRunning_no(), this.fundsTransferOutwardRequest.getIntermediary_bank(), this.fundsTransferOutwardRequest.getBeneficiary_bank(), this.fundsTransferOutwardRequest.getCharges_details(), this.fundsTransferOutwardRequest.getReceiver_Bic(), this.fundsTransferOutwardRequest.getP_field_59(), this.fundsTransferOutwardRequest.getP_fed_wire_ind(), this.fundsTransferOutwardRequest.getP_fed_wire_data());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@WebMethod(operationName = "BookTDCreate")
	public TDBookingResponse BookTDCreate(@WebParam(name = "tDBookingCreate") TDBookingCreation tDBookingCreate) {
		this.tdBookingCreation = tDBookingCreate;
		ServiceProcessor serviceProcessor = null;
		TDBookingResponse response = null;
		try {
			response = new TDBookingResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.BookAndCreateDeposit(this.tdBookingCreation);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "BookCreateTD")
	public TDBookingResponse BookCreateTD(@WebParam(name = "TDBookingCreation") TDBookingCreation TDBookingCreate) {
		this.tdBookingCreation = TDBookingCreate;
		ServiceProcessor serviceProcessor = null;
		TDBookingResponse response = null;
		try {
			response = new TDBookingResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.BookAndCreateDeposit(this.tdBookingCreation);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "getTDDetailWithAccountNumber")
	public TDDetails[] getTDDetailWithAccountNumber(@WebParam(name = "accountNumber") String accountNumber, @WebParam(name = "customerID") String customerID) {
		TDDetails[] var = null;
		ServiceProcessor serviceProcessor = null;
		try {
			serviceProcessor = new ServiceProcessor();
			var = serviceProcessor.getTDDetailsWithAccountNumber(accountNumber, customerID);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return var;
	}

	@WebMethod(operationName = "getTDDetailWithCustID")
	public TDDetails[] getTDDetailWithCustID(@WebParam(name = "custId") String custId) {
		TDDetails[] var = null;
		ServiceProcessor serviceProcessor = null;
		try {
			serviceProcessor = new ServiceProcessor();
			var = serviceProcessor.getTDDetailsWithCustID(custId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return var;
	}

	@WebMethod(operationName = "getTDDetailWithRefNo")
	public TDDetails[] getTDDetailWithRefNo(@WebParam(name = "refNo") String refNo) {
		TDDetails[] var = null;
		ServiceProcessor serviceProcessor = null;
		try {
			serviceProcessor = new ServiceProcessor();
			var = serviceProcessor.getTDDetailsWithRefNo(refNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return var;
	}

	@WebMethod(operationName = "TDClosure")
	public TDLiquidationResponse TDClosure(@WebParam(name = "tdLiquidationReq") TDLiquidationRequest tdLiquidationReq) {
		this.tdLiquidationRequest = tdLiquidationReq;
		TDLiquidationResponse response = null;
		ServiceProcessor serviceProcessor = null;
		try {
			response = new TDLiquidationResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.TDPreClosure(this.tdLiquidationRequest.getFccref(), this.tdLiquidationRequest.getPenaltyOption(), this.tdLiquidationRequest.getPrepaymentpenaltyamount());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "getFloatRate")
	public FloatRateResponse getFloatRate(@WebParam(name = "tdFloatRateRequest") FloatRateRequest tdFloatRateRequest) {
		System.out.println("tdFloatRateRequest.getFromDate()======" + tdFloatRateRequest.getFromDate());
		this.tfloatRateRequest = tdFloatRateRequest;
		ServiceProcessor serviceProcessor = null;
		FloatRateResponse response = null;
		try {
			response = new FloatRateResponse();
			serviceProcessor = new ServiceProcessor();
			response = serviceProcessor.getFloatRate(this.tfloatRateRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "closeAccount")
	public AccountCloseResponse closeAccount(@WebParam(name = "accountcloserequest") AccountCloseRequest accountcloserequest) {
		this.acctcloserequest = accountcloserequest;
		AccountCloseResponse response = null;
		ServiceProcessor serviceProcessor = null;
		try {
			response = new AccountCloseResponse();
			serviceProcessor = new ServiceProcessor();
			System.out.println("AccountNumber: " + this.acctcloserequest.getAccountNumber());
			System.out.println("CustomerNumber: " + this.acctcloserequest.getCustomerNumber());
			System.out.println("CCLS: " + this.acctcloserequest.getACCLS());
			System.out.println("CCY: " + this.acctcloserequest.getCCY());
			System.out.println("BranchCode: " + this.acctcloserequest.getBranchCode());
			response = serviceProcessor.CloseAccount(this.acctcloserequest.getAccountNumber(), this.acctcloserequest.getCustomerNumber(), this.acctcloserequest.getACCLS(), this.acctcloserequest.getCCY(), this.acctcloserequest.getBranchCode(), this.acctcloserequest.getUserID());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "reactivateAccount")
	public AccountReactivationResponse reactivateAccount(@WebParam(name = "reactivateacctrequest") AccountReactivationRequest reactivateacctrequest) {
		AccountReactivationResponse response = new AccountReactivationResponse();
		ServiceProcessor serviceProcessor = new ServiceProcessor();
		try {
			response = serviceProcessor.reactivateAcct(reactivateacctrequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "reopenAccount")
	public AccountReopeningResponse reopenAccount(@WebParam(name = "reopenacctrequest") AccountReopeningRequest reopenacctrequest) {
		AccountReopeningResponse response = new AccountReopeningResponse();
		ServiceProcessor serviceProcessor = new ServiceProcessor();
		response = serviceProcessor.reopenAccount(reopenacctrequest);
		return response;
	}

	@WebMethod(operationName = "restrictAccount")
	public AccountRestrictionResponse restrictAccount(@WebParam(name = "restrictacctrequest") AccountRestrictionRequest restrictacctrequest) {
		AccountRestrictionResponse response = new AccountRestrictionResponse();
		ServiceProcessor serviceProcessor = new ServiceProcessor();
		try {
			response = serviceProcessor.restrictAcct(restrictacctrequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@WebMethod(operationName = "updateBVNRecord")
	public UpdateBVNResponse updateBVNRecord(@WebParam(name = "updatebvnrequest") UpdateBVNRequest updatebvnrequest) {
		this.updatebvnrequests = updatebvnrequest;
		UpdateBVNResponse response = new UpdateBVNResponse();
		ServiceProcessor serviceProcessor = new ServiceProcessor();
		response = serviceProcessor.updateBVNRecord(updatebvnrequest);
		return response;
	}

	@WebMethod(operationName = "fetchBVNRecord")
	public FetchBVNResponse fetchBVNRecord(@WebParam(name = "fetchbvnrequest") FetchBVNRequest fetchbvnrequest) {
		FetchBVNResponse response = new FetchBVNResponse();
		List<BVNRecords> recordlist = new ArrayList();
		BVNRecords records = new BVNRecords();
		records.setAccountno(fetchbvnrequest.getAccountno());
		recordlist.add(records);
		response.setBvnlist(recordlist);
		return response;
	}

	@WebMethod(operationName = "createAccountMemos")
	public CreateAccountMemoResponse createAccountMemos(@WebParam(name = "createAccountMemoRequest") CreateAccountMemoRequest createAccountMemoRequest) {
		this.createAccountMemoRequests = createAccountMemoRequest;
		CreateAccountMemoResponse response = new CreateAccountMemoResponse();
		ServiceProcessor serviceProcessor = new ServiceProcessor();
		try {
			serviceProcessor.createAccountMemo(createAccountMemoRequest);
		} catch (Exception e) {
			e.printStackTrace();
			response.setResponsecode("1");
			response.setResponsemessage("Memo Creation Failed");
		}
		return response;
	}

	@WebMethod(operationName = "getTDDetailsWithArrayOfAccountNumbers")
	public TDDetails[] getTDDetailsWithArrayOfAccountNumbers(@WebParam(name = "accountNumberArray") List<String> accountNumberArray) {
		TDDetails[] var = null;
		ServiceProcessor serviceProcessor = null;
		try {
			serviceProcessor = new ServiceProcessor();
			var = serviceProcessor.getTDDetailsWithArrayOfAccountNumbers(accountNumberArray);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return var;
	}

	@WebMethod(operationName = "getStandingInstructionOF")
	public List<StandingInstructionDetailsResponse> getStandingInstructionOF(@WebParam(name = "accountNumber") String accNo) {
		List<StandingInstructionDetailsResponse> var = null;
		ServiceProcessorOF serviceProcessor = null;
		try {
			serviceProcessor = new ServiceProcessorOF();
			var = serviceProcessor.getStandingInstructionOF(accNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return var;
	}
	
	@WebMethod(operationName = "changeCustDetails")
	public AccountMaintenanceResponse changeCustDetailsOF(@WebParam(name = "changeCustDetailsRequest")changeCustDetailsOFRequest changeCustDetailsRequest) {
		ServiceProcessorOF serviceProcessor = null;
		AccountMaintenanceResponse response = null;
		try {
			response = new AccountMaintenanceResponse();
			serviceProcessor = new ServiceProcessorOF();
			response = serviceProcessor.changeCustNameOF(changeCustDetailsRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
	@WebMethod(operationName = "reactivateAccountOF")
	public AccountReactivationResponse reactivateAccountOF(@WebParam(name = "reactivateacctrequest") AccountReactivationRequest reactivateacctrequest) {
		AccountReactivationResponse response = new AccountReactivationResponse();
		ServiceProcessorOF serviceProcessor = new ServiceProcessorOF();
		try {
			response = serviceProcessor.reactivateAcctOF(reactivateacctrequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

//	 public static void main(String[] args) {
//		 AccountOpenService ss = new AccountOpenService();
//		 List<StandingInstructionDetailsResponse> s = ss.getStandingInstruction("0047819468");
//		 System.out.println(s);
//		 
//	 }
}

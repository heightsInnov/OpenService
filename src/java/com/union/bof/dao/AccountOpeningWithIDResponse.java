package com.union.bof.dao;

public class AccountOpeningWithIDResponse {

    private String accountNumber;
    private String responseCode;
    private String responseMessage;
    private String customerID;

    /**
     * @return the referenceNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param referenceNumber the referenceNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the responseCode
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * @param responseCode the responseCode to set
     */
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * @return the responseMessage
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * @param responseMessage the responseMessage to set
     */
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

}

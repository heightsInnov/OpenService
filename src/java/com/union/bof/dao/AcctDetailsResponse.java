package com.union.bof.dao;

import java.io.Serializable;

public class AcctDetailsResponse implements Serializable{
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String custID;
    private String fullName;
    private String isCurrent;
    private String emailAddress;
    private String custPhone;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the isCurrent
     */
    public String getIsCurrent() {
        return isCurrent;
    }

    /**
     * @param isCurrent the isCurrent to set
     */
    public void setIsCurrent(String isCurrent) {
        this.isCurrent = isCurrent;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the custPhone
     */
    public String getCustPhone() {
        return custPhone;
    }

    /**
     * @param custPhone the custPhone to set
     */
    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

}

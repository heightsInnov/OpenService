package com.union.bof.dao;

import java.io.Serializable;

public class AccountOpeningRequest implements Serializable{
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dateOfBirth;
    private String address;
    private String address2;
    private String address3;
    private String address4;
    private String state;
    private String nationality;
    private String motherMaidenName;
    private String telephone;
    private String telephone2;
    private String profession;
    private String maritaStatus;
    private String gender;
    private String email;
    private String custID;
    private String custIdNo;
    private String issueDate;
    private String expiryDate;
    private String nextOfKin;
    private String relatioship;
    private String branch;
    private String uniqueID;
    private String acctCategory;
    private String language;
    private String theCity;
    private String countryOfResident;
    private String zipCode;
    private String isStaff;
    private String country;
    private String productCode;
    private byte[] customerSignature;//=new byte[4096];
    private byte[] customerpix;//=new byte[4096];
    private byte[] customerIDScan;//=new byte[4096];
    private byte[] customerUtilScan;//=new byte[4096];
    private byte[] custFingerPrintScan;//=new byte[4096];
    private String linkSignature;
    private String linkcustomerpix;
    private String linkcustomerIDScan;
    private String linkcustomerUtilScan;
    private String cardType;
    private String internetBankingSubscribe;
    private String unionMobileSubscribe;
    private String nextOfKinMobileNo;
    private String rmCode; private String initiatorID;
    private String verifierID;

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
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @return the address3
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * @param address3 the address3 to set
     */
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return the motherMaidenName
     */
    public String getMotherMaidenName() {
        return motherMaidenName;
    }

    /**
     * @param motherMaidenName the motherMaidenName to set
     */
    public void setMotherMaidenName(String motherMaidenName) {
        this.motherMaidenName = motherMaidenName;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the telephone2
     */
    public String getTelephone2() {
        return telephone2;
    }

    /**
     * @param telephone2 the telephone2 to set
     */
    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    /**
     * @return the profession
     */
    public String getProfession() {
        return profession;
    }

    /**
     * @param profession the profession to set
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * @return the maritaStatus
     */
    public String getMaritaStatus() {
        return maritaStatus;
    }

    /**
     * @param maritaStatus the maritaStatus to set
     */
    public void setMaritaStatus(String maritaStatus) {
        this.maritaStatus = maritaStatus;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return the custIdNo
     */
    public String getCustIdNo() {
        return custIdNo;
    }

    /**
     * @param custIdNo the custIdNo to set
     */
    public void setCustIdNo(String custIdNo) {
        this.custIdNo = custIdNo;
    }

    /**
     * @return the issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @return the expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the expiryDate to set
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return the nextOfKin
     */
    public String getNextOfKin() {
        return nextOfKin;
    }

    /**
     * @param nextOfKin the nextOfKin to set
     */
    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    /**
     * @return the relatioship
     */
    public String getRelatioship() {
        return relatioship;
    }

    /**
     * @param relatioship the relatioship to set
     */
    public void setRelatioship(String relatioship) {
        this.relatioship = relatioship;
    }

    /**
     * @return the branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * @return the uniqueID
     */
    public String getUniqueID() {
        return uniqueID;
    }

    /**
     * @param uniqueID the uniqueID to set
     */
    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    /**
     * @return the acctCategory
     */
    public String getAcctCategory() {
        return acctCategory;
    }

    /**
     * @param acctCategory the acctCategory to set
     */
    public void setAcctCategory(String acctCategory) {
        this.acctCategory = acctCategory;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the theCity
     */
    public String getTheCity() {
        return theCity;
    }

    /**
     * @param theCity the theCity to set
     */
    public void setTheCity(String theCity) {
        this.theCity = theCity;
    }

    /**
     * @return the countryOfResident
     */
    public String getCountryOfResident() {
        return countryOfResident;
    }

    /**
     * @param countryOfResident the countryOfResident to set
     */
    public void setCountryOfResident(String countryOfResident) {
        this.countryOfResident = countryOfResident;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the isStaff
     */
    public String getIsStaff() {
        return isStaff;
    }

    /**
     * @param isStaff the isStaff to set
     */
    public void setIsStaff(String isStaff) {
        this.isStaff = isStaff;
    }

    /**
     * @return the customerSignature
     */
    public byte[] getCustomerSignature() {
        return customerSignature;
    }

    /**
     * @param customerSignature the customerSignature to set
     */
    public void setCustomerSignature(byte[] customerSignature) {
        this.customerSignature = customerSignature;
    }

    /**
     * @return the customerpix
     */
    public byte[] getCustomerpix() {
        return customerpix;
    }

    /**
     * @param customerpix the customerpix to set
     */
    public void setCustomerpix(byte[] customerpix) {
        this.customerpix = customerpix;
    }

    /**
     * @return the customerIDScan
     */
    public byte[] getCustomerIDScan() {
        return customerIDScan;
    }

    /**
     * @param customerIDScan the customerIDScan to set
     */
    public void setCustomerIDScan(byte[] customerIDScan) {
        this.customerIDScan = customerIDScan;
    }

    /**
     * @return the customerUtilScan
     */
    public byte[] getCustomerUtilScan() {
        return customerUtilScan;
    }

    /**
     * @param customerUtilScan the customerUtilScan to set
     */
    public void setCustomerUtilScan(byte[] customerUtilScan) {
        this.customerUtilScan = customerUtilScan;
    }

    /**
     * @return the custFingerPrintScan
     */
    public byte[] getCustFingerPrintScan() {
        return custFingerPrintScan;
    }

    /**
     * @param custFingerPrintScan the custFingerPrintScan to set
     */
    public void setCustFingerPrintScan(byte[] custFingerPrintScan) {
        this.custFingerPrintScan = custFingerPrintScan;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the productCode
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * @return the linkSignature
     */
    public String getLinkSignature() {
        return linkSignature;
    }

    /**
     * @param linkSignature the linkSignature to set
     */
    public void setLinkSignature(String linkSignature) {
        this.linkSignature = linkSignature;
    }

    /**
     * @return the linkcustomerpix
     */
    public String getLinkcustomerpix() {
        return linkcustomerpix;
    }

    /**
     * @param linkcustomerpix the linkcustomerpix to set
     */
    public void setLinkcustomerpix(String linkcustomerpix) {
        this.linkcustomerpix = linkcustomerpix;
    }

    /**
     * @return the linkcustomerIDScan
     */
    public String getLinkcustomerIDScan() {
        return linkcustomerIDScan;
    }

    /**
     * @param linkcustomerIDScan the linkcustomerIDScan to set
     */
    public void setLinkcustomerIDScan(String linkcustomerIDScan) {
        this.linkcustomerIDScan = linkcustomerIDScan;
    }

    /**
     * @return the linkcustomerUtilScan
     */
    public String getLinkcustomerUtilScan() {
        return linkcustomerUtilScan;
    }

    /**
     * @param linkcustomerUtilScan the linkcustomerUtilScan to set
     */
    public void setLinkcustomerUtilScan(String linkcustomerUtilScan) {
        this.linkcustomerUtilScan = linkcustomerUtilScan;
    }

    /**
     * @return the cardType
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * @param cardType the cardType to set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * @return the internetBankingSubscribe
     */
    public String getInternetBankingSubscribe() {
        return internetBankingSubscribe;
    }

    /**
     * @param internetBankingSubscribe the internetBankingSubscribe to set
     */
    public void setInternetBankingSubscribe(String internetBankingSubscribe) {
        this.internetBankingSubscribe = internetBankingSubscribe;
    }

    /**
     * @return the unionMobileSubscribe
     */
    public String getUnionMobileSubscribe() {
        return unionMobileSubscribe;
    }

    /**
     * @param unionMobileSubscribe the unionMobileSubscribe to set
     */
    public void setUnionMobileSubscribe(String unionMobileSubscribe) {
        this.unionMobileSubscribe = unionMobileSubscribe;
    }

    /**
     * @return the nextOfKinMobileNo
     */
    public String getNextOfKinMobileNo() {
        return nextOfKinMobileNo;
    }

    /**
     * @param nextOfKinMobileNo the nextOfKinMobileNo to set
     */
    public void setNextOfKinMobileNo(String nextOfKinMobileNo) {
        this.nextOfKinMobileNo = nextOfKinMobileNo;
    }

    /**
     * @return the rmCode
     */
    public String getRmCode() {
        return rmCode;
    }

    /**
     * @param rmCode the rmCode to set
     */
    public void setRmCode(String rmCode) {
        this.rmCode = rmCode;
    }

    /**
     * @return the initiatorID
     */
    public String getInitiatorID() {
        return initiatorID;
    }

    /**
     * @param initiatorID the initiatorID to set
     */
    public void setInitiatorID(String initiatorID) {
        this.initiatorID = initiatorID;
    }

    /**
     * @return the verifierID
     */
    public String getVerifierID() {
        return verifierID;
    }

    /**
     * @param verifierID the verifierID to set
     */
    public void setVerifierID(String verifierID) {
        this.verifierID = verifierID;
    }

    /**
     * @return the address4
     */
    public String getAddress4() {
        return address4;
    }

    /**
     * @param address4 the address4 to set
     */
    public void setAddress4(String address4) {
        this.address4 = address4;
    }
}

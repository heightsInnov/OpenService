
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustAccBalance-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustAccBalance-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNTCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LINKED_ENTITY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LINKED_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CASATYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPOSITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NO_OF_TRNS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Account-Details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUSTACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACSTATDORMANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACSTATNODR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACSTATNOCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACSTATFROZEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LINEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACYCURRBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACYAVLBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DISUNUTLAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DISTOTAVLAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACYUNCOLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACYBLKAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TODLIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SUBLIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UNCOLLFUNDSLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACYACCRDRIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACYACCRCRIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="JOINTACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="JNTHLDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NET_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="SWP_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Td-Accounts" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUSTACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AC_OPEN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="INITDEPAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="PRINCBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CURRBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DEPSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="JNTHLDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SWP_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Td-Details" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUSTACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DEPTENYEARS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DEPTENMNTHS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DEPTENDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ORGTENYEARS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ORGTENMNTHS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ORGTENDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="TOTTOPUPAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NOOFTOPUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MATURITYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="INTRATECUMAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INTRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="LASTACCRDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="INTACCRTILLDT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="NEXTACCRDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="LASTLIQDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="BOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INTLIQTILLDT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="NEXTLIQDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="TAXRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="TAXCOLLTILLDT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="AMOUNT_BLOCK" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AC_OPEN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="INITDEPAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="PRINCBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CURRBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DEPSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="JNTHLDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MADTE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Tdamtblockmain" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Tdamtblock" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HOLDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMTBLOCKNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="EFFECTIVEDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="EXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="AMTBLOCKTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HOLDCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustAccBalance-Full-Type", propOrder = {
    "custacno",
    "ccy",
    "accountclass",
    "custno",
    "accdesc",
    "linkedentity1",
    "linkedaccount",
    "custname1",
    "casatype",
    "deposits",
    "nooftrns",
    "accountDetails",
    "tdAccounts",
    "tdDetails",
    "tdamtblockmain",
    "tdamtblock"
})
public class CustAccBalanceFullType {

    @XmlElement(name = "CUSTACNO")
    protected String custacno;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "ACCOUNTCLASS")
    protected String accountclass;
    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "ACC_DESC")
    protected String accdesc;
    @XmlElement(name = "LINKED_ENTITY1")
    protected String linkedentity1;
    @XmlElement(name = "LINKED_ACCOUNT")
    protected String linkedaccount;
    @XmlElement(name = "CUSTNAME1")
    protected String custname1;
    @XmlElement(name = "CASATYPE")
    protected String casatype;
    @XmlElement(name = "DEPOSITS")
    protected String deposits;
    @XmlElement(name = "NO_OF_TRNS")
    protected BigDecimal nooftrns;
    @XmlElement(name = "Account-Details")
    protected List<CustAccBalanceFullType.AccountDetails> accountDetails;
    @XmlElement(name = "Td-Accounts")
    protected List<CustAccBalanceFullType.TdAccounts> tdAccounts;
    @XmlElement(name = "Td-Details")
    protected CustAccBalanceFullType.TdDetails tdDetails;
    @XmlElement(name = "Tdamtblockmain")
    protected CustAccBalanceFullType.Tdamtblockmain tdamtblockmain;
    @XmlElement(name = "Tdamtblock")
    protected List<CustAccBalanceFullType.Tdamtblock> tdamtblock;

    /**
     * Gets the value of the custacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTACNO() {
        return custacno;
    }

    /**
     * Sets the value of the custacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTACNO(String value) {
        this.custacno = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCY() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCY(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the accountclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTCLASS() {
        return accountclass;
    }

    /**
     * Sets the value of the accountclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTCLASS(String value) {
        this.accountclass = value;
    }

    /**
     * Gets the value of the custno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNO() {
        return custno;
    }

    /**
     * Sets the value of the custno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNO(String value) {
        this.custno = value;
    }

    /**
     * Gets the value of the accdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCDESC() {
        return accdesc;
    }

    /**
     * Sets the value of the accdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCDESC(String value) {
        this.accdesc = value;
    }

    /**
     * Gets the value of the linkedentity1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKEDENTITY1() {
        return linkedentity1;
    }

    /**
     * Sets the value of the linkedentity1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKEDENTITY1(String value) {
        this.linkedentity1 = value;
    }

    /**
     * Gets the value of the linkedaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKEDACCOUNT() {
        return linkedaccount;
    }

    /**
     * Sets the value of the linkedaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKEDACCOUNT(String value) {
        this.linkedaccount = value;
    }

    /**
     * Gets the value of the custname1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNAME1() {
        return custname1;
    }

    /**
     * Sets the value of the custname1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNAME1(String value) {
        this.custname1 = value;
    }

    /**
     * Gets the value of the casatype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASATYPE() {
        return casatype;
    }

    /**
     * Sets the value of the casatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASATYPE(String value) {
        this.casatype = value;
    }

    /**
     * Gets the value of the deposits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPOSITS() {
        return deposits;
    }

    /**
     * Sets the value of the deposits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPOSITS(String value) {
        this.deposits = value;
    }

    /**
     * Gets the value of the nooftrns property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNOOFTRNS() {
        return nooftrns;
    }

    /**
     * Sets the value of the nooftrns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNOOFTRNS(BigDecimal value) {
        this.nooftrns = value;
    }

    /**
     * Gets the value of the accountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustAccBalanceFullType.AccountDetails }
     * 
     * 
     */
    public List<CustAccBalanceFullType.AccountDetails> getAccountDetails() {
        if (accountDetails == null) {
            accountDetails = new ArrayList<CustAccBalanceFullType.AccountDetails>();
        }
        return this.accountDetails;
    }

    /**
     * Gets the value of the tdAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTdAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustAccBalanceFullType.TdAccounts }
     * 
     * 
     */
    public List<CustAccBalanceFullType.TdAccounts> getTdAccounts() {
        if (tdAccounts == null) {
            tdAccounts = new ArrayList<CustAccBalanceFullType.TdAccounts>();
        }
        return this.tdAccounts;
    }

    /**
     * Gets the value of the tdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccBalanceFullType.TdDetails }
     *     
     */
    public CustAccBalanceFullType.TdDetails getTdDetails() {
        return tdDetails;
    }

    /**
     * Sets the value of the tdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccBalanceFullType.TdDetails }
     *     
     */
    public void setTdDetails(CustAccBalanceFullType.TdDetails value) {
        this.tdDetails = value;
    }

    /**
     * Gets the value of the tdamtblockmain property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccBalanceFullType.Tdamtblockmain }
     *     
     */
    public CustAccBalanceFullType.Tdamtblockmain getTdamtblockmain() {
        return tdamtblockmain;
    }

    /**
     * Sets the value of the tdamtblockmain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccBalanceFullType.Tdamtblockmain }
     *     
     */
    public void setTdamtblockmain(CustAccBalanceFullType.Tdamtblockmain value) {
        this.tdamtblockmain = value;
    }

    /**
     * Gets the value of the tdamtblock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdamtblock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTdamtblock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustAccBalanceFullType.Tdamtblock }
     * 
     * 
     */
    public List<CustAccBalanceFullType.Tdamtblock> getTdamtblock() {
        if (tdamtblock == null) {
            tdamtblock = new ArrayList<CustAccBalanceFullType.Tdamtblock>();
        }
        return this.tdamtblock;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CUSTACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACSTATDORMANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACSTATNODR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACSTATNOCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACSTATFROZEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LINEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACYCURRBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACYAVLBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DISUNUTLAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DISTOTAVLAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACYUNCOLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACYBLKAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TODLIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SUBLIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UNCOLLFUNDSLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACYACCRDRIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACYACCRCRIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="JOINTACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="JNTHLDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NET_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="SWP_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "custacno",
        "acstatdormant",
        "ccy",
        "acstatnodr",
        "acstatnocr",
        "acstatfrozen",
        "lineid",
        "acycurrbal",
        "acyavlbal",
        "disunutlamt",
        "distotavlamt",
        "acyuncoll",
        "acyblkamt",
        "todlimit",
        "sublimit",
        "uncollfundslm",
        "acyaccrdric",
        "acyaccrcric",
        "acctype",
        "accstat",
        "acdesc",
        "acclass",
        "jointacctype",
        "jnthldtyp",
        "netbal",
        "swpin"
    })
    public static class AccountDetails {

        @XmlElement(name = "CUSTACNO")
        protected String custacno;
        @XmlElement(name = "ACSTATDORMANT")
        protected String acstatdormant;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "ACSTATNODR")
        protected String acstatnodr;
        @XmlElement(name = "ACSTATNOCR")
        protected String acstatnocr;
        @XmlElement(name = "ACSTATFROZEN")
        protected String acstatfrozen;
        @XmlElement(name = "LINEID")
        protected String lineid;
        @XmlElement(name = "ACYCURRBAL")
        protected String acycurrbal;
        @XmlElement(name = "ACYAVLBAL")
        protected String acyavlbal;
        @XmlElement(name = "DISUNUTLAMT")
        protected String disunutlamt;
        @XmlElement(name = "DISTOTAVLAMT")
        protected String distotavlamt;
        @XmlElement(name = "ACYUNCOLL")
        protected String acyuncoll;
        @XmlElement(name = "ACYBLKAMT")
        protected String acyblkamt;
        @XmlElement(name = "TODLIMIT")
        protected String todlimit;
        @XmlElement(name = "SUBLIMIT")
        protected String sublimit;
        @XmlElement(name = "UNCOLLFUNDSLM")
        protected String uncollfundslm;
        @XmlElement(name = "ACYACCRDRIC")
        protected String acyaccrdric;
        @XmlElement(name = "ACYACCRCRIC")
        protected String acyaccrcric;
        @XmlElement(name = "ACCTYPE")
        protected String acctype;
        @XmlElement(name = "ACCSTAT")
        protected String accstat;
        @XmlElement(name = "ACDESC")
        protected String acdesc;
        @XmlElement(name = "ACCLASS")
        protected String acclass;
        @XmlElement(name = "JOINTACCTYPE")
        protected String jointacctype;
        @XmlElement(name = "JNTHLDTYP")
        protected String jnthldtyp;
        @XmlElement(name = "NET_BAL")
        protected BigDecimal netbal;
        @XmlElement(name = "SWP_IN")
        protected String swpin;

        /**
         * Gets the value of the custacno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTACNO() {
            return custacno;
        }

        /**
         * Sets the value of the custacno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTACNO(String value) {
            this.custacno = value;
        }

        /**
         * Gets the value of the acstatdormant property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACSTATDORMANT() {
            return acstatdormant;
        }

        /**
         * Sets the value of the acstatdormant property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACSTATDORMANT(String value) {
            this.acstatdormant = value;
        }

        /**
         * Gets the value of the ccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCY() {
            return ccy;
        }

        /**
         * Sets the value of the ccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCY(String value) {
            this.ccy = value;
        }

        /**
         * Gets the value of the acstatnodr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACSTATNODR() {
            return acstatnodr;
        }

        /**
         * Sets the value of the acstatnodr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACSTATNODR(String value) {
            this.acstatnodr = value;
        }

        /**
         * Gets the value of the acstatnocr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACSTATNOCR() {
            return acstatnocr;
        }

        /**
         * Sets the value of the acstatnocr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACSTATNOCR(String value) {
            this.acstatnocr = value;
        }

        /**
         * Gets the value of the acstatfrozen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACSTATFROZEN() {
            return acstatfrozen;
        }

        /**
         * Sets the value of the acstatfrozen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACSTATFROZEN(String value) {
            this.acstatfrozen = value;
        }

        /**
         * Gets the value of the lineid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINEID() {
            return lineid;
        }

        /**
         * Sets the value of the lineid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINEID(String value) {
            this.lineid = value;
        }

        /**
         * Gets the value of the acycurrbal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACYCURRBAL() {
            return acycurrbal;
        }

        /**
         * Sets the value of the acycurrbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACYCURRBAL(String value) {
            this.acycurrbal = value;
        }

        /**
         * Gets the value of the acyavlbal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACYAVLBAL() {
            return acyavlbal;
        }

        /**
         * Sets the value of the acyavlbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACYAVLBAL(String value) {
            this.acyavlbal = value;
        }

        /**
         * Gets the value of the disunutlamt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISUNUTLAMT() {
            return disunutlamt;
        }

        /**
         * Sets the value of the disunutlamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISUNUTLAMT(String value) {
            this.disunutlamt = value;
        }

        /**
         * Gets the value of the distotavlamt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISTOTAVLAMT() {
            return distotavlamt;
        }

        /**
         * Sets the value of the distotavlamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISTOTAVLAMT(String value) {
            this.distotavlamt = value;
        }

        /**
         * Gets the value of the acyuncoll property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACYUNCOLL() {
            return acyuncoll;
        }

        /**
         * Sets the value of the acyuncoll property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACYUNCOLL(String value) {
            this.acyuncoll = value;
        }

        /**
         * Gets the value of the acyblkamt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACYBLKAMT() {
            return acyblkamt;
        }

        /**
         * Sets the value of the acyblkamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACYBLKAMT(String value) {
            this.acyblkamt = value;
        }

        /**
         * Gets the value of the todlimit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTODLIMIT() {
            return todlimit;
        }

        /**
         * Sets the value of the todlimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTODLIMIT(String value) {
            this.todlimit = value;
        }

        /**
         * Gets the value of the sublimit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUBLIMIT() {
            return sublimit;
        }

        /**
         * Sets the value of the sublimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUBLIMIT(String value) {
            this.sublimit = value;
        }

        /**
         * Gets the value of the uncollfundslm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUNCOLLFUNDSLM() {
            return uncollfundslm;
        }

        /**
         * Sets the value of the uncollfundslm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUNCOLLFUNDSLM(String value) {
            this.uncollfundslm = value;
        }

        /**
         * Gets the value of the acyaccrdric property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACYACCRDRIC() {
            return acyaccrdric;
        }

        /**
         * Sets the value of the acyaccrdric property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACYACCRDRIC(String value) {
            this.acyaccrdric = value;
        }

        /**
         * Gets the value of the acyaccrcric property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACYACCRCRIC() {
            return acyaccrcric;
        }

        /**
         * Sets the value of the acyaccrcric property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACYACCRCRIC(String value) {
            this.acyaccrcric = value;
        }

        /**
         * Gets the value of the acctype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCTYPE() {
            return acctype;
        }

        /**
         * Sets the value of the acctype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCTYPE(String value) {
            this.acctype = value;
        }

        /**
         * Gets the value of the accstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCSTAT() {
            return accstat;
        }

        /**
         * Sets the value of the accstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCSTAT(String value) {
            this.accstat = value;
        }

        /**
         * Gets the value of the acdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACDESC() {
            return acdesc;
        }

        /**
         * Sets the value of the acdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACDESC(String value) {
            this.acdesc = value;
        }

        /**
         * Gets the value of the acclass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCLASS() {
            return acclass;
        }

        /**
         * Sets the value of the acclass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCLASS(String value) {
            this.acclass = value;
        }

        /**
         * Gets the value of the jointacctype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJOINTACCTYPE() {
            return jointacctype;
        }

        /**
         * Sets the value of the jointacctype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJOINTACCTYPE(String value) {
            this.jointacctype = value;
        }

        /**
         * Gets the value of the jnthldtyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJNTHLDTYP() {
            return jnthldtyp;
        }

        /**
         * Sets the value of the jnthldtyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJNTHLDTYP(String value) {
            this.jnthldtyp = value;
        }

        /**
         * Gets the value of the netbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNETBAL() {
            return netbal;
        }

        /**
         * Sets the value of the netbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNETBAL(BigDecimal value) {
            this.netbal = value;
        }

        /**
         * Gets the value of the swpin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSWPIN() {
            return swpin;
        }

        /**
         * Sets the value of the swpin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSWPIN(String value) {
            this.swpin = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CUSTACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AC_OPEN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="INITDEPAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="PRINCBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CURRBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DEPSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="JNTHLDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SWP_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "custacno",
        "acdesc",
        "acclass",
        "ccy",
        "accbrn",
        "acopendate",
        "initdepamt",
        "princbal",
        "currbal",
        "depstatus",
        "acctype",
        "matdt",
        "jnthldtyp",
        "swpin"
    })
    public static class TdAccounts {

        @XmlElement(name = "CUSTACNO")
        protected String custacno;
        @XmlElement(name = "ACDESC")
        protected String acdesc;
        @XmlElement(name = "ACCLASS")
        protected String acclass;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "ACCBRN")
        protected String accbrn;
        @XmlElement(name = "AC_OPEN_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar acopendate;
        @XmlElement(name = "INITDEPAMT")
        protected BigDecimal initdepamt;
        @XmlElement(name = "PRINCBAL")
        protected BigDecimal princbal;
        @XmlElement(name = "CURRBAL")
        protected BigDecimal currbal;
        @XmlElement(name = "DEPSTATUS")
        protected String depstatus;
        @XmlElement(name = "ACCTYPE")
        protected String acctype;
        @XmlElement(name = "MATDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar matdt;
        @XmlElement(name = "JNTHLDTYP")
        protected String jnthldtyp;
        @XmlElement(name = "SWP_IN")
        protected String swpin;

        /**
         * Gets the value of the custacno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTACNO() {
            return custacno;
        }

        /**
         * Sets the value of the custacno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTACNO(String value) {
            this.custacno = value;
        }

        /**
         * Gets the value of the acdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACDESC() {
            return acdesc;
        }

        /**
         * Sets the value of the acdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACDESC(String value) {
            this.acdesc = value;
        }

        /**
         * Gets the value of the acclass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCLASS() {
            return acclass;
        }

        /**
         * Sets the value of the acclass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCLASS(String value) {
            this.acclass = value;
        }

        /**
         * Gets the value of the ccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCY() {
            return ccy;
        }

        /**
         * Sets the value of the ccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCY(String value) {
            this.ccy = value;
        }

        /**
         * Gets the value of the accbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCBRN() {
            return accbrn;
        }

        /**
         * Sets the value of the accbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCBRN(String value) {
            this.accbrn = value;
        }

        /**
         * Gets the value of the acopendate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getACOPENDATE() {
            return acopendate;
        }

        /**
         * Sets the value of the acopendate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setACOPENDATE(XMLGregorianCalendar value) {
            this.acopendate = value;
        }

        /**
         * Gets the value of the initdepamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINITDEPAMT() {
            return initdepamt;
        }

        /**
         * Sets the value of the initdepamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINITDEPAMT(BigDecimal value) {
            this.initdepamt = value;
        }

        /**
         * Gets the value of the princbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPRINCBAL() {
            return princbal;
        }

        /**
         * Sets the value of the princbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPRINCBAL(BigDecimal value) {
            this.princbal = value;
        }

        /**
         * Gets the value of the currbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCURRBAL() {
            return currbal;
        }

        /**
         * Sets the value of the currbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCURRBAL(BigDecimal value) {
            this.currbal = value;
        }

        /**
         * Gets the value of the depstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPSTATUS() {
            return depstatus;
        }

        /**
         * Sets the value of the depstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPSTATUS(String value) {
            this.depstatus = value;
        }

        /**
         * Gets the value of the acctype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCTYPE() {
            return acctype;
        }

        /**
         * Sets the value of the acctype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCTYPE(String value) {
            this.acctype = value;
        }

        /**
         * Gets the value of the matdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getMATDT() {
            return matdt;
        }

        /**
         * Sets the value of the matdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setMATDT(XMLGregorianCalendar value) {
            this.matdt = value;
        }

        /**
         * Gets the value of the jnthldtyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJNTHLDTYP() {
            return jnthldtyp;
        }

        /**
         * Sets the value of the jnthldtyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJNTHLDTYP(String value) {
            this.jnthldtyp = value;
        }

        /**
         * Gets the value of the swpin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSWPIN() {
            return swpin;
        }

        /**
         * Sets the value of the swpin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSWPIN(String value) {
            this.swpin = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CUSTACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DEPTENYEARS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DEPTENMNTHS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DEPTENDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ORGTENYEARS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ORGTENMNTHS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ORGTENDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="TOTTOPUPAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NOOFTOPUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MATURITYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="INTRATECUMAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INTRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="LASTACCRDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="INTACCRTILLDT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="NEXTACCRDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="LASTLIQDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="BOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INTLIQTILLDT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="NEXTLIQDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="TAXRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="TAXCOLLTILLDT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="AMOUNT_BLOCK" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AC_OPEN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="INITDEPAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="PRINCBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CURRBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DEPSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="JNTHLDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MADTE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "custacno",
        "ccy",
        "accbrn",
        "deptenyears",
        "deptenmnths",
        "deptendays",
        "orgtenyears",
        "orgtenmnths",
        "orgtendays",
        "tottopupamt",
        "nooftopup",
        "maturityamt",
        "intratecumamt",
        "intrate",
        "lastaccrdt",
        "intaccrtilldt",
        "nextaccrdt",
        "lastliqdt",
        "bookacc",
        "intliqtilldt",
        "nextliqdt",
        "taxrate",
        "taxcolltilldt",
        "amountblock",
        "acdesc",
        "acclass",
        "acopendate",
        "initdepamt",
        "princbal",
        "currbal",
        "depstatus",
        "acctype",
        "jnthldtyp",
        "madte"
    })
    public static class TdDetails {

        @XmlElement(name = "CUSTACNO")
        protected String custacno;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "ACCBRN")
        protected String accbrn;
        @XmlElement(name = "DEPTENYEARS")
        protected BigDecimal deptenyears;
        @XmlElement(name = "DEPTENMNTHS")
        protected BigDecimal deptenmnths;
        @XmlElement(name = "DEPTENDAYS")
        protected BigDecimal deptendays;
        @XmlElement(name = "ORGTENYEARS")
        protected BigDecimal orgtenyears;
        @XmlElement(name = "ORGTENMNTHS")
        protected BigDecimal orgtenmnths;
        @XmlElement(name = "ORGTENDAYS")
        protected BigDecimal orgtendays;
        @XmlElement(name = "TOTTOPUPAMT")
        protected String tottopupamt;
        @XmlElement(name = "NOOFTOPUP")
        protected String nooftopup;
        @XmlElement(name = "MATURITYAMT")
        protected BigDecimal maturityamt;
        @XmlElement(name = "INTRATECUMAMT")
        protected String intratecumamt;
        @XmlElement(name = "INTRATE")
        protected BigDecimal intrate;
        @XmlElement(name = "LASTACCRDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar lastaccrdt;
        @XmlElement(name = "INTACCRTILLDT")
        protected BigDecimal intaccrtilldt;
        @XmlElement(name = "NEXTACCRDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar nextaccrdt;
        @XmlElement(name = "LASTLIQDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar lastliqdt;
        @XmlElement(name = "BOOKACC")
        protected String bookacc;
        @XmlElement(name = "INTLIQTILLDT")
        protected BigDecimal intliqtilldt;
        @XmlElement(name = "NEXTLIQDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar nextliqdt;
        @XmlElement(name = "TAXRATE")
        protected BigDecimal taxrate;
        @XmlElement(name = "TAXCOLLTILLDT")
        protected BigDecimal taxcolltilldt;
        @XmlElement(name = "AMOUNT_BLOCK")
        protected BigDecimal amountblock;
        @XmlElement(name = "ACDESC")
        protected String acdesc;
        @XmlElement(name = "ACCLASS")
        protected String acclass;
        @XmlElement(name = "AC_OPEN_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar acopendate;
        @XmlElement(name = "INITDEPAMT")
        protected BigDecimal initdepamt;
        @XmlElement(name = "PRINCBAL")
        protected BigDecimal princbal;
        @XmlElement(name = "CURRBAL")
        protected BigDecimal currbal;
        @XmlElement(name = "DEPSTATUS")
        protected String depstatus;
        @XmlElement(name = "ACCTYPE")
        protected String acctype;
        @XmlElement(name = "JNTHLDTYP")
        protected String jnthldtyp;
        @XmlElement(name = "MADTE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar madte;

        /**
         * Gets the value of the custacno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTACNO() {
            return custacno;
        }

        /**
         * Sets the value of the custacno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTACNO(String value) {
            this.custacno = value;
        }

        /**
         * Gets the value of the ccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCY() {
            return ccy;
        }

        /**
         * Sets the value of the ccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCY(String value) {
            this.ccy = value;
        }

        /**
         * Gets the value of the accbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCBRN() {
            return accbrn;
        }

        /**
         * Sets the value of the accbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCBRN(String value) {
            this.accbrn = value;
        }

        /**
         * Gets the value of the deptenyears property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDEPTENYEARS() {
            return deptenyears;
        }

        /**
         * Sets the value of the deptenyears property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDEPTENYEARS(BigDecimal value) {
            this.deptenyears = value;
        }

        /**
         * Gets the value of the deptenmnths property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDEPTENMNTHS() {
            return deptenmnths;
        }

        /**
         * Sets the value of the deptenmnths property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDEPTENMNTHS(BigDecimal value) {
            this.deptenmnths = value;
        }

        /**
         * Gets the value of the deptendays property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDEPTENDAYS() {
            return deptendays;
        }

        /**
         * Sets the value of the deptendays property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDEPTENDAYS(BigDecimal value) {
            this.deptendays = value;
        }

        /**
         * Gets the value of the orgtenyears property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getORGTENYEARS() {
            return orgtenyears;
        }

        /**
         * Sets the value of the orgtenyears property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setORGTENYEARS(BigDecimal value) {
            this.orgtenyears = value;
        }

        /**
         * Gets the value of the orgtenmnths property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getORGTENMNTHS() {
            return orgtenmnths;
        }

        /**
         * Sets the value of the orgtenmnths property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setORGTENMNTHS(BigDecimal value) {
            this.orgtenmnths = value;
        }

        /**
         * Gets the value of the orgtendays property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getORGTENDAYS() {
            return orgtendays;
        }

        /**
         * Sets the value of the orgtendays property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setORGTENDAYS(BigDecimal value) {
            this.orgtendays = value;
        }

        /**
         * Gets the value of the tottopupamt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTOTTOPUPAMT() {
            return tottopupamt;
        }

        /**
         * Sets the value of the tottopupamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTOTTOPUPAMT(String value) {
            this.tottopupamt = value;
        }

        /**
         * Gets the value of the nooftopup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNOOFTOPUP() {
            return nooftopup;
        }

        /**
         * Sets the value of the nooftopup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNOOFTOPUP(String value) {
            this.nooftopup = value;
        }

        /**
         * Gets the value of the maturityamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMATURITYAMT() {
            return maturityamt;
        }

        /**
         * Sets the value of the maturityamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMATURITYAMT(BigDecimal value) {
            this.maturityamt = value;
        }

        /**
         * Gets the value of the intratecumamt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTRATECUMAMT() {
            return intratecumamt;
        }

        /**
         * Sets the value of the intratecumamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTRATECUMAMT(String value) {
            this.intratecumamt = value;
        }

        /**
         * Gets the value of the intrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINTRATE() {
            return intrate;
        }

        /**
         * Sets the value of the intrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINTRATE(BigDecimal value) {
            this.intrate = value;
        }

        /**
         * Gets the value of the lastaccrdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLASTACCRDT() {
            return lastaccrdt;
        }

        /**
         * Sets the value of the lastaccrdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLASTACCRDT(XMLGregorianCalendar value) {
            this.lastaccrdt = value;
        }

        /**
         * Gets the value of the intaccrtilldt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINTACCRTILLDT() {
            return intaccrtilldt;
        }

        /**
         * Sets the value of the intaccrtilldt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINTACCRTILLDT(BigDecimal value) {
            this.intaccrtilldt = value;
        }

        /**
         * Gets the value of the nextaccrdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNEXTACCRDT() {
            return nextaccrdt;
        }

        /**
         * Sets the value of the nextaccrdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNEXTACCRDT(XMLGregorianCalendar value) {
            this.nextaccrdt = value;
        }

        /**
         * Gets the value of the lastliqdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLASTLIQDT() {
            return lastliqdt;
        }

        /**
         * Sets the value of the lastliqdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLASTLIQDT(XMLGregorianCalendar value) {
            this.lastliqdt = value;
        }

        /**
         * Gets the value of the bookacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOOKACC() {
            return bookacc;
        }

        /**
         * Sets the value of the bookacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOOKACC(String value) {
            this.bookacc = value;
        }

        /**
         * Gets the value of the intliqtilldt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINTLIQTILLDT() {
            return intliqtilldt;
        }

        /**
         * Sets the value of the intliqtilldt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINTLIQTILLDT(BigDecimal value) {
            this.intliqtilldt = value;
        }

        /**
         * Gets the value of the nextliqdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNEXTLIQDT() {
            return nextliqdt;
        }

        /**
         * Sets the value of the nextliqdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNEXTLIQDT(XMLGregorianCalendar value) {
            this.nextliqdt = value;
        }

        /**
         * Gets the value of the taxrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTAXRATE() {
            return taxrate;
        }

        /**
         * Sets the value of the taxrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTAXRATE(BigDecimal value) {
            this.taxrate = value;
        }

        /**
         * Gets the value of the taxcolltilldt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTAXCOLLTILLDT() {
            return taxcolltilldt;
        }

        /**
         * Sets the value of the taxcolltilldt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTAXCOLLTILLDT(BigDecimal value) {
            this.taxcolltilldt = value;
        }

        /**
         * Gets the value of the amountblock property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNTBLOCK() {
            return amountblock;
        }

        /**
         * Sets the value of the amountblock property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNTBLOCK(BigDecimal value) {
            this.amountblock = value;
        }

        /**
         * Gets the value of the acdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACDESC() {
            return acdesc;
        }

        /**
         * Sets the value of the acdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACDESC(String value) {
            this.acdesc = value;
        }

        /**
         * Gets the value of the acclass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCLASS() {
            return acclass;
        }

        /**
         * Sets the value of the acclass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCLASS(String value) {
            this.acclass = value;
        }

        /**
         * Gets the value of the acopendate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getACOPENDATE() {
            return acopendate;
        }

        /**
         * Sets the value of the acopendate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setACOPENDATE(XMLGregorianCalendar value) {
            this.acopendate = value;
        }

        /**
         * Gets the value of the initdepamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINITDEPAMT() {
            return initdepamt;
        }

        /**
         * Sets the value of the initdepamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINITDEPAMT(BigDecimal value) {
            this.initdepamt = value;
        }

        /**
         * Gets the value of the princbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPRINCBAL() {
            return princbal;
        }

        /**
         * Sets the value of the princbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPRINCBAL(BigDecimal value) {
            this.princbal = value;
        }

        /**
         * Gets the value of the currbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCURRBAL() {
            return currbal;
        }

        /**
         * Sets the value of the currbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCURRBAL(BigDecimal value) {
            this.currbal = value;
        }

        /**
         * Gets the value of the depstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPSTATUS() {
            return depstatus;
        }

        /**
         * Sets the value of the depstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPSTATUS(String value) {
            this.depstatus = value;
        }

        /**
         * Gets the value of the acctype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCTYPE() {
            return acctype;
        }

        /**
         * Sets the value of the acctype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCTYPE(String value) {
            this.acctype = value;
        }

        /**
         * Gets the value of the jnthldtyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJNTHLDTYP() {
            return jnthldtyp;
        }

        /**
         * Sets the value of the jnthldtyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJNTHLDTYP(String value) {
            this.jnthldtyp = value;
        }

        /**
         * Gets the value of the madte property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getMADTE() {
            return madte;
        }

        /**
         * Sets the value of the madte property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setMADTE(XMLGregorianCalendar value) {
            this.madte = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="HOLDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AMTBLOCKNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="EFFECTIVEDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="EXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="AMTBLOCKTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HOLDCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "holddesc",
        "remarks",
        "referenceno",
        "account",
        "branch",
        "amtblockno",
        "amount",
        "effectivedate",
        "expirydate",
        "amtblocktype",
        "holdcode"
    })
    public static class Tdamtblock {

        @XmlElement(name = "HOLDDESC")
        protected String holddesc;
        @XmlElement(name = "REMARKS")
        protected String remarks;
        @XmlElement(name = "REFERENCE_NO")
        protected String referenceno;
        @XmlElement(name = "ACCOUNT")
        protected String account;
        @XmlElement(name = "BRANCH")
        protected String branch;
        @XmlElement(name = "AMTBLOCKNO")
        protected String amtblockno;
        @XmlElement(name = "AMOUNT")
        protected BigDecimal amount;
        @XmlElement(name = "EFFECTIVEDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectivedate;
        @XmlElement(name = "EXPIRYDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expirydate;
        @XmlElement(name = "AMTBLOCKTYPE")
        protected String amtblocktype;
        @XmlElement(name = "HOLDCODE")
        protected String holdcode;

        /**
         * Gets the value of the holddesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHOLDDESC() {
            return holddesc;
        }

        /**
         * Sets the value of the holddesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHOLDDESC(String value) {
            this.holddesc = value;
        }

        /**
         * Gets the value of the remarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARKS() {
            return remarks;
        }

        /**
         * Sets the value of the remarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARKS(String value) {
            this.remarks = value;
        }

        /**
         * Gets the value of the referenceno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFERENCENO() {
            return referenceno;
        }

        /**
         * Sets the value of the referenceno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFERENCENO(String value) {
            this.referenceno = value;
        }

        /**
         * Gets the value of the account property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNT() {
            return account;
        }

        /**
         * Sets the value of the account property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNT(String value) {
            this.account = value;
        }

        /**
         * Gets the value of the branch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRANCH() {
            return branch;
        }

        /**
         * Sets the value of the branch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRANCH(String value) {
            this.branch = value;
        }

        /**
         * Gets the value of the amtblockno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAMTBLOCKNO() {
            return amtblockno;
        }

        /**
         * Sets the value of the amtblockno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAMTBLOCKNO(String value) {
            this.amtblockno = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the effectivedate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEFFECTIVEDATE() {
            return effectivedate;
        }

        /**
         * Sets the value of the effectivedate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEFFECTIVEDATE(XMLGregorianCalendar value) {
            this.effectivedate = value;
        }

        /**
         * Gets the value of the expirydate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEXPIRYDATE() {
            return expirydate;
        }

        /**
         * Sets the value of the expirydate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEXPIRYDATE(XMLGregorianCalendar value) {
            this.expirydate = value;
        }

        /**
         * Gets the value of the amtblocktype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAMTBLOCKTYPE() {
            return amtblocktype;
        }

        /**
         * Sets the value of the amtblocktype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAMTBLOCKTYPE(String value) {
            this.amtblocktype = value;
        }

        /**
         * Gets the value of the holdcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHOLDCODE() {
            return holdcode;
        }

        /**
         * Sets the value of the holdcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHOLDCODE(String value) {
            this.holdcode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Tdamtblockmain {


    }

}

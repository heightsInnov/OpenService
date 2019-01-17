
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustAccBalance-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustAccBalance-Query-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNTCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LINKED_ENTITY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LINKED_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CASATYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPOSITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustAccBalance-Query-IO-Type", propOrder = {
    "custacno",
    "ccy",
    "accountclass",
    "custno",
    "branch",
    "linkedentity1",
    "linkedaccount",
    "casatype",
    "deposits"
})
public class CustAccBalanceQueryIOType {

    @XmlElement(name = "CUSTACNO")
    protected String custacno;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "ACCOUNTCLASS")
    protected String accountclass;
    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "BRANCH")
    protected String branch;
    @XmlElement(name = "LINKED_ENTITY1")
    protected String linkedentity1;
    @XmlElement(name = "LINKED_ACCOUNT")
    protected String linkedaccount;
    @XmlElement(name = "CASATYPE")
    protected String casatype;
    @XmlElement(name = "DEPOSITS")
    protected String deposits;

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

}

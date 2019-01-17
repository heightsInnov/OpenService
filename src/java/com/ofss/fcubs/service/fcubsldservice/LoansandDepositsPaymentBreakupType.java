
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoansandDepositsPaymentBreakup-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoansandDepositsPaymentBreakup-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMTDUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AMOUNT_PAID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INTPREPAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TAXPAID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OVERDUE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoansandDepositsPaymentBreakup-Type", propOrder = {
    "fccref",
    "comp",
    "amtdue",
    "amountpaid",
    "intprepay",
    "taxpaid",
    "overdue"
})
public class LoansandDepositsPaymentBreakupType {

    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "COMP")
    protected String comp;
    @XmlElement(name = "AMTDUE")
    protected BigDecimal amtdue;
    @XmlElement(name = "AMOUNT_PAID")
    protected BigDecimal amountpaid;
    @XmlElement(name = "INTPREPAY")
    protected BigDecimal intprepay;
    @XmlElement(name = "TAXPAID")
    protected BigDecimal taxpaid;
    @XmlElement(name = "OVERDUE")
    protected BigInteger overdue;

    /**
     * Gets the value of the fccref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCCREF() {
        return fccref;
    }

    /**
     * Sets the value of the fccref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCCREF(String value) {
        this.fccref = value;
    }

    /**
     * Gets the value of the comp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMP() {
        return comp;
    }

    /**
     * Sets the value of the comp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMP(String value) {
        this.comp = value;
    }

    /**
     * Gets the value of the amtdue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMTDUE() {
        return amtdue;
    }

    /**
     * Sets the value of the amtdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMTDUE(BigDecimal value) {
        this.amtdue = value;
    }

    /**
     * Gets the value of the amountpaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTPAID() {
        return amountpaid;
    }

    /**
     * Sets the value of the amountpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTPAID(BigDecimal value) {
        this.amountpaid = value;
    }

    /**
     * Gets the value of the intprepay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTPREPAY() {
        return intprepay;
    }

    /**
     * Sets the value of the intprepay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTPREPAY(BigDecimal value) {
        this.intprepay = value;
    }

    /**
     * Gets the value of the taxpaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAXPAID() {
        return taxpaid;
    }

    /**
     * Sets the value of the taxpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAXPAID(BigDecimal value) {
        this.taxpaid = value;
    }

    /**
     * Gets the value of the overdue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOVERDUE() {
        return overdue;
    }

    /**
     * Sets the value of the overdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOVERDUE(BigInteger value) {
        this.overdue = value;
    }

}


package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentBreakUpType1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentBreakUpType1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMTDUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OVERDUE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AMTPAID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INTPREPAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TAXPAID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentBreakUpType1", propOrder = {
    "comp",
    "amtdue",
    "overdue",
    "amtpaid",
    "intprepay",
    "taxpaid"
})
public class PaymentBreakUpType1 {

    @XmlElement(name = "COMP")
    protected String comp;
    @XmlElement(name = "AMTDUE")
    protected BigDecimal amtdue;
    @XmlElement(name = "OVERDUE")
    protected BigInteger overdue;
    @XmlElement(name = "AMTPAID")
    protected BigDecimal amtpaid;
    @XmlElement(name = "INTPREPAY")
    protected BigDecimal intprepay;
    @XmlElement(name = "TAXPAID")
    protected BigDecimal taxpaid;

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

    /**
     * Gets the value of the amtpaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMTPAID() {
        return amtpaid;
    }

    /**
     * Sets the value of the amtpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMTPAID(BigDecimal value) {
        this.amtpaid = value;
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

}


package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LDContract-Provision-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LDContract-Provision-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SEQ" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT-EVENT-LOG" type="{http://fcubs.ofss.com/service/FCUBSLDService}EventlogType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LDContract-Provision-Full-Type", propOrder = {
    "fccref",
    "ccy",
    "amt",
    "seq",
    "stat",
    "contracteventlog"
})
public class LDContractProvisionFullType {

    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "AMT")
    protected BigDecimal amt;
    @XmlElement(name = "SEQ")
    protected BigInteger seq;
    @XmlElement(name = "STAT")
    protected String stat;
    @XmlElement(name = "CONTRACT-EVENT-LOG")
    protected EventlogType contracteventlog;

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
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMT() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMT(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEQ() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEQ(BigInteger value) {
        this.seq = value;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAT() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAT(String value) {
        this.stat = value;
    }

    /**
     * Gets the value of the contracteventlog property.
     * 
     * @return
     *     possible object is
     *     {@link EventlogType }
     *     
     */
    public EventlogType getCONTRACTEVENTLOG() {
        return contracteventlog;
    }

    /**
     * Sets the value of the contracteventlog property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventlogType }
     *     
     */
    public void setCONTRACTEVENTLOG(EventlogType value) {
        this.contracteventlog = value;
    }

}

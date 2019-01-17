
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IntDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="INTAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="INTBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INTRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTSPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AQRDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntDetailType", propOrder = {
    "valdt",
    "txndt",
    "intamt",
    "intccy",
    "esn",
    "intbasis",
    "intrate",
    "intratecode",
    "intspread",
    "aqrdamt",
    "rttype"
})
public class IntDetailType {

    @XmlElement(name = "VALDT")
    //@XmlSchemaType(name = "date")
    protected String valdt;
    @XmlElement(name = "TXNDT")
    //@XmlSchemaType(name = "date")
    protected String txndt;
    @XmlElement(name = "INTAMT")
    protected BigDecimal intamt;
    @XmlElement(name = "INTCCY")
    protected String intccy;
    @XmlElement(name = "ESN", required = true)
    protected BigInteger esn;
    @XmlElement(name = "INTBASIS")
    protected String intbasis;
    @XmlElement(name = "INTRATE")
    protected BigDecimal intrate;
    @XmlElement(name = "INTRATECODE")
    protected String intratecode;
    @XmlElement(name = "INTSPREAD")
    protected BigDecimal intspread;
    @XmlElement(name = "AQRDAMT")
    protected BigDecimal aqrdamt;
    @XmlElement(name = "RTTYPE")
    protected String rttype;

    /**
     * Gets the value of the valdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getVALDT() {
        return valdt;
    }

    /**
     * Sets the value of the valdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVALDT(String value) {
        this.valdt = value;
    }

    /**
     * Gets the value of the txndt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getTXNDT() {
        return txndt;
    }

    /**
     * Sets the value of the txndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTXNDT(String value) {
        this.txndt = value;
    }

    /**
     * Gets the value of the intamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTAMT() {
        return intamt;
    }

    /**
     * Sets the value of the intamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTAMT(BigDecimal value) {
        this.intamt = value;
    }

    /**
     * Gets the value of the intccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTCCY() {
        return intccy;
    }

    /**
     * Sets the value of the intccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTCCY(String value) {
        this.intccy = value;
    }

    /**
     * Gets the value of the esn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getESN() {
        return esn;
    }

    /**
     * Sets the value of the esn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setESN(BigInteger value) {
        this.esn = value;
    }

    /**
     * Gets the value of the intbasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTBASIS() {
        return intbasis;
    }

    /**
     * Sets the value of the intbasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTBASIS(String value) {
        this.intbasis = value;
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
     * Gets the value of the intratecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTRATECODE() {
        return intratecode;
    }

    /**
     * Sets the value of the intratecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTRATECODE(String value) {
        this.intratecode = value;
    }

    /**
     * Gets the value of the intspread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTSPREAD() {
        return intspread;
    }

    /**
     * Sets the value of the intspread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTSPREAD(BigDecimal value) {
        this.intspread = value;
    }

    /**
     * Gets the value of the aqrdamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAQRDAMT() {
        return aqrdamt;
    }

    /**
     * Sets the value of the aqrdamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAQRDAMT(BigDecimal value) {
        this.aqrdamt = value;
    }

    /**
     * Gets the value of the rttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTTYPE() {
        return rttype;
    }

    /**
     * Sets the value of the rttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTTYPE(String value) {
        this.rttype = value;
    }

}

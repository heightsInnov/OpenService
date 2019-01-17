
package com.ofss.fcubs.service.fcubsldservice;

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
 * <p>Java class for ContractDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OSAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CPTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USRDEFSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TOTPAID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PREPAYPENRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PREPAYPENAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PAYREM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Payment-BreakUp" type="{http://fcubs.ofss.com/service/FCUBSLDService}PaymentBreakUpType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Overrides" type="{http://fcubs.ofss.com/service/FCUBSLDService}OVERRIDEType2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractDescriptionType", propOrder = {
    "xref",
    "fccref",
    "osamt",
    "amt",
    "cpty",
    "ccy",
    "usrdefstat",
    "paystat",
    "valdt",
    "totpaid",
    "prepaypenrate",
    "prepaypenamt",
    "payrem",
    "paymentBreakUp",
    "overrides"
})
public class ContractDescriptionType {

    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "OSAMT")
    protected BigDecimal osamt;
    @XmlElement(name = "AMT")
    protected BigDecimal amt;
    @XmlElement(name = "CPTY")
    protected String cpty;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "USRDEFSTAT")
    protected String usrdefstat;
    @XmlElement(name = "PAYSTAT")
    protected String paystat;
    @XmlElement(name = "VALDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valdt;
    @XmlElement(name = "TOTPAID")
    protected BigDecimal totpaid;
    @XmlElement(name = "PREPAYPENRATE")
    protected BigDecimal prepaypenrate;
    @XmlElement(name = "PREPAYPENAMT")
    protected BigDecimal prepaypenamt;
    @XmlElement(name = "PAYREM")
    protected String payrem;
    @XmlElement(name = "Payment-BreakUp")
    protected List<PaymentBreakUpType> paymentBreakUp;
    @XmlElement(name = "Overrides")
    protected List<OVERRIDEType2> overrides;

    /**
     * Gets the value of the xref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXREF() {
        return xref;
    }

    /**
     * Sets the value of the xref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXREF(String value) {
        this.xref = value;
    }

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
     * Gets the value of the osamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOSAMT() {
        return osamt;
    }

    /**
     * Sets the value of the osamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOSAMT(BigDecimal value) {
        this.osamt = value;
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
     * Gets the value of the cpty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPTY() {
        return cpty;
    }

    /**
     * Sets the value of the cpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPTY(String value) {
        this.cpty = value;
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
     * Gets the value of the usrdefstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSRDEFSTAT() {
        return usrdefstat;
    }

    /**
     * Sets the value of the usrdefstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSRDEFSTAT(String value) {
        this.usrdefstat = value;
    }

    /**
     * Gets the value of the paystat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYSTAT() {
        return paystat;
    }

    /**
     * Sets the value of the paystat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYSTAT(String value) {
        this.paystat = value;
    }

    /**
     * Gets the value of the valdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVALDT() {
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
    public void setVALDT(XMLGregorianCalendar value) {
        this.valdt = value;
    }

    /**
     * Gets the value of the totpaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTPAID() {
        return totpaid;
    }

    /**
     * Sets the value of the totpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTPAID(BigDecimal value) {
        this.totpaid = value;
    }

    /**
     * Gets the value of the prepaypenrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPREPAYPENRATE() {
        return prepaypenrate;
    }

    /**
     * Sets the value of the prepaypenrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPREPAYPENRATE(BigDecimal value) {
        this.prepaypenrate = value;
    }

    /**
     * Gets the value of the prepaypenamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPREPAYPENAMT() {
        return prepaypenamt;
    }

    /**
     * Sets the value of the prepaypenamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPREPAYPENAMT(BigDecimal value) {
        this.prepaypenamt = value;
    }

    /**
     * Gets the value of the payrem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYREM() {
        return payrem;
    }

    /**
     * Sets the value of the payrem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYREM(String value) {
        this.payrem = value;
    }

    /**
     * Gets the value of the paymentBreakUp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentBreakUp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentBreakUp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentBreakUpType }
     * 
     * 
     */
    public List<PaymentBreakUpType> getPaymentBreakUp() {
        if (paymentBreakUp == null) {
            paymentBreakUp = new ArrayList<PaymentBreakUpType>();
        }
        return this.paymentBreakUp;
    }

    /**
     * Gets the value of the overrides property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overrides property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverrides().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OVERRIDEType2 }
     * 
     * 
     */
    public List<OVERRIDEType2> getOverrides() {
        if (overrides == null) {
            overrides = new ArrayList<OVERRIDEType2>();
        }
        return this.overrides;
    }

}

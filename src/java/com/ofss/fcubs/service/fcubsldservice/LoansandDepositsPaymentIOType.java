
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
 * <p>Java class for LoansandDepositsPayment-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoansandDepositsPayment-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTPAID" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LIMITDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Payment-Breakup" type="{http://fcubs.ofss.com/service/FCUBSLDService}PaymentBreakUpType1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoansandDepositsPayment-IO-Type", propOrder = {
    "fccref",
    "xref",
    "totpaid",
    "valdt",
    "limitdt",
    "paymentBreakup"
})
public class LoansandDepositsPaymentIOType {

    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "TOTPAID", required = true)
    protected BigDecimal totpaid;
    @XmlElement(name = "VALDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valdt;
    @XmlElement(name = "LIMITDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar limitdt;
    @XmlElement(name = "Payment-Breakup", required = true)
    protected List<PaymentBreakUpType1> paymentBreakup;

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
     * Gets the value of the limitdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLIMITDT() {
        return limitdt;
    }

    /**
     * Sets the value of the limitdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLIMITDT(XMLGregorianCalendar value) {
        this.limitdt = value;
    }

    /**
     * Gets the value of the paymentBreakup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentBreakup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentBreakup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentBreakUpType1 }
     * 
     * 
     */
    public List<PaymentBreakUpType1> getPaymentBreakup() {
        if (paymentBreakup == null) {
            paymentBreakup = new ArrayList<PaymentBreakUpType1>();
        }
        return this.paymentBreakup;
    }

}

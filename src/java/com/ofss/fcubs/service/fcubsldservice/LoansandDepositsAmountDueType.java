
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LoansandDepositsAmountDue-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoansandDepositsAmountDue-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUEDT" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="AMTDUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AMTSTD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ADJAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoansandDepositsAmountDue-Type", propOrder = {
    "fccref",
    "comp",
    "duedt",
    "amtdue",
    "amtstd",
    "adjamt"
})
public class LoansandDepositsAmountDueType {

    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "COMP")
    protected String comp;
    @XmlElement(name = "DUEDT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar duedt;
    @XmlElement(name = "AMTDUE")
    protected BigDecimal amtdue;
    @XmlElement(name = "AMTSTD")
    protected BigDecimal amtstd;
    @XmlElement(name = "ADJAMT")
    protected BigDecimal adjamt;

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
     * Gets the value of the duedt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDUEDT() {
        return duedt;
    }

    /**
     * Sets the value of the duedt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDUEDT(XMLGregorianCalendar value) {
        this.duedt = value;
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
     * Gets the value of the amtstd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMTSTD() {
        return amtstd;
    }

    /**
     * Sets the value of the amtstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMTSTD(BigDecimal value) {
        this.amtstd = value;
    }

    /**
     * Gets the value of the adjamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getADJAMT() {
        return adjamt;
    }

    /**
     * Sets the value of the adjamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setADJAMT(BigDecimal value) {
        this.adjamt = value;
    }

}

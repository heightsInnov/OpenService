
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoansandDepositsRefineAmt-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoansandDepositsRefineAmt-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CIFID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NEWP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PAYTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoansandDepositsRefineAmt-Full-Type", propOrder = {
    "fccref",
    "cifid",
    "namt",
    "oamt",
    "newp",
    "paytype"
})
public class LoansandDepositsRefineAmtFullType {

    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "CIFID")
    protected String cifid;
    @XmlElement(name = "NAMT")
    protected BigDecimal namt;
    @XmlElement(name = "OAMT")
    protected BigDecimal oamt;
    @XmlElement(name = "NEWP")
    protected BigDecimal newp;
    @XmlElement(name = "PAYTYPE")
    protected String paytype;

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
     * Gets the value of the cifid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIFID() {
        return cifid;
    }

    /**
     * Sets the value of the cifid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIFID(String value) {
        this.cifid = value;
    }

    /**
     * Gets the value of the namt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNAMT() {
        return namt;
    }

    /**
     * Sets the value of the namt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNAMT(BigDecimal value) {
        this.namt = value;
    }

    /**
     * Gets the value of the oamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOAMT() {
        return oamt;
    }

    /**
     * Sets the value of the oamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOAMT(BigDecimal value) {
        this.oamt = value;
    }

    /**
     * Gets the value of the newp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNEWP() {
        return newp;
    }

    /**
     * Sets the value of the newp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNEWP(BigDecimal value) {
        this.newp = value;
    }

    /**
     * Gets the value of the paytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYTYPE() {
        return paytype;
    }

    /**
     * Sets the value of the paytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYTYPE(String value) {
        this.paytype = value;
    }

}

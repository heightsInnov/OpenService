
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
 * <p>Java class for DenomDeposit-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DenomDeposit-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TD_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DENM_ALLCT_PENDINGAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CERTIF_ALLCT_PENDINGAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CERTIF_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Demdep" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DENOMINATION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DENDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DENMVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UNITS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Demcertificate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CERTIFICATE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DENOMINATION_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ISSUE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="CURRSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NEWSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STATUS_CHANGE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="STATUS_CHANGE_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DenomDeposit-Full-Type", propOrder = {
    "tdamount",
    "denmallctpendingamt",
    "certifallctpendingamt",
    "certifstatus",
    "status",
    "demdep",
    "demcertificate"
})
public class DenomDepositFullType {

    @XmlElement(name = "TD_AMOUNT")
    protected String tdamount;
    @XmlElement(name = "DENM_ALLCT_PENDINGAMT")
    protected String denmallctpendingamt;
    @XmlElement(name = "CERTIF_ALLCT_PENDINGAMT")
    protected String certifallctpendingamt;
    @XmlElement(name = "CERTIF_STATUS")
    protected String certifstatus;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "Demdep")
    protected List<DenomDepositFullType.Demdep> demdep;
    @XmlElement(name = "Demcertificate")
    protected List<DenomDepositFullType.Demcertificate> demcertificate;

    /**
     * Gets the value of the tdamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDAMOUNT() {
        return tdamount;
    }

    /**
     * Sets the value of the tdamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDAMOUNT(String value) {
        this.tdamount = value;
    }

    /**
     * Gets the value of the denmallctpendingamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDENMALLCTPENDINGAMT() {
        return denmallctpendingamt;
    }

    /**
     * Sets the value of the denmallctpendingamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDENMALLCTPENDINGAMT(String value) {
        this.denmallctpendingamt = value;
    }

    /**
     * Gets the value of the certifallctpendingamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCERTIFALLCTPENDINGAMT() {
        return certifallctpendingamt;
    }

    /**
     * Sets the value of the certifallctpendingamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCERTIFALLCTPENDINGAMT(String value) {
        this.certifallctpendingamt = value;
    }

    /**
     * Gets the value of the certifstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCERTIFSTATUS() {
        return certifstatus;
    }

    /**
     * Sets the value of the certifstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCERTIFSTATUS(String value) {
        this.certifstatus = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the demdep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demdep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemdep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DenomDepositFullType.Demdep }
     * 
     * 
     */
    public List<DenomDepositFullType.Demdep> getDemdep() {
        if (demdep == null) {
            demdep = new ArrayList<DenomDepositFullType.Demdep>();
        }
        return this.demdep;
    }

    /**
     * Gets the value of the demcertificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demcertificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemcertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DenomDepositFullType.Demcertificate }
     * 
     * 
     */
    public List<DenomDepositFullType.Demcertificate> getDemcertificate() {
        if (demcertificate == null) {
            demcertificate = new ArrayList<DenomDepositFullType.Demcertificate>();
        }
        return this.demcertificate;
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
     *         &lt;element name="CERTIFICATE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DENOMINATION_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ISSUE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="CURRSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NEWSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STATUS_CHANGE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="STATUS_CHANGE_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "certificateno",
        "denominationvalue",
        "issuedate",
        "currstat",
        "newstat",
        "statuschangedate",
        "statuschangereason"
    })
    public static class Demcertificate {

        @XmlElement(name = "CERTIFICATE_NO")
        protected String certificateno;
        @XmlElement(name = "DENOMINATION_VALUE")
        protected BigDecimal denominationvalue;
        @XmlElement(name = "ISSUE_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar issuedate;
        @XmlElement(name = "CURRSTAT")
        protected String currstat;
        @XmlElement(name = "NEWSTAT")
        protected String newstat;
        @XmlElement(name = "STATUS_CHANGE_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar statuschangedate;
        @XmlElement(name = "STATUS_CHANGE_REASON")
        protected String statuschangereason;

        /**
         * Gets the value of the certificateno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCERTIFICATENO() {
            return certificateno;
        }

        /**
         * Sets the value of the certificateno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCERTIFICATENO(String value) {
            this.certificateno = value;
        }

        /**
         * Gets the value of the denominationvalue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDENOMINATIONVALUE() {
            return denominationvalue;
        }

        /**
         * Sets the value of the denominationvalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDENOMINATIONVALUE(BigDecimal value) {
            this.denominationvalue = value;
        }

        /**
         * Gets the value of the issuedate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getISSUEDATE() {
            return issuedate;
        }

        /**
         * Sets the value of the issuedate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setISSUEDATE(XMLGregorianCalendar value) {
            this.issuedate = value;
        }

        /**
         * Gets the value of the currstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCURRSTAT() {
            return currstat;
        }

        /**
         * Sets the value of the currstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCURRSTAT(String value) {
            this.currstat = value;
        }

        /**
         * Gets the value of the newstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNEWSTAT() {
            return newstat;
        }

        /**
         * Sets the value of the newstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNEWSTAT(String value) {
            this.newstat = value;
        }

        /**
         * Gets the value of the statuschangedate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTATUSCHANGEDATE() {
            return statuschangedate;
        }

        /**
         * Sets the value of the statuschangedate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTATUSCHANGEDATE(XMLGregorianCalendar value) {
            this.statuschangedate = value;
        }

        /**
         * Gets the value of the statuschangereason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUSCHANGEREASON() {
            return statuschangereason;
        }

        /**
         * Sets the value of the statuschangereason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUSCHANGEREASON(String value) {
            this.statuschangereason = value;
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
     *         &lt;element name="DENOMINATION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DENDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DENMVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UNITS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "denominationid",
        "dendesc",
        "denmvalue",
        "units",
        "totalamount"
    })
    public static class Demdep {

        @XmlElement(name = "DENOMINATION_ID")
        protected String denominationid;
        @XmlElement(name = "DENDESC")
        protected String dendesc;
        @XmlElement(name = "DENMVALUE")
        protected String denmvalue;
        @XmlElement(name = "UNITS")
        protected BigDecimal units;
        @XmlElement(name = "TOTAL_AMOUNT")
        protected String totalamount;

        /**
         * Gets the value of the denominationid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDENOMINATIONID() {
            return denominationid;
        }

        /**
         * Sets the value of the denominationid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDENOMINATIONID(String value) {
            this.denominationid = value;
        }

        /**
         * Gets the value of the dendesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDENDESC() {
            return dendesc;
        }

        /**
         * Sets the value of the dendesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDENDESC(String value) {
            this.dendesc = value;
        }

        /**
         * Gets the value of the denmvalue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDENMVALUE() {
            return denmvalue;
        }

        /**
         * Sets the value of the denmvalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDENMVALUE(String value) {
            this.denmvalue = value;
        }

        /**
         * Gets the value of the units property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUNITS() {
            return units;
        }

        /**
         * Sets the value of the units property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUNITS(BigDecimal value) {
            this.units = value;
        }

        /**
         * Gets the value of the totalamount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTOTALAMOUNT() {
            return totalamount;
        }

        /**
         * Sets the value of the totalamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTOTALAMOUNT(String value) {
            this.totalamount = value;
        }

    }

}


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
 * <p>Java class for DenomDeposit-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DenomDeposit-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TD_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DENM_ALLCT_PENDINGAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CERTIF_ALLCT_PENDINGAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CERTIF_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Demdep" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DENDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DENMVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UNITS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Demcertificate" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CERTIFICATE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DENOMINATION_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ISSUE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="CURRSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STATUS_CHANGE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="STATUS_CHANGE_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OLD_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DenomDeposit-Modify-IO-Type", propOrder = {
    "branchcode",
    "custacno",
    "tdamount",
    "denmallctpendingamt",
    "certifallctpendingamt",
    "certifstatus",
    "status",
    "demdep",
    "demcertificate"
})
public class DenomDepositModifyIOType {

    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "CUST_AC_NO")
    protected String custacno;
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
    @XmlElement(name = "Demdep", required = true)
    protected List<DenomDepositModifyIOType.Demdep> demdep;
    @XmlElement(name = "Demcertificate", required = true)
    protected List<DenomDepositModifyIOType.Demcertificate> demcertificate;

    /**
     * Gets the value of the branchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHCODE() {
        return branchcode;
    }

    /**
     * Sets the value of the branchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHCODE(String value) {
        this.branchcode = value;
    }

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
     * {@link DenomDepositModifyIOType.Demdep }
     * 
     * 
     */
    public List<DenomDepositModifyIOType.Demdep> getDemdep() {
        if (demdep == null) {
            demdep = new ArrayList<DenomDepositModifyIOType.Demdep>();
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
     * {@link DenomDepositModifyIOType.Demcertificate }
     * 
     * 
     */
    public List<DenomDepositModifyIOType.Demcertificate> getDemcertificate() {
        if (demcertificate == null) {
            demcertificate = new ArrayList<DenomDepositModifyIOType.Demcertificate>();
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
     *         &lt;element name="STATUS_CHANGE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="STATUS_CHANGE_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OLD_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "statuschangedate",
        "statuschangereason",
        "oldstatus"
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
        @XmlElement(name = "STATUS_CHANGE_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar statuschangedate;
        @XmlElement(name = "STATUS_CHANGE_REASON")
        protected String statuschangereason;
        @XmlElement(name = "OLD_STATUS")
        protected String oldstatus;

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

        /**
         * Gets the value of the oldstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOLDSTATUS() {
            return oldstatus;
        }

        /**
         * Sets the value of the oldstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOLDSTATUS(String value) {
            this.oldstatus = value;
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
        "dendesc",
        "denmvalue",
        "units",
        "totalamount"
    })
    public static class Demdep {

        @XmlElement(name = "DENDESC")
        protected String dendesc;
        @XmlElement(name = "DENMVALUE")
        protected String denmvalue;
        @XmlElement(name = "UNITS")
        protected BigDecimal units;
        @XmlElement(name = "TOTAL_AMOUNT")
        protected String totalamount;

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

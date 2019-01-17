
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DenomDeposit-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DenomDeposit-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CERTIF_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Demdep" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DENOMINATION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UNITS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *                   &lt;element name="NEWSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DenomDeposit-Create-IO-Type", propOrder = {
    "branchcode",
    "custacno",
    "certifstatus",
    "status",
    "demdep",
    "demcertificate"
})
public class DenomDepositCreateIOType {

    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "CUST_AC_NO")
    protected String custacno;
    @XmlElement(name = "CERTIF_STATUS")
    protected String certifstatus;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "Demdep")
    protected List<DenomDepositCreateIOType.Demdep> demdep;
    @XmlElement(name = "Demcertificate")
    protected List<DenomDepositCreateIOType.Demcertificate> demcertificate;

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
     * {@link DenomDepositCreateIOType.Demdep }
     * 
     * 
     */
    public List<DenomDepositCreateIOType.Demdep> getDemdep() {
        if (demdep == null) {
            demdep = new ArrayList<DenomDepositCreateIOType.Demdep>();
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
     * {@link DenomDepositCreateIOType.Demcertificate }
     * 
     * 
     */
    public List<DenomDepositCreateIOType.Demcertificate> getDemcertificate() {
        if (demcertificate == null) {
            demcertificate = new ArrayList<DenomDepositCreateIOType.Demcertificate>();
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
     *         &lt;element name="NEWSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "newstat",
        "statuschangereason"
    })
    public static class Demcertificate {

        @XmlElement(name = "CERTIFICATE_NO")
        protected String certificateno;
        @XmlElement(name = "NEWSTAT")
        protected String newstat;
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
     *         &lt;element name="UNITS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "units"
    })
    public static class Demdep {

        @XmlElement(name = "DENOMINATION_ID")
        protected String denominationid;
        @XmlElement(name = "UNITS")
        protected BigDecimal units;

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

    }

}


package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnlineSweep-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnlineSweep-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sttms-Sweep-Details-C" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Sttms-Sweep-Details-Td" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LINKED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="LINKED_PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DEP_ACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Sttms-Sweep-Details-Ad" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
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
@XmlType(name = "OnlineSweep-Create-IO-Type", propOrder = {
    "branchcode",
    "custacno",
    "sttmsSweepDetailsC",
    "sttmsSweepDetailsTd",
    "sttmsSweepDetailsAd"
})
public class OnlineSweepCreateIOType {

    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "CUST_AC_NO")
    protected String custacno;
    @XmlElement(name = "Sttms-Sweep-Details-C")
    protected List<OnlineSweepCreateIOType.SttmsSweepDetailsC> sttmsSweepDetailsC;
    @XmlElement(name = "Sttms-Sweep-Details-Td")
    protected List<OnlineSweepCreateIOType.SttmsSweepDetailsTd> sttmsSweepDetailsTd;
    @XmlElement(name = "Sttms-Sweep-Details-Ad")
    protected List<OnlineSweepCreateIOType.SttmsSweepDetailsAd> sttmsSweepDetailsAd;

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
     * Gets the value of the sttmsSweepDetailsC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttmsSweepDetailsC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttmsSweepDetailsC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnlineSweepCreateIOType.SttmsSweepDetailsC }
     * 
     * 
     */
    public List<OnlineSweepCreateIOType.SttmsSweepDetailsC> getSttmsSweepDetailsC() {
        if (sttmsSweepDetailsC == null) {
            sttmsSweepDetailsC = new ArrayList<OnlineSweepCreateIOType.SttmsSweepDetailsC>();
        }
        return this.sttmsSweepDetailsC;
    }

    /**
     * Gets the value of the sttmsSweepDetailsTd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttmsSweepDetailsTd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttmsSweepDetailsTd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnlineSweepCreateIOType.SttmsSweepDetailsTd }
     * 
     * 
     */
    public List<OnlineSweepCreateIOType.SttmsSweepDetailsTd> getSttmsSweepDetailsTd() {
        if (sttmsSweepDetailsTd == null) {
            sttmsSweepDetailsTd = new ArrayList<OnlineSweepCreateIOType.SttmsSweepDetailsTd>();
        }
        return this.sttmsSweepDetailsTd;
    }

    /**
     * Gets the value of the sttmsSweepDetailsAd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttmsSweepDetailsAd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttmsSweepDetailsAd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnlineSweepCreateIOType.SttmsSweepDetailsAd }
     * 
     * 
     */
    public List<OnlineSweepCreateIOType.SttmsSweepDetailsAd> getSttmsSweepDetailsAd() {
        if (sttmsSweepDetailsAd == null) {
            sttmsSweepDetailsAd = new ArrayList<OnlineSweepCreateIOType.SttmsSweepDetailsAd>();
        }
        return this.sttmsSweepDetailsAd;
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
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SttmsSweepDetailsAd {


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
     *         &lt;element name="CACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "caccount",
        "brn",
        "acc"
    })
    public static class SttmsSweepDetailsC {

        @XmlElement(name = "CACCOUNT", required = true)
        protected String caccount;
        @XmlElement(name = "BRN")
        protected String brn;
        @XmlElement(name = "ACC")
        protected String acc;

        /**
         * Gets the value of the caccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCACCOUNT() {
            return caccount;
        }

        /**
         * Sets the value of the caccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCACCOUNT(String value) {
            this.caccount = value;
        }

        /**
         * Gets the value of the brn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRN() {
            return brn;
        }

        /**
         * Sets the value of the brn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRN(String value) {
            this.brn = value;
        }

        /**
         * Gets the value of the acc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACC() {
            return acc;
        }

        /**
         * Sets the value of the acc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACC(String value) {
            this.acc = value;
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
     *         &lt;element name="LINKED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="LINKED_PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DEP_ACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "linkedamt",
        "linkedpercentage",
        "depacc"
    })
    public static class SttmsSweepDetailsTd {

        @XmlElement(name = "LINKED_AMT")
        protected BigDecimal linkedamt;
        @XmlElement(name = "LINKED_PERCENTAGE")
        protected BigDecimal linkedpercentage;
        @XmlElement(name = "DEP_ACC", required = true)
        protected String depacc;

        /**
         * Gets the value of the linkedamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLINKEDAMT() {
            return linkedamt;
        }

        /**
         * Sets the value of the linkedamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLINKEDAMT(BigDecimal value) {
            this.linkedamt = value;
        }

        /**
         * Gets the value of the linkedpercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLINKEDPERCENTAGE() {
            return linkedpercentage;
        }

        /**
         * Sets the value of the linkedpercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLINKEDPERCENTAGE(BigDecimal value) {
            this.linkedpercentage = value;
        }

        /**
         * Gets the value of the depacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPACC() {
            return depacc;
        }

        /**
         * Sets the value of the depacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPACC(String value) {
            this.depacc = value;
        }

    }

}

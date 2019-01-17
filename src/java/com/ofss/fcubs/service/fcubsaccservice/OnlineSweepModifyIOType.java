
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnlineSweep-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnlineSweep-Modify-IO-Type">
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
 *                   &lt;element name="CBRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="UTILAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *                   &lt;element name="BLOCKED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="UTILIZED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="AVL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="LINKED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="LINKED_PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ORDER_OF_LINKAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *                   &lt;element name="ORDEROFLINKAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="LINKAGEPERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="LIMIT_LINKED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="LIMIT_AVAILABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="UTILAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "OnlineSweep-Modify-IO-Type", propOrder = {
    "branchcode",
    "custacno",
    "sttmsSweepDetailsC",
    "sttmsSweepDetailsTd",
    "sttmsSweepDetailsAd"
})
public class OnlineSweepModifyIOType {

    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "CUST_AC_NO")
    protected String custacno;
    @XmlElement(name = "Sttms-Sweep-Details-C")
    protected List<OnlineSweepModifyIOType.SttmsSweepDetailsC> sttmsSweepDetailsC;
    @XmlElement(name = "Sttms-Sweep-Details-Td")
    protected List<OnlineSweepModifyIOType.SttmsSweepDetailsTd> sttmsSweepDetailsTd;
    @XmlElement(name = "Sttms-Sweep-Details-Ad")
    protected List<OnlineSweepModifyIOType.SttmsSweepDetailsAd> sttmsSweepDetailsAd;

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
     * {@link OnlineSweepModifyIOType.SttmsSweepDetailsC }
     * 
     * 
     */
    public List<OnlineSweepModifyIOType.SttmsSweepDetailsC> getSttmsSweepDetailsC() {
        if (sttmsSweepDetailsC == null) {
            sttmsSweepDetailsC = new ArrayList<OnlineSweepModifyIOType.SttmsSweepDetailsC>();
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
     * {@link OnlineSweepModifyIOType.SttmsSweepDetailsTd }
     * 
     * 
     */
    public List<OnlineSweepModifyIOType.SttmsSweepDetailsTd> getSttmsSweepDetailsTd() {
        if (sttmsSweepDetailsTd == null) {
            sttmsSweepDetailsTd = new ArrayList<OnlineSweepModifyIOType.SttmsSweepDetailsTd>();
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
     * {@link OnlineSweepModifyIOType.SttmsSweepDetailsAd }
     * 
     * 
     */
    public List<OnlineSweepModifyIOType.SttmsSweepDetailsAd> getSttmsSweepDetailsAd() {
        if (sttmsSweepDetailsAd == null) {
            sttmsSweepDetailsAd = new ArrayList<OnlineSweepModifyIOType.SttmsSweepDetailsAd>();
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
     *         &lt;element name="ORDEROFLINKAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="LINKAGEPERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="LIMIT_LINKED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="LIMIT_AVAILABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="UTILAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "orderoflinkage",
        "linkagepercent",
        "limitlinkedamount",
        "limitavailableamount",
        "utilamt"
    })
    public static class SttmsSweepDetailsAd {

        @XmlElement(name = "ORDEROFLINKAGE")
        protected BigDecimal orderoflinkage;
        @XmlElement(name = "LINKAGEPERCENT")
        protected BigDecimal linkagepercent;
        @XmlElement(name = "LIMIT_LINKED_AMOUNT")
        protected BigDecimal limitlinkedamount;
        @XmlElement(name = "LIMIT_AVAILABLE_AMOUNT")
        protected BigDecimal limitavailableamount;
        @XmlElement(name = "UTILAMT")
        protected BigDecimal utilamt;

        /**
         * Gets the value of the orderoflinkage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getORDEROFLINKAGE() {
            return orderoflinkage;
        }

        /**
         * Sets the value of the orderoflinkage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setORDEROFLINKAGE(BigDecimal value) {
            this.orderoflinkage = value;
        }

        /**
         * Gets the value of the linkagepercent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLINKAGEPERCENT() {
            return linkagepercent;
        }

        /**
         * Sets the value of the linkagepercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLINKAGEPERCENT(BigDecimal value) {
            this.linkagepercent = value;
        }

        /**
         * Gets the value of the limitlinkedamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLIMITLINKEDAMOUNT() {
            return limitlinkedamount;
        }

        /**
         * Sets the value of the limitlinkedamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLIMITLINKEDAMOUNT(BigDecimal value) {
            this.limitlinkedamount = value;
        }

        /**
         * Gets the value of the limitavailableamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLIMITAVAILABLEAMOUNT() {
            return limitavailableamount;
        }

        /**
         * Sets the value of the limitavailableamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLIMITAVAILABLEAMOUNT(BigDecimal value) {
            this.limitavailableamount = value;
        }

        /**
         * Gets the value of the utilamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUTILAMT() {
            return utilamt;
        }

        /**
         * Sets the value of the utilamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUTILAMT(BigDecimal value) {
            this.utilamt = value;
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
     *         &lt;element name="CBRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="UTILAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "cbranch",
        "caccount",
        "utilamt"
    })
    public static class SttmsSweepDetailsC {

        @XmlElement(name = "CBRANCH")
        protected String cbranch;
        @XmlElement(name = "CACCOUNT", required = true)
        protected String caccount;
        @XmlElement(name = "UTILAMT")
        protected BigDecimal utilamt;

        /**
         * Gets the value of the cbranch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCBRANCH() {
            return cbranch;
        }

        /**
         * Sets the value of the cbranch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCBRANCH(String value) {
            this.cbranch = value;
        }

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
         * Gets the value of the utilamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUTILAMT() {
            return utilamt;
        }

        /**
         * Sets the value of the utilamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUTILAMT(BigDecimal value) {
            this.utilamt = value;
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
     *         &lt;element name="BLOCKED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="UTILIZED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="AVL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="LINKED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="LINKED_PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ORDER_OF_LINKAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "blockedamt",
        "utilizedamt",
        "avlamt",
        "linkedamt",
        "linkedpercentage",
        "orderoflinkage"
    })
    public static class SttmsSweepDetailsTd {

        @XmlElement(name = "BLOCKED_AMT")
        protected BigDecimal blockedamt;
        @XmlElement(name = "UTILIZED_AMT")
        protected BigDecimal utilizedamt;
        @XmlElement(name = "AVL_AMT")
        protected BigDecimal avlamt;
        @XmlElement(name = "LINKED_AMT")
        protected BigDecimal linkedamt;
        @XmlElement(name = "LINKED_PERCENTAGE")
        protected BigDecimal linkedpercentage;
        @XmlElement(name = "ORDER_OF_LINKAGE")
        protected BigDecimal orderoflinkage;

        /**
         * Gets the value of the blockedamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBLOCKEDAMT() {
            return blockedamt;
        }

        /**
         * Sets the value of the blockedamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBLOCKEDAMT(BigDecimal value) {
            this.blockedamt = value;
        }

        /**
         * Gets the value of the utilizedamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUTILIZEDAMT() {
            return utilizedamt;
        }

        /**
         * Sets the value of the utilizedamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUTILIZEDAMT(BigDecimal value) {
            this.utilizedamt = value;
        }

        /**
         * Gets the value of the avlamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAVLAMT() {
            return avlamt;
        }

        /**
         * Sets the value of the avlamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAVLAMT(BigDecimal value) {
            this.avlamt = value;
        }

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
         * Gets the value of the orderoflinkage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getORDEROFLINKAGE() {
            return orderoflinkage;
        }

        /**
         * Sets the value of the orderoflinkage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setORDEROFLINKAGE(BigDecimal value) {
            this.orderoflinkage = value;
        }

    }

}

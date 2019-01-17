
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdAccrualFee-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdAccrualFee-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accrual-Fee-Details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LIQINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LIQPRNCHNG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DISCACCRAPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCRREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BASISAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ENDDTINP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RULFEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FEETYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCRFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FREQVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="COMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STPASSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ProdAccrualFee-Create-IO-Type", propOrder = {
    "accrualFeeDetails"
})
public class ProdAccrualFeeCreateIOType {

    @XmlElement(name = "Accrual-Fee-Details")
    protected List<ProdAccrualFeeCreateIOType.AccrualFeeDetails> accrualFeeDetails;

    /**
     * Gets the value of the accrualFeeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accrualFeeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccrualFeeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdAccrualFeeCreateIOType.AccrualFeeDetails }
     * 
     * 
     */
    public List<ProdAccrualFeeCreateIOType.AccrualFeeDetails> getAccrualFeeDetails() {
        if (accrualFeeDetails == null) {
            accrualFeeDetails = new ArrayList<ProdAccrualFeeCreateIOType.AccrualFeeDetails>();
        }
        return this.accrualFeeDetails;
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
     *         &lt;element name="LIQINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LIQPRNCHNG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DISCACCRAPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCRREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BASISAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ENDDTINP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RULFEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FEETYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCRFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FREQVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="COMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STPASSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "liqint",
        "liqprnchng",
        "discaccrapp",
        "accrreqd",
        "basisamt",
        "enddtinp",
        "rulfee",
        "feetyp",
        "accrfreq",
        "freqval",
        "comp",
        "stpassn"
    })
    public static class AccrualFeeDetails {

        @XmlElement(name = "LIQINT")
        protected String liqint;
        @XmlElement(name = "LIQPRNCHNG")
        protected String liqprnchng;
        @XmlElement(name = "DISCACCRAPP")
        protected String discaccrapp;
        @XmlElement(name = "ACCRREQD")
        protected String accrreqd;
        @XmlElement(name = "BASISAMT")
        protected String basisamt;
        @XmlElement(name = "ENDDTINP")
        protected String enddtinp;
        @XmlElement(name = "RULFEE")
        protected String rulfee;
        @XmlElement(name = "FEETYP")
        protected String feetyp;
        @XmlElement(name = "ACCRFREQ")
        protected String accrfreq;
        @XmlElement(name = "FREQVAL")
        protected BigDecimal freqval;
        @XmlElement(name = "COMP")
        protected String comp;
        @XmlElement(name = "STPASSN")
        protected String stpassn;

        /**
         * Gets the value of the liqint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLIQINT() {
            return liqint;
        }

        /**
         * Sets the value of the liqint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLIQINT(String value) {
            this.liqint = value;
        }

        /**
         * Gets the value of the liqprnchng property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLIQPRNCHNG() {
            return liqprnchng;
        }

        /**
         * Sets the value of the liqprnchng property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLIQPRNCHNG(String value) {
            this.liqprnchng = value;
        }

        /**
         * Gets the value of the discaccrapp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISCACCRAPP() {
            return discaccrapp;
        }

        /**
         * Sets the value of the discaccrapp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISCACCRAPP(String value) {
            this.discaccrapp = value;
        }

        /**
         * Gets the value of the accrreqd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCRREQD() {
            return accrreqd;
        }

        /**
         * Sets the value of the accrreqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCRREQD(String value) {
            this.accrreqd = value;
        }

        /**
         * Gets the value of the basisamt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBASISAMT() {
            return basisamt;
        }

        /**
         * Sets the value of the basisamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBASISAMT(String value) {
            this.basisamt = value;
        }

        /**
         * Gets the value of the enddtinp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getENDDTINP() {
            return enddtinp;
        }

        /**
         * Sets the value of the enddtinp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setENDDTINP(String value) {
            this.enddtinp = value;
        }

        /**
         * Gets the value of the rulfee property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRULFEE() {
            return rulfee;
        }

        /**
         * Sets the value of the rulfee property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRULFEE(String value) {
            this.rulfee = value;
        }

        /**
         * Gets the value of the feetyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFEETYP() {
            return feetyp;
        }

        /**
         * Sets the value of the feetyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFEETYP(String value) {
            this.feetyp = value;
        }

        /**
         * Gets the value of the accrfreq property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCRFREQ() {
            return accrfreq;
        }

        /**
         * Sets the value of the accrfreq property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCRFREQ(String value) {
            this.accrfreq = value;
        }

        /**
         * Gets the value of the freqval property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFREQVAL() {
            return freqval;
        }

        /**
         * Sets the value of the freqval property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFREQVAL(BigDecimal value) {
            this.freqval = value;
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
         * Gets the value of the stpassn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTPASSN() {
            return stpassn;
        }

        /**
         * Sets the value of the stpassn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTPASSN(String value) {
            this.stpassn = value;
        }

    }

}

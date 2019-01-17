
package com.ofss.fcubs.service.fcubsldservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCharges-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCharges-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Charge-Details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SETTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DFTWAIV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ALWRULAMND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMNDAFTRASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ALWAMTAMND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMNDAFTRAPPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STPASOCIATN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADVCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DFTRULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ProductCharges-Modify-IO-Type", propOrder = {
    "chargeDetails"
})
public class ProductChargesModifyIOType {

    @XmlElement(name = "Charge-Details")
    protected List<ProductChargesModifyIOType.ChargeDetails> chargeDetails;

    /**
     * Gets the value of the chargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductChargesModifyIOType.ChargeDetails }
     * 
     * 
     */
    public List<ProductChargesModifyIOType.ChargeDetails> getChargeDetails() {
        if (chargeDetails == null) {
            chargeDetails = new ArrayList<ProductChargesModifyIOType.ChargeDetails>();
        }
        return this.chargeDetails;
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
     *         &lt;element name="SETTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DFTWAIV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ALWRULAMND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AMNDAFTRASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ALWAMTAMND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AMNDAFTRAPPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STPASOCIATN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADVCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DFTRULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "settccy",
        "dftwaiv",
        "alwrulamnd",
        "amndaftrassoc",
        "alwamtamnd",
        "amndaftrappl",
        "stpasociatn",
        "advchg",
        "dftrule",
        "compnt"
    })
    public static class ChargeDetails {

        @XmlElement(name = "SETTCCY")
        protected String settccy;
        @XmlElement(name = "DFTWAIV")
        protected String dftwaiv;
        @XmlElement(name = "ALWRULAMND")
        protected String alwrulamnd;
        @XmlElement(name = "AMNDAFTRASSOC")
        protected String amndaftrassoc;
        @XmlElement(name = "ALWAMTAMND")
        protected String alwamtamnd;
        @XmlElement(name = "AMNDAFTRAPPL")
        protected String amndaftrappl;
        @XmlElement(name = "STPASOCIATN")
        protected String stpasociatn;
        @XmlElement(name = "ADVCHG")
        protected String advchg;
        @XmlElement(name = "DFTRULE")
        protected String dftrule;
        @XmlElement(name = "COMPNT", required = true)
        protected String compnt;

        /**
         * Gets the value of the settccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSETTCCY() {
            return settccy;
        }

        /**
         * Sets the value of the settccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSETTCCY(String value) {
            this.settccy = value;
        }

        /**
         * Gets the value of the dftwaiv property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDFTWAIV() {
            return dftwaiv;
        }

        /**
         * Sets the value of the dftwaiv property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDFTWAIV(String value) {
            this.dftwaiv = value;
        }

        /**
         * Gets the value of the alwrulamnd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getALWRULAMND() {
            return alwrulamnd;
        }

        /**
         * Sets the value of the alwrulamnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setALWRULAMND(String value) {
            this.alwrulamnd = value;
        }

        /**
         * Gets the value of the amndaftrassoc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAMNDAFTRASSOC() {
            return amndaftrassoc;
        }

        /**
         * Sets the value of the amndaftrassoc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAMNDAFTRASSOC(String value) {
            this.amndaftrassoc = value;
        }

        /**
         * Gets the value of the alwamtamnd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getALWAMTAMND() {
            return alwamtamnd;
        }

        /**
         * Sets the value of the alwamtamnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setALWAMTAMND(String value) {
            this.alwamtamnd = value;
        }

        /**
         * Gets the value of the amndaftrappl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAMNDAFTRAPPL() {
            return amndaftrappl;
        }

        /**
         * Sets the value of the amndaftrappl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAMNDAFTRAPPL(String value) {
            this.amndaftrappl = value;
        }

        /**
         * Gets the value of the stpasociatn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTPASOCIATN() {
            return stpasociatn;
        }

        /**
         * Sets the value of the stpasociatn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTPASOCIATN(String value) {
            this.stpasociatn = value;
        }

        /**
         * Gets the value of the advchg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADVCHG() {
            return advchg;
        }

        /**
         * Sets the value of the advchg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADVCHG(String value) {
            this.advchg = value;
        }

        /**
         * Gets the value of the dftrule property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDFTRULE() {
            return dftrule;
        }

        /**
         * Sets the value of the dftrule property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDFTRULE(String value) {
            this.dftrule = value;
        }

        /**
         * Gets the value of the compnt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPNT() {
            return compnt;
        }

        /**
         * Sets the value of the compnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPNT(String value) {
            this.compnt = value;
        }

    }

}

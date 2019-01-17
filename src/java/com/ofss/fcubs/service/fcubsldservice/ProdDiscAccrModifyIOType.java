
package com.ofss.fcubs.service.fcubsldservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdDiscAccr-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdDiscAccr-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLASCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLASTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLASDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disc-Accr-Details" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DISCACCRREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCRFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PREPAYTBDTREAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACQTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ccy-Preferences" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CCYCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CCYNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DENOMDCNTMET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DENOMMETHOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ProdDiscAccr-Modify-IO-Type", propOrder = {
    "clascd",
    "clastyp",
    "prd",
    "clasdesc",
    "discAccrDetails",
    "ccyPreferences"
})
public class ProdDiscAccrModifyIOType {

    @XmlElement(name = "CLASCD")
    protected String clascd;
    @XmlElement(name = "CLASTYP")
    protected String clastyp;
    @XmlElement(name = "PRD")
    protected String prd;
    @XmlElement(name = "CLASDESC")
    protected String clasdesc;
    @XmlElement(name = "Disc-Accr-Details")
    protected ProdDiscAccrModifyIOType.DiscAccrDetails discAccrDetails;
    @XmlElement(name = "Ccy-Preferences", required = true)
    protected List<ProdDiscAccrModifyIOType.CcyPreferences> ccyPreferences;

    /**
     * Gets the value of the clascd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASCD() {
        return clascd;
    }

    /**
     * Sets the value of the clascd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASCD(String value) {
        this.clascd = value;
    }

    /**
     * Gets the value of the clastyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASTYP() {
        return clastyp;
    }

    /**
     * Sets the value of the clastyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASTYP(String value) {
        this.clastyp = value;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRD() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRD(String value) {
        this.prd = value;
    }

    /**
     * Gets the value of the clasdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASDESC() {
        return clasdesc;
    }

    /**
     * Sets the value of the clasdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASDESC(String value) {
        this.clasdesc = value;
    }

    /**
     * Gets the value of the discAccrDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProdDiscAccrModifyIOType.DiscAccrDetails }
     *     
     */
    public ProdDiscAccrModifyIOType.DiscAccrDetails getDiscAccrDetails() {
        return discAccrDetails;
    }

    /**
     * Sets the value of the discAccrDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdDiscAccrModifyIOType.DiscAccrDetails }
     *     
     */
    public void setDiscAccrDetails(ProdDiscAccrModifyIOType.DiscAccrDetails value) {
        this.discAccrDetails = value;
    }

    /**
     * Gets the value of the ccyPreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccyPreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyPreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdDiscAccrModifyIOType.CcyPreferences }
     * 
     * 
     */
    public List<ProdDiscAccrModifyIOType.CcyPreferences> getCcyPreferences() {
        if (ccyPreferences == null) {
            ccyPreferences = new ArrayList<ProdDiscAccrModifyIOType.CcyPreferences>();
        }
        return this.ccyPreferences;
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
     *         &lt;element name="CCYCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CCYNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DENOMDCNTMET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DENOMMETHOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ccycode",
        "ccyname",
        "denomdcntmet",
        "denommethod"
    })
    public static class CcyPreferences {

        @XmlElement(name = "CCYCODE", required = true)
        protected String ccycode;
        @XmlElement(name = "CCYNAME", required = true)
        protected String ccyname;
        @XmlElement(name = "DENOMDCNTMET")
        protected String denomdcntmet;
        @XmlElement(name = "DENOMMETHOD")
        protected String denommethod;

        /**
         * Gets the value of the ccycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCYCODE() {
            return ccycode;
        }

        /**
         * Sets the value of the ccycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCYCODE(String value) {
            this.ccycode = value;
        }

        /**
         * Gets the value of the ccyname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCYNAME() {
            return ccyname;
        }

        /**
         * Sets the value of the ccyname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCYNAME(String value) {
            this.ccyname = value;
        }

        /**
         * Gets the value of the denomdcntmet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDENOMDCNTMET() {
            return denomdcntmet;
        }

        /**
         * Sets the value of the denomdcntmet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDENOMDCNTMET(String value) {
            this.denomdcntmet = value;
        }

        /**
         * Gets the value of the denommethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDENOMMETHOD() {
            return denommethod;
        }

        /**
         * Sets the value of the denommethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDENOMMETHOD(String value) {
            this.denommethod = value;
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
     *         &lt;element name="DISCACCRREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCRFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PREPAYTBDTREAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACQTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "discaccrreqd",
        "accrfreq",
        "prepaytbdtreat",
        "acqtyp"
    })
    public static class DiscAccrDetails {

        @XmlElement(name = "DISCACCRREQD")
        protected String discaccrreqd;
        @XmlElement(name = "ACCRFREQ")
        protected String accrfreq;
        @XmlElement(name = "PREPAYTBDTREAT")
        protected String prepaytbdtreat;
        @XmlElement(name = "ACQTYP")
        protected String acqtyp;

        /**
         * Gets the value of the discaccrreqd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISCACCRREQD() {
            return discaccrreqd;
        }

        /**
         * Sets the value of the discaccrreqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISCACCRREQD(String value) {
            this.discaccrreqd = value;
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
         * Gets the value of the prepaytbdtreat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPREPAYTBDTREAT() {
            return prepaytbdtreat;
        }

        /**
         * Sets the value of the prepaytbdtreat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPREPAYTBDTREAT(String value) {
            this.prepaytbdtreat = value;
        }

        /**
         * Gets the value of the acqtyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACQTYP() {
            return acqtyp;
        }

        /**
         * Sets the value of the acqtyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACQTYP(String value) {
            this.acqtyp = value;
        }

    }

}

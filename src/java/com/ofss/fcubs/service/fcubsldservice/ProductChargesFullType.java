
package com.ofss.fcubs.service.fcubsldservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCharges-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCharges-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Charge-Details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CHGTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="THRDPTYTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DRCRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NTCNSINDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NETCONSPLSMINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SWIFTQLF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SETTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DFTWAIV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ALWRULAMND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMNDAFTRASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ALWAMTAMND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMNDAFTRAPPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STPASOCIATN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADVCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CAPTLIZE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DISCACCRAPLB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PROPREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DISCNTBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DFTRULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EVNTFRASSC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EVNTFRAPPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EVNTFRLIQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BASISAMNTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BASICAMTTGDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCRREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPNENTDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EVNTASSCTDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EVNTAPPLIDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EVNTLIQDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RULDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ProductCharges-Full-Type", propOrder = {
    "chargeDetails"
})
public class ProductChargesFullType {

    @XmlElement(name = "Charge-Details")
    protected List<ProductChargesFullType.ChargeDetails> chargeDetails;

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
     * {@link ProductChargesFullType.ChargeDetails }
     * 
     * 
     */
    public List<ProductChargesFullType.ChargeDetails> getChargeDetails() {
        if (chargeDetails == null) {
            chargeDetails = new ArrayList<ProductChargesFullType.ChargeDetails>();
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
     *         &lt;element name="CHGTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="THRDPTYTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DRCRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NTCNSINDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NETCONSPLSMINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SWIFTQLF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SETTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DFTWAIV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ALWRULAMND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AMNDAFTRASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ALWAMTAMND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AMNDAFTRAPPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STPASOCIATN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADVCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CAPTLIZE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DISCACCRAPLB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PROPREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DISCNTBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DFTRULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EVNTFRASSC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EVNTFRAPPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EVNTFRLIQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BASISAMNTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BASICAMTTGDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCRREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPNENTDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EVNTASSCTDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EVNTAPPLIDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EVNTLIQDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RULDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "chgtyp",
        "thrdptyty",
        "drcrtype",
        "ntcnsindi",
        "netconsplsmins",
        "swiftqlf",
        "settccy",
        "dftwaiv",
        "alwrulamnd",
        "amndaftrassoc",
        "alwamtamnd",
        "amndaftrappl",
        "stpasociatn",
        "advchg",
        "captlize",
        "discaccraplb",
        "propreqd",
        "discntbasis",
        "dftrule",
        "compnt",
        "evntfrassc",
        "evntfrappl",
        "evntfrliq",
        "basisamnttag",
        "basicamttgdesc",
        "accrreqd",
        "compnentdesc",
        "evntassctdesc",
        "evntapplidesc",
        "evntliqddesc",
        "ruldesc"
    })
    public static class ChargeDetails {

        @XmlElement(name = "CHGTYP")
        protected String chgtyp;
        @XmlElement(name = "THRDPTYTY")
        protected String thrdptyty;
        @XmlElement(name = "DRCRTYPE")
        protected String drcrtype;
        @XmlElement(name = "NTCNSINDI")
        protected String ntcnsindi;
        @XmlElement(name = "NETCONSPLSMINS")
        protected String netconsplsmins;
        @XmlElement(name = "SWIFTQLF")
        protected String swiftqlf;
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
        @XmlElement(name = "CAPTLIZE")
        protected String captlize;
        @XmlElement(name = "DISCACCRAPLB")
        protected String discaccraplb;
        @XmlElement(name = "PROPREQD")
        protected String propreqd;
        @XmlElement(name = "DISCNTBASIS")
        protected String discntbasis;
        @XmlElement(name = "DFTRULE")
        protected String dftrule;
        @XmlElement(name = "COMPNT", required = true)
        protected String compnt;
        @XmlElement(name = "EVNTFRASSC")
        protected String evntfrassc;
        @XmlElement(name = "EVNTFRAPPL")
        protected String evntfrappl;
        @XmlElement(name = "EVNTFRLIQ")
        protected String evntfrliq;
        @XmlElement(name = "BASISAMNTTAG")
        protected String basisamnttag;
        @XmlElement(name = "BASICAMTTGDESC")
        protected String basicamttgdesc;
        @XmlElement(name = "ACCRREQD")
        protected String accrreqd;
        @XmlElement(name = "COMPNENTDESC")
        protected String compnentdesc;
        @XmlElement(name = "EVNTASSCTDESC")
        protected String evntassctdesc;
        @XmlElement(name = "EVNTAPPLIDESC")
        protected String evntapplidesc;
        @XmlElement(name = "EVNTLIQDDESC")
        protected String evntliqddesc;
        @XmlElement(name = "RULDESC")
        protected String ruldesc;

        /**
         * Gets the value of the chgtyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGTYP() {
            return chgtyp;
        }

        /**
         * Sets the value of the chgtyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGTYP(String value) {
            this.chgtyp = value;
        }

        /**
         * Gets the value of the thrdptyty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTHRDPTYTY() {
            return thrdptyty;
        }

        /**
         * Sets the value of the thrdptyty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTHRDPTYTY(String value) {
            this.thrdptyty = value;
        }

        /**
         * Gets the value of the drcrtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRCRTYPE() {
            return drcrtype;
        }

        /**
         * Sets the value of the drcrtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRCRTYPE(String value) {
            this.drcrtype = value;
        }

        /**
         * Gets the value of the ntcnsindi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNTCNSINDI() {
            return ntcnsindi;
        }

        /**
         * Sets the value of the ntcnsindi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNTCNSINDI(String value) {
            this.ntcnsindi = value;
        }

        /**
         * Gets the value of the netconsplsmins property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNETCONSPLSMINS() {
            return netconsplsmins;
        }

        /**
         * Sets the value of the netconsplsmins property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNETCONSPLSMINS(String value) {
            this.netconsplsmins = value;
        }

        /**
         * Gets the value of the swiftqlf property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSWIFTQLF() {
            return swiftqlf;
        }

        /**
         * Sets the value of the swiftqlf property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSWIFTQLF(String value) {
            this.swiftqlf = value;
        }

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
         * Gets the value of the captlize property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCAPTLIZE() {
            return captlize;
        }

        /**
         * Sets the value of the captlize property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCAPTLIZE(String value) {
            this.captlize = value;
        }

        /**
         * Gets the value of the discaccraplb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISCACCRAPLB() {
            return discaccraplb;
        }

        /**
         * Sets the value of the discaccraplb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISCACCRAPLB(String value) {
            this.discaccraplb = value;
        }

        /**
         * Gets the value of the propreqd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROPREQD() {
            return propreqd;
        }

        /**
         * Sets the value of the propreqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROPREQD(String value) {
            this.propreqd = value;
        }

        /**
         * Gets the value of the discntbasis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISCNTBASIS() {
            return discntbasis;
        }

        /**
         * Sets the value of the discntbasis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISCNTBASIS(String value) {
            this.discntbasis = value;
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

        /**
         * Gets the value of the evntfrassc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVNTFRASSC() {
            return evntfrassc;
        }

        /**
         * Sets the value of the evntfrassc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVNTFRASSC(String value) {
            this.evntfrassc = value;
        }

        /**
         * Gets the value of the evntfrappl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVNTFRAPPL() {
            return evntfrappl;
        }

        /**
         * Sets the value of the evntfrappl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVNTFRAPPL(String value) {
            this.evntfrappl = value;
        }

        /**
         * Gets the value of the evntfrliq property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVNTFRLIQ() {
            return evntfrliq;
        }

        /**
         * Sets the value of the evntfrliq property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVNTFRLIQ(String value) {
            this.evntfrliq = value;
        }

        /**
         * Gets the value of the basisamnttag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBASISAMNTTAG() {
            return basisamnttag;
        }

        /**
         * Sets the value of the basisamnttag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBASISAMNTTAG(String value) {
            this.basisamnttag = value;
        }

        /**
         * Gets the value of the basicamttgdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBASICAMTTGDESC() {
            return basicamttgdesc;
        }

        /**
         * Sets the value of the basicamttgdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBASICAMTTGDESC(String value) {
            this.basicamttgdesc = value;
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
         * Gets the value of the compnentdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPNENTDESC() {
            return compnentdesc;
        }

        /**
         * Sets the value of the compnentdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPNENTDESC(String value) {
            this.compnentdesc = value;
        }

        /**
         * Gets the value of the evntassctdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVNTASSCTDESC() {
            return evntassctdesc;
        }

        /**
         * Sets the value of the evntassctdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVNTASSCTDESC(String value) {
            this.evntassctdesc = value;
        }

        /**
         * Gets the value of the evntapplidesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVNTAPPLIDESC() {
            return evntapplidesc;
        }

        /**
         * Sets the value of the evntapplidesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVNTAPPLIDESC(String value) {
            this.evntapplidesc = value;
        }

        /**
         * Gets the value of the evntliqddesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVNTLIQDDESC() {
            return evntliqddesc;
        }

        /**
         * Sets the value of the evntliqddesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVNTLIQDDESC(String value) {
            this.evntliqddesc = value;
        }

        /**
         * Gets the value of the ruldesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRULDESC() {
            return ruldesc;
        }

        /**
         * Sets the value of the ruldesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRULDESC(String value) {
            this.ruldesc = value;
        }

    }

}
